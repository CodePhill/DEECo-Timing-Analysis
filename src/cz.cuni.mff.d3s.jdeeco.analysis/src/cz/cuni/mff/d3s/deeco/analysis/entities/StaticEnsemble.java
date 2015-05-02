package cz.cuni.mff.d3s.deeco.analysis.entities;

import com.google.common.base.Optional;

import cz.cuni.mff.d3s.deeco.analysis.core.ErrorReporter;

/**
 * Represents DEECo instance of a static ensemble.
 * 
 * Because most of the behavior is common with processes the functionality is situated in
 * the inherited class {@link Task Tasks}. This class only extends it with calculation of the delay,
 * assertions of integrity and knowledge about member and coordinator.
 */
public class StaticEnsemble extends Task {
	/** Belief propagation delay (this term is defined in the DEECo semantics). */
	private Optional<Integer> beliefPropagationDelay = Optional.absent();
	/** Reference to the member (component instance). */
	private Component member;
	/** Reference to the coordinator (component instance). */
	private Component coordinator;
	
	/**
	 * Constructs a periodic ensemble.
	 * @param name Name of the static ensemble.
	 * @param coordinator Reference to the coordinator (component instance).
	 * @param member Reference to the member (component instance).
	 * @param deadline Deadline of the ensemble.
	 * @param period Period of the ensemble.
	 */
	public StaticEnsemble(
			String name,
			Component coordinator,
			Component member,
			int deadline,
			int period) {
		super(name, deadline, Optional.of(period));
		this.member = member;
		this.coordinator = coordinator;
	}
	
	/**
	 * Constructs a triggered ensemble. 
	 * @param name Name of the static ensemble.
	 * @param coordinator Reference to the coordinator (component instance).
	 * @param member Reference to the member (component instance).
	 * @param deadline Deadline of the ensemble.
	 */
	public StaticEnsemble(
			String name,
			Component coordinator,
			Component member,
			int deadline) {
		super(name, deadline, Optional.<Integer>absent());
		this.member = member;
		this.coordinator = coordinator;
	}
	
	/** Returns the member of the ensemble. */
	public Component getMember() {
		return member;
	}
	
	/** Returns the coordinator of the ensemble. */
	public Component getCoordinator() {
		return coordinator;
	}
	
	/**
	 * Returns the delay caused by the ensemble.
	 * @param isOutputUsed Whether the delay is for knowledge field that is used as an input.
	 */
	public int getDelay(boolean isOutputUsed) {
		// When the period is zero we work with triggered ensemble. Such ensemble has no scheduling
		// overhead since it should be called immediately. Its running time is covered by the dead-
		// line. On the other hand for the non-triggered ensemble we have to count in the period
		// which will be for that case non-zero. From this reason we can simplify the calculation in 
		// the statement bellow. We also have to include belief propagation delay (meaning of this
		// variable is explained in the DEECo semantics. 
		if (isOutputUsed) {
			return getPeriod().or(0) + getDeadline() + beliefPropagationDelay.or(0);
		}
		
		// If an output field of the ensemble is not used by other processes or ensembles then 
		// the delay is only equal to the deadline + propagation delay.
		return getDeadline() + beliefPropagationDelay.or(0);
	}
	
	/** Sets belief propagation delay. */
	public void setBeliefPropagationDelay(int beliefPropagationDelay) {
		this.beliefPropagationDelay = Optional.of((Integer)beliefPropagationDelay);
	}
		
	@Override
	public void assertConfiguration(ErrorReporter errorReporter) {
		if (member == null) {
			errors.add("Ensemble member is null!");
		}
		
		if (coordinator == null) {
			errors.add("Ensemble coordinator is null!");
		}
		
		super.assertConfiguration(errorReporter);
	}
	
}
