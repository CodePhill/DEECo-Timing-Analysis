/**
 */
package analysismetamodel.impl;

import analysismetamodel.AnalysismetamodelPackage;
import analysismetamodel.ComponentInstance;
import analysismetamodel.EnsembleInvocableByCustomFunc;
import analysismetamodel.EnsembleInvocableByEQSet;
import analysismetamodel.StaticEnsemble;

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
 * An implementation of the model object '<em><b>Static Ensemble</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link analysismetamodel.impl.StaticEnsembleImpl#getCoordinator <em>Coordinator</em>}</li>
 *   <li>{@link analysismetamodel.impl.StaticEnsembleImpl#getMember <em>Member</em>}</li>
 *   <li>{@link analysismetamodel.impl.StaticEnsembleImpl#getName <em>Name</em>}</li>
 *   <li>{@link analysismetamodel.impl.StaticEnsembleImpl#getInvocablesByEQSet <em>Invocables By EQ Set</em>}</li>
 *   <li>{@link analysismetamodel.impl.StaticEnsembleImpl#getInvocablesByCustomFunc <em>Invocables By Custom Func</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticEnsembleImpl extends TaskImpl implements StaticEnsemble {
	/**
	 * The cached value of the '{@link #getCoordinator() <em>Coordinator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinator()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance coordinator;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance member;

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
	 * The cached value of the '{@link #getInvocablesByEQSet() <em>Invocables By EQ Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocablesByEQSet()
	 * @generated
	 * @ordered
	 */
	protected EList<EnsembleInvocableByEQSet> invocablesByEQSet;

	/**
	 * The cached value of the '{@link #getInvocablesByCustomFunc() <em>Invocables By Custom Func</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocablesByCustomFunc()
	 * @generated
	 * @ordered
	 */
	protected EList<EnsembleInvocableByCustomFunc> invocablesByCustomFunc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticEnsembleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysismetamodelPackage.Literals.STATIC_ENSEMBLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getCoordinator() {
		if (coordinator != null && coordinator.eIsProxy()) {
			InternalEObject oldCoordinator = (InternalEObject)coordinator;
			coordinator = (ComponentInstance)eResolveProxy(oldCoordinator);
			if (coordinator != oldCoordinator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysismetamodelPackage.STATIC_ENSEMBLE__COORDINATOR, oldCoordinator, coordinator));
			}
		}
		return coordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetCoordinator() {
		return coordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinator(ComponentInstance newCoordinator) {
		ComponentInstance oldCoordinator = coordinator;
		coordinator = newCoordinator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.STATIC_ENSEMBLE__COORDINATOR, oldCoordinator, coordinator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getMember() {
		if (member != null && member.eIsProxy()) {
			InternalEObject oldMember = (InternalEObject)member;
			member = (ComponentInstance)eResolveProxy(oldMember);
			if (member != oldMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysismetamodelPackage.STATIC_ENSEMBLE__MEMBER, oldMember, member));
			}
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetMember() {
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMember(ComponentInstance newMember) {
		ComponentInstance oldMember = member;
		member = newMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.STATIC_ENSEMBLE__MEMBER, oldMember, member));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.STATIC_ENSEMBLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnsembleInvocableByEQSet> getInvocablesByEQSet() {
		if (invocablesByEQSet == null) {
			invocablesByEQSet = new EObjectContainmentEList<EnsembleInvocableByEQSet>(EnsembleInvocableByEQSet.class, this, AnalysismetamodelPackage.STATIC_ENSEMBLE__INVOCABLES_BY_EQ_SET);
		}
		return invocablesByEQSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnsembleInvocableByCustomFunc> getInvocablesByCustomFunc() {
		if (invocablesByCustomFunc == null) {
			invocablesByCustomFunc = new EObjectContainmentEList<EnsembleInvocableByCustomFunc>(EnsembleInvocableByCustomFunc.class, this, AnalysismetamodelPackage.STATIC_ENSEMBLE__INVOCABLES_BY_CUSTOM_FUNC);
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
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__INVOCABLES_BY_EQ_SET:
				return ((InternalEList<?>)getInvocablesByEQSet()).basicRemove(otherEnd, msgs);
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__INVOCABLES_BY_CUSTOM_FUNC:
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
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__COORDINATOR:
				if (resolve) return getCoordinator();
				return basicGetCoordinator();
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__MEMBER:
				if (resolve) return getMember();
				return basicGetMember();
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__NAME:
				return getName();
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__INVOCABLES_BY_EQ_SET:
				return getInvocablesByEQSet();
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__INVOCABLES_BY_CUSTOM_FUNC:
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
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__COORDINATOR:
				setCoordinator((ComponentInstance)newValue);
				return;
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__MEMBER:
				setMember((ComponentInstance)newValue);
				return;
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__NAME:
				setName((String)newValue);
				return;
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__INVOCABLES_BY_EQ_SET:
				getInvocablesByEQSet().clear();
				getInvocablesByEQSet().addAll((Collection<? extends EnsembleInvocableByEQSet>)newValue);
				return;
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__INVOCABLES_BY_CUSTOM_FUNC:
				getInvocablesByCustomFunc().clear();
				getInvocablesByCustomFunc().addAll((Collection<? extends EnsembleInvocableByCustomFunc>)newValue);
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
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__COORDINATOR:
				setCoordinator((ComponentInstance)null);
				return;
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__MEMBER:
				setMember((ComponentInstance)null);
				return;
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__INVOCABLES_BY_EQ_SET:
				getInvocablesByEQSet().clear();
				return;
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__INVOCABLES_BY_CUSTOM_FUNC:
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
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__COORDINATOR:
				return coordinator != null;
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__MEMBER:
				return member != null;
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__INVOCABLES_BY_EQ_SET:
				return invocablesByEQSet != null && !invocablesByEQSet.isEmpty();
			case AnalysismetamodelPackage.STATIC_ENSEMBLE__INVOCABLES_BY_CUSTOM_FUNC:
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

} //StaticEnsembleImpl
