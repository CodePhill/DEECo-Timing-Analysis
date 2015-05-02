package cz.cuni.mff.d3s.deeco.analysis.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import cz.cuni.mff.d3s.deeco.analysis.entities.Component;
import cz.cuni.mff.d3s.deeco.analysis.entities.StaticEnsemble;

/**
 * Analysis configuration container. Contains all parts of the analysis input such as components,
 * ensembles and global configuration parameters.
 */
public class AnalysisConfiguration implements Assertable {
	
	/* Value of belief propagation delay used by ensembles. */
	private int beliefPropagationDelay;
	/* Whether the analysis should be executed. If not then input is only checked for integrity. */
	private boolean runValueEvaluations;
	/* Components that should be included into analysis. */
	private Collection<Component> components;
	/* Static ensembles that should be included into analysis. */
	private Collection<StaticEnsemble> staticEnsembles;
	
	public AnalysisConfiguration() {
		this.components = new ArrayList<Component>();
		this.staticEnsembles = new ArrayList<StaticEnsemble>();
		this.runValueEvaluations = true;
		this.beliefPropagationDelay = 0;
	}
	
	/** Returns belief propagation delay. */
	public int getBeliefPropagationDelay() {
		return beliefPropagationDelay;
	}
	
	/** Returns whether knowledge bound values should be evaluated.*/
	public boolean getRunValueEvaluations() {
		return runValueEvaluations;
	}
	
	/** Returns immutable collection of components. */
	public Collection<Component> getComponents() {
		return Collections.unmodifiableCollection(components);
	}
	
	/** Returns immutable collection of static ensembles. */
	public Collection<StaticEnsemble> getStaticEnsembles() {
		return Collections.unmodifiableCollection(staticEnsembles);
	}
	
	/** Sets belief propagation delay. */
	public void setBeliefPropagationDelay(int beliefPropagationDelay) {
		this.beliefPropagationDelay = beliefPropagationDelay;
	}
	
	/** Sets whether knowledge bound values should be evaluated. */
	public void setRunValueEvaluations(boolean runValueEvaluations) {
		this.runValueEvaluations = runValueEvaluations;
	}
	
	/** Adds a new component to the configuration. */
	public void addComponent(Component component) {
		components.add(component);
	}
	
	/** Adds a new static ensemble to the configuration. */
	public void addStaticEnsemble(StaticEnsemble staticEnsemble) {
		staticEnsembles.add(staticEnsemble);
	}

	@Override
	public void assertConfiguration(ErrorReporter errorReporter) {
		// Assert each component.
		for(Component component : components) {
			component.assertConfiguration(errorReporter);
		}
				
		// Assert each ensemble.
		for(StaticEnsemble staticEnsemble : staticEnsembles) {
			staticEnsemble.assertConfiguration(errorReporter);
		}
	}
}