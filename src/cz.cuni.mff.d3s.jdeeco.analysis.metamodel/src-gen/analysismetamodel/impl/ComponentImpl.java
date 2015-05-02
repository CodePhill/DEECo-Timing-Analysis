/**
 */
package analysismetamodel.impl;

import analysismetamodel.AnalysismetamodelPackage;
import analysismetamodel.Component;
import analysismetamodel.ComponentProcess;
import analysismetamodel.Knowledge;

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
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link analysismetamodel.impl.ComponentImpl#getComponentProcesses <em>Component Processes</em>}</li>
 *   <li>{@link analysismetamodel.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link analysismetamodel.impl.ComponentImpl#getKnowledges <em>Knowledges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The cached value of the '{@link #getComponentProcesses() <em>Component Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentProcess> componentProcesses;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKnowledges() <em>Knowledges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledges()
	 * @generated
	 * @ordered
	 */
	protected EList<Knowledge> knowledges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysismetamodelPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentProcess> getComponentProcesses() {
		if (componentProcesses == null) {
			componentProcesses = new EObjectContainmentEList<ComponentProcess>(ComponentProcess.class, this, AnalysismetamodelPackage.COMPONENT__COMPONENT_PROCESSES);
		}
		return componentProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Knowledge> getKnowledges() {
		if (knowledges == null) {
			knowledges = new EObjectContainmentEList<Knowledge>(Knowledge.class, this, AnalysismetamodelPackage.COMPONENT__KNOWLEDGES);
		}
		return knowledges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysismetamodelPackage.COMPONENT__COMPONENT_PROCESSES:
				return ((InternalEList<?>)getComponentProcesses()).basicRemove(otherEnd, msgs);
			case AnalysismetamodelPackage.COMPONENT__KNOWLEDGES:
				return ((InternalEList<?>)getKnowledges()).basicRemove(otherEnd, msgs);
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
			case AnalysismetamodelPackage.COMPONENT__COMPONENT_PROCESSES:
				return getComponentProcesses();
			case AnalysismetamodelPackage.COMPONENT__NAME:
				return getName();
			case AnalysismetamodelPackage.COMPONENT__KNOWLEDGES:
				return getKnowledges();
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
			case AnalysismetamodelPackage.COMPONENT__COMPONENT_PROCESSES:
				getComponentProcesses().clear();
				getComponentProcesses().addAll((Collection<? extends ComponentProcess>)newValue);
				return;
			case AnalysismetamodelPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case AnalysismetamodelPackage.COMPONENT__KNOWLEDGES:
				getKnowledges().clear();
				getKnowledges().addAll((Collection<? extends Knowledge>)newValue);
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
			case AnalysismetamodelPackage.COMPONENT__COMPONENT_PROCESSES:
				getComponentProcesses().clear();
				return;
			case AnalysismetamodelPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnalysismetamodelPackage.COMPONENT__KNOWLEDGES:
				getKnowledges().clear();
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
			case AnalysismetamodelPackage.COMPONENT__COMPONENT_PROCESSES:
				return componentProcesses != null && !componentProcesses.isEmpty();
			case AnalysismetamodelPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnalysismetamodelPackage.COMPONENT__KNOWLEDGES:
				return knowledges != null && !knowledges.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
