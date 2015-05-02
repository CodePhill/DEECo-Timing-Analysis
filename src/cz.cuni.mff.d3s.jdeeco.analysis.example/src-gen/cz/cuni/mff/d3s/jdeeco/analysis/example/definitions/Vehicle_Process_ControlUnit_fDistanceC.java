package cz.cuni.mff.d3s.jdeeco.analysis.example.definitions;

import cz.cuni.mff.d3s.deeco.analysis.def.*;

public abstract class Vehicle_Process_ControlUnit_fDistanceC extends FuncWithEquationSet {
	
	@Override
	public double F(double t, int i, double[] values, double[] valuesDerivatives) {
		if (i == 1) {
			return getfDistanceDerivation(t, values[0], valuesDerivatives[0], values[1], valuesDerivatives[1]);
		}
		
		return valuesDerivatives[i];
	}
	
	public abstract double getfDistanceDerivation(double t, double fSpeed, double fSpeedDerivative, double fDistance, double fDistanceDerivative);
	
}
