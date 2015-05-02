/**
 */
package analysismetamodel.util;

import analysismetamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see analysismetamodel.AnalysismetamodelPackage
 * @generated
 */
public class AnalysismetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnalysismetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysismetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AnalysismetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysismetamodelSwitch<Adapter> modelSwitch =
		new AnalysismetamodelSwitch<Adapter>() {
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseComponentProcess(ComponentProcess object) {
				return createComponentProcessAdapter();
			}
			@Override
			public Adapter caseGenericKnowledge(GenericKnowledge object) {
				return createGenericKnowledgeAdapter();
			}
			@Override
			public Adapter caseComponentInstance(ComponentInstance object) {
				return createComponentInstanceAdapter();
			}
			@Override
			public Adapter caseStaticEnsemble(StaticEnsemble object) {
				return createStaticEnsembleAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseUpperBoundTable(UpperBoundTable object) {
				return createUpperBoundTableAdapter();
			}
			@Override
			public Adapter caseTableRow(TableRow object) {
				return createTableRowAdapter();
			}
			@Override
			public Adapter caseTableOfDerivatives(TableOfDerivatives object) {
				return createTableOfDerivativesAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseDefaultValue(DefaultValue object) {
				return createDefaultValueAdapter();
			}
			@Override
			public Adapter caseDefaultValueByEnumeration(DefaultValueByEnumeration object) {
				return createDefaultValueByEnumerationAdapter();
			}
			@Override
			public Adapter caseDefaultValueByGenerator(DefaultValueByGenerator object) {
				return createDefaultValueByGeneratorAdapter();
			}
			@Override
			public Adapter caseCustomInterval(CustomInterval object) {
				return createCustomIntervalAdapter();
			}
			@Override
			public Adapter caseCustomGenerator(CustomGenerator object) {
				return createCustomGeneratorAdapter();
			}
			@Override
			public Adapter caseAlert(Alert object) {
				return createAlertAdapter();
			}
			@Override
			public Adapter caseNumericKnowledgeBinding(NumericKnowledgeBinding object) {
				return createNumericKnowledgeBindingAdapter();
			}
			@Override
			public Adapter caseLowerBoundTable(LowerBoundTable object) {
				return createLowerBoundTableAdapter();
			}
			@Override
			public Adapter caseEnsembleInvocableByEQSet(EnsembleInvocableByEQSet object) {
				return createEnsembleInvocableByEQSetAdapter();
			}
			@Override
			public Adapter caseNumericKnowledge(NumericKnowledge object) {
				return createNumericKnowledgeAdapter();
			}
			@Override
			public Adapter caseProcessInvocableByEQSet(ProcessInvocableByEQSet object) {
				return createProcessInvocableByEQSetAdapter();
			}
			@Override
			public Adapter caseProcessInvocableByCustomFunc(ProcessInvocableByCustomFunc object) {
				return createProcessInvocableByCustomFuncAdapter();
			}
			@Override
			public Adapter caseKnowledge(Knowledge object) {
				return createKnowledgeAdapter();
			}
			@Override
			public Adapter caseKnowledgeBinding(KnowledgeBinding object) {
				return createKnowledgeBindingAdapter();
			}
			@Override
			public Adapter caseEnsembleInvocableByCustomFunc(EnsembleInvocableByCustomFunc object) {
				return createEnsembleInvocableByCustomFuncAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.ComponentProcess <em>Component Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.ComponentProcess
	 * @generated
	 */
	public Adapter createComponentProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.GenericKnowledge <em>Generic Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.GenericKnowledge
	 * @generated
	 */
	public Adapter createGenericKnowledgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.ComponentInstance
	 * @generated
	 */
	public Adapter createComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.StaticEnsemble <em>Static Ensemble</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.StaticEnsemble
	 * @generated
	 */
	public Adapter createStaticEnsembleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.UpperBoundTable <em>Upper Bound Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.UpperBoundTable
	 * @generated
	 */
	public Adapter createUpperBoundTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.TableRow
	 * @generated
	 */
	public Adapter createTableRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.TableOfDerivatives <em>Table Of Derivatives</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.TableOfDerivatives
	 * @generated
	 */
	public Adapter createTableOfDerivativesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.DefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.DefaultValue
	 * @generated
	 */
	public Adapter createDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.DefaultValueByEnumeration <em>Default Value By Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.DefaultValueByEnumeration
	 * @generated
	 */
	public Adapter createDefaultValueByEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.DefaultValueByGenerator <em>Default Value By Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.DefaultValueByGenerator
	 * @generated
	 */
	public Adapter createDefaultValueByGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.CustomInterval <em>Custom Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.CustomInterval
	 * @generated
	 */
	public Adapter createCustomIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.CustomGenerator <em>Custom Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.CustomGenerator
	 * @generated
	 */
	public Adapter createCustomGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.Alert <em>Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.Alert
	 * @generated
	 */
	public Adapter createAlertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.NumericKnowledgeBinding <em>Numeric Knowledge Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.NumericKnowledgeBinding
	 * @generated
	 */
	public Adapter createNumericKnowledgeBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.LowerBoundTable <em>Lower Bound Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.LowerBoundTable
	 * @generated
	 */
	public Adapter createLowerBoundTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.EnsembleInvocableByEQSet <em>Ensemble Invocable By EQ Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.EnsembleInvocableByEQSet
	 * @generated
	 */
	public Adapter createEnsembleInvocableByEQSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.NumericKnowledge <em>Numeric Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.NumericKnowledge
	 * @generated
	 */
	public Adapter createNumericKnowledgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.ProcessInvocableByEQSet <em>Process Invocable By EQ Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.ProcessInvocableByEQSet
	 * @generated
	 */
	public Adapter createProcessInvocableByEQSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.ProcessInvocableByCustomFunc <em>Process Invocable By Custom Func</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.ProcessInvocableByCustomFunc
	 * @generated
	 */
	public Adapter createProcessInvocableByCustomFuncAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.Knowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.Knowledge
	 * @generated
	 */
	public Adapter createKnowledgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.KnowledgeBinding <em>Knowledge Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.KnowledgeBinding
	 * @generated
	 */
	public Adapter createKnowledgeBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link analysismetamodel.EnsembleInvocableByCustomFunc <em>Ensemble Invocable By Custom Func</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see analysismetamodel.EnsembleInvocableByCustomFunc
	 * @generated
	 */
	public Adapter createEnsembleInvocableByCustomFuncAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AnalysismetamodelAdapterFactory
