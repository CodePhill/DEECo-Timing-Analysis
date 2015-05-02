package cz.cuni.mff.d3s.jdeeco.analysis.example.custom;

import cz.cuni.mff.d3s.deeco.analysis.def.Interval;
import cz.cuni.mff.d3s.deeco.analysis.interval.impl.StringInterval;

public class BooleanInterval extends Interval<Boolean> {

	public BooleanInterval(Boolean upperBound, Boolean lowerBound) {
		super(upperBound, lowerBound);
	}

	@Override
	public Interval<String> getStringInterval() {
		return new StringInterval(upperBound.toString(), lowerBound.toString());
	}

}
