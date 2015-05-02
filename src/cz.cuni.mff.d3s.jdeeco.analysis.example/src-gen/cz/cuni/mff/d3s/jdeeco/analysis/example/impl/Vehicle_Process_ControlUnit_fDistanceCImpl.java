package cz.cuni.mff.d3s.jdeeco.analysis.example.impl;

import cz.cuni.mff.d3s.deeco.analysis.def.*;
import cz.cuni.mff.d3s.jdeeco.analysis.example.definitions.*;

public final class Vehicle_Process_ControlUnit_fDistanceCImpl extends Vehicle_Process_ControlUnit_fDistanceC {
	@Override
	public double getfDistanceDerivation(double t, double fSpeed, double fSpeedDerivative, double fDistance, double fDistanceDerivative) {
		return fSpeed;
	}	
}
