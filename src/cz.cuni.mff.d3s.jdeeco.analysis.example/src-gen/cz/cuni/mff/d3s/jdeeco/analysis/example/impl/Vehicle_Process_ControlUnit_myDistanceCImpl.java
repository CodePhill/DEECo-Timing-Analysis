package cz.cuni.mff.d3s.jdeeco.analysis.example.impl;

import cz.cuni.mff.d3s.deeco.analysis.def.*;
import cz.cuni.mff.d3s.jdeeco.analysis.example.definitions.*;

public final class Vehicle_Process_ControlUnit_myDistanceCImpl extends Vehicle_Process_ControlUnit_myDistanceC {
	@Override
	public double getmyDistanceDerivation(double t, double mySpeed, double mySpeedDerivative, double myDistance, double myDistanceDerivative) {
		return mySpeed;
	}	
}
