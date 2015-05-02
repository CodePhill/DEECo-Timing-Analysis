/**
 */
package analysismetamodel.impl;

import analysismetamodel.AnalysismetamodelPackage;
import analysismetamodel.Component;
import analysismetamodel.ComponentProcess;
import analysismetamodel.ProcessInvocableByCustomFunc;
import analysismetamodel.ProcessInvocableByEQSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link analysismetamodel.impl.ComponentProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link analysismetamodel.impl.ComponentProcessImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link analysismetamodel.impl.ComponentProcessImpl#getInvocablesByEQSet <em>Invocables By EQ Set</em>}</li>
 *   <li>{@link analysismetamodel.impl.ComponentProcessImpl#getInvocablesByCustomFunc <em>Invocables By Custom Func</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentProcessImpl extends TaskImpl implements ComponentProcess {
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
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * The cached value of the '{@link #getInvocablesByEQSet() <em>Invocables By EQ Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocablesByEQSet()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessInvocableByEQSet> invocablesByEQSet;

	/**
	 * The cached value of the '{@link #getInvocablesByCustomFunc() <em>Invocables By Custom Func</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocablesByCustomFunc()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessInvocableByCustomFunc> invocablesByCustomFunc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysismetamodelPackage.Literals.COMPONENT_PROCESS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.COMPONENT_PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (Component)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysismetamodelPackage.COMPONENT_PROCESS__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.COMPONENT_PROCESS__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessInvocableByEQSet> getInvocablesByEQSet() {
		if (invocablesByEQSet == null) {
			invocablesByEQSet = new EObjectContainmentEList<ProcessInvocableByEQSet>(ProcessInvocableByEQSet.class, this, AnalysismetamodelPackage.COMPONENT_PROCESS__INVOCABLES_BY_EQ_SET);
		}
		return invocablesByEQSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessInvocableByCustomFunc> getInvocablesByCustomFunc() {
		if (invocablesByCustomFunc == null) {
			invocablesByCustomFunc = new EObjectContainmentEList<ProcessInvocableByCustomFunc>(ProcessInvocableByCustomFunc.class, this, AnalysismetamodelPackage.COMPONENT_PROCESS__INVOCABLES_BY_CUSTOM_FUNC);
		}
		return invocablesByCustomFunc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysismetamodelPackage.COMPONENT_PROCESS__INVOCABLES_BY_EQ_SET:
				return ((InternalEList<?>)getInvocablesByEQSet()).basicRemove(otherEnd, msgs);
			case AnalysismetamodelPackage.COMPONENT_PROCESS__INVOCABLES_BY_CUSTOM_FUNC:
				return ((InternalEList<?>)getInvocablesByCustomFunc()).basicRemove(otherEnd, msgs);
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
			case AnalysismetamodelPackage.COMPONENT_PROCESS__NAME:
				return getName();
			case AnalysismetamodelPackage.COMPONENT_PROCESS__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case AnalysismetamodelPackage.COMPONENT_PROCESS__INVOCABLES_BY_EQ_SET:
				return getInvocablesByEQSet();
			case AnalysismetamodelPackage.COMPONENT_PROCESS__INVOCABLES_BY_CUSTOM_FUNC:
				return getInvocablesByCustomFunc();
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
			case AnalysismetamodelPackage.COMPONENT_PROCESS__NAME:
				setName((String)newValue);
				return;
			case AnalysismetamodelPackage.COMPONENT_PROCESS__COMPONENT:
				setComponent((Component)newValue);
				return;
			case AnalysismetamodelPackage.COMPONENT_PROCESS__INVOCABLES_BY_EQ_SET:
				getInvocablesByEQSet().clear();
				getInvocablesByEQSet().addAll((Collection<? extends ProcessInvocableByEQSet>)newValue);
				return;
			case AnalysismetamodelPackage.COMPONENT_PROCESS__INVOCABLES_BY_CUSTOM_FUNC:
				getInvocablesByCustomFunc().clear();
				getInvocablesByCustomFunc().addAll((Collection<? extends ProcessInvocableByCustomFunc>)newValue);
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
			case AnalysismetamodelPackage.COMPONENT_PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnalysismetamodelPackage.COMPONENT_PROCESS__COMPONENT:
				setComponent((Component)null);
				return;
			case AnalysismetamodelPackage.COMPONENT_PROCESS__INVOCABLES_BY_EQ_SET:
				getInvocablesByEQSet().clear();
				return;
			case AnalysismetamodelPackage.COMPONENT_PROCESS__INVOCABLES_BY_CUSTOM_FUNC:
				getInvocablesByCustomFunc().clear();
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
			case AnalysismetamodelPackage.COMPONENT_PROCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnalysismetamodelPackage.COMPONENT_PROCESS__COMPONENT:
				return component != null;
			case AnalysismetamodelPackage.COMPONENT_PROCESS__INVOCABLES_BY_EQ_SET:
				return invocablesByEQSet != null && !invocablesByEQSet.isEmpty();
			case AnalysismetamodelPackage.COMPONENT_PROCESS__INVOCABLES_BY_CUSTOM_FUNC:
				return invocablesByCustomFunc != null && !invocablesByCustomFunc.isEmpty();
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

} //ComponentProcessImpl
