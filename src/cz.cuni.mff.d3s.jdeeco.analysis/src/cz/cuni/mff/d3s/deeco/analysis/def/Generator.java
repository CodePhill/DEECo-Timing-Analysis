package cz.cuni.mff.d3s.deeco.analysis.def;

/**
 * 
 * Abstract generator. Task of generator is to generate values from a given interval. 
 *
 * @param <T> Type of values that should be returned by the generator.
 */
public abstract class Generator<T> {
	/* Start of the interval. */
	protected T start;
	/* End of the interval. */
	protected T end;
	/* Maximum number of values that is going to be generated. */
	protected int count;
	
	/**
	 * Initializes the generator with necessary values.
	 * @param start First value of the interval from which the values should be generated.
	 * @param end Last value of the interval from which the values should be generated.
	 * @param count Maximum number of values that is going to be generated.
	 */
	public void InitGenerator(T start, T end, int count) {
		this.start = start;
		this.end = end;
		this.count = count;
	}
	
	/**
	 * Returns vector of generated values given by provided arguments during initialization.
	 * Values will be in interval [start, end]. There is no guarantee on ordering or variability.
	 * Each implementor can address this problem with custom approach.
	 */
	public abstract Interval<T>[] generate();
}
