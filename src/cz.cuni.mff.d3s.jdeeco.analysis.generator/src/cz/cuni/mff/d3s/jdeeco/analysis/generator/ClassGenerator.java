package cz.cuni.mff.d3s.jdeeco.analysis.generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cz.cuni.mff.d3s.jdeeco.analysis.generator.utils.FileUtils;
import cz.cuni.mff.d3s.jdeeco.analysis.generator.utils.GeneratorUtils;
import cz.cuni.mff.d3s.jdeeco.analysis.generator.utils.StringUtils;
import freemarker.template.TemplateException;
import analysismetamodel.*;

/**
 * Generates stand-alone source files with entities' definitions and source files into which
 * user implementation should be placed.
 */
public class ClassGenerator extends AbstractGenerator {
	/** Whether files containing user implementation can be overwritten. */
	boolean overrideImpl;
	
	/**
	 * @param packge Package into which the class TimingAnalysis will be generated.
	 * @param overrideImpl Whether files containing user implementation can be overwritten.
	 */
	public ClassGenerator(FileUtils generatorUtils, String packge, boolean overrideImpl) {
		super(generatorUtils, packge);
		this.overrideImpl = overrideImpl;
	}
	
	@Override
	public void generateCodeForModel(Model model) throws IOException, TemplateException {
		for(Component component : model.getComponents()) {
			for(ComponentProcess componentProcess : component.getComponentProcesses()) {
				generateProcessClasses(component, componentProcess);
			}
		}
		
		for(StaticEnsemble staticEnsemble : model.getStaticEnsembles()) {
			generateEnsembleClasses(staticEnsemble);
		}
		
		for(Alert alert : model.getAlerts()) {
			generateAlertClass(alert);
		}
	}
	
	/**
	 * Generates source files for the given process.
	 */
	protected void generateProcessClasses(Component component, ComponentProcess componentProcess) 
			throws TemplateException, IOException {
		
		for (ProcessInvocableByCustomFunc invocable : 
				componentProcess.getInvocablesByCustomFunc()) {
			String className = naming.getProcessClass(
					componentProcess, component, invocable.getOutputKnowledge());
			generateInvocableByCustom(
					className, invocable.getOutputKnowledge(), invocable.getInputKnowledges());
		}
		
		for (ProcessInvocableByEQSet invocable : componentProcess.getInvocablesByEQSet()) {
			String className = naming.getProcessClass(
					componentProcess, component, invocable.getOutputKnowledge());
			generateInvocableByEQSet(
					className, invocable.getOutputKnowledge(), invocable.getInputKnowledges());
		}
	}
	
	/**
	 * Generates source files for the given static ensemble.
	 */
	protected void generateEnsembleClasses(StaticEnsemble staticEnsemble) 
			throws TemplateException, IOException {
		
		for (EnsembleInvocableByCustomFunc invocable : staticEnsemble.getInvocablesByCustomFunc()) {	
			Collection<Knowledge> inputKnowledges = new ArrayList<Knowledge>();
			for(KnowledgeBinding knowledgeBinding : invocable.getInputKnowledgeBindings()) {
				inputKnowledges.add(knowledgeBinding.getKnowledge());
			}
			
			Knowledge outputKnowledge = invocable.getOutputKnowledgeBinding().getKnowledge();	
			String className = naming.getEnsembleClass(staticEnsemble, outputKnowledge);
			generateInvocableByCustom(className, outputKnowledge, inputKnowledges);
		}
		
		for (EnsembleInvocableByEQSet invocable : staticEnsemble.getInvocablesByEQSet()) {	
			Collection<NumericKnowledge> inputKnowledges = new ArrayList<NumericKnowledge>();
			for(NumericKnowledgeBinding knowledgeBinding : invocable.getInputKnowledgeBindings()) {
				inputKnowledges.add(knowledgeBinding.getKnowledge());
			}
			
			NumericKnowledge outputKnowledge = invocable.getOutputKnowledgeBinding().getKnowledge();			
			String className = naming.getEnsembleClass(staticEnsemble, outputKnowledge);
			generateInvocableByEQSet(className, outputKnowledge, inputKnowledges);
		}
	}
	
	/**
	 * Generates a source file for the given alert.
	 */
	protected void generateAlertClass(Alert alert) throws IOException, TemplateException {
		String className = naming.getAlertClassImpl(alert);
		Map<String, String> root = new HashMap<String, String>();
		root.put("package", packge);
		root.put("name", className);
		root.put("knowledgeType", GeneratorUtils.getKnowledgeType(alert.getKnowledge()));
		
		if (overrideImpl || !fileUtils.checkIfFileExists(className, "impl")) {
			fileUtils.createFileFromTemplate("alert.ftl", root, className, "impl");
			
			System.out.println("[DONE]    Generating file impl/" + className);
		} else {
			System.out.println("[SKIPPED] Generating file impl/" + className);
		}
	}
	
	/**
	 * Generates source files for a task (Process or Ensemble) with a custom function.
	 */
	protected void generateInvocableByCustom(
			String className, Knowledge outputKnowledge, Collection<Knowledge> inputKnowledges)
					throws TemplateException, IOException {
		
		int argsCnt = inputKnowledges.size();
		
		String functionIN = "";
		String functionIN2 = "";
		
		int i = 0;
		for(Knowledge knowledge : inputKnowledges) {
			String knowledgeName = knowledge.getName();
			String knowledgeType = GeneratorUtils.getKnowledgeType(knowledge);
			
			functionIN += StringUtils
					.replace(", (Interval<{{0}}>) values[{{1}}]", knowledgeType, i);
			functionIN2 += StringUtils
					.replace(", Interval<{{0}}> {{1}}", knowledgeType, knowledgeName);
			++i;
		}

		Map<String, Object> root = new HashMap<String, Object>();
		root.put("package", packge);
		
		root.put("functionOUT", GeneratorUtils.getKnowledgeType(outputKnowledge));
		root.put("functionIN", functionIN);
		root.put("functionIN2", functionIN2);
		root.put("superClassName", "Func"+argsCnt+"Args");
		
		root.put("className", className);
		fileUtils.createFileFromTemplate(
				"invocableByCustomFuncDefinition.ftl", root, className, "definitions");
		
		System.out.println("[DONE]    Generating file definitions/" + className);
		
		if (overrideImpl || !fileUtils.checkIfFileExists(className + "Impl", "impl")) {
			fileUtils.createFileFromTemplate(
					"invocableByCustomFuncImpl.ftl", root, className + "Impl", "impl");
			
			System.out.println("[DONE]    Generating file impl/" + className + "Impl");
		} else {
			System.out.println("[SKIPPED] Generating file impl/" + className + "Impl");
		}
	}
	
	/**
	 * Generates source files for a task (Process or Ensemble) with an equation set function.
	 */
	protected void generateInvocableByEQSet(
			String className,
			NumericKnowledge outputKnowledge,
			Collection<NumericKnowledge> inputKnowledges) 
					throws TemplateException, IOException {
		
		String assignements = "t";
		String arguments = "double t";		
		Collection<Object> methods = new ArrayList<Object>();
		
		int i = 0;
		for (Knowledge knowledge : inputKnowledges) {
			assignements += StringUtils.replace(", values[{{0}}], valuesDerivatives[{{0}}]", i);
			arguments += StringUtils
					.replace(", double {{0}}, double {{0}}Derivative", knowledge.getName());
			++i;
		}
		
		i = 0;
		int g = 0;
		for (NumericKnowledge knowledge : inputKnowledges) {
			if (knowledge.getTableOfDerivatives() == null) {
				Map<String, Object> method = new HashMap<String, Object>();
				method.put("name", knowledge.getName());
				method.put("args", arguments);
				method.put("assignments", assignements);
				method.put("i", i);
				methods.add(method);
				++g;
			}
			++i;
		}
		
		if (g == 0) {
			return;
		}
		
		Map<String, Object> root = new HashMap<String, Object>();
		root.put("package", packge);
		root.put("className", className);
		root.put("methods", methods);
		
		fileUtils.createFileFromTemplate(
				"invocableByEQSetDefinition.ftl", root, className, "definitions");
		
		System.out.println("[DONE]    Generating file definitions/" + className);
		
		if (overrideImpl || !fileUtils.checkIfFileExists(className + "Impl", "impl")) {
			fileUtils.createFileFromTemplate(
					"invocableByEQSetImpl.ftl", root, className + "Impl", "impl");
			
			System.out.println("[DONE]    Generating file impl/" + className + "Impl");
		} else {
			System.out.println("[SKIPPED] Generating file impl/" + className + "Impl");
		}
	}
}
