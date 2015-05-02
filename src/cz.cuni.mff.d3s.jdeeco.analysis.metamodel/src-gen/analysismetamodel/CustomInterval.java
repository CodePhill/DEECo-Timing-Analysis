/**
 */
package analysismetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.CustomInterval#getWrappedType <em>Wrapped Type</em>}</li>
 *   <li>{@link analysismetamodel.CustomInterval#getClazz <em>Clazz</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getCustomInterval()
 * @model
 * @generated
 */
public interface CustomInterval extends EObject {
	/**
	 * Returns the value of the '<em><b>Wrapped Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrapped Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped Type</em>' attribute.
	 * @see #setWrappedType(String)
	 * @see analysismetamodel.AnalysismetamodelPackage#getCustomInterval_WrappedType()
	 * @model required="true"
	 * @generated
	 */
	String getWrappedType();

	/**
	 * Sets the value of the '{@link analysismetamodel.CustomInterval#getWrappedType <em>Wrapped Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrapped Type</em>' attribute.
	 * @see #getWrappedType()
	 * @generated
	 */
	void setWrappedType(String value);

	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clazz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' attribute.
	 * @see #setClazz(String)
	 * @see analysismetamodel.AnalysismetamodelPackage#getCustomInterval_Clazz()
	 * @model required="true"
	 * @generated
	 */
	String getClazz();

	/**
	 * Sets the value of the '{@link analysismetamodel.CustomInterval#getClazz <em>Clazz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' attribute.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(String value);

} // CustomInterval
