package cz.cuni.mff.d3s.jdeeco.analysis.example.impl;

import cz.cuni.mff.d3s.deeco.analysis.def.*;
import cz.cuni.mff.d3s.jdeeco.analysis.example.definitions.*;

public final class Ensemble_UpdatePositionInfrormation_fDistanceImpl extends Ensemble_UpdatePositionInfrormation_fDistance {
	@Override
	public double getinitDistanceDerivation(double t, double initSpeed, double initSpeedDerivative, double initDistance, double initDistanceDerivative) {
		return initSpeed;
	}	
}
