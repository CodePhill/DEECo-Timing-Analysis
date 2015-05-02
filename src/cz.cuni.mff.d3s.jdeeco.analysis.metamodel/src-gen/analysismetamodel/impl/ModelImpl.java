/**
 */
package analysismetamodel.impl;

import analysismetamodel.Alert;
import analysismetamodel.AnalysismetamodelPackage;
import analysismetamodel.Component;
import analysismetamodel.ComponentInstance;
import analysismetamodel.CustomGenerator;
import analysismetamodel.CustomInterval;
import analysismetamodel.Model;
import analysismetamodel.StaticEnsemble;
import analysismetamodel.TableOfDerivatives;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link analysismetamodel.impl.ModelImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link analysismetamodel.impl.ModelImpl#getStaticEnsembles <em>Static Ensembles</em>}</li>
 *   <li>{@link analysismetamodel.impl.ModelImpl#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link analysismetamodel.impl.ModelImpl#getBeliefPropagationDelay <em>Belief Propagation Delay</em>}</li>
 *   <li>{@link analysismetamodel.impl.ModelImpl#getCustomIntervals <em>Custom Intervals</em>}</li>
 *   <li>{@link analysismetamodel.impl.ModelImpl#getCustomGenerators <em>Custom Generators</em>}</li>
 *   <li>{@link analysismetamodel.impl.ModelImpl#getAlerts <em>Alerts</em>}</li>
 *   <li>{@link analysismetamodel.impl.ModelImpl#getTablesOfDerivatives <em>Tables Of Derivatives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getStaticEnsembles() <em>Static Ensembles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticEnsembles()
	 * @generated
	 * @ordered
	 */
	protected EList<StaticEnsemble> staticEnsembles;

	/**
	 * The cached value of the '{@link #getComponentInstances() <em>Component Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> componentInstances;

	/**
	 * The default value of the '{@link #getBeliefPropagationDelay() <em>Belief Propagation Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeliefPropagationDelay()
	 * @generated
	 * @ordered
	 */
	protected static final int BELIEF_PROPAGATION_DELAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBeliefPropagationDelay() <em>Belief Propagation Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeliefPropagationDelay()
	 * @generated
	 * @ordered
	 */
	protected int beliefPropagationDelay = BELIEF_PROPAGATION_DELAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomIntervals() <em>Custom Intervals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomIntervals()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomInterval> customIntervals;

	/**
	 * The cached value of the '{@link #getCustomGenerators() <em>Custom Generators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomGenerator> customGenerators;

	/**
	 * The cached value of the '{@link #getAlerts() <em>Alerts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlerts()
	 * @generated
	 * @ordered
	 */
	protected EList<Alert> alerts;

	/**
	 * The cached value of the '{@link #getTablesOfDerivatives() <em>Tables Of Derivatives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablesOfDerivatives()
	 * @generated
	 * @ordered
	 */
	protected EList<TableOfDerivatives> tablesOfDerivatives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysismetamodelPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, AnalysismetamodelPackage.MODEL__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaticEnsemble> getStaticEnsembles() {
		if (staticEnsembles == null) {
			staticEnsembles = new EObjectContainmentEList<StaticEnsemble>(StaticEnsemble.class, this, AnalysismetamodelPackage.MODEL__STATIC_ENSEMBLES);
		}
		return staticEnsembles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getComponentInstances() {
		if (componentInstances == null) {
			componentInstances = new EObjectContainmentEList<ComponentInstance>(ComponentInstance.class, this, AnalysismetamodelPackage.MODEL__COMPONENT_INSTANCES);
		}
		return componentInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBeliefPropagationDelay() {
		return beliefPropagationDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeliefPropagationDelay(int newBeliefPropagationDelay) {
		int oldBeliefPropagationDelay = beliefPropagationDelay;
		beliefPropagationDelay = newBeliefPropagationDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.MODEL__BELIEF_PROPAGATION_DELAY, oldBeliefPropagationDelay, beliefPropagationDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomInterval> getCustomIntervals() {
		if (customIntervals == null) {
			customIntervals = new EObjectContainmentEList<CustomInterval>(CustomInterval.class, this, AnalysismetamodelPackage.MODEL__CUSTOM_INTERVALS);
		}
		return customIntervals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomGenerator> getCustomGenerators() {
		if (customGenerators == null) {
			customGenerators = new EObjectContainmentEList<CustomGenerator>(CustomGenerator.class, this, AnalysismetamodelPackage.MODEL__CUSTOM_GENERATORS);
		}
		return customGenerators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alert> getAlerts() {
		if (alerts == null) {
			alerts = new EObjectContainmentEList<Alert>(Alert.class, this, AnalysismetamodelPackage.MODEL__ALERTS);
		}
		return alerts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableOfDerivatives> getTablesOfDerivatives() {
		if (tablesOfDerivatives == null) {
			tablesOfDerivatives = new EObjectContainmentEList<TableOfDerivatives>(TableOfDerivatives.class, this, AnalysismetamodelPackage.MODEL__TABLES_OF_DERIVATIVES);
		}
		return tablesOfDerivatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysismetamodelPackage.MODEL__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case AnalysismetamodelPackage.MODEL__STATIC_ENSEMBLES:
				return ((InternalEList<?>)getStaticEnsembles()).basicRemove(otherEnd, msgs);
			case AnalysismetamodelPackage.MODEL__COMPONENT_INSTANCES:
				return ((InternalEList<?>)getComponentInstances()).basicRemove(otherEnd, msgs);
			case AnalysismetamodelPackage.MODEL__CUSTOM_INTERVALS:
				return ((InternalEList<?>)getCustomIntervals()).basicRemove(otherEnd, msgs);
			case AnalysismetamodelPackage.MODEL__CUSTOM_GENERATORS:
				return ((InternalEList<?>)getCustomGenerators()).basicRemove(otherEnd, msgs);
			case AnalysismetamodelPackage.MODEL__ALERTS:
				return ((InternalEList<?>)getAlerts()).basicRemove(otherEnd, msgs);
			case AnalysismetamodelPackage.MODEL__TABLES_OF_DERIVATIVES:
				return ((InternalEList<?>)getTablesOfDerivatives()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysismetamodelPackage.MODEL__COMPONENTS:
				return getComponents();
			case AnalysismetamodelPackage.MODEL__STATIC_ENSEMBLES:
				return getStaticEnsembles();
			case AnalysismetamodelPackage.MODEL__COMPONENT_INSTANCES:
				return getComponentInstances();
			case AnalysismetamodelPackage.MODEL__BELIEF_PROPAGATION_DELAY:
				return getBeliefPropagationDelay();
			case AnalysismetamodelPackage.MODEL__CUSTOM_INTERVALS:
				return getCustomIntervals();
			case AnalysismetamodelPackage.MODEL__CUSTOM_GENERATORS:
				return getCustomGenerators();
			case AnalysismetamodelPackage.MODEL__ALERTS:
				return getAlerts();
			case AnalysismetamodelPackage.MODEL__TABLES_OF_DERIVATIVES:
				return getTablesOfDerivatives();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnalysismetamodelPackage.MODEL__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case AnalysismetamodelPackage.MODEL__STATIC_ENSEMBLES:
				getStaticEnsembles().clear();
				getStaticEnsembles().addAll((Collection<? extends StaticEnsemble>)newValue);
				return;
			case AnalysismetamodelPackage.MODEL__COMPONENT_INSTANCES:
				getComponentInstances().clear();
				getComponentInstances().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case AnalysismetamodelPackage.MODEL__BELIEF_PROPAGATION_DELAY:
				setBeliefPropagationDelay((Integer)newValue);
				return;
			case AnalysismetamodelPackage.MODEL__CUSTOM_INTERVALS:
				getCustomIntervals().clear();
				getCustomIntervals().addAll((Collection<? extends CustomInterval>)newValue);
				return;
			case AnalysismetamodelPackage.MODEL__CUSTOM_GENERATORS:
				getCustomGenerators().clear();
				getCustomGenerators().addAll((Collection<? extends CustomGenerator>)newValue);
				return;
			case AnalysismetamodelPackage.MODEL__ALERTS:
				getAlerts().clear();
				getAlerts().addAll((Collection<? extends Alert>)newValue);
				return;
			case AnalysismetamodelPackage.MODEL__TABLES_OF_DERIVATIVES:
				getTablesOfDerivatives().clear();
				getTablesOfDerivatives().addAll((Collection<? extends TableOfDerivatives>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AnalysismetamodelPackage.MODEL__COMPONENTS:
				getComponents().clear();
				return;
			case AnalysismetamodelPackage.MODEL__STATIC_ENSEMBLES:
				getStaticEnsembles().clear();
				return;
			case AnalysismetamodelPackage.MODEL__COMPONENT_INSTANCES:
				getComponentInstances().clear();
				return;
			case AnalysismetamodelPackage.MODEL__BELIEF_PROPAGATION_DELAY:
				setBeliefPropagationDelay(BELIEF_PROPAGATION_DELAY_EDEFAULT);
				return;
			case AnalysismetamodelPackage.MODEL__CUSTOM_INTERVALS:
				getCustomIntervals().clear();
				return;
			case AnalysismetamodelPackage.MODEL__CUSTOM_GENERATORS:
				getCustomGenerators().clear();
				return;
			case AnalysismetamodelPackage.MODEL__ALERTS:
				getAlerts().clear();
				return;
			case AnalysismetamodelPackage.MODEL__TABLES_OF_DERIVATIVES:
				getTablesOfDerivatives().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AnalysismetamodelPackage.MODEL__COMPONENTS:
				return components != null && !components.isEmpty();
			case AnalysismetamodelPackage.MODEL__STATIC_ENSEMBLES:
				return staticEnsembles != null && !staticEnsembles.isEmpty();
			case AnalysismetamodelPackage.MODEL__COMPONENT_INSTANCES:
				return componentInstances != null && !componentInstances.isEmpty();
			case AnalysismetamodelPackage.MODEL__BELIEF_PROPAGATION_DELAY:
				return beliefPropagationDelay != BELIEF_PROPAGATION_DELAY_EDEFAULT;
			case AnalysismetamodelPackage.MODEL__CUSTOM_INTERVALS:
				return customIntervals != null && !customIntervals.isEmpty();
			case AnalysismetamodelPackage.MODEL__CUSTOM_GENERATORS:
				return customGenerators != null && !customGenerators.isEmpty();
			case AnalysismetamodelPackage.MODEL__ALERTS:
				return alerts != null && !alerts.isEmpty();
			case AnalysismetamodelPackage.MODEL__TABLES_OF_DERIVATIVES:
				return tablesOfDerivatives != null && !tablesOfDerivatives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (BeliefPropagationDelay: ");
		result.append(beliefPropagationDelay);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
