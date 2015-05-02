package cz.cuni.mff.d3s.jdeeco.analysis.example.definitions;

import cz.cuni.mff.d3s.deeco.analysis.def.*;

public abstract class Vehicle_Process_ControlUnit_myDistanceC extends FuncWithEquationSet {
	
	@Override
	public double F(double t, int i, double[] values, double[] valuesDerivatives) {
		if (i == 1) {
			return getmyDistanceDerivation(t, values[0], valuesDerivatives[0], values[1], valuesDerivatives[1]);
		}
		
		return valuesDerivatives[i];
	}
	
	public abstract double getmyDistanceDerivation(double t, double mySpeed, double mySpeedDerivative, double myDistance, double myDistanceDerivative);
	
}
