package cz.cuni.mff.d3s.deeco.analysis.core;

/**
 * Implemented by classes that need to assert their internal configuration before the analysis
 * starts. Must be also implemented by classes which directly own other classes that implement it.
 */
public interface Assertable {

	/**
	 * Asserts internal configuration of the class. If any errors are found they are reported to the
	 * error reporter given as an argument. Implementor of this  method is responsible for calling 
	 * it on each directly owned object that also implements the interface. No exception allowed.
	 */
	void assertConfiguration(ErrorReporter errorReporter);
}
