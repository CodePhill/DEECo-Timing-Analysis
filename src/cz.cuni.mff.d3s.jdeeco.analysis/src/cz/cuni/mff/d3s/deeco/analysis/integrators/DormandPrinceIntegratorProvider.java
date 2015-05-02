package cz.cuni.mff.d3s.deeco.analysis.integrators;

import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;

/**
 * Integrator provider that provides the analysis with implementation of 8(5,3) Dormand-Prince
 * integrator for Ordinary Differential Equations.
 */
public class DormandPrinceIntegratorProvider implements IntegratorProvider {
	
	@Override
	public FirstOrderIntegrator getIntegrator() {
		return new DormandPrince853Integrator(1.0e-12, 100, 1.0e-10, 1.0e-10);
	}
}
