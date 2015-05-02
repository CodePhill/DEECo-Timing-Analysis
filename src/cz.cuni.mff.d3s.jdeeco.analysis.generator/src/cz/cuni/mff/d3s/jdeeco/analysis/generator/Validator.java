package cz.cuni.mff.d3s.jdeeco.analysis.generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import cz.cuni.mff.d3s.jdeeco.analysis.generator.utils.GeneratorUtils;
import cz.cuni.mff.d3s.jdeeco.analysis.generator.utils.StringUtils;
import analysismetamodel.Alert;
import analysismetamodel.Component;
import analysismetamodel.ComponentInstance;
import analysismetamodel.ComponentProcess;
import analysismetamodel.CustomGenerator;
import analysismetamodel.CustomInterval;
import analysismetamodel.DefaultValue;
import analysismetamodel.DefaultValueByEnumeration;
import analysismetamodel.DefaultValueByGenerator;
import analysismetamodel.EnsembleInvocableByCustomFunc;
import analysismetamodel.EnsembleInvocableByEQSet;
import analysismetamodel.EnsembleSide;
import analysismetamodel.Knowledge;
import analysismetamodel.KnowledgeBinding;
import analysismetamodel.LowerBoundTable;
import analysismetamodel.Model;
import analysismetamodel.NumericKnowledge;
import analysismetamodel.NumericKnowledgeBinding;
import analysismetamodel.StaticEnsemble;
import analysismetamodel.TableOfDerivatives;
import analysismetamodel.UpperBoundTable;

/**
 * Validates input model of the analysis. The validator is mainly determined to check constraints 
 * which are not validated by the EMF validator. These constrains as for instance duplicities in
 * naming of components, processes, ensembles, alerts and knowledge fields. Empty string such as
 * names, type, code references. The validator should not be used without the EMF validator.
 */
public class Validator {
	/* List of error messages reported during the validation process. */
	Collection<String> errors;
	
	public Validator() {
		this.errors = new ArrayList<String>();
	}

	/**
	 * Whether provided model is valid. If the model is not valid errors are printed to the standard
	 * output.
	 */
	public boolean validate(Model model) {
		// Clear previous errors
		this.errors.clear();
		
		// Validate duplicates
		checkDuplicates(model);
		
		// Validate custom interval and create default set
		HashMap<String, String> intervalsImpls = GeneratorUtils.getDefaultIntervalsImplementors();
		for (CustomInterval customInterval : model.getCustomIntervals()) {
			checkCustomInterval(customInterval);
			intervalsImpls.put(customInterval.getWrappedType(), "");
		}
		
		// Validate each ensemble
		for(StaticEnsemble ensemble : model.getStaticEnsembles()) {
			checkStaticEnsemble(ensemble);
		}
		
		// Validate each knowledge field
		for(Component component : model.getComponents()) {
			for(Knowledge knowledge : component.getKnowledges()) {
				checkKnowledgeField(knowledge, intervalsImpls);
			}
		}
		
		// Validate custom generators
		for(CustomGenerator generator : model.getCustomGenerators()) {
			checkGenerator(generator);
		}
		
		// Print errors
		if (!errors.isEmpty()) {
			System.out.println("There were found critivcal errors in the given input model.");
			System.out.println("===========================================================");
			
			for(String error : errors) {
				System.out.println(error);
			}
			
			return false;
		} 
		
		return true;
	}
	
	/** 
	 * Checks the given knowledge field for constraints violations. These can be: empty type,
	 * incorrectly defined table of derivatives, empty array with default values, different type of
	 * a generator.
	 * 
	 * @param intervalsImpls Map between the supported types and implementation of their wrappers.
	 */
	private void checkKnowledgeField(Knowledge knowledge, HashMap<String, String> intervalsImpls) {
		if (knowledge instanceof NumericKnowledge) {
			// Verify integrity of numeric knowledge fields
			NumericKnowledge numKnowledge = (NumericKnowledge) knowledge;
			TableOfDerivatives tableOfDerivatives = numKnowledge.getTableOfDerivatives();
			
			if (tableOfDerivatives != null) {
				UpperBoundTable upperBoundTable = tableOfDerivatives.getUpperBoundTable();
				LowerBoundTable lowerBoundTable = tableOfDerivatives.getLowerBoundTable();
				
				if (upperBoundTable == null) {
					reportError("Knowledge", knowledge.getName(), "Upper bound table is null");
				} else if (upperBoundTable.getRows().size() == 0) {
					reportError("Knowledge", knowledge.getName(), "Upper bound table is empty");
				}
				
				if (lowerBoundTable == null) {
					reportError("Knowledge", knowledge.getName(), "Lower bound table is null");
				} else if (lowerBoundTable.getRows().size() == 0) {
					reportError("Knowledge", knowledge.getName(), "Lower bound table is empty");
				}
			}
		}
		
		String type = GeneratorUtils.getKnowledgeType(knowledge);
		if (type == null || type.isEmpty()) {
			reportError("Knowledge", knowledge.getName(), "Knowledge must have type defined.");
		}
		
		if (!intervalsImpls.containsKey(type)) {
			reportError("Knowledge", knowledge.getName(), 
					"No interval implementation available for the defined type.");
		}

		for(DefaultValue defaultValue : knowledge.getDefaultValues()) {
			if (defaultValue instanceof DefaultValueByEnumeration) {
				if (((DefaultValueByEnumeration)defaultValue).getValue().size() == 0) {
					// Empty vectors with values are not allowed
					reportError("Knowledge", knowledge.getName(), 
							"Vector with default values is empty.");
				}
			} else if (defaultValue instanceof DefaultValueByGenerator) {
				CustomGenerator generator = ((DefaultValueByGenerator) defaultValue).getGenerator();				
				if (!generator.getGeneratedType().equals(type)) {
					reportError("Knowledge", knowledge.getName(), 
							"Provided generator is defined for a different type of knowledge, "
							+ "generator type: " + generator.getGeneratedType()
							+ " vs knowledge type:"	+ type);
				}
			}
		}
	}
	
	/** 
	 * Checks the given static ensemble for constraints violations. These can be: missing output and
	 * binding of knowledge from a wrong component.
	 */
	private void checkStaticEnsemble(StaticEnsemble ensemble) {
		if (ensemble.getCoordinator() == null || ensemble.getMember() == null) {
			reportError("Ensemble", ensemble.getName(),
					"Ensemble needs to have member and coordinator defined.");
			return;
		}
		
		Component coordinator = ensemble.getCoordinator().getComponent();
		Component member = ensemble.getMember().getComponent();
		
		for (EnsembleInvocableByCustomFunc invocableByCustomFunc :
				ensemble.getInvocablesByCustomFunc()) {
			for (KnowledgeBinding binding : invocableByCustomFunc.getInputKnowledgeBindings()) {
				verifyBinding(ensemble, binding, coordinator, member);
			}
			
			if (invocableByCustomFunc.getOutputKnowledgeBinding() != null) {
				verifyBinding(
						ensemble,
						invocableByCustomFunc.getOutputKnowledgeBinding(),
						coordinator,
						member);
			} else {
				reportError("Ensemble output", ensemble.getName(),
						"Output knowledge binding has no output defined.");
			}
		}
		
		for (EnsembleInvocableByEQSet invocableByEQFunc : ensemble.getInvocablesByEQSet()) {
			for (NumericKnowledgeBinding binding : invocableByEQFunc.getInputKnowledgeBindings()) {
				verifyNumericBinding(ensemble, binding, coordinator, member);
			}
			
			if (invocableByEQFunc.getOutputKnowledgeBinding() != null) {
				verifyNumericBinding(
						ensemble,
						invocableByEQFunc.getOutputKnowledgeBinding(), 
						coordinator, 
						member);
			} else {
				reportError("Ensemble output", ensemble.getName(),
						"Output knowledge binding has no output defined.");
			}
		}
	}
	
	/** 
	 * Checks the given custom generator for constraints violations. These can be: missing type and
	 * missing implementation reference.
	 */
	private void checkGenerator(CustomGenerator generator) {
		if (generator.getGeneratedType() == null || generator.getGeneratedType().isEmpty()) {
			reportError("Custom generator", "", "Must have type defined.");
		}
		
		if (generator.getClazz() == null || generator.getClazz().isEmpty()) {
			reportError("Custom generator", "", "Must reference its implementation.");
		}
	}
	
	/** 
	 * Checks the given custom interval for constraints violations. These can be: missing type and
	 * missing implementation reference.
	 */
	private void checkCustomInterval(CustomInterval interval) {
		if (interval.getWrappedType() == null || interval.getWrappedType().isEmpty()) {
			reportError("Custom Interval", interval.getClazz(),
					"Must have defined a type which it wrapps.");
		}
		
		if (interval.getClazz() == null || interval.getClazz().isEmpty()) {
			reportError("Custom Interval", interval.getWrappedType(),
					"Must reference its implementation.");
		}
	}
	
	/** 
	 * Checks the model entities for empty name or name duplicities. Entities whose names are
	 * validated are component, components instances, processes, ensembles, knowledge fields and
	 * alerts.
	 */
	private void checkDuplicates(Model model) {
		// Check components instances names duplicates
		HashSet<String> componentsIds = new HashSet<String>();
		for(Component component : model.getComponents()) {
			String name = StringUtils.removeSpaces(component.getName());
			if (name.isEmpty()) {
				reportError("Component", "", "Cannot have empty name.");
			}
			
			if (componentsIds.contains(name)) {
				reportError("Component", component.getName(),
						"There already exists a component with the same name.");
			}
			
			// Check processes
			HashSet<String> processesIds = new HashSet<String>();
			for(ComponentProcess process : component.getComponentProcesses()) {
				String procName = StringUtils.removeSpaces(process.getName());
				if (procName.isEmpty()) {
					reportError("Process", "", "Cannot have empty name.");
				}
				
				if (processesIds.contains(procName)) {
					reportError("Process", process.getName(),
							"In current component already exists a process with the same name.");
				}
				
				processesIds.add(procName);
			}
			
			// Check knowledge fields
			HashSet<String> fieldsIds = new HashSet<String>();
			for(Knowledge knowledge : component.getKnowledges()) {
				String fieldName = StringUtils.removeSpaces(knowledge.getName());
				if (fieldName.isEmpty()) {
					reportError("Knowledge", "", "Cannot have empty name.");
				}
				
				if (fieldsIds.contains(fieldName)) {
					reportError("Knowedge", knowledge.getName(),
							"In current component already exists a knowledge with the same name.");
				}
				
				fieldsIds.add(fieldName);
			}
			
			componentsIds.add(name);
		}
		
		// Check components instances names duplicates
		HashSet<String> componentsInstancesIds = new HashSet<String>();
		for(ComponentInstance componentInstance : model.getComponentInstances()) {
			String name = StringUtils.removeSpaces(componentInstance.getName());
			if (name.isEmpty()) {
				reportError("Component instance", "", "Cannot have empty name.");
			}
			
			if (componentsInstancesIds.contains(name)) {
				reportError("Component instace", componentInstance.getName(),
						"There already exists a component instance with the same name.");
			}
			
			componentsInstancesIds.add(name);
		}
		
		// Check ensembles names duplicates
		HashSet<String> ensemblesIds = new HashSet<String>();
		for(StaticEnsemble ensemble : model.getStaticEnsembles()) {
			String name = StringUtils.removeSpaces(ensemble.getName());
			if (name.isEmpty()) {
				reportError("Ensemble", "", "Cannot have empty name.");
			}
			
			if (ensemblesIds.contains(name)) {
				reportError("Ensemble", ensemble.getName(),
						"There already exists a component instance with the same name.");
			}
			
			ensemblesIds.add(name);
		}
		
		// Check alerts names duplicates
		HashSet<String> alertsIds = new HashSet<String>();
		for(Alert alert : model.getAlerts()) {
			String name = StringUtils.removeSpaces(alert.getName());
			if (name.isEmpty()) {
				reportError("Alert", "", "Cannot have empty name.");
			}
			
			if (alertsIds.contains(name)) {
				reportError("Alert", alert.getName(),
						"There already exists an alert instance with the same name.");
			}
			
			alertsIds.add(name);
		}
	}
	
	/**
	 * Verifies whether the given knowledge binding is bound to a coordinator or member. Otherwise
	 * an error is reported.
	 * @param ensemble Ensemble for which we check the binding.
	 * @param binding Knowledge binding of the ensemble.
	 * @param coordinator Coordinator of the ensemble.
	 * @param member Member of the ensemble.
	 */
	private void verifyBinding(
			StaticEnsemble ensemble, 
			KnowledgeBinding binding, 
			Component coordinator, 
			Component member) {
		Component component = binding.getEnsembleSide() == EnsembleSide.COORDINATOR
				? coordinator
				: member;
		
		if (!component.getKnowledges().contains(binding.getKnowledge())) {
			reportError("Knowledge " + binding.getKnowledge().getName() + " bound to ensemble", 
					ensemble.getName(),
					"such knowledge is not defined on a component assigned as "
					+ binding.getEnsembleSide().toString()
					+ " of the ensemble");
		}
	}
	
	private void verifyNumericBinding(
			StaticEnsemble ensemble, 
			NumericKnowledgeBinding binding, 
			Component coordinator, 
			Component member) {
		Component component = binding.getEnsembleSide() == EnsembleSide.COORDINATOR
				? coordinator
				: member;
		
		if (!component.getKnowledges().contains(binding.getKnowledge())) {
			reportError("Knowledge " + binding.getKnowledge().getName() + " bound to ensemble", 
					ensemble.getName(),
					"such knowledge is not defined on a component assigned as "
					+ binding.getEnsembleSide().toString()
					+ " of the ensemble");
		}
	}
	
	/**
	 * Creates error message that will later displayed to the user.
	 * @param target Type of the entity for which we report the error.
	 * @param name Name of the entity for which we report the error.
	 * @param message The error message.
	 */
	private void reportError(String target, String name, String message) {
		errors.add(target + " '" + name + "': " + message);
	}
}
