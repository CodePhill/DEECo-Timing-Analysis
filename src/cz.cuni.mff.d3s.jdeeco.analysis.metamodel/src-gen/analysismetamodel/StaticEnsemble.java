/**
 */
package analysismetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Ensemble</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.StaticEnsemble#getCoordinator <em>Coordinator</em>}</li>
 *   <li>{@link analysismetamodel.StaticEnsemble#getMember <em>Member</em>}</li>
 *   <li>{@link analysismetamodel.StaticEnsemble#getName <em>Name</em>}</li>
 *   <li>{@link analysismetamodel.StaticEnsemble#getInvocablesByEQSet <em>Invocables By EQ Set</em>}</li>
 *   <li>{@link analysismetamodel.StaticEnsemble#getInvocablesByCustomFunc <em>Invocables By Custom Func</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getStaticEnsemble()
 * @model
 * @generated
 */
public interface StaticEnsemble extends Task {
	/**
	 * Returns the value of the '<em><b>Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinator</em>' reference.
	 * @see #setCoordinator(ComponentInstance)
	 * @see analysismetamodel.AnalysismetamodelPackage#getStaticEnsemble_Coordinator()
	 * @model required="true"
	 * @generated
	 */
	ComponentInstance getCoordinator();

	/**
	 * Sets the value of the '{@link analysismetamodel.StaticEnsemble#getCoordinator <em>Coordinator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinator</em>' reference.
	 * @see #getCoordinator()
	 * @generated
	 */
	void setCoordinator(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(ComponentInstance)
	 * @see analysismetamodel.AnalysismetamodelPackage#getStaticEnsemble_Member()
	 * @model required="true"
	 * @generated
	 */
	ComponentInstance getMember();

	/**
	 * Sets the value of the '{@link analysismetamodel.StaticEnsemble#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(ComponentInstance value);

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
	 * @see analysismetamodel.AnalysismetamodelPackage#getStaticEnsemble_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link analysismetamodel.StaticEnsemble#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Invocables By EQ Set</b></em>' containment reference list.
	 * The list contents are of type {@link analysismetamodel.EnsembleInvocableByEQSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocables By EQ Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocables By EQ Set</em>' containment reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getStaticEnsemble_InvocablesByEQSet()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EnsembleInvocableByEQSet> getInvocablesByEQSet();

	/**
	 * Returns the value of the '<em><b>Invocables By Custom Func</b></em>' containment reference list.
	 * The list contents are of type {@link analysismetamodel.EnsembleInvocableByCustomFunc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocables By Custom Func</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocables By Custom Func</em>' containment reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getStaticEnsemble_InvocablesByCustomFunc()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnsembleInvocableByCustomFunc> getInvocablesByCustomFunc();

} // StaticEnsemble
