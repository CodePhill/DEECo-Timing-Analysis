package cz.cuni.mff.d3s.deeco.analysis.interval.impl;

import java.text.DecimalFormat;

import com.google.common.base.Optional;

import cz.cuni.mff.d3s.deeco.analysis.def.Interval;

/**
 * Implementation of {@link cz.cuni.mff.d3s.deeco.analysis.def.Interval Interval} for Double.
 */
public class DoubleInterval extends Interval<Double> {
	
	/** Format of the number for the output */
	private Optional<DecimalFormat> format;

	public DoubleInterval(double upperBound, double lowerBound) {
		super(upperBound, lowerBound);
		format = Optional.absent();
	}
	
	public DoubleInterval(int upperBound, int lowerBound) {
		super((double) upperBound, (double) lowerBound);
		format = Optional.absent();
	}
	
	/** Creates independent copy of the given interval. */
	public DoubleInterval(Interval<Double> interval) {
		super(interval.getUpperBound(), interval.getLowerBound());
	}
	
	/** Sums two intervals in the same way as vectors and returns new instance as an result. */
	public static Interval<Double> sum(Interval<Double> first, Interval<Double> second) {
		return new DoubleInterval(
				first.getUpperBound() + second.getUpperBound(),
				first.getLowerBound() + second.getLowerBound());
	}
	
	/** Multiplies vector of values with scalar and returns new instance as an result. */
	public static Interval<Double> mul(Interval<Double> interval, Double value) {
		return new DoubleInterval(
				interval.getUpperBound() * value,
				interval.getLowerBound() * value);
	}

	@Override
	public Interval<String> getStringInterval() {
		if (format.isPresent()) {
			return new StringInterval(
					format.get().format(this.upperBound),
					format.get().format(this.lowerBound));
		} else {
			return new StringInterval(
					((Double) round(this.upperBound)).toString(),
					((Double) round(this.lowerBound)).toString());
		}
	}
	
	@Override
	public void setPrecision(int precision) {
		String formatStr = "#.";
		for (int i = 0; i < precision; ++i) {
			formatStr += "#";
		}
		
		this.format = Optional.of(new DecimalFormat(formatStr));
	}
	
	private Double round(double num) {
		int n = 3;		
	    if(num == 0) {
	        return 0.0;
	    }

	    double d = Math.ceil(Math.log10(num < 0 ? -num: num));
	    int power = n - (int) d;

	    double magnitude = Math.pow(10, power);
	    long shifted = Math.round(num*magnitude);
	    return shifted/magnitude;
	}
}
