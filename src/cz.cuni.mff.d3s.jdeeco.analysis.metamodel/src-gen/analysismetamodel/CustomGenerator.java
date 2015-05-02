/**
 */
package analysismetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.CustomGenerator#getGeneratedType <em>Generated Type</em>}</li>
 *   <li>{@link analysismetamodel.CustomGenerator#getClazz <em>Clazz</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getCustomGenerator()
 * @model
 * @generated
 */
public interface CustomGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Generated Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Type</em>' attribute.
	 * @see #setGeneratedType(String)
	 * @see analysismetamodel.AnalysismetamodelPackage#getCustomGenerator_GeneratedType()
	 * @model required="true"
	 * @generated
	 */
	String getGeneratedType();

	/**
	 * Sets the value of the '{@link analysismetamodel.CustomGenerator#getGeneratedType <em>Generated Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated Type</em>' attribute.
	 * @see #getGeneratedType()
	 * @generated
	 */
	void setGeneratedType(String value);

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
	 * @see analysismetamodel.AnalysismetamodelPackage#getCustomGenerator_Clazz()
	 * @model required="true"
	 * @generated
	 */
	String getClazz();

	/**
	 * Sets the value of the '{@link analysismetamodel.CustomGenerator#getClazz <em>Clazz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' attribute.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(String value);

} // CustomGenerator
