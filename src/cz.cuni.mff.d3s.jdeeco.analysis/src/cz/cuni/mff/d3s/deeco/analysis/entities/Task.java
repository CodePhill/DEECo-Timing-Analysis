package cz.cuni.mff.d3s.deeco.analysis.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.common.base.Optional;

import cz.cuni.mff.d3s.deeco.analysis.core.Assertable;
import cz.cuni.mff.d3s.deeco.analysis.core.ErrorReporter;

/** 
 * Represents tasks such as process or ensemble.
 */
public abstract class Task implements Assertable {
	/** Name of the task entity (process or ensemble). */
	private String name;
	/** Period of the task (zero for the triggered ones). */
	private Optional<Integer> period;
	/** Deadline of the task. */
	private int deadline;
	/** Hard-coded delay - will be used instead of the computed one. */
	private Optional<Integer> predefinedDelay;
	/** Functions from which is the task composed. */
	private Collection<FuncWrapperBase> funcWrappers;
	/** Whether this task was already evaluated. Protection against beeing evaluated twice. */
	private boolean evaluated;
	
	/** Errors found during configuration. */
	protected Collection<String> errors;
	
	/**
	 * @param name Name of the entity (process or ensemble).
	 * @param deadline Deadline of the task.
	 * @param period Period of the task (zero for the triggered ones).
	 */
	public Task(String name, int deadline, Optional<Integer> period) {
		this.name = name;
		this.deadline = deadline;
		this.period = period;
		funcWrappers = new ArrayList<>();
		errors = new ArrayList<String>();
		predefinedDelay = Optional.absent();
		evaluated = false;
	}
	
	/** Returns name of the task. */
	public String getName() {
		return name;
	}
	
	/** Returns period of the task. */
	public Optional<Integer> getPeriod() {
		return period;
	}
	
	/** Return deadline of task. */
	public int getDeadline() {
		return deadline;
	}
	
	/** Returns evaluation functions wrappers. */
	public Collection<FuncWrapperBase> getFuncWrappers() {
		return funcWrappers;
	}
	
	/**
	 * Adds new evaluation function wrapper.
	 * @param funcWrapper Evaluation function wrapper to be added.
	 * @param inputFields Input fields of the evaluation function.
	 * @param outputField Output field of the evaluation function.
	 */
	public void addFuncWrapper(
			FuncWrapperBase funcWrapper,
			Collection<KnowledgeField<?>> inputFields,
			KnowledgeField<?> outputField) {
		funcWrappers.add(funcWrapper);
		funcWrapper.setOutputField(outputField);
		outputField.setOutputOfPeriodic(this);
		for(KnowledgeField<?> inputField : inputFields) {
			funcWrapper.addInputField(inputField);
			inputField.setIsUsedAsInput();
		}
	}
	
	/**
	 * Returns distinct collection of all aggregated input knowledge fields from all evaluation
	 * function wrappers.
	 */
	public Collection<KnowledgeField<?>> getInputFields() {		
		List<KnowledgeField<?>> fields = new ArrayList<>();
		for(FuncWrapperBase funcWrapper : funcWrappers) {
			for (KnowledgeField<?> inputField : funcWrapper.getInputFields()) {
				boolean alreadyAdded = false;
				for(KnowledgeField<?> addedField : fields) {
					if (addedField.getName().equals(inputField.getName())) {
						alreadyAdded = true;
						break;
					}
				}
			
				if (!alreadyAdded) {
					fields.add(inputField);
				}
			}
		}
		
		return fields;
	}
	
	/**
	 * Returns distinct collection of all aggregated output knowledge fields from all evaluation
	 * function wrappers.
	 */
	public List<KnowledgeField<?>> getOutputFields() {
		List<KnowledgeField<?>> fields = new ArrayList<>();
		for(FuncWrapperBase funcWrapper : funcWrappers) {
			fields.add(funcWrapper.getOutputField());
		}
		
		return fields;
	}
	
	/** Sets predefined delay - will be used instead of the computed one. */
	public void setPredefinedDelay(int delay) {
		predefinedDelay = Optional.of(delay);
	}
	
	/** Runs evaluation via all defined evaluation function wrappers. */
	public void evaluateVector() {
		if (evaluated) {
			return;
		}
		
		evaluated = true;
		
		for(FuncWrapperBase funcWrapper : funcWrappers) {
			boolean isOutputUsed = funcWrapper.getOutputField().isUsedAsInput();
			int delay = predefinedDelay.isPresent() 
					? predefinedDelay.get()
					: getDelay(isOutputUsed);
			funcWrapper.evaluateVector(delay);
		}
	}
	
	@Override
	public void assertConfiguration(ErrorReporter errorReporter) {
		for(FuncWrapperBase funcWrapper : funcWrappers) {
			funcWrapper.assertConfiguration(errorReporter);
		}
		
		for(String error : errors) {
			errorReporter.reportError(this, error);
		}
	}
	
	/**
	 * Returns the delay of the Task.
	 * @param isOutputUsed Whether the delay is for knowledge field that is used as an input.
	 */
	public abstract int getDelay(boolean isOutputUsed);
}
