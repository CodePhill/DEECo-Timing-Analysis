package cz.cuni.mff.d3s.deeco.analysis.entities;

import java.util.Collection;

import com.google.common.base.Optional;

/**
 * Represents single DEECo process instance (process of component instance).
 * 
 * Because most of the behavior is common with ensembles the functionality is situated in
 * the inherited class {@link Task Tasks}. This class only extends it with calculation of the delay
 * and with assertions of integrity.
 */
public class Process extends Task {
	/* Component in to which the process belongs. */
	private Component component;
	
	/**
	 * Constructs a triggered process. 
	 * @param component The component into which the process belongs.
	 * @param name Name of the process.
	 * @param deadline Deadline of the process.
	 */
	public Process(
			Component component, String name, int deadline) {
		super(name, deadline, Optional.<Integer>absent());
		this.component = component;
	}
	
	/**
	 * Constructs a periodic process.
	 * @param component The component into which the process belongs.
	 * @param name Name of the process.
	 * @param deadline Deadline of the process.
	 * @param period Period of the process.
	 */
	public Process(
			Component component, String name, int deadline, int period) {
		super(name, deadline, Optional.of(period));
		this.component = component;
	}
	
	/**
	 * Returns the delay caused by the process.
	 * @param isOutputUsed Whether the delay is for knowledge field that is used as an input.
	 */
	public int getDelay(boolean isOutputUsed) {
		// When the period is zero we work with triggered process. Such process has no scheduling
		// overhead since it should be called immediately. Its running time is covered by the dead-
		// line. On the other hand for the non-triggered processes we have to count in the period
		// which will be for that case non-zero. From this reason we can simplify the calculation in 
		// the statement bellow.
		if (isOutputUsed) {
			return getPeriod().or(0) + getDeadline();
		}
		
		// If an output field of the process is not used by other processes or ensembles then 
		// the delay is only equal to the period.
		return getDeadline();
	}
	
	/** 
	 * Adds extra check that verifies whether binded knowledge fields belong to the same component
	 * as the process. 
	 */
	@Override
	public void addFuncWrapper(
			FuncWrapperBase invocable,
			Collection<KnowledgeField<?>> inputFields,
			KnowledgeField<?> outputField) {
		if (component != outputField.getComponent()) {
			errors.add("Bindig output field to a wrong component!");
		}
		
		for(KnowledgeField<?> inputField : inputFields) {
			if (component != inputField.getComponent()) {
				errors.add("Bindig input field from a different component!");
			}
		}
		
		super.addFuncWrapper(invocable, inputFields, outputField);
	}
}
