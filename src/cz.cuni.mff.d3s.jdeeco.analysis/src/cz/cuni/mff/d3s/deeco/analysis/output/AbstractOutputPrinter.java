package cz.cuni.mff.d3s.deeco.analysis.output;

import cz.cuni.mff.d3s.deeco.analysis.core.AnalysisConfiguration;
import cz.cuni.mff.d3s.deeco.analysis.core.ErrorReporter;

/**
 * Output printer that is used by the analysis to provide the user with results. Each implementor
 * choose its own custom way how to print the results.
 */
public interface AbstractOutputPrinter {

	/**
	 * Provides the user with results of the analysis.
	 * @param analysisConfiguration Input of the analysis that also contains all necessary results.
	 * @param duration Duration of the analysis in milliseconds.
	 * @return Whether printing has succeeded.
	 */
	public boolean printReport(AnalysisConfiguration analysisConfiguration, long duration);
	
	/**
	 * Provides the user with report of occurred errors.
	 * @param errorReporter Source of aggregated errors that are going to be presented to the user.
	 * @return Whether printing has succeeded.
	 */
	public boolean printErrorReport(ErrorReporter errorReporter);
}
