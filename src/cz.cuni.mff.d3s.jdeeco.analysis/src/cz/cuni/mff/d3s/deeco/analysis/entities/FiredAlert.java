package cz.cuni.mff.d3s.deeco.analysis.entities;

import cz.cuni.mff.d3s.deeco.analysis.def.Alert;
import cz.cuni.mff.d3s.deeco.analysis.def.Interval;

/**
 * Represents one single fired alert. Instance of this class exists for each alert and each value
 * for which the alert was fired.
 *
 * @param <T>
 */
public class FiredAlert<T> {
	/* Alert that was fired. */
	private Alert<T> alert;
	/* Value for which the alert was fired. s*/
	private Interval<T> value;
	
	/**
	 * @param alert Alert that was fired.
	 * @param value Value for which the alert was fired.
	 */
	public FiredAlert(Alert<T> alert, Interval<T> value) {
		this.alert = alert;
		this.value = value;
	}
	
	/** Returns the alert that was fired. */
	public Alert<T> getAlert() {
		return alert;
	}
	
	/** Returns value for which the alert was fired. */
	public Interval<T> getValue() {
		return value;
	}
}
