package cz.cuni.mff.d3s.deeco.analysis.generators;

import java.util.ArrayList;

import cz.cuni.mff.d3s.deeco.analysis.def.Generator;
import cz.cuni.mff.d3s.deeco.analysis.def.Interval;
import cz.cuni.mff.d3s.deeco.analysis.interval.impl.IntegerInterval;

/**
 * Generator version for integers.
 * 
 * @see cz.cuni.mff.d3s.deeco.analysis.def.Generator
 */
public class IntegerGenerator extends Generator<Integer> {
	
	@Override
	/** 
	 * Generates n values from interval [start, end] with constant step = ((end - start) / count)
	 */
	public Interval<Integer>[] generate() {
		int step = (end - start) / count;
		if (step == 0) { 
			step = 1;
		}
		
		ArrayList<Interval<Integer>> list = new ArrayList<Interval<Integer>>();
		for(int i = start; i <= end; i+= step) {
			list.add(new IntegerInterval(i, i));
		}
		
		Interval<Integer>[] result = new IntegerInterval[list.size()];
		return list.toArray(result);
	}
}
