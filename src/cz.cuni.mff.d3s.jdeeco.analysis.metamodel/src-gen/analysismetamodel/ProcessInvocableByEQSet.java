/**
 */
package analysismetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Invocable By EQ Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.ProcessInvocableByEQSet#getInputKnowledges <em>Input Knowledges</em>}</li>
 *   <li>{@link analysismetamodel.ProcessInvocableByEQSet#getOutputKnowledge <em>Output Knowledge</em>}</li>
 *   <li>{@link analysismetamodel.ProcessInvocableByEQSet#isDoCartesianProduct <em>Do Cartesian Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getProcessInvocableByEQSet()
 * @model
 * @generated
 */
public interface ProcessInvocableByEQSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Knowledges</b></em>' reference list.
	 * The list contents are of type {@link analysismetamodel.NumericKnowledge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Knowledges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Knowledges</em>' reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getProcessInvocableByEQSet_InputKnowledges()
	 * @model
	 * @generated
	 */
	EList<NumericKnowledge> getInputKnowledges();

	/**
	 * Returns the value of the '<em><b>Output Knowledge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Knowledge</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Knowledge</em>' reference.
	 * @see #setOutputKnowledge(NumericKnowledge)
	 * @see analysismetamodel.AnalysismetamodelPackage#getProcessInvocableByEQSet_OutputKnowledge()
	 * @model required="true"
	 * @generated
	 */
	NumericKnowledge getOutputKnowledge();

	/**
	 * Sets the value of the '{@link analysismetamodel.ProcessInvocableByEQSet#getOutputKnowledge <em>Output Knowledge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Knowledge</em>' reference.
	 * @see #getOutputKnowledge()
	 * @generated
	 */
	void setOutputKnowledge(NumericKnowledge value);

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
	 * @see analysismetamodel.AnalysismetamodelPackage#getProcessInvocableByEQSet_DoCartesianProduct()
	 * @model
	 * @generated
	 */
	boolean isDoCartesianProduct();

	/**
	 * Sets the value of the '{@link analysismetamodel.ProcessInvocableByEQSet#isDoCartesianProduct <em>Do Cartesian Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Cartesian Product</em>' attribute.
	 * @see #isDoCartesianProduct()
	 * @generated
	 */
	void setDoCartesianProduct(boolean value);

} // ProcessInvocableByEQSet
