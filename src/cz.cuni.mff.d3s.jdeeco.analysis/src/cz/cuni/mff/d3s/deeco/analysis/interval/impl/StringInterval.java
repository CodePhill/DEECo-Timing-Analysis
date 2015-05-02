package cz.cuni.mff.d3s.deeco.analysis.interval.impl;

import cz.cuni.mff.d3s.deeco.analysis.def.Interval;

/**
 * Implementation of {@link cz.cuni.mff.d3s.deeco.analysis.def.Interval Interval} for String.
 */
public class StringInterval extends Interval<String> {
	public StringInterval(String upperBound, String lowerBound) {
		super(upperBound, lowerBound);
	}
	
	@Override
	public Interval<String> getStringInterval() {
		return this;
	}
}
