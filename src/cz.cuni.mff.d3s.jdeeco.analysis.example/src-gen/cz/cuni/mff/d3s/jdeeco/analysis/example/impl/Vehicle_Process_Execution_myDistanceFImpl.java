package cz.cuni.mff.d3s.jdeeco.analysis.example.impl;

import cz.cuni.mff.d3s.deeco.analysis.def.*;
import cz.cuni.mff.d3s.jdeeco.analysis.example.definitions.*;

public final class Vehicle_Process_Execution_myDistanceFImpl extends Vehicle_Process_Execution_myDistanceF {
	@Override
	public double getmyDistanceCDerivation(double t, double mySpeedC, double mySpeedCDerivative, double myDistanceC, double myDistanceCDerivative) {
		return mySpeedC;
	}	
}
