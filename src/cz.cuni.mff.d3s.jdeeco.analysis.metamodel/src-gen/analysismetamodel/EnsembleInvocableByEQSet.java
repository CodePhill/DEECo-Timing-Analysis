/**
 */
package analysismetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ensemble Invocable By EQ Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.EnsembleInvocableByEQSet#getInputKnowledgeBindings <em>Input Knowledge Bindings</em>}</li>
 *   <li>{@link analysismetamodel.EnsembleInvocableByEQSet#getOutputKnowledgeBinding <em>Output Knowledge Binding</em>}</li>
 *   <li>{@link analysismetamodel.EnsembleInvocableByEQSet#isDoCartesianProduct <em>Do Cartesian Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getEnsembleInvocableByEQSet()
 * @model
 * @generated
 */
public interface EnsembleInvocableByEQSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Knowledge Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link analysismetamodel.NumericKnowledgeBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Knowledge Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Knowledge Bindings</em>' containment reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getEnsembleInvocableByEQSet_InputKnowledgeBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<NumericKnowledgeBinding> getInputKnowledgeBindings();

	/**
	 * Returns the value of the '<em><b>Output Knowledge Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Knowledge Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Knowledge Binding</em>' containment reference.
	 * @see #setOutputKnowledgeBinding(NumericKnowledgeBinding)
	 * @see analysismetamodel.AnalysismetamodelPackage#getEnsembleInvocableByEQSet_OutputKnowledgeBinding()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumericKnowledgeBinding getOutputKnowledgeBinding();

	/**
	 * Sets the value of the '{@link analysismetamodel.EnsembleInvocableByEQSet#getOutputKnowledgeBinding <em>Output Knowledge Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Knowledge Binding</em>' containment reference.
	 * @see #getOutputKnowledgeBinding()
	 * @generated
	 */
	void setOutputKnowledgeBinding(NumericKnowledgeBinding value);

	/**
	 * Returns the value of the '<em><b>Do Cartesian Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Cartesian Product</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Cartesian Product</em>' attribute.
	 * @see #setDoCartesianProduct(boolean)
	 * @see analysismetamodel.AnalysismetamodelPackage#getEnsembleInvocableByEQSet_DoCartesianProduct()
	 * @model
	 * @generated
	 */
	boolean isDoCartesianProduct();

	/**
	 * Sets the value of the '{@link analysismetamodel.EnsembleInvocableByEQSet#isDoCartesianProduct <em>Do Cartesian Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Cartesian Product</em>' attribute.
	 * @see #isDoCartesianProduct()
	 * @generated
	 */
	void setDoCartesianProduct(boolean value);

} // EnsembleInvocableByEQSet
