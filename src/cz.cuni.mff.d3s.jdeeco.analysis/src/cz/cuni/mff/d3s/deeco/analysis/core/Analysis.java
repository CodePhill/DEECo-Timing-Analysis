package cz.cuni.mff.d3s.deeco.analysis.core;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;

import cz.cuni.mff.d3s.deeco.analysis.entities.Component;
import cz.cuni.mff.d3s.deeco.analysis.entities.KnowledgeField;
import cz.cuni.mff.d3s.deeco.analysis.entities.StaticEnsemble;
import cz.cuni.mff.d3s.deeco.analysis.entities.Task;
import cz.cuni.mff.d3s.deeco.analysis.graph.OrientedGraph;
import cz.cuni.mff.d3s.deeco.analysis.output.AbstractOutputPrinter;

/** Contains main algorithm of the analysis. */
public class Analysis {

	/**
	 * Runs the analysis over given configuration.
	 * @param analysisConfiguration Input configuration of the analysis.
	 * @param abstractOutputPrinter Class that will be used to print the analysis output.
	 */
	public void runAnalysis(
			AnalysisConfiguration analysisConfiguration,
			AbstractOutputPrinter abstractOutputPrinter) {
		
		// To measure execution time
		long start = System.nanoTime();
		
		for(StaticEnsemble ensemble : analysisConfiguration.getStaticEnsembles()) {
			ensemble.setBeliefPropagationDelay(analysisConfiguration.getBeliefPropagationDelay());
		}
		
		ErrorReporter errorReporter = new ErrorReporter();
		analysisConfiguration.assertConfiguration(errorReporter);
		
		if (errorReporter.getNumberOfErrors() > 0) {
			abstractOutputPrinter.printErrorReport(errorReporter);
			return;
		}
		
		OrientedGraph<KnowledgeField<?>> graph = new OrientedGraph<KnowledgeField<?>>();
		
		// Add all nodes to the graph.
		for(Component component : analysisConfiguration.getComponents()) {
			for(KnowledgeField<?> field : component.getKnowledgeFields()) {
				graph.addNode(field);
			}
		}
		
		// Add processes edges to the graph.
		for(Component component : analysisConfiguration.getComponents()) {
			addEdgesForTasks(graph, component.getProcesses());
		}
		
		// Add ensembles edges to the graph.
		addEdgesForTasks(graph, analysisConfiguration.getStaticEnsembles());
		
		try {
			// Get topologically ordered fields.
			Collection<KnowledgeField<?>> orderedFields = graph.getTopologicallyOrderedValues();
			
			// Analyze field one by one in topological order.
			for(KnowledgeField<?> knowledgeFieldInstance : orderedFields) {
				Task task = knowledgeFieldInstance.getOutputOfPeriodic();
				if (task != null) {
					try {
						task.evaluateVector();
					} catch (Exception ex) { // Can be thrown from a custom user function.						
						StringWriter sw = new StringWriter();
						PrintWriter pw = new PrintWriter(sw);
						ex.printStackTrace(pw);
						String stackTrace = sw.toString();
						
						errorReporter.reportError(task, 
								"Exception thrown from the evaluation function"
								+ "<br> Message: <br>"
								+ ex.getMessage()
								+ "<br> Stack trace: <br>"
								+ stackTrace);
						
						abstractOutputPrinter.printErrorReport(errorReporter);
						return;
					}
				}
			}
		
			// Calculate execution time
			long durationInMs = (System.nanoTime() - start) / 1000000;
			
			// Print results
			boolean result = abstractOutputPrinter.printReport(analysisConfiguration, durationInMs);		
			if (!result) {
				System.out.println("Printing of results has failed!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}
	
	/**
	 * Adds oriented edges to the given graph. Edges are oriented from the inputs to the outputs of
	 * the given task instance.
	 */
	private void addEdgesForTasks(
			OrientedGraph<KnowledgeField<?>> graph, Collection<? extends Task> tasks) {
		for(Task task : tasks) {
			for(KnowledgeField<?> inputField : task.getInputFields()) {
				for(KnowledgeField<?> outputField : task.getOutputFields()) {
					graph.addOrientedEdge(inputField, outputField);
				}
			}
		}
	}
}
