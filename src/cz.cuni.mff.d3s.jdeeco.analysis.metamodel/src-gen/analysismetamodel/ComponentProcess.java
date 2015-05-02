/**
 */
package analysismetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.ComponentProcess#getName <em>Name</em>}</li>
 *   <li>{@link analysismetamodel.ComponentProcess#getComponent <em>Component</em>}</li>
 *   <li>{@link analysismetamodel.ComponentProcess#getInvocablesByEQSet <em>Invocables By EQ Set</em>}</li>
 *   <li>{@link analysismetamodel.ComponentProcess#getInvocablesByCustomFunc <em>Invocables By Custom Func</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getComponentProcess()
 * @model
 * @generated
 */
public interface ComponentProcess extends Task {
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
	 * @see analysismetamodel.AnalysismetamodelPackage#getComponentProcess_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link analysismetamodel.ComponentProcess#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see analysismetamodel.AnalysismetamodelPackage#getComponentProcess_Component()
	 * @model required="true"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link analysismetamodel.ComponentProcess#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Invocables By EQ Set</b></em>' containment reference list.
	 * The list contents are of type {@link analysismetamodel.ProcessInvocableByEQSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocables By EQ Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocables By EQ Set</em>' containment reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getComponentProcess_InvocablesByEQSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessInvocableByEQSet> getInvocablesByEQSet();

	/**
	 * Returns the value of the '<em><b>Invocables By Custom Func</b></em>' containment reference list.
	 * The list contents are of type {@link analysismetamodel.ProcessInvocableByCustomFunc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocables By Custom Func</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocables By Custom Func</em>' containment reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getComponentProcess_InvocablesByCustomFunc()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessInvocableByCustomFunc> getInvocablesByCustomFunc();

} // ComponentProcess
