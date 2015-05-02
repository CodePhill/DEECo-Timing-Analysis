/**
 */
package analysismetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Of Derivatives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.TableOfDerivatives#getUpperBoundTable <em>Upper Bound Table</em>}</li>
 *   <li>{@link analysismetamodel.TableOfDerivatives#getName <em>Name</em>}</li>
 *   <li>{@link analysismetamodel.TableOfDerivatives#getValuesMultiplier <em>Values Multiplier</em>}</li>
 *   <li>{@link analysismetamodel.TableOfDerivatives#getLowerBoundTable <em>Lower Bound Table</em>}</li>
 *   <li>{@link analysismetamodel.TableOfDerivatives#getDerivativesMutliplier <em>Derivatives Mutliplier</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getTableOfDerivatives()
 * @model
 * @generated
 */
public interface TableOfDerivatives extends EObject {
	/**
	 * Returns the value of the '<em><b>Upper Bound Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound Table</em>' containment reference.
	 * @see #setUpperBoundTable(UpperBoundTable)
	 * @see analysismetamodel.AnalysismetamodelPackage#getTableOfDerivatives_UpperBoundTable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UpperBoundTable getUpperBoundTable();

	/**
	 * Sets the value of the '{@link analysismetamodel.TableOfDerivatives#getUpperBoundTable <em>Upper Bound Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound Table</em>' containment reference.
	 * @see #getUpperBoundTable()
	 * @generated
	 */
	void setUpperBoundTable(UpperBoundTable value);

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
	 * @see analysismetamodel.AnalysismetamodelPackage#getTableOfDerivatives_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link analysismetamodel.TableOfDerivatives#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Values Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Multiplier</em>' attribute.
	 * @see #setValuesMultiplier(double)
	 * @see analysismetamodel.AnalysismetamodelPackage#getTableOfDerivatives_ValuesMultiplier()
	 * @model required="true"
	 * @generated
	 */
	double getValuesMultiplier();

	/**
	 * Sets the value of the '{@link analysismetamodel.TableOfDerivatives#getValuesMultiplier <em>Values Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values Multiplier</em>' attribute.
	 * @see #getValuesMultiplier()
	 * @generated
	 */
	void setValuesMultiplier(double value);

	/**
	 * Returns the value of the '<em><b>Lower Bound Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound Table</em>' containment reference.
	 * @see #setLowerBoundTable(LowerBoundTable)
	 * @see analysismetamodel.AnalysismetamodelPackage#getTableOfDerivatives_LowerBoundTable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LowerBoundTable getLowerBoundTable();

	/**
	 * Sets the value of the '{@link analysismetamodel.TableOfDerivatives#getLowerBoundTable <em>Lower Bound Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound Table</em>' containment reference.
	 * @see #getLowerBoundTable()
	 * @generated
	 */
	void setLowerBoundTable(LowerBoundTable value);

	/**
	 * Returns the value of the '<em><b>Derivatives Mutliplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivatives Mutliplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivatives Mutliplier</em>' attribute.
	 * @see #setDerivativesMutliplier(double)
	 * @see analysismetamodel.AnalysismetamodelPackage#getTableOfDerivatives_DerivativesMutliplier()
	 * @model required="true"
	 * @generated
	 */
	double getDerivativesMutliplier();

	/**
	 * Sets the value of the '{@link analysismetamodel.TableOfDerivatives#getDerivativesMutliplier <em>Derivatives Mutliplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivatives Mutliplier</em>' attribute.
	 * @see #getDerivativesMutliplier()
	 * @generated
	 */
	void setDerivativesMutliplier(double value);

} // TableOfDerivatives
