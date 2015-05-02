package cz.cuni.mff.d3s.deeco.analysis.entities;

import java.util.ArrayList;
import java.util.Collection;

import cz.cuni.mff.d3s.deeco.analysis.core.Assertable;
import cz.cuni.mff.d3s.deeco.analysis.core.ErrorReporter;

/** 
 * Represents single DEECo component instance.
 */
public class Component implements Assertable {
	/* Name of the original component. */
	private String name;
	/* Name of the instance of the component. */
	private String instanceName;
	/* Instances of knowledge fields which belong to the component. */
	private Collection<KnowledgeField<?>> knowledgeFields;
	/* Instances of processes which belong to the component. */
	private Collection<Process> processes;
	
	/**
	 * @param name Name of the original component.
	 * @param instanceName Name of the instance of the component.
	 */
	public Component(String name, String instanceName) {
		this.name = name;
		this.instanceName = instanceName;
		this.knowledgeFields = new ArrayList<KnowledgeField<?>>();
		this.processes = new ArrayList<Process>();
	}
	
	/** Returns name of the component. */
	public String getName() {
		return name;
	}
	
	/** Returns name of this component instance. */
	public String getInstanceName() {
		return instanceName;
	}
	
	/** Returns knowledge fields which belong to this component. */
	public Collection<KnowledgeField<?>> getKnowledgeFields() {
		return knowledgeFields;
	}
	
	/** Returns processes which belong to this component. */
	public Collection<Process> getProcesses() {
		return processes;
	}
	
	/** Adds knowledge field to the component. */
	public void addKnowledgeField(KnowledgeField<?> knowledgeField) {
		knowledgeFields.add(knowledgeField);
	}
	
	/**
	 * Creates process in current component and initialize it with provided arguments.
	 * 
	 * @param name Name of the process.
	 * @param deadline Deadline of the process.
	 * @param period Period of the process.
	 * @return Created process.
	 */
	public Process createProcess(
			String name, int deadline, int period) {
		Process process = new Process(this, name, deadline, period);
		processes.add(process);
		return process;
	}
		
	@Override
	public void assertConfiguration(ErrorReporter errorReporter) {
		for(KnowledgeField<?> knowledgeField : knowledgeFields) {
			knowledgeField.assertConfiguration(errorReporter);
		}
		
		for(Process process : processes) {
			process.assertConfiguration(errorReporter);
		}
	}
}
