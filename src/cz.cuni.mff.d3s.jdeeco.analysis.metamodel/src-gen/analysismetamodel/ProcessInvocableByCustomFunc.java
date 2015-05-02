/**
 */
package analysismetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Invocable By Custom Func</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.ProcessInvocableByCustomFunc#getInputKnowledges <em>Input Knowledges</em>}</li>
 *   <li>{@link analysismetamodel.ProcessInvocableByCustomFunc#getOutputKnowledge <em>Output Knowledge</em>}</li>
 *   <li>{@link analysismetamodel.ProcessInvocableByCustomFunc#isDoCartesianProduct <em>Do Cartesian Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getProcessInvocableByCustomFunc()
 * @model
 * @generated
 */
public interface ProcessInvocableByCustomFunc extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Knowledges</b></em>' reference list.
	 * The list contents are of type {@link analysismetamodel.Knowledge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Knowledges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Knowledges</em>' reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getProcessInvocableByCustomFunc_InputKnowledges()
	 * @model
	 * @generated
	 */
	EList<Knowledge> getInputKnowledges();

	/**
	 * Returns the value of the '<em><b>Output Knowledge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Knowledge</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Knowledge</em>' reference.
	 * @see #setOutputKnowledge(Knowledge)
	 * @see analysismetamodel.AnalysismetamodelPackage#getProcessInvocableByCustomFunc_OutputKnowledge()
	 * @model required="true"
	 * @generated
	 */
	Knowledge getOutputKnowledge();

	/**
	 * Sets the value of the '{@link analysismetamodel.ProcessInvocableByCustomFunc#getOutputKnowledge <em>Output Knowledge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Knowledge</em>' reference.
	 * @see #getOutputKnowledge()
	 * @generated
	 */
	void setOutputKnowledge(Knowledge value);

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
	 * @see analysismetamodel.AnalysismetamodelPackage#getProcessInvocableByCustomFunc_DoCartesianProduct()
	 * @model
	 * @generated
	 */
	boolean isDoCartesianProduct();

	/**
	 * Sets the value of the '{@link analysismetamodel.ProcessInvocableByCustomFunc#isDoCartesianProduct <em>Do Cartesian Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Cartesian Product</em>' attribute.
	 * @see #isDoCartesianProduct()
	 * @generated
	 */
	void setDoCartesianProduct(boolean value);

} // ProcessInvocableByCustomFunc
