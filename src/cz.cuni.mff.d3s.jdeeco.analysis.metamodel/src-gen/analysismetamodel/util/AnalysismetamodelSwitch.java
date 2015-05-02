/**
 */
package analysismetamodel.util;

import analysismetamodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see analysismetamodel.AnalysismetamodelPackage
 * @generated
 */
public class AnalysismetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnalysismetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysismetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = AnalysismetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AnalysismetamodelPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.COMPONENT_PROCESS: {
				ComponentProcess componentProcess = (ComponentProcess)theEObject;
				T result = caseComponentProcess(componentProcess);
				if (result == null) result = caseTask(componentProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.GENERIC_KNOWLEDGE: {
				GenericKnowledge genericKnowledge = (GenericKnowledge)theEObject;
				T result = caseGenericKnowledge(genericKnowledge);
				if (result == null) result = caseKnowledge(genericKnowledge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.COMPONENT_INSTANCE: {
				ComponentInstance componentInstance = (ComponentInstance)theEObject;
				T result = caseComponentInstance(componentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.STATIC_ENSEMBLE: {
				StaticEnsemble staticEnsemble = (StaticEnsemble)theEObject;
				T result = caseStaticEnsemble(staticEnsemble);
				if (result == null) result = caseTask(staticEnsemble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.UPPER_BOUND_TABLE: {
				UpperBoundTable upperBoundTable = (UpperBoundTable)theEObject;
				T result = caseUpperBoundTable(upperBoundTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.TABLE_ROW: {
				TableRow tableRow = (TableRow)theEObject;
				T result = caseTableRow(tableRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES: {
				TableOfDerivatives tableOfDerivatives = (TableOfDerivatives)theEObject;
				T result = caseTableOfDerivatives(tableOfDerivatives);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.DEFAULT_VALUE: {
				DefaultValue defaultValue = (DefaultValue)theEObject;
				T result = caseDefaultValue(defaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_ENUMERATION: {
				DefaultValueByEnumeration defaultValueByEnumeration = (DefaultValueByEnumeration)theEObject;
				T result = caseDefaultValueByEnumeration(defaultValueByEnumeration);
				if (result == null) result = caseDefaultValue(defaultValueByEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR: {
				DefaultValueByGenerator defaultValueByGenerator = (DefaultValueByGenerator)theEObject;
				T result = caseDefaultValueByGenerator(defaultValueByGenerator);
				if (result == null) result = caseDefaultValue(defaultValueByGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.CUSTOM_INTERVAL: {
				CustomInterval customInterval = (CustomInterval)theEObject;
				T result = caseCustomInterval(customInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.CUSTOM_GENERATOR: {
				CustomGenerator customGenerator = (CustomGenerator)theEObject;
				T result = caseCustomGenerator(customGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.ALERT: {
				Alert alert = (Alert)theEObject;
				T result = caseAlert(alert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE_BINDING: {
				NumericKnowledgeBinding numericKnowledgeBinding = (NumericKnowledgeBinding)theEObject;
				T result = caseNumericKnowledgeBinding(numericKnowledgeBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.LOWER_BOUND_TABLE: {
				LowerBoundTable lowerBoundTable = (LowerBoundTable)theEObject;
				T result = caseLowerBoundTable(lowerBoundTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET: {
				EnsembleInvocableByEQSet ensembleInvocableByEQSet = (EnsembleInvocableByEQSet)theEObject;
				T result = caseEnsembleInvocableByEQSet(ensembleInvocableByEQSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE: {
				NumericKnowledge numericKnowledge = (NumericKnowledge)theEObject;
				T result = caseNumericKnowledge(numericKnowledge);
				if (result == null) result = caseKnowledge(numericKnowledge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_EQ_SET: {
				ProcessInvocableByEQSet processInvocableByEQSet = (ProcessInvocableByEQSet)theEObject;
				T result = caseProcessInvocableByEQSet(processInvocableByEQSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_CUSTOM_FUNC: {
				ProcessInvocableByCustomFunc processInvocableByCustomFunc = (ProcessInvocableByCustomFunc)theEObject;
				T result = caseProcessInvocableByCustomFunc(processInvocableByCustomFunc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.KNOWLEDGE: {
				Knowledge knowledge = (Knowledge)theEObject;
				T result = caseKnowledge(knowledge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.KNOWLEDGE_BINDING: {
				KnowledgeBinding knowledgeBinding = (KnowledgeBinding)theEObject;
				T result = caseKnowledgeBinding(knowledgeBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC: {
				EnsembleInvocableByCustomFunc ensembleInvocableByCustomFunc = (EnsembleInvocableByCustomFunc)theEObject;
				T result = caseEnsembleInvocableByCustomFunc(ensembleInvocableByCustomFunc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentProcess(ComponentProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Knowledge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Knowledge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericKnowledge(GenericKnowledge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstance(ComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Ensemble</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Ensemble</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticEnsemble(StaticEnsemble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upper Bound Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upper Bound Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpperBoundTable(UpperBoundTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRow(TableRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Of Derivatives</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Of Derivatives</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableOfDerivatives(TableOfDerivatives object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultValue(DefaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Value By Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Value By Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultValueByEnumeration(DefaultValueByEnumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Value By Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Value By Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultValueByGenerator(DefaultValueByGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomInterval(CustomInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomGenerator(CustomGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlert(Alert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Knowledge Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Knowledge Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericKnowledgeBinding(NumericKnowledgeBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lower Bound Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lower Bound Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowerBoundTable(LowerBoundTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ensemble Invocable By EQ Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ensemble Invocable By EQ Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnsembleInvocableByEQSet(EnsembleInvocableByEQSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Knowledge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Knowledge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericKnowledge(NumericKnowledge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Invocable By EQ Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Invocable By EQ Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessInvocableByEQSet(ProcessInvocableByEQSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Invocable By Custom Func</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Invocable By Custom Func</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessInvocableByCustomFunc(ProcessInvocableByCustomFunc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knowledge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knowledge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnowledge(Knowledge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knowledge Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knowledge Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnowledgeBinding(KnowledgeBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ensemble Invocable By Custom Func</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ensemble Invocable By Custom Func</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnsembleInvocableByCustomFunc(EnsembleInvocableByCustomFunc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AnalysismetamodelSwitch
