/**
 */
package analysismetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link analysismetamodel.Model#getComponents <em>Components</em>}</li>
 *   <li>{@link analysismetamodel.Model#getStaticEnsembles <em>Static Ensembles</em>}</li>
 *   <li>{@link analysismetamodel.Model#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link analysismetamodel.Model#getBeliefPropagationDelay <em>Belief Propagation Delay</em>}</li>
 *   <li>{@link analysismetamodel.Model#getCustomIntervals <em>Custom Intervals</em>}</li>
 *   <li>{@link analysismetamodel.Model#getCustomGenerators <em>Custom Generators</em>}</li>
 *   <li>{@link analysismetamodel.Model#getAlerts <em>Alerts</em>}</li>
 *   <li>{@link analysismetamodel.Model#getTablesOfDerivatives <em>Tables Of Derivatives</em>}</li>
 * </ul>
 * </p>
 *
 * @see analysismetamodel.AnalysismetamodelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link analysismetamodel.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getModel_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Static Ensembles</b></em>' containment reference list.
	 * The list contents are of type {@link analysismetamodel.StaticEnsemble}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Ensembles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Ensembles</em>' containment reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getModel_StaticEnsembles()
	 * @model containment="true"
	 * @generated
	 */
	EList<StaticEnsemble> getStaticEnsembles();

	/**
	 * Returns the value of the '<em><b>Component Instances</b></em>' containment reference list.
	 * The list contents are of type {@link analysismetamodel.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instances</em>' containment reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getModel_ComponentInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getComponentInstances();

	/**
	 * Returns the value of the '<em><b>Belief Propagation Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belief Propagation Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belief Propagation Delay</em>' attribute.
	 * @see #setBeliefPropagationDelay(int)
	 * @see analysismetamodel.AnalysismetamodelPackage#getModel_BeliefPropagationDelay()
	 * @model required="true"
	 * @generated
	 */
	int getBeliefPropagationDelay();

	/**
	 * Sets the value of the '{@link analysismetamodel.Model#getBeliefPropagationDelay <em>Belief Propagation Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belief Propagation Delay</em>' attribute.
	 * @see #getBeliefPropagationDelay()
	 * @generated
	 */
	void setBeliefPropagationDelay(int value);

	/**
	 * Returns the value of the '<em><b>Custom Intervals</b></em>' containment reference list.
	 * The list contents are of type {@link analysismetamodel.CustomInterval}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Intervals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Intervals</em>' containment reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getModel_CustomIntervals()
	 * @model containment="true"
	 * @generated
	 */
	EList<CustomInterval> getCustomIntervals();

	/**
	 * Returns the value of the '<em><b>Custom Generators</b></em>' containment reference list.
	 * The list contents are of type {@link analysismetamodel.CustomGenerator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Generators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Generators</em>' containment reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getModel_CustomGenerators()
	 * @model containment="true"
	 * @generated
	 */
	EList<CustomGenerator> getCustomGenerators();

	/**
	 * Returns the value of the '<em><b>Alerts</b></em>' containment reference list.
	 * The list contents are of type {@link analysismetamodel.Alert}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alerts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alerts</em>' containment reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getModel_Alerts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alert> getAlerts();

	/**
	 * Returns the value of the '<em><b>Tables Of Derivatives</b></em>' containment reference list.
	 * The list contents are of type {@link analysismetamodel.TableOfDerivatives}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables Of Derivatives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables Of Derivatives</em>' containment reference list.
	 * @see analysismetamodel.AnalysismetamodelPackage#getModel_TablesOfDerivatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableOfDerivatives> getTablesOfDerivatives();

} // Model
