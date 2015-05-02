package cz.cuni.mff.d3s.deeco.analysis.entities;

import java.util.ArrayList;
import java.util.Collection;

import com.google.common.base.Optional;

import cz.cuni.mff.d3s.deeco.analysis.core.Assertable;
import cz.cuni.mff.d3s.deeco.analysis.core.ErrorReporter;

public class TableOfDerivatives implements Assertable {	
	/** Array of given values. */
	private double[] originalValues;
	/** Array of derivatives where derivatives[i] is a derivative for values[i]. */
	private double[] originalDerivatives;
	/** Same as original values property but values are multiplied by the values multiplier. */
	private double[] values;
	/** Same as original derivatives property but values are multiplied by the derivatives multiplier. */
	private double[] derivatives;
	/** All values used in calculations are multiplied by this variable. */
	private Optional<Double> multiplier;
	/** All derivatives used in calculations are multiplied by this variable. */
	private Optional<Double> derivativesMultiplier;
	
	/**
	 * @param values Array of values.
	 * @param derivatives Array of derivatives where derivatives[i] is a derivative for values[i].
	 */
	public TableOfDerivatives(double[] values, double[] derivatives) {
		this.originalValues = values;
		this.originalDerivatives = derivatives;
		this.values = values;
		this.derivatives = derivatives;
		this.multiplier = Optional.absent();
		
		checkValuesOrder();
	}
	
	/** Returns the values multiplier. */
	public Optional<Double> getValuesMultiplier() {
		return multiplier;
	}
	
	/** Returns the derivatives multiplier. */
	public Optional<Double> getDerivativesMultiplier() {
		return derivativesMultiplier;
	}
	
	/** Returns vector of original values. */
	public double[] getOriginalValues() {
		return originalValues;
	}
	
	/** Returns vector of original derivatives. */
	public double[] getOriginalDerivatives() {
		return originalDerivatives;
	}
	
	/** Returns collection of pairs where p[0] is a value, p[1] is a derivative of that value. */
	public Collection<double[]> getOriginalValuesAndDerivatives() {
		Collection<double[]> pairs = new ArrayList<>();
		for(int i = 0; i < getTableSize(); ++i) {
			pairs.add(new double[] { originalValues[i], originalDerivatives[i] });
		}
		
		return pairs;
	}
	
	
	/** Returns size of the table. */
	public int getTableSize() {
		return this.originalValues.length;
	}
	
	/** 
	 * Sets the values multiplier. Warning: Multiplier can be set only once. 
	 * All values of the table (not derivatives) will be multiplied by the value of the multiplier.
	 * Serves for units conversion.
	 */
	public void setMultiplier(Double multiplier) {
		this.multiplier = Optional.of(multiplier);
		this.values = new double[this.getTableSize()];
		for(int i = 0; i < values.length; ++i) {
			values[i] = originalValues[i] * multiplier;
		}
	}
	
	/**
	 * Sets the derivatives multiplier. Warning: Multiplier can be set only once. 
	 * All derivatives of the table will be multiplied by the value of the multiplier. Servers for
	 * unit conversions.
	 */
	public void setDerivativesMultiplier(Double multiplier) {
		this.derivativesMultiplier = Optional.of(multiplier);
		this.derivatives = new double[this.getTableSize()];
		for(int i = 0; i < values.length; ++i) {
			derivatives[i] = originalDerivatives[i] * multiplier;
		}
	}
	
	/**
	 * Returns derivation of the given value by using the table of derivatives. If precise values is
	 * not found in the table, then liner interpolation is used.
	 * @param val
	 * @return
	 */
	public double getDerivation(double val) {
		if (values.length == 1) {
			return values[0];
		}
		
		int s = 0;
		int e = values.length - 2;
		while(true) {
			int m = (s + e) / 2;
			
			if (val == values[m]) {
				return derivatives[m];
			} else if (val == values[m+1]) {
				return derivatives[m+1];
			} else if (val > values[m] && val < values[m+1]) {
				// Do the interpolation.
				return derivatives[m]
						+ (derivatives[m+1] - derivatives[m])
						* (val - values[m]) / (values[m+1] - values[m]);
			}
						
			if (val > values[m]) {
				s = m + 1;
			} else {
				e = m - 1;
			}
			
			if (s > e) {
				return 0;
			}
		}
	}

	@Override
	public void assertConfiguration(ErrorReporter errorReporter) {
		if (this.values == null || this.derivatives == null) {
			errorReporter.reportError(this, 
					"Values or derivatives of table of derivatives are null!");
		}
		
		if (this.values.length != this.derivatives.length) {
			errorReporter.reportError(this, 
					"There is different number of values and derivatives in table of derivatives!");
		}
		
		checkValuesOrder();
	}
	
	public void checkValuesOrder() {
		boolean sorted = false;
		
		while(!sorted) {
			sorted = true;
			
			for(int i = 0; i < values.length - 1; ++i) {
				if (values[i] > values[i + 1]) {
					double tempVal = values[i];
					double tempDer = derivatives[i];
					values[i] = values[i + 1];
					derivatives[i] = derivatives[i + 1];
					values[i + 1] = tempVal;
					derivatives[i + 1] = tempDer;
					sorted = false;
				}
			}
		}
	}
}
