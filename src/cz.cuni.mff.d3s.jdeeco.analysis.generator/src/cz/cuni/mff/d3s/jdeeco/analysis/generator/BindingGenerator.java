package cz.cuni.mff.d3s.jdeeco.analysis.generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import cz.cuni.mff.d3s.jdeeco.analysis.generator.utils.FileUtils;
import cz.cuni.mff.d3s.jdeeco.analysis.generator.utils.GeneratorUtils;
import cz.cuni.mff.d3s.jdeeco.analysis.generator.utils.StringUtils;
import analysismetamodel.*;
import freemarker.template.TemplateException;

/**
 * Generates necessary glue code into a class called TimingAnalysis. Generates code heavily depends
 * on a code generated from the {@see ClassGenerator class generator}.
 */
public class BindingGenerator extends AbstractGenerator {

	/**
	 * @param packge Package into which the class TimingAnalysis will be generated.
	 */
	public BindingGenerator(FileUtils generatorUtils, String packge) {
		super(generatorUtils, packge);
	}
	
	@Override
	public void generateCodeForModel(Model model) throws IOException, TemplateException {
		Collection<String> knowledgeFieldsDefinitions = generateKnowledgeFieldsDefinitions(model);
				
		Map<String, Object> root = new HashMap<String, Object>();
		root.put("package", packge);
		root.put("beliefPropDelay", model.getBeliefPropagationDelay());
		root.put("componentsDefinitions", generateComponentDefinitions(model));
		root.put("knowledgeFieldsDefinitions",
				StringUtils.buildIndentedString("\t\t", knowledgeFieldsDefinitions));
		root.put("processes", generateProcessesDefinitions(model));
		root.put("ensembles", generateEnsemblesDefinitions(model));
		root.put("alertsDefinitions", generateAlertsDefinitions(model));
				
		fileUtils.createFileFromTemplate("bindings.ftl", root, "TimingAnalysis", "core");
		
		System.out.println("[DONE]    Generating file core/TimingAnalysis");
	}
	
	/** 
	 * Generates definition for each component instance in the system.
	 * @return Map of values for the template.
	 */
	private Collection<Map<String, Object>> generateComponentDefinitions(Model model) {
		Collection<Map<String, Object>> componentsDefs = new ArrayList<Map<String, Object>>();
		for (ComponentInstance component : model.getComponentInstances()) {
			Map<String, Object> cRoot = new HashMap<String, Object>();
			cRoot.put("instanceId", naming.getComponentInstanceId(component));
			cRoot.put("instanceName", component.getName());
			cRoot.put("name", component.getComponent().getName());
			componentsDefs.add(cRoot);
		}
		
		return componentsDefs;
	}
	
	/**
	 * Generates source code defining all knowledge fields of all instances in the system and their
	 * binding to the analysis. Also defines table of derivatives and their assignments.
	 * @return Collection of lines of the source code.
	 */
	private Collection<String> generateKnowledgeFieldsDefinitions(Model model) {
		Collection<String> knowledgeFieldsDefinitions = new ArrayList<String>();
		
		// Custom intervals
		HashMap<String, String> intervalImpls = GeneratorUtils.getDefaultIntervalsImplementors();		
		for(CustomInterval interval : model.getCustomIntervals()) {
			intervalImpls.put(interval.getWrappedType(), interval.getClazz());
		}
		
		for (ComponentInstance componentInstance : model.getComponentInstances()) {			
			for(Knowledge knowledge : componentInstance.getComponent().getKnowledges()) {
				String knowledgeId = naming.getKnowledgeId(knowledge, componentInstance);
				String componentId = naming.getComponentInstanceId(componentInstance);
				knowledgeFieldsDefinitions.add("");
				
				if (knowledge instanceof NumericKnowledge) {
					NumericKnowledge nKnowledge = (NumericKnowledge)knowledge;
					
					if (nKnowledge.getTableOfDerivatives() == null) {
						knowledgeFieldsDefinitions.add(
								StringUtils.replace(
										"KnowledgeFieldNumeric {{0}} ="
										+ " new KnowledgeFieldNumeric({{1}}, \"{{2}}\");", 
										knowledgeId, componentId, knowledge.getName())
										);
					} else {
						TableOfDerivatives table = nKnowledge.getTableOfDerivatives();
						
						Collection<Double> upValues = new ArrayList<Double>();
						Collection<Double> upDerivations = new ArrayList<Double>();
						Collection<Double> lowValues = new ArrayList<Double>();
						Collection<Double> lowDerivations = new ArrayList<Double>();
						
						for (TableRow row : table.getUpperBoundTable().getRows()) {
							upValues.add(row.getValue());
							upDerivations.add(row.getDerivative());
						}
						
						for (TableRow row : table.getLowerBoundTable().getRows()) {
							lowValues.add(row.getValue());
							lowDerivations.add(row.getDerivative());
						}
						
						knowledgeFieldsDefinitions.add(
								StringUtils.replace(
										"TableOfDerivatives {{0}}_upTable = "
										+ "new TableOfDerivatives(\n\t\t"
										+ "new double[] { {{1}} }, \n\t\t"
										+ "new double[] { {{2}} });",
										knowledgeId,
										StringUtils.joinWithComma(upValues.toArray()), 
										StringUtils.joinWithComma(upDerivations.toArray()))
										);
						
						knowledgeFieldsDefinitions.add(
								StringUtils.replace(
										"TableOfDerivatives {{0}}_loTable = "
										+ "new TableOfDerivatives(\n\t\t"
										+ "new double[] { {{1}} }, \n\t\t"
										+ "new double[] { {{2}} });",
										knowledgeId,
										StringUtils.joinWithComma(lowValues.toArray()), 
										StringUtils.joinWithComma(lowDerivations.toArray()))
										);
						
						if (table.getValuesMultiplier() != 0) {
							knowledgeFieldsDefinitions.add(
									StringUtils.replace("{{0}}_upTable.setMultiplier({{1}});", 
											knowledgeId, table.getValuesMultiplier())
									);
							knowledgeFieldsDefinitions.add(
									StringUtils.replace("{{0}}_loTable.setMultiplier({{1}});", 
											knowledgeId, table.getValuesMultiplier())
									);
						}
						
						if (table.getDerivativesMutliplier() != 0) {
							knowledgeFieldsDefinitions.add(
									StringUtils.replace(
											"{{0}}_upTable.setDerivativesMultiplier({{1}});", 
											knowledgeId, table.getDerivativesMutliplier())
									);
							knowledgeFieldsDefinitions.add(
									StringUtils.replace(
											"{{0}}_loTable.setDerivativesMultiplier({{1}});",
											knowledgeId, table.getDerivativesMutliplier())
									);
						}
						
						knowledgeFieldsDefinitions.add(
								StringUtils.replace(
										"KnowledgeFieldViaTable {{0}} = new KnowledgeFieldViaTable("
										+ "{{1}}, \"{{2}}\", {{0}}_upTable, {{0}}_loTable);", 
										knowledgeId, componentId, knowledge.getName())
										);	
					}
				} else {
					knowledgeFieldsDefinitions.add(
							StringUtils.replace("KnowledgeField<{{0}}> {{1}} ="
									+ " new KnowledgeField<{{0}}>({{2}}, \"{{3}}\", {{0}}.class);", 
									GeneratorUtils.getKnowledgeType(knowledge),
									knowledgeId, 
									componentId, 
									knowledge.getName()));
				}
				
				/* Set default values for knowledge */
				DefaultValue selectedDefault = null;
				
				if (knowledge.getDefaultValues() != null) {
					for(DefaultValue defaultValue : knowledge.getDefaultValues()) {
						if (defaultValue.getComponentInstance() == null) {
							selectedDefault = defaultValue;
						} else if (defaultValue.getComponentInstance() == componentInstance) {
							selectedDefault = defaultValue;
							break;
						}
					}
					
					if (selectedDefault != null) {
												
						if (selectedDefault instanceof DefaultValueByEnumeration) {
							EList<String> values = 
									((DefaultValueByEnumeration)selectedDefault).getValue();
							String[] strValues = new String[values.size()];
							
							String intervalType = intervalImpls
									.get(GeneratorUtils.getKnowledgeType(knowledge));
							intervalType = intervalType != null ? intervalType : "";
							
							for(int i = 0; i < values.size(); ++i) {
								strValues[i] = "new " 
										+ intervalType
										+ "("
										+ values.get(i) + "," + values.get(i)
										+ ")";
							}
							
							knowledgeFieldsDefinitions.add(StringUtils.replace(
									"{{0}}.setDefaultVector(new {{1}}[] {{{2}}});", 
									knowledgeId, 
									intervalType, 
									StringUtils.joinWithComma(strValues)));
							
						} else {
							/* Generator */
							DefaultValueByGenerator byGenerator =
									(DefaultValueByGenerator)selectedDefault;
							
							CustomGenerator generator = byGenerator.getGenerator();
							
							knowledgeFieldsDefinitions.add(StringUtils.replace(
									"{{0}} {{1}}_generator = new {{0}}();", 
									generator.getClazz(), knowledgeId));
							
							knowledgeFieldsDefinitions.add(StringUtils.replace(
									"{{0}}_generator.InitGenerator({{1}}, {{2}}, {{3}});", 
									knowledgeId,
									byGenerator.getStart(),
									byGenerator.getEnd(),
									byGenerator.getCount()));
							
							knowledgeFieldsDefinitions.add(StringUtils.replace(
									"{{0}}.setDefaultVector({{0}}_generator);",
									knowledgeId));
						}
					}
				}
				
				/* IsPivot */
				if (knowledge.isIsPivot()) {
					knowledgeFieldsDefinitions.add(StringUtils.replace(
							"{{0}}.setIsPivot(true);", knowledgeId));
				}
				
				/* Show pivot*/
				if (knowledge.isShowPivot()) {
					knowledgeFieldsDefinitions.add(StringUtils.replace(
							"{{0}}.setShowPivots(true);", knowledgeId));
				}
				
				if (knowledge instanceof NumericKnowledge) {
					// Multiplier
					NumericKnowledge nKnowledge = (NumericKnowledge)knowledge;
					if (nKnowledge.getMultiplier() != 0) {
						knowledgeFieldsDefinitions.add(StringUtils.replace(
								"{{0}}.setMultiplier({{1}});", 
								knowledgeId, 
								nKnowledge.getMultiplier()));
					}
					
					// Precision
					if (nKnowledge.getPrecision() > 0) {
						knowledgeFieldsDefinitions.add(StringUtils.replace(
								"{{0}}.setPrecision({{1}});", 
								knowledgeId,
								nKnowledge.getPrecision()));
					}
				}
			}
		}

		return knowledgeFieldsDefinitions;
	}
	
	/**
	 * Generates source code binding processes to their implementation and knowledge fields.
	 * @return Map of values for the template.
	 */
	private Collection<Map<String, Object>> generateProcessesDefinitions(Model model) {		
		Collection<Map<String, Object>> processes = new ArrayList<Map<String, Object>>();
		
		for (ComponentInstance componentInstance : model.getComponentInstances()) {
			for(ComponentProcess process : componentInstance
					.getComponent().getComponentProcesses()) {
								
				Map<String, Object> proot = new HashMap<String, Object>();
				proot.put("name", process.getName());
				proot.put("id", naming.getProcessId(process, componentInstance));
				proot.put("componentInstanceId", naming.getComponentInstanceId(componentInstance));
				proot.put("deadline", process.getDeadline());
				proot.put("period", process.getPeriod());
				Collection<Object> invocablesCustomFunc = new ArrayList<Object>();
				Collection<Object> invocablesEQSet = new ArrayList<Object>();
				
				for (ProcessInvocableByCustomFunc invocable : process.getInvocablesByCustomFunc()) {
					Collection<String> inputs = new ArrayList<String>();
					for(Knowledge knowledge : invocable.getInputKnowledges()) {
						inputs.add(naming.getKnowledgeId(knowledge, componentInstance));
					}
								
					Map<String, Object> iroot = new HashMap<String, Object>();
					iroot.put("impl", naming.getProcessClassImpl(
							process,
							componentInstance.getComponent(),
							invocable.getOutputKnowledge()));
					iroot.put("implVar", naming.getProcessClassImplVar(
									process, componentInstance, invocable.getOutputKnowledge()));
					iroot.put("output", naming.getKnowledgeId(
							invocable.getOutputKnowledge(), componentInstance));
					iroot.put("inputs", StringUtils.joinWithComma(inputs.toArray()));
					iroot.put("cartesian", invocable.isDoCartesianProduct() ? "true" : "false");
					
					invocablesCustomFunc.add(iroot);
				}
				
				for (ProcessInvocableByEQSet invocable : process.getInvocablesByEQSet()) {
					Collection<String> inputs = new ArrayList<String>();
					boolean funcWithEquationSetNeeded = false;
					for(NumericKnowledge knowledge : invocable.getInputKnowledges()) {
						inputs.add(naming.getKnowledgeId(knowledge, componentInstance));
						if (knowledge.getTableOfDerivatives() == null) {
							funcWithEquationSetNeeded = true;
						}
					}
								
					Map<String, Object> iroot = new HashMap<String, Object>();
					iroot.put("impl", funcWithEquationSetNeeded
							? ", new "
								+ naming.getProcessClassImpl(
										process, componentInstance.getComponent(),
										invocable.getOutputKnowledge())
								+ "()"
							: "");
					iroot.put("output", naming.getKnowledgeId(
							invocable.getOutputKnowledge(), componentInstance));
					iroot.put("inputs", StringUtils.joinWithComma(inputs.toArray()));
					iroot.put("cartesian", invocable.isDoCartesianProduct() ? "true" : "false");
					
					invocablesEQSet.add(iroot);
				}
				
				proot.put("invocablesCustomFunc", invocablesCustomFunc);
				proot.put("invocablesEQSet", invocablesEQSet);
				processes.add(proot);
			}
		}
		
		return processes;
	}
	
	/**
	 * Generates source code binding ensembles with knowledge fields and their classes.
	 * @return Map of values for the template.
	 */
	private Collection<Map<String, Object>> generateEnsemblesDefinitions(Model model) {		
		Collection<Map<String, Object>> ensembles = new ArrayList<Map<String, Object>>();
		
		for (StaticEnsemble ensemble : model.getStaticEnsembles()) {								
			Map<String, Object> proot = new HashMap<String, Object>();
			proot.put("name", ensemble.getName());
			proot.put("id", naming.getEnsembleId(ensemble));
			proot.put("deadline", ensemble.getDeadline());
			proot.put("period", ensemble.getPeriod());
			proot.put("coordinator", naming.getComponentInstanceId(ensemble.getCoordinator()));
			proot.put("member", naming.getComponentInstanceId(ensemble.getMember()));
			Collection<Object> invocablesCustomFunc = new ArrayList<Object>();
			Collection<Object> invocablesEQSet = new ArrayList<Object>();
			
			for (EnsembleInvocableByCustomFunc invocable : ensemble.getInvocablesByCustomFunc()) {
				Collection<String> inputs = new ArrayList<String>();
				for(KnowledgeBinding knowledgeBinding : invocable.getInputKnowledgeBindings()) {
					ComponentInstance componentInstance = 
							getComponentOfEnsembleKnowledge(ensemble, knowledgeBinding);
					inputs.add(naming.getKnowledgeId(
							knowledgeBinding.getKnowledge(), componentInstance));
				}
				
				Knowledge outputKnowledge = invocable.getOutputKnowledgeBinding().getKnowledge();
				ComponentInstance outputKnowledgeComponentInstance =
						getComponentOfEnsembleKnowledge(ensemble,
								invocable.getOutputKnowledgeBinding());
							
				Map<String, Object> iroot = new HashMap<String, Object>();
				iroot.put("impl", naming.getEnsembleClassImpl(ensemble, outputKnowledge));
				iroot.put("output", naming.getKnowledgeId(outputKnowledge, 
						outputKnowledgeComponentInstance));
				iroot.put("inputs", StringUtils.joinWithComma(inputs.toArray()));
				iroot.put("cartesian", invocable.isDoCartesianProduct() ? "true" : "false");
				
				invocablesCustomFunc.add(iroot);
			}
			
			for (EnsembleInvocableByEQSet invocable : ensemble.getInvocablesByEQSet()) {
				Collection<String> inputs = new ArrayList<String>();
				boolean funcWithEquationSetNeeded = false;				
				for(NumericKnowledgeBinding knowledgeBinding : invocable
						.getInputKnowledgeBindings()) {
					ComponentInstance componentInstance = 
							getComponentOfEnsembleKnowledge(ensemble, knowledgeBinding);
					inputs.add(naming.getKnowledgeId(
							knowledgeBinding.getKnowledge(), componentInstance));
					if (knowledgeBinding.getKnowledge().getTableOfDerivatives() == null) {
						funcWithEquationSetNeeded = true;
					}
				}
				
				Knowledge outputKnowledge = invocable.getOutputKnowledgeBinding().getKnowledge();
				ComponentInstance outputKnowledgeComponentInstance =
						getComponentOfEnsembleKnowledge(ensemble,
								invocable.getOutputKnowledgeBinding());
							
				Map<String, Object> iroot = new HashMap<String, Object>();
				iroot.put("impl", funcWithEquationSetNeeded
						? ", new " + naming.getEnsembleClassImpl(ensemble, outputKnowledge) + "()"
						: "");
				iroot.put("output", naming.getKnowledgeId(
						outputKnowledge, outputKnowledgeComponentInstance));
				iroot.put("inputs", StringUtils.joinWithComma(inputs.toArray()));
				iroot.put("cartesian", invocable.isDoCartesianProduct() ? "true" : "false");
				
				invocablesEQSet.add(iroot);
			}
			
			proot.put("invocablesCustomFunc", invocablesCustomFunc);
			proot.put("invocablesEQSet", invocablesEQSet);
			ensembles.add(proot);
		}
		
		return ensembles;
	}
	
	/**
	 * Generates source code binding alerts to their implementation and to the analysis.
	 * @return Map of values for the template.
	 */
	private Collection<Map<String, Object>> generateAlertsDefinitions(Model model) {
		Collection<Map<String, Object>> alertsDefinitions = new ArrayList<Map<String, Object>>();
		
		int i = 0;
		for (Alert alert : model.getAlerts()) {
			Collection<String> fields = new ArrayList<String>();
			for(ComponentInstance componentInstance : model.getComponentInstances()) {
				if(componentInstance
						.getComponent().getKnowledges().contains(alert.getKnowledge())) {
					fields.add(naming.getKnowledgeId(alert.getKnowledge(), componentInstance));			
				}
			}
			
			Map<String, Object> aroot = new HashMap<String, Object>();
			aroot.put("id", "alert" + i);
			aroot.put("impl", naming.getAlertClassImpl(alert));
			aroot.put("fields", fields);
			alertsDefinitions.add(aroot);
			
			++i;
		}
		
		return alertsDefinitions;
	}
	
	/** Returns a component instance into which the binded numeric knowledge belongs. */
	private ComponentInstance getComponentOfEnsembleKnowledge(
			StaticEnsemble ensemble, NumericKnowledgeBinding knowledgeBinding) {
		return knowledgeBinding.getEnsembleSide() == EnsembleSide.COORDINATOR
					? ensemble.getCoordinator()
					: ensemble.getMember();
	}
	
	/** Returns a component instance into which the binded knowledge belongs. */
	private ComponentInstance getComponentOfEnsembleKnowledge(
			StaticEnsemble ensemble, KnowledgeBinding knowledgeBinding) {
		return knowledgeBinding.getEnsembleSide() == EnsembleSide.COORDINATOR
				? ensemble.getCoordinator()
				: ensemble.getMember();
	}
}
