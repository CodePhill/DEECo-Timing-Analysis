package cz.cuni.mff.d3s.jdeeco.analysis.example.impl;

import cz.cuni.mff.d3s.deeco.analysis.def.*;
import cz.cuni.mff.d3s.deeco.analysis.interval.impl.DoubleInterval;
import cz.cuni.mff.d3s.deeco.analysis.interval.impl.IntegerInterval;
import cz.cuni.mff.d3s.jdeeco.analysis.example.definitions.*;

public final class Vehicle_Process_Dummy_collisionDistanceImpl extends Vehicle_Process_Dummy_collisionDistance {
	
	@Override
	public Interval<java.lang.Double> evaluate(int delay, Interval<java.lang.Double> myDistanceF, Interval<java.lang.Double> fDistanceF) {
		return new DoubleInterval(myDistanceF.getUpperBound() - fDistanceF.getLowerBound(), 0);
	}
}
