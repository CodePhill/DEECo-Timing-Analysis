package cz.cuni.mff.d3s.deeco.analysis.def;

import cz.cuni.mff.d3s.deeco.analysis.entities.KnowledgeField;

/**
 * Represents all wrappers of evaluation functions. 
 */
public abstract class Func<OUT> {
	protected KnowledgeField<OUT> out;
	
	/** Binds output knowledge field used by the wrapped function. */
	public void setArgs(KnowledgeField<OUT> out) {
		this.out = out;
	}
	
	/**
	 * Method calculates new value of an output knowledge field from given vector of values of input 
	 * knowledge fields with respect to the given delay. The values should be stored to the output
	 * knowledge field that was previously given to the class.
	 * @param delay Delay of the process or ensemble for which is the function called.
	 * @param values Arrays of input values representing arguments of the function.
	 */
	public abstract void evaluateVector(int delay, Interval<?>[] values);
}
