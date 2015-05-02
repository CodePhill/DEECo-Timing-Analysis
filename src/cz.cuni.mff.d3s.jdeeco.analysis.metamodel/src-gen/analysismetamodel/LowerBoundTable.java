/**
 */
package analysismetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lower Bound Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.LowerBoundTable#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getLowerBoundTable()
 * @model
 * @generated
 */
public interface LowerBoundTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link analysismetamodel.TableRow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getLowerBoundTable_Rows()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TableRow> getRows();

} // LowerBoundTable
