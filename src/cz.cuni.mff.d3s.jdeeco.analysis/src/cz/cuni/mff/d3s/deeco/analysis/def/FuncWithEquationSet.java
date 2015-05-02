package cz.cuni.mff.d3s.deeco.analysis.def;

/**
 * Interface for equations set wrappers.
 */
public abstract class FuncWithEquationSet {
	
	/**
	 * Returns derivation of argument on index i.
	 * @param t Time for which the derivation is computed.
	 * @param i Index of a value for which we are calculating the derivation.
	 * @param values Derivatives from previous run.
	 * @param derivatives Current calculated derivatives.
	 */
	public abstract double F(double t, int i, double[] values, double[] derivatives);	
}
