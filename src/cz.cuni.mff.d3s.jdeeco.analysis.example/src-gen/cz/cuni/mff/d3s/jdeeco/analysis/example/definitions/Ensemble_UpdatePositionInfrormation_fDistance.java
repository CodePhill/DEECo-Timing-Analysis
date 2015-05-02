package cz.cuni.mff.d3s.jdeeco.analysis.example.definitions;

import cz.cuni.mff.d3s.deeco.analysis.def.*;

public abstract class Ensemble_UpdatePositionInfrormation_fDistance extends FuncWithEquationSet {
	
	@Override
	public double F(double t, int i, double[] values, double[] valuesDerivatives) {
		if (i == 1) {
			return getinitDistanceDerivation(t, values[0], valuesDerivatives[0], values[1], valuesDerivatives[1]);
		}
		
		return valuesDerivatives[i];
	}
	
	public abstract double getinitDistanceDerivation(double t, double initSpeed, double initSpeedDerivative, double initDistance, double initDistanceDerivative);
	
}
