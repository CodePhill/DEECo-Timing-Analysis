package ${package}.definitions;

import cz.cuni.mff.d3s.deeco.analysis.def.*;

public abstract class ${className} extends Func<${functionOUT}> {
	
	@Override
	public void evaluateVector(int delay, Interval<?>[] values) {
		out.addComputedValue(evaluate(delay${functionIN}));
	}
	
	public abstract Interval<${functionOUT}> evaluate(int delay${functionIN2}) ;
}
