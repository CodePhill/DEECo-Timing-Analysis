package cz.cuni.mff.d3s.jdeeco.analysis.example.definitions;

import cz.cuni.mff.d3s.deeco.analysis.def.*;

public abstract class Vehicle_Process_Dummy_collisionDistance extends Func<java.lang.Double> {
	
	@Override
	public void evaluateVector(int delay, Interval<?>[] values) {
		out.addComputedValue(evaluate(delay, (Interval<java.lang.Double>) values[0], (Interval<java.lang.Double>) values[1]));
	}
	
	public abstract Interval<java.lang.Double> evaluate(int delay, Interval<java.lang.Double> myDistanceF, Interval<java.lang.Double> fDistanceF) ;
}
