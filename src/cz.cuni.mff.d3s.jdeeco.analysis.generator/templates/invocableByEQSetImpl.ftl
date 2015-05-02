package ${package}.impl;

import cz.cuni.mff.d3s.deeco.analysis.def.*;
import ${package}.definitions.*;

public final class ${className}Impl extends ${className} {
  <#list methods as method>
	@Override
	public double get${method.name}Derivation(${method.args}) {
		// TODO: Implement.
		throw new UnsupportedOperationException();
	}	
  </#list>
}
