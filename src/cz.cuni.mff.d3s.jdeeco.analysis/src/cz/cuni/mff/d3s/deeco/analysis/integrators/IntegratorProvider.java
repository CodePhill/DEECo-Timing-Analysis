package cz.cuni.mff.d3s.deeco.analysis.integrators;

import org.apache.commons.math3.ode.FirstOrderIntegrator;

/**
 * General interface that allows us to provide the analysis with custom integrator.
 */
public interface IntegratorProvider {
	/** Returns implementation of a first order integrator. */
	public FirstOrderIntegrator getIntegrator();
}
