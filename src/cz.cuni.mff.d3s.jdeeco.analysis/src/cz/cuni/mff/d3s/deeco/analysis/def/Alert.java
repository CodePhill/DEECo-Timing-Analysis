package cz.cuni.mff.d3s.deeco.analysis.def;

/**
 * Abstract alert wrapper.
 * @param <T> Type of a knowledge field for which the alert is defined.
 */
public abstract class Alert<T> {
	
	/** Returns false when internal conditions are violated and alert is active. */
	public abstract boolean CheckValue(Interval<T> value);
}
