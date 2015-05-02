/**
 */
package analysismetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see analysismetamodel.AnalysismetamodelPackage
 * @generated
 */
public interface AnalysismetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysismetamodelFactory eINSTANCE = analysismetamodel.impl.AnalysismetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Component Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Process</em>'.
	 * @generated
	 */
	ComponentProcess createComponentProcess();

	/**
	 * Returns a new object of class '<em>Generic Knowledge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Knowledge</em>'.
	 * @generated
	 */
	GenericKnowledge createGenericKnowledge();

	/**
	 * Returns a new object of class '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance</em>'.
	 * @generated
	 */
	ComponentInstance createComponentInstance();

	/**
	 * Returns a new object of class '<em>Static Ensemble</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Ensemble</em>'.
	 * @generated
	 */
	StaticEnsemble createStaticEnsemble();

	/**
	 * Returns a new object of class '<em>Upper Bound Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Upper Bound Table</em>'.
	 * @generated
	 */
	UpperBoundTable createUpperBoundTable();

	/**
	 * Returns a new object of class '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Row</em>'.
	 * @generated
	 */
	TableRow createTableRow();

	/**
	 * Returns a new object of class '<em>Table Of Derivatives</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Of Derivatives</em>'.
	 * @generated
	 */
	TableOfDerivatives createTableOfDerivatives();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Default Value By Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Value By Enumeration</em>'.
	 * @generated
	 */
	DefaultValueByEnumeration createDefaultValueByEnumeration();

	/**
	 * Returns a new object of class '<em>Default Value By Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Value By Generator</em>'.
	 * @generated
	 */
	DefaultValueByGenerator createDefaultValueByGenerator();

	/**
	 * Returns a new object of class '<em>Custom Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Interval</em>'.
	 * @generated
	 */
	CustomInterval createCustomInterval();

	/**
	 * Returns a new object of class '<em>Custom Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Generator</em>'.
	 * @generated
	 */
	CustomGenerator createCustomGenerator();

	/**
	 * Returns a new object of class '<em>Alert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alert</em>'.
	 * @generated
	 */
	Alert createAlert();

	/**
	 * Returns a new object of class '<em>Numeric Knowledge Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Knowledge Binding</em>'.
	 * @generated
	 */
	NumericKnowledgeBinding createNumericKnowledgeBinding();

	/**
	 * Returns a new object of class '<em>Lower Bound Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lower Bound Table</em>'.
	 * @generated
	 */
	LowerBoundTable createLowerBoundTable();

	/**
	 * Returns a new object of class '<em>Ensemble Invocable By EQ Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ensemble Invocable By EQ Set</em>'.
	 * @generated
	 */
	EnsembleInvocableByEQSet createEnsembleInvocableByEQSet();

	/**
	 * Returns a new object of class '<em>Numeric Knowledge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Knowledge</em>'.
	 * @generated
	 */
	NumericKnowledge createNumericKnowledge();

	/**
	 * Returns a new object of class '<em>Process Invocable By EQ Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Invocable By EQ Set</em>'.
	 * @generated
	 */
	ProcessInvocableByEQSet createProcessInvocableByEQSet();

	/**
	 * Returns a new object of class '<em>Process Invocable By Custom Func</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Invocable By Custom Func</em>'.
	 * @generated
	 */
	ProcessInvocableByCustomFunc createProcessInvocableByCustomFunc();

	/**
	 * Returns a new object of class '<em>Knowledge Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knowledge Binding</em>'.
	 * @generated
	 */
	KnowledgeBinding createKnowledgeBinding();

	/**
	 * Returns a new object of class '<em>Ensemble Invocable By Custom Func</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ensemble Invocable By Custom Func</em>'.
	 * @generated
	 */
	EnsembleInvocableByCustomFunc createEnsembleInvocableByCustomFunc();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnalysismetamodelPackage getAnalysismetamodelPackage();

} //AnalysismetamodelFactory
