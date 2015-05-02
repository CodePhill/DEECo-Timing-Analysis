/**
 */
package analysismetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Knowledge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.NumericKnowledge#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link analysismetamodel.NumericKnowledge#getTableOfDerivatives <em>Table Of Derivatives</em>}</li>
 *   <li>{@link analysismetamodel.NumericKnowledge#getPrecision <em>Precision</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getNumericKnowledge()
 * @model
 * @generated
 */
public interface NumericKnowledge extends Knowledge {
	/**
	 * Returns the value of the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplier</em>' attribute.
	 * @see #setMultiplier(double)
	 * @see analysismetamodel.AnalysismetamodelPackage#getNumericKnowledge_Multiplier()
	 * @model
	 * @generated
	 */
	double getMultiplier();

	/**
	 * Sets the value of the '{@link analysismetamodel.NumericKnowledge#getMultiplier <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplier</em>' attribute.
	 * @see #getMultiplier()
	 * @generated
	 */
	void setMultiplier(double value);

	/**
	 * Returns the value of the '<em><b>Table Of Derivatives</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Of Derivatives</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Of Derivatives</em>' reference.
	 * @see #setTableOfDerivatives(TableOfDerivatives)
	 * @see analysismetamodel.AnalysismetamodelPackage#getNumericKnowledge_TableOfDerivatives()
	 * @model
	 * @generated
	 */
	TableOfDerivatives getTableOfDerivatives();

	/**
	 * Sets the value of the '{@link analysismetamodel.NumericKnowledge#getTableOfDerivatives <em>Table Of Derivatives</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Of Derivatives</em>' reference.
	 * @see #getTableOfDerivatives()
	 * @generated
	 */
	void setTableOfDerivatives(TableOfDerivatives value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(int)
	 * @see analysismetamodel.AnalysismetamodelPackage#getNumericKnowledge_Precision()
	 * @model
	 * @generated
	 */
	int getPrecision();

	/**
	 * Sets the value of the '{@link analysismetamodel.NumericKnowledge#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(int value);

} // NumericKnowledge
