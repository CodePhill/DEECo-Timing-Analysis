package cz.cuni.mff.d3s.jdeeco.analysis.generator.utils;

import analysismetamodel.Alert;
import analysismetamodel.Component;
import analysismetamodel.ComponentInstance;
import analysismetamodel.ComponentProcess;
import analysismetamodel.Knowledge;
import analysismetamodel.StaticEnsemble;

/**
 * Provides names of variables and classes used by all generators.
 */
public class NamingConventions {
	
	/** 
	 * Returns id of the given knowledge field - usable as variable identifier.
	 * 
	 * @param componentInstance A component instance into which the knowledge belongs.
	 */
	public String getKnowledgeId(Knowledge knowledge, ComponentInstance componentInstance) {
		return "k_"
				+ StringUtils.removeSpaces(componentInstance.getName())
				+ "_"
				+ StringUtils.removeSpaces(knowledge.getName());
	}
	
	/** 
	 * Returns id of the given process field - usable as variable identifier.
	 * 
	 * @param componentInstance A component instance into which the process belongs.
	 */
	public String getProcessId(ComponentProcess process, ComponentInstance componentInstance) {
		return "p_"
				+ StringUtils.removeSpaces(componentInstance.getName())
				+ "_"
				+ StringUtils.removeSpaces(process.getName());
	}
	
	/** Returns id of the given component instance - usable as variable identifier. */
	public String getComponentInstanceId(ComponentInstance componentInstance) {
		return "c_" + StringUtils.removeSpaces(componentInstance.getName());
	}
	
	/** Returns variable identifier for a class of the given process and output. */
	public String getProcessClassImplVar(
			ComponentProcess process, ComponentInstance componentInstance, Knowledge output) {
		return "var_"
				+ StringUtils.removeSpaces(componentInstance.getName())
				+ "_Process_"
				+ StringUtils.removeSpaces(process.getName())
				+ "_"
				+ StringUtils.removeSpaces(output.getName());
	}
	
	/** Returns name of a class of the given process and its output used for a user's 
	 * implementation. */
	public String getProcessClassImpl(
			ComponentProcess process, Component component, Knowledge output) {
		return getProcessClass(process, component, output) + "Impl";
	}
	
	/** Returns name of a class of the given process and its output. */
	public String getProcessClass(
			ComponentProcess process, Component component, Knowledge output) {
		return StringUtils.removeSpaces(component.getName())
				+ "_Process_"
				+ StringUtils.removeSpaces(process.getName())
				+ "_"
				+ StringUtils.removeSpaces(output.getName());
	}
	
	/** Returns id of the given static ensemble - usable as variable identifier. */
	public String getEnsembleId(StaticEnsemble ensemble) {
		return "e_" + StringUtils.removeSpaces(ensemble.getName());
	}
	
	/** Returns name of a class of the given ensemble for a user's implementation. */
	public String getEnsembleClassImpl(StaticEnsemble ensemble, Knowledge output) {
		return getEnsembleClass(ensemble, output) + "Impl";
	}
	
	/** Returns name of a class of the given ensemble. */
	public String getEnsembleClass(StaticEnsemble ensemble, Knowledge output) {
		return "Ensemble_"
				+ StringUtils.removeSpaces(ensemble.getName())
				+ "_"
				+ StringUtils.removeSpaces(output.getName());
	}
	
	/** Returns name of a class of the given alert for a user's implementation. */
	public String getAlertClassImpl(Alert alert) {
		return getAlertClass(alert) + "Impl";
	}
	
	/** Returns name of a class of the given alert. */
	public String getAlertClass(Alert alert) {
		return "Alert_" + StringUtils.removeSpaces(alert.getName());
	}
}
