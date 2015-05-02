package cz.cuni.mff.d3s.deeco.analysis.output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import com.google.common.base.Optional;

import cz.cuni.mff.d3s.deeco.analysis.core.AnalysisConfiguration;
import cz.cuni.mff.d3s.deeco.analysis.core.ErrorReporter;
import cz.cuni.mff.d3s.deeco.analysis.def.FuncWithEquationSet;
import cz.cuni.mff.d3s.deeco.analysis.def.Interval;
import cz.cuni.mff.d3s.deeco.analysis.entities.Component;
import cz.cuni.mff.d3s.deeco.analysis.entities.FiredAlert;
import cz.cuni.mff.d3s.deeco.analysis.entities.FuncWrapper;
import cz.cuni.mff.d3s.deeco.analysis.entities.FuncWrapperBase;
import cz.cuni.mff.d3s.deeco.analysis.entities.FuncWrapperDifferential;
import cz.cuni.mff.d3s.deeco.analysis.entities.KnowledgeField;
import cz.cuni.mff.d3s.deeco.analysis.entities.KnowledgeFieldNumeric;
import cz.cuni.mff.d3s.deeco.analysis.entities.KnowledgeFieldViaTable;
import cz.cuni.mff.d3s.deeco.analysis.entities.Process;
import cz.cuni.mff.d3s.deeco.analysis.entities.StaticEnsemble;
import cz.cuni.mff.d3s.deeco.analysis.entities.TableOfDerivatives;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

/**
 * HTML output printer implementation of {@link AbstractOutputPrinter AbstractOutputPrinter}.
 * Uses FreeMarker library as an template engine for printing the HTML content.
 */
public class HTMLOutputPrinter implements AbstractOutputPrinter {
	
	/** Folder where HTML templates are stored. */
	private static final String TemplatesDirectory = "/";
	
	private Configuration cfg;
	
	private String filePath;
	
	public HTMLOutputPrinter() {
		this("results.html");
	}
	
	public HTMLOutputPrinter(String filePath) {
		// Create and adjust the configuration freemarker
        cfg = new Configuration(Configuration.VERSION_2_3_21);
		cfg.setClassForTemplateLoading(this.getClass(), TemplatesDirectory);        
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
        
        // Check the file path
        this.filePath = filePath;
        File file = new File(filePath);
        
        boolean result = false;
        if (!file.exists()) {
        	try {
				result = file.createNewFile();
			} catch (IOException e) {
				result = false;
			}
        } else {
        	result = file.canWrite();
        }
        
		if (!result) {
			System.out.println("File path " + filePath + " is invalid!");
		}
	}
	
	public boolean printReport(AnalysisConfiguration analysisConfiguration, long duration) {
		// Prepare dictionaries and arrays.
		Map<String, Object> root = new HashMap<String, Object>();
		Collection<Object> componentsDef = new ArrayList<Object>();
		Collection<Object> componentsAnalysis = new ArrayList<Object>();
		Collection<Object> ensemblesDefs = new ArrayList<Object>();
		Collection<Object> firedAlerts = new ArrayList<Object>();		
		
		// Fill the template.
		root.put("configBeliefPropagationDelay", analysisConfiguration.getBeliefPropagationDelay());
		root.put("configRunValuesEvaluation", analysisConfiguration.getRunValueEvaluations());
		root.put("componentsDefs", componentsDef);
		root.put("staticEnsemblesDefinitions", ensemblesDefs);
		root.put("firedAlerts", firedAlerts);
		root.put("componentsInstances", componentsAnalysis);
		root.put("duration", duration / (double)1000);
		
		// Build components definitions.
		HashSet<String> printedComponents = new HashSet<>();
		for(Component componentInstance : analysisConfiguration.getComponents()) {
			if (printedComponents.contains(componentInstance.getName())) {
				continue;
			}
			
			componentsDef.add(buildComponentDefiniton(componentInstance));
			printedComponents.add(componentInstance.getName());
		}
		
		// Build static ensembles definitions.
		for(StaticEnsemble staticEnsemble : analysisConfiguration.getStaticEnsembles()) {
			ensemblesDefs.add(buildStaticEnsembleDefinition(staticEnsemble));
		}
		
		// Build fired alerts.
		for(Component componentInstance : analysisConfiguration.getComponents()) {
			for(KnowledgeField<?> field : componentInstance.getKnowledgeFields()) {
				field.checkAlerts();
				for (FiredAlert<?> firedAlert : field.getFiredAlerts()) {
					firedAlerts.add(buildFiredAlert(firedAlert));
				}
			}
		}
		
		// Build components analysis.
		for(Component component : analysisConfiguration.getComponents()) {
			componentsAnalysis.add(buildComponentAnalysis(component));
		}
		
		// Print the file
		return printFile("result.html", root);
	}
	
	public boolean printErrorReport(ErrorReporter errorReporter) {
		Map<String, Object> root = new HashMap<String, Object>();
		root.put("errors", errorReporter.getAllErrors());
		return printFile("errorResult.html", root);
	}
	
	private boolean printFile(String templateName, Object model) {
		FileWriter out = null;
		
		try {
			File file = new File(filePath);					
			out = new FileWriter(file);
			Template template = cfg.getTemplate(templateName);
			template.process(model, out);
		} catch (IOException e) {
			return false;
		} catch (TemplateException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (out != null) {
					out.close();
				}
		    } catch (IOException e) {
		    	return false;
		    }
		}
		
		return true;
	}
	
	private Map<String, Object> buildComponentDefiniton(Component component) {
		Map<String, Object> cRoot = new HashMap<String, Object>();
		cRoot.put("name", component.getName());
		cRoot.put("processDefinitions", buildProcessDefinitions(component));
		cRoot.put("knowledgeFieldsDefinitions", buildKnowledgeFieldsDefinitions(component));
		return cRoot;
	}
	
	private Map<String, Object> buildStaticEnsembleDefinition(StaticEnsemble staticEnsemble) {
		ArrayList<Map<String, Object>> wrappers = new ArrayList<Map<String, Object>>();
		
		for (FuncWrapperBase invocable : staticEnsemble.getFuncWrappers()) {
			String name = null;
			
			if (invocable instanceof FuncWrapper) {
				name = printClassType(((FuncWrapper)invocable).getFunc().getClass());
			} else if (invocable instanceof FuncWrapperDifferential) {
				Optional<FuncWithEquationSet> funcWithEquationSet = 
						((FuncWrapperDifferential)invocable).getEquationSetFunc();
				if (funcWithEquationSet.isPresent()) {
					name = printClassType(funcWithEquationSet.get().getClass());
				} else {
					name = "Set of tables of derivatives";
				}
			}
			
			ArrayList<String> inList = new ArrayList<String>();
			for (KnowledgeField<?> knowledgeField : invocable.getInputFields()) {
				inList.add(knowledgeField.getName());
			}
			
			Map<String, Object> wRoot = new HashMap<String, Object>();
			wRoot.put("name", name);
			wRoot.put("inFields", inList);
			wRoot.put("outField", invocable.getOutputField().getName());
			wRoot.put("delay", staticEnsemble.getDelay(invocable.getOutputField().isUsedAsInput()));
			wrappers.add(wRoot);
		}
		
		Map<String, Object> eRoot = new HashMap<>();
		eRoot.put("name", staticEnsemble.getName());
		eRoot.put("period", staticEnsemble.getPeriod().isPresent()
				? staticEnsemble.getPeriod().get()
				: "Triggered");
		eRoot.put("deadline", staticEnsemble.getDeadline());
		eRoot.put("wrappers", wrappers);
		eRoot.put("member", staticEnsemble.getMember().getInstanceName());
		eRoot.put("coordinator", staticEnsemble.getCoordinator().getInstanceName());
		return eRoot;
	}
	
	private Object buildKnowledgeFieldsDefinitions(Component component) {
		Collection<Map<String, Object>> fields = new ArrayList<Map<String, Object>>();
		
		for(KnowledgeField<?> field : component.getKnowledgeFields()) {
			Map<String, Object> fRoot = new HashMap<>();
			fRoot.put("name", field.getName());
			fRoot.put("type", field.getTypeName());
			if (field instanceof KnowledgeFieldNumeric) {
				Optional<Double> multiplier = ((KnowledgeFieldNumeric) field).getMultiplier();
				if (multiplier.isPresent()) {
					fRoot.put("multiplier", multiplier.get().toString());
				}
			}
			
			if (field instanceof KnowledgeFieldViaTable) {				
				KnowledgeFieldViaTable fieldViaTable = ((KnowledgeFieldViaTable) field);				
				fRoot.put("upperTable", 
						fieldViaTable.getUpperBoundTable().getOriginalValuesAndDerivatives());
				fRoot.put("lowerTable", 
						fieldViaTable.getLowerBoundTable().getOriginalValuesAndDerivatives());
				
				TableOfDerivatives table = fieldViaTable.getUpperBoundTable();
				
				Optional<Double> multiplier = table.getValuesMultiplier();
				if (multiplier.isPresent()) {
					fRoot.put("valuesMultiplier", multiplier.get().toString());
				}
				
				multiplier = table.getDerivativesMultiplier();
				if (multiplier.isPresent()) {
					fRoot.put("derivativesMultiplier", multiplier.get().toString());
				}
			}
			
			fields.add(fRoot);
		}
		
		return fields;
	}
	
	private Object buildProcessDefinitions(Component component) {
		Collection<Map<String, Object>> processes = new ArrayList<Map<String, Object>>();
		
		for(Process process : component.getProcesses()) {
			ArrayList<Map<String, Object>> wrappers = new ArrayList<Map<String, Object>>();
			
			for (FuncWrapperBase invocable : process.getFuncWrappers()) {
				String name = null;
				
				if (invocable instanceof FuncWrapper) {
					name = printClassType(((FuncWrapper)invocable).getFunc().getClass());
				} else if (invocable instanceof FuncWrapperDifferential) {
					Optional<FuncWithEquationSet> funcWithEquationSet = 
							((FuncWrapperDifferential)invocable).getEquationSetFunc();
					if (funcWithEquationSet.isPresent()) {
						name = printClassType(funcWithEquationSet.get().getClass());
					} else {
						name = "Set of tables of derivatives";
					}
				}
				
				ArrayList<String> inList = new ArrayList<String>();
				for (KnowledgeField<?> knowledgeField : invocable.getInputFields()) {
					inList.add(knowledgeField.getName());
				}
				
				Map<String, Object> wRoot = new HashMap<String, Object>();
				wRoot.put("name", name);
				wRoot.put("inFields", inList);
				wRoot.put("outField", invocable.getOutputField().getName());
				wRoot.put("delay", process.getDelay(invocable.getOutputField().isUsedAsInput()));
				wrappers.add(wRoot);
			}
		
			Map<String, Object> pRoot = new HashMap<String, Object>();
			pRoot.put("name", process.getName());
			pRoot.put("wrappers", wrappers);
			pRoot.put("period", process.getPeriod().isPresent()
					? process.getPeriod().get()
					: "Triggered");
			pRoot.put("deadline", process.getDeadline());			
			processes.add(pRoot);
		}
		
		return processes;
	}
	
	private Map<String, Object> buildComponentAnalysis(Component componentInstance) {
		Map<String, Object> cRoot = new HashMap<String, Object>();
		cRoot.put("name", componentInstance.getName());
		cRoot.put("instanceName", componentInstance.getInstanceName());
		cRoot.put("knowledgeFieldsAffections", buildKnowledgeFieldsAffections(componentInstance));
		return cRoot;
	}
	
	private Map<String, Object> buildFiredAlert(FiredAlert<?> firedAlert) {
		Map<String, Object> aRoot = new HashMap<String, Object>();
		aRoot.put("name", firedAlert.getAlert().getClass().getSimpleName());
		aRoot.put("upperBound", firedAlert.getValue().getUpperBound());
		aRoot.put("lowerBound", firedAlert.getValue().getLowerBound());
		return aRoot;
	}
	
	private Object buildKnowledgeFieldsAffections(Component componentInstance) {
		Collection<Map<String, Object>> affections = new ArrayList<Map<String, Object>>();
				
		for(KnowledgeField<?> field : componentInstance.getKnowledgeFields()) {
			Map<String, Object> aRoot = new HashMap<String, Object>();
			aRoot.put("name", field.getName());
			aRoot.put("delay", field.getDelay());
			aRoot.put("componentName", componentInstance.getName());
				
			ArrayList<KnowledgeField<?>> dimensions = null;
			
			if (field.isShowPivots()) {
				dimensions = new ArrayList<KnowledgeField<?>>(field.getInputDimensions());
			} else {
				dimensions = new ArrayList<KnowledgeField<?>>();
			}
			
			Collection<Map<String, Object>> dimensionsNames = new ArrayList<Map<String, Object>>();
			boolean[] droppedDimensions = new boolean[dimensions.size()];
			
			int d = 0;
			for(KnowledgeField<?> dimension : dimensions) {
				for(int dd = 0; dd < d; ++dd) {
					KnowledgeField<?> previousDimension = dimensions.get(dd);
					if (previousDimension.equals(dimension)) {
						droppedDimensions[d] = true;
						break;
					}
				}
				
				if (!droppedDimensions[d]) {
					Map<String, Object> dRoot = new HashMap<String, Object>();
					dRoot.put("component", dimension.getComponent().getInstanceName());
					dRoot.put("field", dimension.getName());
					dimensionsNames.add(dRoot);
				}
				
				d++;
			}
										
			String rows = "";
			Interval<String> strInterval;
			for(int i = 0; i < field.getValuesCount(); ++i) {
				rows += "<tr>";
				
				Integer[] dimensionsIndices = field.getDimensionsIndicesForIndex(i);
				
				int c = 0;
				for(KnowledgeField<?> dimension : dimensions) {
					if (droppedDimensions[c]) {
						c++;
						continue;
					}
					
					strInterval = dimension.getValueForOutput(
							dimensionsIndices[c]).getStringInterval();
					rows += "<td>"+strInterval.getUpperBound()+"</td>";
					rows += "<td>"+strInterval.getLowerBound()+"</td>";
					++c;
				}
				
				strInterval = field.getValueForOutput(i).getStringInterval();
				rows += "<td>"+strInterval.getUpperBound()+"</td>";
				rows += "<td>"+strInterval.getLowerBound()+"</td>";
				
				rows += "</tr>";
			}
			
			aRoot.put("dimensions", dimensionsNames);
			aRoot.put("values", rows);
			affections.add(aRoot);
		}
		
		return affections;
	}
	
	private String printClassType(Class<?> clazz) {
		return "<span title=\""+clazz.getName()+"\">" + clazz.getSimpleName() + "</span>";
	}
}
