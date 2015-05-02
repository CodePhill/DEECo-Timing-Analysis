/**
 */
package analysismetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Value By Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.DefaultValueByGenerator#getStart <em>Start</em>}</li>
 *   <li>{@link analysismetamodel.DefaultValueByGenerator#getEnd <em>End</em>}</li>
 *   <li>{@link analysismetamodel.DefaultValueByGenerator#getCount <em>Count</em>}</li>
 *   <li>{@link analysismetamodel.DefaultValueByGenerator#getGenerator <em>Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getDefaultValueByGenerator()
 * @model
 * @generated
 */
public interface DefaultValueByGenerator extends DefaultValue {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(String)
	 * @see analysismetamodel.AnalysismetamodelPackage#getDefaultValueByGenerator_Start()
	 * @model required="true"
	 * @generated
	 */
	String getStart();

	/**
	 * Sets the value of the '{@link analysismetamodel.DefaultValueByGenerator#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(String value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(String)
	 * @see analysismetamodel.AnalysismetamodelPackage#getDefaultValueByGenerator_End()
	 * @model required="true"
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link analysismetamodel.DefaultValueByGenerator#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see analysismetamodel.AnalysismetamodelPackage#getDefaultValueByGenerator_Count()
	 * @model required="true"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link analysismetamodel.DefaultValueByGenerator#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' reference.
	 * @see #setGenerator(CustomGenerator)
	 * @see analysismetamodel.AnalysismetamodelPackage#getDefaultValueByGenerator_Generator()
	 * @model required="true"
	 * @generated
	 */
	CustomGenerator getGenerator();

	/**
	 * Sets the value of the '{@link analysismetamodel.DefaultValueByGenerator#getGenerator <em>Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(CustomGenerator value);

} // DefaultValueByGenerator
