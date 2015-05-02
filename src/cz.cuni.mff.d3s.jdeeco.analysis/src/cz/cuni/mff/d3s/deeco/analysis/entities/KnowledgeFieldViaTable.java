package cz.cuni.mff.d3s.deeco.analysis.entities;

import cz.cuni.mff.d3s.deeco.analysis.core.ErrorReporter;

/**
 * Represents single DEECo knowledge field instance (knowledge field of component instance). Used
 * for knowledge fields which have their derivatives defined via table of derivatives. Such
 * knowledge field must have a numeric type.
 */
public class KnowledgeFieldViaTable extends KnowledgeFieldNumeric  {
	/** Table of derivatives for upper bounds (positive derivatives). */
	private TableOfDerivatives upperBoundTable;
	/** Table of derivatives for lower bounds (negative derivatives). */
	private TableOfDerivatives lowerBoundTable;
	
	/**
	 * @param component The component into which the knowledge field belongs.
	 * @param name Name of the knowledge field.
	 * @param upperBoundTable Table of derivatives for upper bounds (positive derivatives).
	 * @param lowerBoundTable Table of derivatives for lower bounds (negative derivatives).
	 */
	public KnowledgeFieldViaTable(
			Component component,
			String name,
			TableOfDerivatives upperBoundTable,
			TableOfDerivatives lowerBoundTable) {
		super(component, name);
		this.upperBoundTable = upperBoundTable;
		this.lowerBoundTable = lowerBoundTable;
	}

	/** Returns table of derivatives for upper bounds. */
	public TableOfDerivatives getUpperBoundTable() {
		return upperBoundTable;
	}
	
	/** Returns table of derivatives for lower bounds. */
	public TableOfDerivatives getLowerBoundTable() {
		return lowerBoundTable;
	}
	
	@Override
	public void assertConfiguration(ErrorReporter errorReporter) {
		super.assertConfiguration(errorReporter);
		
		if (upperBoundTable == null || lowerBoundTable == null) {
			errorReporter.reportError(this, "Missing a table of derivatives for knowledge field!");
		}
		
		upperBoundTable.assertConfiguration(errorReporter);
		lowerBoundTable.assertConfiguration(errorReporter);
	}
}
