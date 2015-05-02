package cz.cuni.mff.d3s.deeco.analysis.entities;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Optional;

import cz.cuni.mff.d3s.deeco.analysis.def.Interval;
import cz.cuni.mff.d3s.deeco.analysis.interval.impl.DoubleInterval;

/**
 * Represents single DEECo numeric knowledge field instance (knowledge field of component instance).
 * It's not mandatory to represent every numeric field by this type of class. It is useful in
 * situations where we need some additional functionality that depends on numeric values, which
 * isn't possible with the general {@link KnowledgeField Knowledge field} implementation. It brings
 * rounding, multipliers for units transformation and usage in differential equations. Values are
 * internally represented by double.
 */
public class KnowledgeFieldNumeric extends KnowledgeField<Double>  {
	/** Multiplier by which the values will be multiplied before usage in calculations. */
	private Optional<Double> multiplier;
	/** Precision used during rounding of numeric values in the output. */
	private Optional<Integer> precision;
	
	/** Values that will be used for the output. */
	private List<Interval<Double>> valuesForOutput;
	
	/**
	 * @param component The component into which the knowledge field belongs.
	 * @param name Name of the knowledge field.
	 */
	public KnowledgeFieldNumeric(Component component, String name) {
		super(component, name, Double.class);
		valuesForOutput = new ArrayList<>();
		multiplier = Optional.absent();
		precision = Optional.absent();
	}
		
	/** Adds functionality of number formating and applying multipliers for the output. */
	@Override
	public Interval<Double> getValueForOutput(int i) {
		Interval<Double> interval;
		if (!valuesForOutput.isEmpty() && valuesForOutput.size() == values.size()) {
			interval = valuesForOutput.get(i);
		} else if (multiplier.isPresent()) {
			interval = DoubleInterval.mul(super.getValue(i), 1 / multiplier.get());
		} else {
			interval = super.getValue(i);
		}
		
		if (precision.isPresent()) {
			interval.setPrecision(precision.get());
		}
		
		return interval;
	}

	/** Return multiplier by which the values are multiplied before usage in calculations. */
	public Optional<Double> getMultiplier() {
		return multiplier;
	}
	
	/** 
	 * Sets multiplier by which the values will be multiplied before usage in calculations. And
	 * transforms internal values by multiplier for future calculations.
	 */
	public void setMultiplier(double multiplier) {
		this.multiplier = Optional.of(multiplier);
		
		ArrayList<Interval<Double>> converted = new ArrayList<>();
		for(Interval<Double> value : values) {
			valuesForOutput.add(value);
			converted.add(
					new DoubleInterval(
							value.getUpperBound() * multiplier, 
							value.getLowerBound() * multiplier));			
		}
		
		values = converted;
	}
	
	/** Sets precision used during rounding of numeric values in the output. */
	public void setPrecision(int precision) {
		this.precision = Optional.of(precision);
	}
}
