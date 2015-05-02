/**
 */
package analysismetamodel.impl;

import analysismetamodel.AnalysismetamodelPackage;
import analysismetamodel.CustomInterval;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link analysismetamodel.impl.CustomIntervalImpl#getWrappedType <em>Wrapped Type</em>}</li>
 *   <li>{@link analysismetamodel.impl.CustomIntervalImpl#getClazz <em>Clazz</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomIntervalImpl extends MinimalEObjectImpl.Container implements CustomInterval {
	/**
	 * The default value of the '{@link #getWrappedType() <em>Wrapped Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrappedType()
	 * @generated
	 * @ordered
	 */
	protected static final String WRAPPED_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrappedType() <em>Wrapped Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrappedType()
	 * @generated
	 * @ordered
	 */
	protected String wrappedType = WRAPPED_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClazz() <em>Clazz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazz()
	 * @generated
	 * @ordered
	 */
	protected static final String CLAZZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClazz() <em>Clazz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazz()
	 * @generated
	 * @ordered
	 */
	protected String clazz = CLAZZ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysismetamodelPackage.Literals.CUSTOM_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWrappedType() {
		return wrappedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrappedType(String newWrappedType) {
		String oldWrappedType = wrappedType;
		wrappedType = newWrappedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.CUSTOM_INTERVAL__WRAPPED_TYPE, oldWrappedType, wrappedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClazz() {
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClazz(String newClazz) {
		String oldClazz = clazz;
		clazz = newClazz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.CUSTOM_INTERVAL__CLAZZ, oldClazz, clazz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysismetamodelPackage.CUSTOM_INTERVAL__WRAPPED_TYPE:
				return getWrappedType();
			case AnalysismetamodelPackage.CUSTOM_INTERVAL__CLAZZ:
				return getClazz();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnalysismetamodelPackage.CUSTOM_INTERVAL__WRAPPED_TYPE:
				setWrappedType((String)newValue);
				return;
			case AnalysismetamodelPackage.CUSTOM_INTERVAL__CLAZZ:
				setClazz((String)newValue);
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
			case AnalysismetamodelPackage.CUSTOM_INTERVAL__WRAPPED_TYPE:
				setWrappedType(WRAPPED_TYPE_EDEFAULT);
				return;
			case AnalysismetamodelPackage.CUSTOM_INTERVAL__CLAZZ:
				setClazz(CLAZZ_EDEFAULT);
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
			case AnalysismetamodelPackage.CUSTOM_INTERVAL__WRAPPED_TYPE:
				return WRAPPED_TYPE_EDEFAULT == null ? wrappedType != null : !WRAPPED_TYPE_EDEFAULT.equals(wrappedType);
			case AnalysismetamodelPackage.CUSTOM_INTERVAL__CLAZZ:
				return CLAZZ_EDEFAULT == null ? clazz != null : !CLAZZ_EDEFAULT.equals(clazz);
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
		result.append(" (WrappedType: ");
		result.append(wrappedType);
		result.append(", Clazz: ");
		result.append(clazz);
		result.append(')');
		return result.toString();
	}

} //CustomIntervalImpl
