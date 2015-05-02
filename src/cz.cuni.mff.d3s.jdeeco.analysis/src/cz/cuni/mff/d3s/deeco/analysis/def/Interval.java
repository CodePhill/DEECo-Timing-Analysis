package cz.cuni.mff.d3s.deeco.analysis.def;

/**
 * Interval that contains upper and lower bounds of one single type.
 *
 * @param <T> Type of the value contained by the interval.
 */
public abstract class Interval<T> {
	/* Upper value of the interval. */
	protected T upperBound;
	/* Lower value of the interval. */
	protected T lowerBound;
	/* Precision of rounding in output printing - used only by implementors of numeric intervals.*/
	protected int precision;
	
	/**
	 * @param upperBound Upper value of the interval.
	 * @param lowerBound Lower value of the interval.
	 */
	public Interval(T upperBound, T lowerBound) {
		this.upperBound = upperBound;
		this.lowerBound = lowerBound;
	}

	/** Returns the upper bound value of the interval. */
	public T getUpperBound() {
		return upperBound;
	}
	
	/** Returns the lower bound value of the interval. */
	public T getLowerBound() {
		return lowerBound;
	}
	
	/** Sets precision of rounding in output printing - used in numeric intervals.*/
	public void setPrecision(int precision) {
		this.precision = precision;
	}
	
	/** Returns the interval as string for displaying in the output. */
	public abstract Interval<String> getStringInterval();
}
