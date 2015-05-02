package cz.cuni.mff.d3s.deeco.analysis.interval.impl;

import cz.cuni.mff.d3s.deeco.analysis.def.Interval;

/**
 * Implementation of {@link cz.cuni.mff.d3s.deeco.analysis.def.Interval Interval} for Integer.
 */
public class IntegerInterval extends Interval<Integer> {

	public IntegerInterval(Integer upperBound, Integer lowerBound) {
		super(upperBound, lowerBound);
	}
	
	/** Sums two intervals in the same way as vectors and returns new instance as an result. */
	public static Interval<Integer> sum(Interval<Integer> first, Interval<Integer> second) {
		return new IntegerInterval(
				first.getUpperBound() + second.getUpperBound(),
				first.getLowerBound() + second.getLowerBound());
	}
	
	/** Multiplies vector of values with scalar and returns new instance as an result. */
	public static Interval<Integer> mul(Interval<Integer> interval, Integer value) {
		return new IntegerInterval(
				interval.getUpperBound() * value,
				interval.getLowerBound() * value);
	}

	@Override
	public Interval<String> getStringInterval() {
		return new StringInterval(this.upperBound.toString(), this.lowerBound.toString());
	}
}
