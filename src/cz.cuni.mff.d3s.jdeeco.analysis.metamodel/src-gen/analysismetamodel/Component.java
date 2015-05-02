/**
 */
package analysismetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.Component#getComponentProcesses <em>Component Processes</em>}</li>
 *   <li>{@link analysismetamodel.Component#getName <em>Name</em>}</li>
 *   <li>{@link analysismetamodel.Component#getKnowledges <em>Knowledges</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Processes</b></em>' containment reference list.
	 * The list contents are of type {@link analysismetamodel.ComponentProcess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Processes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Processes</em>' containment reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getComponent_ComponentProcesses()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentProcess> getComponentProcesses();

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
	 * @see analysismetamodel.AnalysismetamodelPackage#getComponent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link analysismetamodel.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Knowledges</b></em>' containment reference list.
	 * The list contents are of type {@link analysismetamodel.Knowledge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knowledges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledges</em>' containment reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getComponent_Knowledges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Knowledge> getKnowledges();

} // Component
