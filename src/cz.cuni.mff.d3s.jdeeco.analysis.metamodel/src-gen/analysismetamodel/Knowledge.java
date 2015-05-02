/**
 */
package analysismetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.Knowledge#getName <em>Name</em>}</li>
 *   <li>{@link analysismetamodel.Knowledge#isIsPivot <em>Is Pivot</em>}</li>
 *   <li>{@link analysismetamodel.Knowledge#isShowPivot <em>Show Pivot</em>}</li>
 *   <li>{@link analysismetamodel.Knowledge#getDefaultValues <em>Default Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getKnowledge()
 * @model abstract="true"
 * @generated
 */
public interface Knowledge extends EObject {
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
	 * @see analysismetamodel.AnalysismetamodelPackage#getKnowledge_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link analysismetamodel.Knowledge#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Pivot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Pivot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Pivot</em>' attribute.
	 * @see #setIsPivot(boolean)
	 * @see analysismetamodel.AnalysismetamodelPackage#getKnowledge_IsPivot()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsPivot();

	/**
	 * Sets the value of the '{@link analysismetamodel.Knowledge#isIsPivot <em>Is Pivot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Pivot</em>' attribute.
	 * @see #isIsPivot()
	 * @generated
	 */
	void setIsPivot(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Pivot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Pivot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Pivot</em>' attribute.
	 * @see #setShowPivot(boolean)
	 * @see analysismetamodel.AnalysismetamodelPackage#getKnowledge_ShowPivot()
	 * @model required="true"
	 * @generated
	 */
	boolean isShowPivot();

	/**
	 * Sets the value of the '{@link analysismetamodel.Knowledge#isShowPivot <em>Show Pivot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Pivot</em>' attribute.
	 * @see #isShowPivot()
	 * @generated
	 */
	void setShowPivot(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Values</b></em>' containment reference list.
	 * The list contents are of type {@link analysismetamodel.DefaultValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Values</em>' containment reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getKnowledge_DefaultValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefaultValue> getDefaultValues();

} // Knowledge
