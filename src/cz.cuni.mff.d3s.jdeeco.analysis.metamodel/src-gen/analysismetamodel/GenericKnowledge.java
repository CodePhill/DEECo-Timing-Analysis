/**
 */
package analysismetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Knowledge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.GenericKnowledge#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getGenericKnowledge()
 * @model
 * @generated
 */
public interface GenericKnowledge extends Knowledge {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see analysismetamodel.AnalysismetamodelPackage#getGenericKnowledge_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link analysismetamodel.GenericKnowledge#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // GenericKnowledge
