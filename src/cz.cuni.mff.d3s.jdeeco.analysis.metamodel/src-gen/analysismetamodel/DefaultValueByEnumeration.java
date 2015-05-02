/**
 */
package analysismetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Value By Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.DefaultValueByEnumeration#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getDefaultValueByEnumeration()
 * @model
 * @generated
 */
public interface DefaultValueByEnumeration extends DefaultValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getDefaultValueByEnumeration_Value()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getValue();

} // DefaultValueByEnumeration
