package ${package}.definitions;

import cz.cuni.mff.d3s.deeco.analysis.def.*;

public abstract class ${className} extends FuncWithEquationSet {
	
	@Override
	public double F(double t, int i, double[] values, double[] valuesDerivatives) {
	<#list methods as method>
		if (i == ${method.i}) {
			return get${method.name}Derivation(${method.assignments});
		}
		
	</#list>
		return valuesDerivatives[i];
	}
	
<#list methods as method>
	public abstract double get${method.name}Derivation(${method.args});
	
</#list>
}
