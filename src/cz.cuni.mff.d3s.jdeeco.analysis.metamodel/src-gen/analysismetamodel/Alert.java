/**
 */
package analysismetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.Alert#getName <em>Name</em>}</li>
 *   <li>{@link analysismetamodel.Alert#getKnowledge <em>Knowledge</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getAlert()
 * @model
 * @generated
 */
public interface Alert extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see analysismetamodel.AnalysismetamodelPackage#getAlert_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link analysismetamodel.Alert#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Knowledge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knowledge</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge</em>' reference.
	 * @see #setKnowledge(Knowledge)
	 * @see analysismetamodel.AnalysismetamodelPackage#getAlert_Knowledge()
	 * @model required="true"
	 * @generated
	 */
	Knowledge getKnowledge();

	/**
	 * Sets the value of the '{@link analysismetamodel.Alert#getKnowledge <em>Knowledge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knowledge</em>' reference.
	 * @see #getKnowledge()
	 * @generated
	 */
	void setKnowledge(Knowledge value);

} // Alert
