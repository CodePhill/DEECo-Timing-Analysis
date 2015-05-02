package cz.cuni.mff.d3s.jdeeco.analysis.example.core;

import cz.cuni.mff.d3s.deeco.analysis.def.*;
import cz.cuni.mff.d3s.deeco.analysis.entities.*;
import cz.cuni.mff.d3s.deeco.analysis.entities.Process;
import cz.cuni.mff.d3s.deeco.analysis.core.AnalysisConfiguration;
import cz.cuni.mff.d3s.deeco.analysis.core.Analysis;
import cz.cuni.mff.d3s.deeco.analysis.generators.*;
import cz.cuni.mff.d3s.deeco.analysis.integrators.DormandPrinceIntegratorProvider;
import cz.cuni.mff.d3s.deeco.analysis.integrators.IntegratorProvider;
import cz.cuni.mff.d3s.deeco.analysis.output.AbstractOutputPrinter;
import cz.cuni.mff.d3s.deeco.analysis.output.HTMLOutputPrinter;
import cz.cuni.mff.d3s.deeco.analysis.interval.impl.*;

import java.util.ArrayList;
import java.util.Arrays;

import cz.cuni.mff.d3s.jdeeco.analysis.example.impl.*;

public final class TimingAnalysis {
	
	private IntegratorProvider integratorProvider;
	private AbstractOutputPrinter outputPrinter; 
	
	public void setIntegratorProvider(IntegratorProvider integratorProvider) {
		this.integratorProvider = integratorProvider;
	}
	
	public void setOutputPrinter(AbstractOutputPrinter outputPrinter) {
		this.outputPrinter = outputPrinter;
	}
	
	public void run() {
		if (integratorProvider == null) {
			integratorProvider = new DormandPrinceIntegratorProvider();
		}
		
		if (outputPrinter == null) {
			outputPrinter = new HTMLOutputPrinter();
		}
		
		/* Configuration */
		AnalysisConfiguration configuration = new AnalysisConfiguration();
		configuration.setBeliefPropagationDelay(200);
		
		/* Component definition */
		Component c_FollowingVehicle = new Component("Vehicle", "Following Vehicle");
		configuration.addComponent(c_FollowingVehicle);
		
		Component c_FollowedVehicle = new Component("Vehicle", "Followed Vehicle");
		configuration.addComponent(c_FollowedVehicle);
		

		/* Knowledge fields definitions */
		
		TableOfDerivatives k_FollowingVehicle_mySpeed_upTable = new TableOfDerivatives(
		new double[] { 0.0, 10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0, 110.0, 120.0, 130.0, 140.0, 150.0, 160.0, 170.0, 180.0, 190.0, 200.0, 210.0, 220.0, 230.0 }, 
		new double[] { 9.0, 6.5, 4.9, 5.6, 4.4, 5.25, 2.9, 2.8, 2.7, 1.72, 3.0, 3.0, 1.44, 1.9, 1.45, 1.25, 0.96, 0.82, 0.58, 1.0, 0.6, 0.3, 0.15, 0.0 });
		TableOfDerivatives k_FollowingVehicle_mySpeed_loTable = new TableOfDerivatives(
		new double[] { 0.0, 1.0, 230.0 }, 
		new double[] { 0.0, -8.0, -8.0 });
		k_FollowingVehicle_mySpeed_upTable.setMultiplier(2.777E-4);
		k_FollowingVehicle_mySpeed_loTable.setMultiplier(2.777E-4);
		k_FollowingVehicle_mySpeed_upTable.setDerivativesMultiplier(1.0E-6);
		k_FollowingVehicle_mySpeed_loTable.setDerivativesMultiplier(1.0E-6);
		KnowledgeFieldViaTable k_FollowingVehicle_mySpeed = new KnowledgeFieldViaTable(c_FollowingVehicle, "mySpeed", k_FollowingVehicle_mySpeed_upTable, k_FollowingVehicle_mySpeed_loTable);
		k_FollowingVehicle_mySpeed.setMultiplier(2.777E-4);
		k_FollowingVehicle_mySpeed.setPrecision(1);
		
		TableOfDerivatives k_FollowingVehicle_mySpeedC_upTable = new TableOfDerivatives(
		new double[] { 0.0, 10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0, 110.0, 120.0, 130.0, 140.0, 150.0, 160.0, 170.0, 180.0, 190.0, 200.0, 210.0, 220.0, 230.0 }, 
		new double[] { 9.0, 6.5, 4.9, 5.6, 4.4, 5.25, 2.9, 2.8, 2.7, 1.72, 3.0, 3.0, 1.44, 1.9, 1.45, 1.25, 0.96, 0.82, 0.58, 1.0, 0.6, 0.3, 0.15, 0.0 });
		TableOfDerivatives k_FollowingVehicle_mySpeedC_loTable = new TableOfDerivatives(
		new double[] { 0.0, 1.0, 230.0 }, 
		new double[] { 0.0, -8.0, -8.0 });
		k_FollowingVehicle_mySpeedC_upTable.setMultiplier(2.777E-4);
		k_FollowingVehicle_mySpeedC_loTable.setMultiplier(2.777E-4);
		k_FollowingVehicle_mySpeedC_upTable.setDerivativesMultiplier(1.0E-6);
		k_FollowingVehicle_mySpeedC_loTable.setDerivativesMultiplier(1.0E-6);
		KnowledgeFieldViaTable k_FollowingVehicle_mySpeedC = new KnowledgeFieldViaTable(c_FollowingVehicle, "mySpeedC", k_FollowingVehicle_mySpeedC_upTable, k_FollowingVehicle_mySpeedC_loTable);
		k_FollowingVehicle_mySpeedC.setMultiplier(2.777E-4);
		k_FollowingVehicle_mySpeedC.setPrecision(1);
		
		KnowledgeFieldNumeric k_FollowingVehicle_myDistance = new KnowledgeFieldNumeric(c_FollowingVehicle, "myDistance");
		k_FollowingVehicle_myDistance.setPrecision(1);
		
		KnowledgeFieldNumeric k_FollowingVehicle_myDistanceC = new KnowledgeFieldNumeric(c_FollowingVehicle, "myDistanceC");
		k_FollowingVehicle_myDistanceC.setPrecision(1);
		
		KnowledgeFieldNumeric k_FollowingVehicle_collisionDistance = new KnowledgeFieldNumeric(c_FollowingVehicle, "collisionDistance");
		k_FollowingVehicle_collisionDistance.setShowPivots(true);
		k_FollowingVehicle_collisionDistance.setPrecision(1);
		
		TableOfDerivatives k_FollowingVehicle_fSpeed_upTable = new TableOfDerivatives(
		new double[] { 0.0, 10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0, 110.0, 120.0, 130.0, 140.0, 150.0, 160.0, 170.0, 180.0, 190.0, 200.0, 210.0, 220.0, 230.0 }, 
		new double[] { 9.0, 6.5, 4.9, 5.6, 4.4, 5.25, 2.9, 2.8, 2.7, 1.72, 3.0, 3.0, 1.44, 1.9, 1.45, 1.25, 0.96, 0.82, 0.58, 1.0, 0.6, 0.3, 0.15, 0.0 });
		TableOfDerivatives k_FollowingVehicle_fSpeed_loTable = new TableOfDerivatives(
		new double[] { 0.0, 1.0, 230.0 }, 
		new double[] { 0.0, -8.0, -8.0 });
		k_FollowingVehicle_fSpeed_upTable.setMultiplier(2.777E-4);
		k_FollowingVehicle_fSpeed_loTable.setMultiplier(2.777E-4);
		k_FollowingVehicle_fSpeed_upTable.setDerivativesMultiplier(1.0E-6);
		k_FollowingVehicle_fSpeed_loTable.setDerivativesMultiplier(1.0E-6);
		KnowledgeFieldViaTable k_FollowingVehicle_fSpeed = new KnowledgeFieldViaTable(c_FollowingVehicle, "fSpeed", k_FollowingVehicle_fSpeed_upTable, k_FollowingVehicle_fSpeed_loTable);
		k_FollowingVehicle_fSpeed.setMultiplier(2.777E-4);
		k_FollowingVehicle_fSpeed.setPrecision(1);
		
		TableOfDerivatives k_FollowingVehicle_fSpeedC_upTable = new TableOfDerivatives(
		new double[] { 0.0, 10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0, 110.0, 120.0, 130.0, 140.0, 150.0, 160.0, 170.0, 180.0, 190.0, 200.0, 210.0, 220.0, 230.0 }, 
		new double[] { 9.0, 6.5, 4.9, 5.6, 4.4, 5.25, 2.9, 2.8, 2.7, 1.72, 3.0, 3.0, 1.44, 1.9, 1.45, 1.25, 0.96, 0.82, 0.58, 1.0, 0.6, 0.3, 0.15, 0.0 });
		TableOfDerivatives k_FollowingVehicle_fSpeedC_loTable = new TableOfDerivatives(
		new double[] { 0.0, 1.0, 230.0 }, 
		new double[] { 0.0, -8.0, -8.0 });
		k_FollowingVehicle_fSpeedC_upTable.setMultiplier(2.777E-4);
		k_FollowingVehicle_fSpeedC_loTable.setMultiplier(2.777E-4);
		k_FollowingVehicle_fSpeedC_upTable.setDerivativesMultiplier(1.0E-6);
		k_FollowingVehicle_fSpeedC_loTable.setDerivativesMultiplier(1.0E-6);
		KnowledgeFieldViaTable k_FollowingVehicle_fSpeedC = new KnowledgeFieldViaTable(c_FollowingVehicle, "fSpeedC", k_FollowingVehicle_fSpeedC_upTable, k_FollowingVehicle_fSpeedC_loTable);
		k_FollowingVehicle_fSpeedC.setMultiplier(2.777E-4);
		k_FollowingVehicle_fSpeedC.setPrecision(1);
		
		KnowledgeFieldNumeric k_FollowingVehicle_fDistance = new KnowledgeFieldNumeric(c_FollowingVehicle, "fDistance");
		k_FollowingVehicle_fDistance.setPrecision(1);
		
		KnowledgeFieldNumeric k_FollowingVehicle_fDistanceC = new KnowledgeFieldNumeric(c_FollowingVehicle, "fDistanceC");
		k_FollowingVehicle_fDistanceC.setPrecision(1);
		
		KnowledgeFieldNumeric k_FollowingVehicle_myDistanceF = new KnowledgeFieldNumeric(c_FollowingVehicle, "myDistanceF");
		k_FollowingVehicle_myDistanceF.setPrecision(1);
		
		KnowledgeFieldNumeric k_FollowingVehicle_fDistanceF = new KnowledgeFieldNumeric(c_FollowingVehicle, "fDistanceF");
		k_FollowingVehicle_fDistanceF.setMultiplier(1.0);
		k_FollowingVehicle_fDistanceF.setPrecision(1);
		
		TableOfDerivatives k_FollowingVehicle_initSpeed_upTable = new TableOfDerivatives(
		new double[] { 0.0, 10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0, 110.0, 120.0, 130.0, 140.0, 150.0, 160.0, 170.0, 180.0, 190.0, 200.0, 210.0, 220.0, 230.0 }, 
		new double[] { 9.0, 6.5, 4.9, 5.6, 4.4, 5.25, 2.9, 2.8, 2.7, 1.72, 3.0, 3.0, 1.44, 1.9, 1.45, 1.25, 0.96, 0.82, 0.58, 1.0, 0.6, 0.3, 0.15, 0.0 });
		TableOfDerivatives k_FollowingVehicle_initSpeed_loTable = new TableOfDerivatives(
		new double[] { 0.0, 1.0, 230.0 }, 
		new double[] { 0.0, -8.0, -8.0 });
		k_FollowingVehicle_initSpeed_upTable.setMultiplier(2.777E-4);
		k_FollowingVehicle_initSpeed_loTable.setMultiplier(2.777E-4);
		k_FollowingVehicle_initSpeed_upTable.setDerivativesMultiplier(1.0E-6);
		k_FollowingVehicle_initSpeed_loTable.setDerivativesMultiplier(1.0E-6);
		KnowledgeFieldViaTable k_FollowingVehicle_initSpeed = new KnowledgeFieldViaTable(c_FollowingVehicle, "initSpeed", k_FollowingVehicle_initSpeed_upTable, k_FollowingVehicle_initSpeed_loTable);
		k_FollowingVehicle_initSpeed.setDefaultVector(new DoubleInterval[] {new DoubleInterval(150,150), new DoubleInterval(140,140), new DoubleInterval(100,100), new DoubleInterval(90,90), new DoubleInterval(50,50), new DoubleInterval(40,40)});
		k_FollowingVehicle_initSpeed.setIsPivot(true);
		k_FollowingVehicle_initSpeed.setMultiplier(2.777E-4);
		k_FollowingVehicle_initSpeed.setPrecision(1);
		
		KnowledgeFieldNumeric k_FollowingVehicle_initDistance = new KnowledgeFieldNumeric(c_FollowingVehicle, "initDistance");
		k_FollowingVehicle_initDistance.setDefaultVector(new DoubleInterval[] {new DoubleInterval(0,0)});
		k_FollowingVehicle_initDistance.setPrecision(1);
		
		TableOfDerivatives k_FollowedVehicle_mySpeed_upTable = new TableOfDerivatives(
		new double[] { 0.0, 10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0, 110.0, 120.0, 130.0, 140.0, 150.0, 160.0, 170.0, 180.0, 190.0, 200.0, 210.0, 220.0, 230.0 }, 
		new double[] { 9.0, 6.5, 4.9, 5.6, 4.4, 5.25, 2.9, 2.8, 2.7, 1.72, 3.0, 3.0, 1.44, 1.9, 1.45, 1.25, 0.96, 0.82, 0.58, 1.0, 0.6, 0.3, 0.15, 0.0 });
		TableOfDerivatives k_FollowedVehicle_mySpeed_loTable = new TableOfDerivatives(
		new double[] { 0.0, 1.0, 230.0 }, 
		new double[] { 0.0, -8.0, -8.0 });
		k_FollowedVehicle_mySpeed_upTable.setMultiplier(2.777E-4);
		k_FollowedVehicle_mySpeed_loTable.setMultiplier(2.777E-4);
		k_FollowedVehicle_mySpeed_upTable.setDerivativesMultiplier(1.0E-6);
		k_FollowedVehicle_mySpeed_loTable.setDerivativesMultiplier(1.0E-6);
		KnowledgeFieldViaTable k_FollowedVehicle_mySpeed = new KnowledgeFieldViaTable(c_FollowedVehicle, "mySpeed", k_FollowedVehicle_mySpeed_upTable, k_FollowedVehicle_mySpeed_loTable);
		k_FollowedVehicle_mySpeed.setMultiplier(2.777E-4);
		k_FollowedVehicle_mySpeed.setPrecision(1);
		
		TableOfDerivatives k_FollowedVehicle_mySpeedC_upTable = new TableOfDerivatives(
		new double[] { 0.0, 10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0, 110.0, 120.0, 130.0, 140.0, 150.0, 160.0, 170.0, 180.0, 190.0, 200.0, 210.0, 220.0, 230.0 }, 
		new double[] { 9.0, 6.5, 4.9, 5.6, 4.4, 5.25, 2.9, 2.8, 2.7, 1.72, 3.0, 3.0, 1.44, 1.9, 1.45, 1.25, 0.96, 0.82, 0.58, 1.0, 0.6, 0.3, 0.15, 0.0 });
		TableOfDerivatives k_FollowedVehicle_mySpeedC_loTable = new TableOfDerivatives(
		new double[] { 0.0, 1.0, 230.0 }, 
		new double[] { 0.0, -8.0, -8.0 });
		k_FollowedVehicle_mySpeedC_upTable.setMultiplier(2.777E-4);
		k_FollowedVehicle_mySpeedC_loTable.setMultiplier(2.777E-4);
		k_FollowedVehicle_mySpeedC_upTable.setDerivativesMultiplier(1.0E-6);
		k_FollowedVehicle_mySpeedC_loTable.setDerivativesMultiplier(1.0E-6);
		KnowledgeFieldViaTable k_FollowedVehicle_mySpeedC = new KnowledgeFieldViaTable(c_FollowedVehicle, "mySpeedC", k_FollowedVehicle_mySpeedC_upTable, k_FollowedVehicle_mySpeedC_loTable);
		k_FollowedVehicle_mySpeedC.setMultiplier(2.777E-4);
		k_FollowedVehicle_mySpeedC.setPrecision(1);
		
		KnowledgeFieldNumeric k_FollowedVehicle_myDistance = new KnowledgeFieldNumeric(c_FollowedVehicle, "myDistance");
		k_FollowedVehicle_myDistance.setPrecision(1);
		
		KnowledgeFieldNumeric k_FollowedVehicle_myDistanceC = new KnowledgeFieldNumeric(c_FollowedVehicle, "myDistanceC");
		k_FollowedVehicle_myDistanceC.setPrecision(1);
		
		KnowledgeFieldNumeric k_FollowedVehicle_collisionDistance = new KnowledgeFieldNumeric(c_FollowedVehicle, "collisionDistance");
		k_FollowedVehicle_collisionDistance.setShowPivots(true);
		k_FollowedVehicle_collisionDistance.setPrecision(1);
		
		TableOfDerivatives k_FollowedVehicle_fSpeed_upTable = new TableOfDerivatives(
		new double[] { 0.0, 10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0, 110.0, 120.0, 130.0, 140.0, 150.0, 160.0, 170.0, 180.0, 190.0, 200.0, 210.0, 220.0, 230.0 }, 
		new double[] { 9.0, 6.5, 4.9, 5.6, 4.4, 5.25, 2.9, 2.8, 2.7, 1.72, 3.0, 3.0, 1.44, 1.9, 1.45, 1.25, 0.96, 0.82, 0.58, 1.0, 0.6, 0.3, 0.15, 0.0 });
		TableOfDerivatives k_FollowedVehicle_fSpeed_loTable = new TableOfDerivatives(
		new double[] { 0.0, 1.0, 230.0 }, 
		new double[] { 0.0, -8.0, -8.0 });
		k_FollowedVehicle_fSpeed_upTable.setMultiplier(2.777E-4);
		k_FollowedVehicle_fSpeed_loTable.setMultiplier(2.777E-4);
		k_FollowedVehicle_fSpeed_upTable.setDerivativesMultiplier(1.0E-6);
		k_FollowedVehicle_fSpeed_loTable.setDerivativesMultiplier(1.0E-6);
		KnowledgeFieldViaTable k_FollowedVehicle_fSpeed = new KnowledgeFieldViaTable(c_FollowedVehicle, "fSpeed", k_FollowedVehicle_fSpeed_upTable, k_FollowedVehicle_fSpeed_loTable);
		k_FollowedVehicle_fSpeed.setMultiplier(2.777E-4);
		k_FollowedVehicle_fSpeed.setPrecision(1);
		
		TableOfDerivatives k_FollowedVehicle_fSpeedC_upTable = new TableOfDerivatives(
		new double[] { 0.0, 10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0, 110.0, 120.0, 130.0, 140.0, 150.0, 160.0, 170.0, 180.0, 190.0, 200.0, 210.0, 220.0, 230.0 }, 
		new double[] { 9.0, 6.5, 4.9, 5.6, 4.4, 5.25, 2.9, 2.8, 2.7, 1.72, 3.0, 3.0, 1.44, 1.9, 1.45, 1.25, 0.96, 0.82, 0.58, 1.0, 0.6, 0.3, 0.15, 0.0 });
		TableOfDerivatives k_FollowedVehicle_fSpeedC_loTable = new TableOfDerivatives(
		new double[] { 0.0, 1.0, 230.0 }, 
		new double[] { 0.0, -8.0, -8.0 });
		k_FollowedVehicle_fSpeedC_upTable.setMultiplier(2.777E-4);
		k_FollowedVehicle_fSpeedC_loTable.setMultiplier(2.777E-4);
		k_FollowedVehicle_fSpeedC_upTable.setDerivativesMultiplier(1.0E-6);
		k_FollowedVehicle_fSpeedC_loTable.setDerivativesMultiplier(1.0E-6);
		KnowledgeFieldViaTable k_FollowedVehicle_fSpeedC = new KnowledgeFieldViaTable(c_FollowedVehicle, "fSpeedC", k_FollowedVehicle_fSpeedC_upTable, k_FollowedVehicle_fSpeedC_loTable);
		k_FollowedVehicle_fSpeedC.setMultiplier(2.777E-4);
		k_FollowedVehicle_fSpeedC.setPrecision(1);
		
		KnowledgeFieldNumeric k_FollowedVehicle_fDistance = new KnowledgeFieldNumeric(c_FollowedVehicle, "fDistance");
		k_FollowedVehicle_fDistance.setPrecision(1);
		
		KnowledgeFieldNumeric k_FollowedVehicle_fDistanceC = new KnowledgeFieldNumeric(c_FollowedVehicle, "fDistanceC");
		k_FollowedVehicle_fDistanceC.setPrecision(1);
		
		KnowledgeFieldNumeric k_FollowedVehicle_myDistanceF = new KnowledgeFieldNumeric(c_FollowedVehicle, "myDistanceF");
		k_FollowedVehicle_myDistanceF.setPrecision(1);
		
		KnowledgeFieldNumeric k_FollowedVehicle_fDistanceF = new KnowledgeFieldNumeric(c_FollowedVehicle, "fDistanceF");
		k_FollowedVehicle_fDistanceF.setMultiplier(1.0);
		k_FollowedVehicle_fDistanceF.setPrecision(1);
		
		TableOfDerivatives k_FollowedVehicle_initSpeed_upTable = new TableOfDerivatives(
		new double[] { 0.0, 10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0, 110.0, 120.0, 130.0, 140.0, 150.0, 160.0, 170.0, 180.0, 190.0, 200.0, 210.0, 220.0, 230.0 }, 
		new double[] { 9.0, 6.5, 4.9, 5.6, 4.4, 5.25, 2.9, 2.8, 2.7, 1.72, 3.0, 3.0, 1.44, 1.9, 1.45, 1.25, 0.96, 0.82, 0.58, 1.0, 0.6, 0.3, 0.15, 0.0 });
		TableOfDerivatives k_FollowedVehicle_initSpeed_loTable = new TableOfDerivatives(
		new double[] { 0.0, 1.0, 230.0 }, 
		new double[] { 0.0, -8.0, -8.0 });
		k_FollowedVehicle_initSpeed_upTable.setMultiplier(2.777E-4);
		k_FollowedVehicle_initSpeed_loTable.setMultiplier(2.777E-4);
		k_FollowedVehicle_initSpeed_upTable.setDerivativesMultiplier(1.0E-6);
		k_FollowedVehicle_initSpeed_loTable.setDerivativesMultiplier(1.0E-6);
		KnowledgeFieldViaTable k_FollowedVehicle_initSpeed = new KnowledgeFieldViaTable(c_FollowedVehicle, "initSpeed", k_FollowedVehicle_initSpeed_upTable, k_FollowedVehicle_initSpeed_loTable);
		k_FollowedVehicle_initSpeed.setDefaultVector(new DoubleInterval[] {new DoubleInterval(150,150), new DoubleInterval(140,140), new DoubleInterval(100,100), new DoubleInterval(90,90), new DoubleInterval(50,50), new DoubleInterval(40,40)});
		k_FollowedVehicle_initSpeed.setIsPivot(true);
		k_FollowedVehicle_initSpeed.setMultiplier(2.777E-4);
		k_FollowedVehicle_initSpeed.setPrecision(1);
		
		KnowledgeFieldNumeric k_FollowedVehicle_initDistance = new KnowledgeFieldNumeric(c_FollowedVehicle, "initDistance");
		k_FollowedVehicle_initDistance.setDefaultVector(new DoubleInterval[] {new DoubleInterval(0,0)});
		k_FollowedVehicle_initDistance.setPrecision(1);


		/* Processes definitions */
		Process p_FollowingVehicle_ControlUnit = c_FollowingVehicle.createProcess("Control Unit", 100, 250);
		
		p_FollowingVehicle_ControlUnit.addFuncWrapper(
				new FuncWrapperDifferential(integratorProvider, false),
				Arrays.asList(new KnowledgeField<?>[] { k_FollowingVehicle_mySpeed }),
				k_FollowingVehicle_mySpeedC);
		p_FollowingVehicle_ControlUnit.addFuncWrapper(
				new FuncWrapperDifferential(integratorProvider, false, new Vehicle_Process_ControlUnit_myDistanceCImpl()),
				Arrays.asList(new KnowledgeField<?>[] { k_FollowingVehicle_mySpeed, k_FollowingVehicle_myDistance }),
				k_FollowingVehicle_myDistanceC);
		p_FollowingVehicle_ControlUnit.addFuncWrapper(
				new FuncWrapperDifferential(integratorProvider, false),
				Arrays.asList(new KnowledgeField<?>[] { k_FollowingVehicle_fSpeed }),
				k_FollowingVehicle_fSpeedC);
		p_FollowingVehicle_ControlUnit.addFuncWrapper(
				new FuncWrapperDifferential(integratorProvider, false, new Vehicle_Process_ControlUnit_fDistanceCImpl()),
				Arrays.asList(new KnowledgeField<?>[] { k_FollowingVehicle_fSpeed, k_FollowingVehicle_fDistance }),
				k_FollowingVehicle_fDistanceC);
	  
		Process p_FollowingVehicle_Execution = c_FollowingVehicle.createProcess("Execution", 200, 0);
		
		p_FollowingVehicle_Execution.addFuncWrapper(
				new FuncWrapperDifferential(integratorProvider, false, new Vehicle_Process_Execution_myDistanceFImpl()),
				Arrays.asList(new KnowledgeField<?>[] { k_FollowingVehicle_mySpeedC, k_FollowingVehicle_myDistanceC }),
				k_FollowingVehicle_myDistanceF);
		p_FollowingVehicle_Execution.addFuncWrapper(
				new FuncWrapperDifferential(integratorProvider, false, new Vehicle_Process_Execution_fDistanceFImpl()),
				Arrays.asList(new KnowledgeField<?>[] { k_FollowingVehicle_fSpeedC, k_FollowingVehicle_fDistanceC }),
				k_FollowingVehicle_fDistanceF);
	  
		Process p_FollowingVehicle_Dummy = c_FollowingVehicle.createProcess("Dummy", 0, 0);
		
		Vehicle_Process_Dummy_collisionDistanceImpl var_FollowingVehicle_Process_Dummy_collisionDistance = new Vehicle_Process_Dummy_collisionDistanceImpl();
		var_FollowingVehicle_Process_Dummy_collisionDistance.setArgs(k_FollowingVehicle_collisionDistance);
		p_FollowingVehicle_Dummy.addFuncWrapper(
				new FuncWrapper(var_FollowingVehicle_Process_Dummy_collisionDistance, true),
				Arrays.asList(new KnowledgeField<?>[] { k_FollowingVehicle_myDistanceF, k_FollowingVehicle_fDistanceF }),
				k_FollowingVehicle_collisionDistance);
	  
		Process p_FollowedVehicle_ControlUnit = c_FollowedVehicle.createProcess("Control Unit", 100, 250);
		
		p_FollowedVehicle_ControlUnit.addFuncWrapper(
				new FuncWrapperDifferential(integratorProvider, false),
				Arrays.asList(new KnowledgeField<?>[] { k_FollowedVehicle_mySpeed }),
				k_FollowedVehicle_mySpeedC);
		p_FollowedVehicle_ControlUnit.addFuncWrapper(
				new FuncWrapperDifferential(integratorProvider, false, new Vehicle_Process_ControlUnit_myDistanceCImpl()),
				Arrays.asList(new KnowledgeField<?>[] { k_FollowedVehicle_mySpeed, k_FollowedVehicle_myDistance }),
				k_FollowedVehicle_myDistanceC);
		p_FollowedVehicle_ControlUnit.addFuncWrapper(
				new FuncWrapperDifferential(integratorProvider, false),
				Arrays.asList(new KnowledgeField<?>[] { k_FollowedVehicle_fSpeed }),
				k_FollowedVehicle_fSpeedC);
		p_FollowedVehicle_ControlUnit.addFuncWrapper(
				new FuncWrapperDifferential(integratorProvider, false, new Vehicle_Process_ControlUnit_fDistanceCImpl()),
				Arrays.asList(new KnowledgeField<?>[] { k_FollowedVehicle_fSpeed, k_FollowedVehicle_fDistance }),
				k_FollowedVehicle_fDistanceC);
	  
		Process p_FollowedVehicle_Execution = c_FollowedVehicle.createProcess("Execution", 200, 0);
		
		p_FollowedVehicle_Execution.addFuncWrapper(
				new FuncWrapperDifferential(integratorProvider, false, new Vehicle_Process_Execution_myDistanceFImpl()),
				Arrays.asList(new KnowledgeField<?>[] { k_FollowedVehicle_mySpeedC, k_FollowedVehicle_myDistanceC }),
				k_FollowedVehicle_myDistanceF);
		p_FollowedVehicle_Execution.addFuncWrapper(
				new FuncWrapperDifferential(integratorProvider, false, new Vehicle_Process_Execution_fDistanceFImpl()),
				Arrays.asList(new KnowledgeField<?>[] { k_FollowedVehicle_fSpeedC, k_FollowedVehicle_fDistanceC }),
				k_FollowedVehicle_fDistanceF);
	  
		Process p_FollowedVehicle_Dummy = c_FollowedVehicle.createProcess("Dummy", 0, 0);
		
		Vehicle_Process_Dummy_collisionDistanceImpl var_FollowedVehicle_Process_Dummy_collisionDistance = new Vehicle_Process_Dummy_collisionDistanceImpl();
		var_FollowedVehicle_Process_Dummy_collisionDistance.setArgs(k_FollowedVehicle_collisionDistance);
		p_FollowedVehicle_Dummy.addFuncWrapper(
				new FuncWrapper(var_FollowedVehicle_Process_Dummy_collisionDistance, true),
				Arrays.asList(new KnowledgeField<?>[] { k_FollowedVehicle_myDistanceF, k_FollowedVehicle_fDistanceF }),
				k_FollowedVehicle_collisionDistance);
	  
	
		/* Ensembles definitions */
		StaticEnsemble e_UpdatePositionInfrormation = new StaticEnsemble("UpdatePositionInfrormation", c_FollowingVehicle, c_FollowedVehicle, 400, 800);
		
		e_UpdatePositionInfrormation.addFuncWrapper(
				new FuncWrapperDifferential(integratorProvider, false),
				Arrays.asList(new KnowledgeField<?>[] { k_FollowedVehicle_initSpeed }),
				k_FollowingVehicle_fSpeed);
		e_UpdatePositionInfrormation.addFuncWrapper(
				new FuncWrapperDifferential(integratorProvider, false, new Ensemble_UpdatePositionInfrormation_fDistanceImpl()),
				Arrays.asList(new KnowledgeField<?>[] { k_FollowedVehicle_initSpeed, k_FollowedVehicle_initDistance }),
				k_FollowingVehicle_fDistance);
		e_UpdatePositionInfrormation.addFuncWrapper(
				new FuncWrapperDifferential(integratorProvider, false),
				Arrays.asList(new KnowledgeField<?>[] { k_FollowingVehicle_initSpeed }),
				k_FollowingVehicle_mySpeed);
		e_UpdatePositionInfrormation.addFuncWrapper(
				new FuncWrapperDifferential(integratorProvider, false, new Ensemble_UpdatePositionInfrormation_myDistanceImpl()),
				Arrays.asList(new KnowledgeField<?>[] { k_FollowingVehicle_initSpeed, k_FollowingVehicle_initDistance }),
				k_FollowingVehicle_myDistance);
	  
		configuration.addStaticEnsemble(e_UpdatePositionInfrormation);
		
		
		/* Alerts */
				
		Analysis analysis = new Analysis();
		analysis.runAnalysis(configuration, outputPrinter);
	}
}
