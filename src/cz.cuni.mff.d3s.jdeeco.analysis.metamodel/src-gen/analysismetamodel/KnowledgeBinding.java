/**
 */
package analysismetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.KnowledgeBinding#getEnsembleSide <em>Ensemble Side</em>}</li>
 *   <li>{@link analysismetamodel.KnowledgeBinding#getKnowledge <em>Knowledge</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getKnowledgeBinding()
 * @model
 * @generated
 */
public interface KnowledgeBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Ensemble Side</b></em>' attribute.
	 * The literals are from the enumeration {@link analysismetamodel.EnsembleSide}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ensemble Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ensemble Side</em>' attribute.
	 * @see analysismetamodel.EnsembleSide
	 * @see #setEnsembleSide(EnsembleSide)
	 * @see analysismetamodel.AnalysismetamodelPackage#getKnowledgeBinding_EnsembleSide()
	 * @model required="true"
	 * @generated
	 */
	EnsembleSide getEnsembleSide();

	/**
	 * Sets the value of the '{@link analysismetamodel.KnowledgeBinding#getEnsembleSide <em>Ensemble Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ensemble Side</em>' attribute.
	 * @see analysismetamodel.EnsembleSide
	 * @see #getEnsembleSide()
	 * @generated
	 */
	void setEnsembleSide(EnsembleSide value);

	/**
	 * Returns the value of the '<em><b>Knowledge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knowledge</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge</em>' reference.
	 * @see #setKnowledge(Knowledge)
	 * @see analysismetamodel.AnalysismetamodelPackage#getKnowledgeBinding_Knowledge()
	 * @model required="true"
	 * @generated
	 */
	Knowledge getKnowledge();

	/**
	 * Sets the value of the '{@link analysismetamodel.KnowledgeBinding#getKnowledge <em>Knowledge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knowledge</em>' reference.
	 * @see #getKnowledge()
	 * @generated
	 */
	void setKnowledge(Knowledge value);

} // KnowledgeBinding
