package cz.cuni.mff.d3s.deeco.analysis.entities;

import cz.cuni.mff.d3s.deeco.analysis.def.Func;
import cz.cuni.mff.d3s.deeco.analysis.def.Interval;

/**
 * Wrapper for evaluation functions given by the user.
 */
public class FuncWrapper extends FuncWrapperBase {

	/** Implementation of the evaluation function given by the user. */
	private Func<?> func;
	
	/**
	 * @param func Implementation of the evaluation function given by the user.
	 */
	public FuncWrapper(Func<?> func, boolean doCartesianProduct) {
		super(doCartesianProduct);
		this.func = func;
	}
	
	/** Returns implementation given by the user. */
	public Func<?> getFunc() {
		return func;
	}
	
	@Override
	protected void evaluateInternal(int delay, int[] indices) {
		Interval<?>[] inputValues = new Interval<?>[inputKnowledgeFields.size()];
		
		int c = 0;
		for(KnowledgeField<?> inputField : inputKnowledgeFields) {
			KnowledgeFieldNumeric numericInputField = (KnowledgeFieldNumeric)inputField;
			inputValues[c] = numericInputField.getValue(indices[c]);
			++c;
		}
			
		func.evaluateVector(delay, inputValues);
	}
}
