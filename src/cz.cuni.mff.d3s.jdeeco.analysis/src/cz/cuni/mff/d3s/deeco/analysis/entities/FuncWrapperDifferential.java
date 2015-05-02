package cz.cuni.mff.d3s.deeco.analysis.entities;

import com.google.common.base.Optional;

import cz.cuni.mff.d3s.deeco.analysis.core.DifferentialEquations;
import cz.cuni.mff.d3s.deeco.analysis.core.ErrorReporter;
import cz.cuni.mff.d3s.deeco.analysis.def.FuncWithEquationSet;
import cz.cuni.mff.d3s.deeco.analysis.integrators.IntegratorProvider;
import cz.cuni.mff.d3s.deeco.analysis.interval.impl.DoubleInterval;

/**
 * Wrapper for evaluation functions represented by a set of differential equations. This class is
 * responsible for solving the differential equation using tables of derivatives and by equations
 * given by the user. 
 */
public class FuncWrapperDifferential extends FuncWrapperBase {
	/** Integrator provider which can give us an implementation of the solver. */
	private IntegratorProvider integratorProvider;
	/** Wrapper with implementation of equations defined by the user. */
	private Optional<FuncWithEquationSet> funcWithEquationSet;
	/** Differential equations used by the integrator. */
	DifferentialEquations upperBoundEquations;
	DifferentialEquations lowerBoundEquations;
	
	public FuncWrapperDifferential(
			IntegratorProvider integratorProvider, 
			boolean doCartesianProduct) {
		super(doCartesianProduct);	
		this.integratorProvider = integratorProvider;
		this.funcWithEquationSet = Optional.absent();	
	}
	
	public FuncWrapperDifferential(
			IntegratorProvider integratorProvider, 
			boolean doCartesianProduct, 
			FuncWithEquationSet funcWithEquationSet) {
		super(doCartesianProduct);	
		this.integratorProvider = integratorProvider;
		this.funcWithEquationSet = Optional.of(funcWithEquationSet);
	}
	
	/** Returns wrapper with implementation of equations defined by the user. Empty if not given. */
	public Optional<FuncWithEquationSet> getEquationSetFunc() {
		return funcWithEquationSet;
	}
	
	@Override
	public void evaluateVector(int delay) {
		// Prepare arrays of tables of derivatives for upper and lower bounds.
		TableOfDerivatives[] upperTables = new TableOfDerivatives[inputKnowledgeFields.size()];
		TableOfDerivatives[] lowerTables = new TableOfDerivatives[inputKnowledgeFields.size()];
		for(int i = 0; i < inputKnowledgeFields.size(); ++i) {
			KnowledgeField<?> inputField = inputKnowledgeFields.get(i);
			/* Set field's tables of derivatives. */
			if (inputField instanceof KnowledgeFieldViaTable) {
				upperTables[i]=((KnowledgeFieldViaTable)inputField).getUpperBoundTable();
				lowerTables[i]=((KnowledgeFieldViaTable)inputField).getLowerBoundTable();
			} 
		}
		
		// Create differential equations that will be passed to the step integrator.
		upperBoundEquations = new DifferentialEquations(upperTables, this.funcWithEquationSet);
		lowerBoundEquations = new DifferentialEquations(lowerTables, this.funcWithEquationSet);
		
		super.evaluateVector(delay);
	}
			
	@Override
	protected void evaluateInternal(int delay, int[] indices) {
		int numberOfInputs = inputKnowledgeFields.size();
		double[] yUp = new double[numberOfInputs];
		double[] yLow = new double[numberOfInputs];
		
		// Fill the initial vectors with default values.
		int c = 0;
		for(KnowledgeField<?> inputField : inputKnowledgeFields) {
			KnowledgeFieldNumeric numericInputField = (KnowledgeFieldNumeric)inputField;
			yUp[c] = numericInputField.getValue(indices[c]).getUpperBound();
			yLow[c] = numericInputField.getValue(indices[c]).getLowerBound();
			++c;
		}
		
		// Run integrator over the differential equations with initial vectors.
		integratorProvider.getIntegrator().integrate(upperBoundEquations, 0, yUp, delay, yUp);
		integratorProvider.getIntegrator().integrate(lowerBoundEquations, 0, yLow, delay, yLow);
		
		// Set the last value of the array as a result of the computation.
		((KnowledgeFieldNumeric) outputKnowledgeField).addComputedValue(
				new DoubleInterval(yUp[numberOfInputs-1], yLow[numberOfInputs-1]));
	}
	
	@Override
	public void assertConfiguration(ErrorReporter errorReporter) {
		super.assertConfiguration(errorReporter);
	}
}
