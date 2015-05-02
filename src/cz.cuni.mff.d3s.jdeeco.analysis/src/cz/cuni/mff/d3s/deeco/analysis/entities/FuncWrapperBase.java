package cz.cuni.mff.d3s.deeco.analysis.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import cz.cuni.mff.d3s.deeco.analysis.core.Assertable;
import cz.cuni.mff.d3s.deeco.analysis.core.ErrorReporter;

/**
 * Represents one set of multiple inputs that give single output for given delay. Such operation can
 * be viewed as function. In analysis we call it evaluation function. Each process and ensemble is 
 * composed from one or more instances of this class. Function wrapper creates abstraction between
 * the analysis tools and the implementation of evaluation function. The analysis calls the wrapper
 * providing it with delay and expecting results. If the wrapper uses custom function given by
 * the user or differential solver depends on implementors.
 */
public abstract class FuncWrapperBase implements Assertable {
	/** Input knowledge fields = input arguments of the evaluation function. */
	protected List<KnowledgeField<?>> inputKnowledgeFields;
	/** Output knowledge field = result of the evaluation function. */
	protected KnowledgeField<?> outputKnowledgeField;
	/** Whether output vector should be result of Cartesian product of input vectors. */
	private boolean isCartesianRequired;
	
	/**
	 * @param doCartesianProduct Whether output should be result of Cartesian product of input 
	 * vectors.
	 */
	public FuncWrapperBase(boolean isCartesianRequired) {
		this.inputKnowledgeFields = new ArrayList<KnowledgeField<?>>();
		this.isCartesianRequired = isCartesianRequired;
	}
	
	/** Returns immutable collection of input knowledge fields. */
	public Collection<KnowledgeField<?>> getInputFields() {
		return Collections.unmodifiableCollection(inputKnowledgeFields);
	}
	
	/** Returns output knowledge field. */
	public KnowledgeField<?> getOutputField() {
		return outputKnowledgeField;
	}
	
	/** Adds input knowledge field. */
	public void addInputField(KnowledgeField<?> knowledgeField) {
		inputKnowledgeFields.add(knowledgeField);
	}
	
	/** Sets output knowledge field. */
	public void setOutputField(KnowledgeField<?> knowledgeField) {
		outputKnowledgeField = knowledgeField;
	}
	
	/** Whether input vectors should be created via Cartesian product. */
	private boolean shouldDoCartesian() {
		if (isCartesianRequired) {
			// If Cartesian product is directly required by the user we have to do it.
			return true;
		}
		
		// We have to do a Cartesian product if there is different number of values on each input.
		int count = inputKnowledgeFields.get(0).getValuesCount();
		for(int i = 1; i < inputKnowledgeFields.size(); ++i) {
			if (count != inputKnowledgeFields.get(i).getValuesCount()) {
				return true;
			}
		}
			
		return false;
	}
	
	/**
	 * Runs evaluation function which updates value of output knowledge field based on the given 
	 * delay and values of input knowledge fields.
	 */
	public void evaluateVector(int delay) {
		if (outputKnowledgeField.getValuesCount() > 0) {
			return;
		}
		
		outputKnowledgeField.updateDimensionsForInput(inputKnowledgeFields);
		
		int numberOfInputs = inputKnowledgeFields.size();
		int[] indices = new int[numberOfInputs];
		boolean shouldDoCartesian = shouldDoCartesian();
		
		// Find out total number of iterations
		int max = 0;
		if(shouldDoCartesian) {
			max = 1;
			for (KnowledgeField<?> inputField : inputKnowledgeFields) {			
				max *= inputField.getValuesCount();
			}
		} else {
			max = inputKnowledgeFields.get(0).getValuesCount();
		}
		
		for(int i = 0; i < max; ++i) {
			// Get dimensions indices
			ArrayList<Integer> dimensionsIndices = new ArrayList<>();
			for (int c = 0; c < inputKnowledgeFields.size(); ++c) {
				KnowledgeField<?> inputField = inputKnowledgeFields.get(c);
				dimensionsIndices.addAll(
						Arrays.asList(inputField.getDimensionsIndicesForIndex(indices[c])));
			}
			
			if (dimensionsIndices.size() > 0) {
				getOutputField().addDimensionsIndices(
						dimensionsIndices.toArray(new Integer[dimensionsIndices.size()]));
			}
			
			// Evaluate vector given by indices
			evaluateInternal(delay, indices);
			
			// Increment values selector
			if (!shouldDoCartesian) {
				/* Increment selector */
				int v = indices[0] + 1;
				for(int g = numberOfInputs - 1; g >= 0; --g) {		
					indices[g] = v;
				}
			} else {
				/* Increment selector */
				for(int g = numberOfInputs - 1; g >= 0; --g) {		
					indices[g]++;
					if (indices[g] == inputKnowledgeFields.get(g).getValuesCount()) {
						indices[g] = 0;
					} else {
						break;
					}
				}
			}
		}
	}
	
	@Override
	public void assertConfiguration(ErrorReporter errorReporter) {
		if (this.outputKnowledgeField == null) {
			errorReporter.reportError(this, "Output KnowledgeField is null.");
		}
		
		if (this.inputKnowledgeFields.size() == 0) {
			errorReporter.reportError(this, "Differential solver cannot be used with zero inputs.");
		}
	}
	
	/**
	 * Runs internal function which updates value of output knowledge field based on the given 
	 * delay and values of input knowledge fields.
	 */	
	protected abstract void evaluateInternal(int delay, int[] indices);
}
