/**
 */
package analysismetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ensemble Invocable By Custom Func</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.EnsembleInvocableByCustomFunc#getOutputKnowledgeBinding <em>Output Knowledge Binding</em>}</li>
 *   <li>{@link analysismetamodel.EnsembleInvocableByCustomFunc#getInputKnowledgeBindings <em>Input Knowledge Bindings</em>}</li>
 *   <li>{@link analysismetamodel.EnsembleInvocableByCustomFunc#isDoCartesianProduct <em>Do Cartesian Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getEnsembleInvocableByCustomFunc()
 * @model
 * @generated
 */
public interface EnsembleInvocableByCustomFunc extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Knowledge Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Knowledge Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Knowledge Binding</em>' containment reference.
	 * @see #setOutputKnowledgeBinding(KnowledgeBinding)
	 * @see analysismetamodel.AnalysismetamodelPackage#getEnsembleInvocableByCustomFunc_OutputKnowledgeBinding()
	 * @model containment="true" required="true"
	 * @generated
	 */
	KnowledgeBinding getOutputKnowledgeBinding();

	/**
	 * Sets the value of the '{@link analysismetamodel.EnsembleInvocableByCustomFunc#getOutputKnowledgeBinding <em>Output Knowledge Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Knowledge Binding</em>' containment reference.
	 * @see #getOutputKnowledgeBinding()
	 * @generated
	 */
	void setOutputKnowledgeBinding(KnowledgeBinding value);

	/**
	 * Returns the value of the '<em><b>Input Knowledge Bindings</b></em>' reference list.
	 * The list contents are of type {@link analysismetamodel.KnowledgeBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Knowledge Bindings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Knowledge Bindings</em>' reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getEnsembleInvocableByCustomFunc_InputKnowledgeBindings()
	 * @model
	 * @generated
	 */
	EList<KnowledgeBinding> getInputKnowledgeBindings();

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
	 * @see analysismetamodel.AnalysismetamodelPackage#getEnsembleInvocableByCustomFunc_DoCartesianProduct()
	 * @model
	 * @generated
	 */
	boolean isDoCartesianProduct();

	/**
	 * Sets the value of the '{@link analysismetamodel.EnsembleInvocableByCustomFunc#isDoCartesianProduct <em>Do Cartesian Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Cartesian Product</em>' attribute.
	 * @see #isDoCartesianProduct()
	 * @generated
	 */
	void setDoCartesianProduct(boolean value);

} // EnsembleInvocableByCustomFunc
