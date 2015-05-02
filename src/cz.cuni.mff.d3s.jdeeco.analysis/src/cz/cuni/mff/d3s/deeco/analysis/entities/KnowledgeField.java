package cz.cuni.mff.d3s.deeco.analysis.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import cz.cuni.mff.d3s.deeco.analysis.core.Assertable;
import cz.cuni.mff.d3s.deeco.analysis.core.ErrorReporter;
import cz.cuni.mff.d3s.deeco.analysis.def.Alert;
import cz.cuni.mff.d3s.deeco.analysis.def.Generator;
import cz.cuni.mff.d3s.deeco.analysis.def.Interval;

/**
 * Represents single DEECo knowledge field instance (knowledge field of component instance).
 *
 * @param <T> Type of the knowledge field
 */
public class KnowledgeField<T> implements Assertable  {
	/* Component in to which the knowledge field belongs. */
	private Component component;
	/* Name of the knowledge field. */
	private String name;
	/* Name of the type of the knowledge field. */
	protected String typeName;
	/* Whether the knowledge field will be used on axis of graph result for other fields. */
	private boolean isPivot;
	/* Whether pivots of this field should be displayed in the output. */
	private boolean showPivots;
	/* Whether this field is used as an input argument of a process or ensemble. */
	private boolean isUsedAsInput;
	/* Alerts assigned to the knowledge field. */
	private Collection<Alert<T>> alerts;
	/* Records about fired alerts during the analysis. */
	private Collection<FiredAlert<T>> firedAlerts;
	/* All input knowledge fields that are pivots. */
	private Collection<KnowledgeField<?>> inputDimensions;
	/* Task (process or ensemble) of which is the knowledge field output. */
	private Task outputOfPeriodic;
	
	/* Internal values. */
	protected ArrayList<Interval<T>> values = new ArrayList<Interval<T>>();
	
	protected ArrayList<Integer[]> dimensionsPointers = new ArrayList<Integer[]>();
	
	/**
	 * @param component The component into which the knowledge field belongs.
	 * @param name Name of the knowledge field.
	 * @param type Type of the knowledge field (type of values which it contains).
	 */
	public KnowledgeField(Component component, String name, Class<T> type) {
		this.component = component;
		this.name = name;
		this.typeName = type.getSimpleName();
		this.inputDimensions = new ArrayList<KnowledgeField<?>>();
		this.firedAlerts = new ArrayList<FiredAlert<T>>();
		this.alerts = new ArrayList<Alert<T>>();
		
		this.component.addKnowledgeField(this);
	}
	
	/** Returns the component into which the knowledge field belongs.*/
	public Component getComponent() {
		return component;
	}
	
	/** Returns name of the knowledge field.*/
	public String getName() {
		return name;
	}
	
	/** Returns name of the type of the knowledge field. */
	public String getTypeName() {
		return typeName;
	}
	
	/** Returns delay by which is the knowledge field affected. */
	public int getDelay() {
		if (outputOfPeriodic != null) {
			return outputOfPeriodic.getDelay(isUsedAsInput);
		}
		
		return 0;
	}
	
	/** Returns whether the knowledge field is pivot. */
	public boolean isPivot() {
		return isPivot;
	}
	
	/** Return whether pivot should be displayed. */
	public boolean isShowPivots() {
		return showPivots;
	}
	
	/** Returns whether the field is used as an input argument of a process or ensemble. */
	public boolean isUsedAsInput() {
		return isUsedAsInput;
	}
	
	/** Returns all input knowledge fields that are pivots. */
	public Collection<KnowledgeField<?>> getInputDimensions() {
		return Collections.unmodifiableCollection(inputDimensions);
	}
	
	/** Returns Task (process or ensemble) of which is the knowledge field output. */
	public Task getOutputOfPeriodic() {
		return outputOfPeriodic;
	}
	
	/** Returns fired alerts. */
	public Collection<FiredAlert<T>> getFiredAlerts() {
		return Collections.unmodifiableCollection(firedAlerts);
	}
	
	/** Returns immutable collection of its values. */
	public Collection<Interval<T>> getValues() {
		return Collections.unmodifiableList(values);
	}
	
	/** Returns number of values of the knowledge field. */
	public int getValuesCount() {
		return values.size();
	}
	
	/** Returns value on index i. */
	public Interval<T> getValue(int i) {
		return values.get(i);
	}
	
	
	public Interval<T> getValueForOutput(int i) {
		return values.get(i);
	}
	
	/** Sets whether the knowledge field is pivot. */
	public void setIsPivot(boolean isPivot) {
		this.isPivot = isPivot;
	}
	
	/** Sets whether the knowledge shows its pivots in the output. */
	public void setShowPivots(boolean showPivots) {
		this.showPivots = showPivots;
	}
	
	/** Sets that the field is used as an input argument of a process or ensemble. */
	public void setIsUsedAsInput() {
		isUsedAsInput = true;
	}
		
	/** Sets Task (process or ensemble) of which is the knowledge field output. */
	public void setOutputOfPeriodic(Task outputOfPeriodic) {
		this.outputOfPeriodic = outputOfPeriodic;
	}
	
	/** Sets vector of default values given by an array. */
	public void setDefaultVector(Interval<T>[] defaultValues) {
		for(Interval<T> value : defaultValues) {
			values.add(value);
		}
	}
	
	/** Sets vector of default values given by a collection. */
	public void setDefaultVector(Collection<Interval<T>> defaultValues) {
		for(Interval<T> value : defaultValues) {
			values.add(value);
		}
	}
	
	/** Sets vector of default values by using given generator. */
	public void setDefaultVector(Generator<T> generator) {
		setDefaultVector(generator.generate());
	}
	
	/** Adds new value computed by the analysis. */
	public void addComputedValue(Interval<T> value) {
		values.add(value);
	}
	
	/** Adds new alert. */
	public void addAlert(Alert<T> alert) {
		alerts.add(alert);
	}
	
	/** 
	 * Updates input dimensions of the field from the given input field by following rules. If
	 * the input field is not a pivot but contains some input dimensions then these dimensions are
	 * added to the field as input dimensions. If the input field is pivot and has at least one
	 * value then it is added as input dimension to the field.
	 */
	public void updateDimensionsForInput(Collection<KnowledgeField<?>> inputKnowledgeFields) {
		for (KnowledgeField<?> inputField : inputKnowledgeFields) {
			if (inputField.isPivot()) {
				inputDimensions.add(inputField);
			} else if (inputField.getInputDimensions().size() > 0) {
				inputDimensions.addAll(inputField.getInputDimensions());
			}
		}
	}
	
	public Integer[] getDimensionsIndicesForIndex(int index) {
		if (isPivot) {
			return new Integer[] { index };
		} else if (this.inputDimensions.size() > 0) {
			return this.dimensionsPointers.get(index);
		} else {
			return new Integer[] {};
		}	
	}
	
	public void addDimensionsIndices(Integer[] indices) {
		this.dimensionsPointers.add(indices);
	}
	
	/** Verifies all alerts for all values. All fired alerts are stored for future reference. */
	public void checkAlerts() {
		for (Interval<T> value : getValues()) {
			for(Alert<T> alert : alerts) {
				if (alert.CheckValue(value)) {
					firedAlerts.add(new FiredAlert<T>(alert, value));
				}
			}
		}
	}
		
	@Override
	public void assertConfiguration(ErrorReporter errorReporter) {
		if (component == null) {
			errorReporter.reportError(this, "Component reference is null!");
		}
	}
}
