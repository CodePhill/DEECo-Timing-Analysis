package cz.cuni.mff.d3s.deeco.analysis.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Container for errors found during {@link Assertable assertion check}.
 */
public class ErrorReporter {
	
	private Collection<String> errors;
	
	public ErrorReporter() {
		errors = new ArrayList<String>();
	}
	
	/**
	 * Serves for error reporting.
	 * @param instance Reference to the object that reports the error.
	 * @param message Message of the error.
	 */
	public void reportError(Object instance, String message) {
		errors.add(instance.getClass().getSimpleName() + ": " + message);
	}
	
	/** Returns total number of found errors. */
	public int getNumberOfErrors() {
		return errors.size();
	}
	
	/** Returns collection of formated strings where each represents found error. */
	public Collection<String> getAllErrors() {
		return Collections.unmodifiableCollection(errors);
	}
}
