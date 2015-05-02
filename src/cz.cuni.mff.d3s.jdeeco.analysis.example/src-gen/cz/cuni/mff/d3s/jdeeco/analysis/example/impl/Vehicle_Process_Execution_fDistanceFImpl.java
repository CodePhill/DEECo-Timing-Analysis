package cz.cuni.mff.d3s.jdeeco.analysis.example.impl;

import cz.cuni.mff.d3s.deeco.analysis.def.*;
import cz.cuni.mff.d3s.jdeeco.analysis.example.definitions.*;

public final class Vehicle_Process_Execution_fDistanceFImpl extends Vehicle_Process_Execution_fDistanceF {
	@Override
	public double getfDistanceCDerivation(double t, double fSpeedC, double fSpeedCDerivative, double fDistanceC, double fDistanceCDerivative) {
		return fSpeedC;
	}	
}
