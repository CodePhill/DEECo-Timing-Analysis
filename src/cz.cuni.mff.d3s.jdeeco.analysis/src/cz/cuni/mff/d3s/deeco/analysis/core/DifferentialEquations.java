package cz.cuni.mff.d3s.deeco.analysis.core;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;

import com.google.common.base.Optional;

import cz.cuni.mff.d3s.deeco.analysis.def.FuncWithEquationSet;
import cz.cuni.mff.d3s.deeco.analysis.entities.TableOfDerivatives;

/**
 * Wrapper for a set of differential equations that is passed to a step integrator.
 */
public class DifferentialEquations implements FirstOrderDifferentialEquations {
	
	private TableOfDerivatives[] tablesOfDerivatives;
	private Optional<FuncWithEquationSet> equationsSet;
	
	/**
	 * @param tableOfDerivatives Array of tables of derivatives. When input is on index i then
	 * the table must be on index i of the array. Null entries are allowed.
	 * @param equationsSet Optional class which contains function used to obtain derivations for
	 * a given input. Class is mandatory when table of derivatives is not present for some input. 
	 */
	public DifferentialEquations(
			TableOfDerivatives[] tableOfDerivatives, Optional<FuncWithEquationSet> equationsSet) {
		this.tablesOfDerivatives = tableOfDerivatives;
		this.equationsSet = equationsSet;
	}
	
	@Override
	public void computeDerivatives(double t, double[] y, double[] yDot)
			throws MaxCountExceededException, DimensionMismatchException {
		int inputs = tablesOfDerivatives.length;
		for(int i = 0; i < inputs; ++i) {
			if (tablesOfDerivatives[i] != null) {
				// We have a table of derivatives for an input i
				yDot[i] = tablesOfDerivatives[i].getDerivation(y[i]);
			} else if (equationsSet.isPresent()) {
				// We don't have a table of derivatives so we call implementation given by the user.
				yDot[i] = equationsSet.get().F(t, i, y, yDot);
			}
		}
	}

	@Override
	public int getDimension() {
		return tablesOfDerivatives.length;
	}
}