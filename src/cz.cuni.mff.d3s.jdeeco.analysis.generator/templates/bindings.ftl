package ${package}.core;

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

import ${package}.impl.*;

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
		configuration.setBeliefPropagationDelay(${beliefPropDelay});
		
		/* Component definition */
	  <#list componentsDefinitions as component>
		Component ${component.instanceId} = new Component("${component.name}", "${component.instanceName}");
		configuration.addComponent(${component.instanceId});
		
	  </#list>

		/* Knowledge fields definitions */
${knowledgeFieldsDefinitions}

		/* Processes definitions */
	<#list processes as process>
		Process ${process.id} = ${process.componentInstanceId}.createProcess("${process.name}", ${process.deadline}, ${process.period});
		
	  <#list process.invocablesCustomFunc as invocable>
		${invocable.impl} ${invocable.implVar} = new ${invocable.impl}();
		${invocable.implVar}.setArgs(${invocable.output});
		${process.id}.addFuncWrapper(
				new FuncWrapper(${invocable.implVar}, ${invocable.cartesian}),
				Arrays.asList(new KnowledgeField<?>[] { ${invocable.inputs} }),
				${invocable.output});
	  </#list>
	  <#list process.invocablesEQSet as invocable>
		${process.id}.addFuncWrapper(
				new FuncWrapperDifferential(integratorProvider, ${invocable.cartesian}${invocable.impl}),
				Arrays.asList(new KnowledgeField<?>[] { ${invocable.inputs} }),
				${invocable.output});
	  </#list>
	  
	</#list>
	
		/* Ensembles definitions */
	<#list ensembles as ensemble>
		StaticEnsemble ${ensemble.id} = new StaticEnsemble("${ensemble.name}", ${ensemble.coordinator}, ${ensemble.member}, ${ensemble.deadline}, ${ensemble.period});
		
	  <#list ensemble.invocablesCustomFunc as invocable>
		${invocable.impl} var_${invocable.impl} = new ${invocable.impl}();
		var_${invocable.impl}.setArgs(${invocable.output});
		${ensemble.id}.addFuncWrapper(
				new FuncWrapper(var_${invocable.impl}, ${invocable.cartesian}),
				Arrays.asList(new KnowledgeField<?>[] { ${invocable.inputs} }),
				${invocable.output});
	  </#list>	  
	  <#list ensemble.invocablesEQSet as invocable>
		${ensemble.id}.addFuncWrapper(
				new FuncWrapperDifferential(integratorProvider, ${invocable.cartesian}${invocable.impl}),
				Arrays.asList(new KnowledgeField<?>[] { ${invocable.inputs} }),
				${invocable.output});
	  </#list>
	  
		configuration.addStaticEnsemble(${ensemble.id});
		
	</#list>
		
		/* Alerts */
	<#list alertsDefinitions as alert>
		${alert.impl} ${alert.id} = new ${alert.impl}();
	  <#list alert.fields as field>
		${field}.addAlert(${alert.id});
	  </#list>
	  
	</#list>
				
		Analysis analysis = new Analysis();
		analysis.runAnalysis(configuration, outputPrinter);
	}
}
