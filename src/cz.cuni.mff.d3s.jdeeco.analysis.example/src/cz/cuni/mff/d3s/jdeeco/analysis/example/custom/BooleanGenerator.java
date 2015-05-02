package cz.cuni.mff.d3s.jdeeco.analysis.example.custom;

import cz.cuni.mff.d3s.deeco.analysis.def.Generator;
import cz.cuni.mff.d3s.deeco.analysis.def.Interval;

public class BooleanGenerator extends Generator<Boolean> {

	@Override
	public Interval<Boolean>[] generate() {
		return new BooleanInterval[] { new BooleanInterval(true, true) };
	}
}
