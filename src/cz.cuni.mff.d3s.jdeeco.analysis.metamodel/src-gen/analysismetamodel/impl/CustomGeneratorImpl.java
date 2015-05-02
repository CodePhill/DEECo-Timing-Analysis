/**
 */
package analysismetamodel.impl;

import analysismetamodel.AnalysismetamodelPackage;
import analysismetamodel.CustomGenerator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link analysismetamodel.impl.CustomGeneratorImpl#getGeneratedType <em>Generated Type</em>}</li>
 *   <li>{@link analysismetamodel.impl.CustomGeneratorImpl#getClazz <em>Clazz</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomGeneratorImpl extends MinimalEObjectImpl.Container implements CustomGenerator {
	/**
	 * The default value of the '{@link #getGeneratedType() <em>Generated Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedType()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneratedType() <em>Generated Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedType()
	 * @generated
	 * @ordered
	 */
	protected String generatedType = GENERATED_TYPE_EDEFAULT;

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
	protected CustomGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysismetamodelPackage.Literals.CUSTOM_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneratedType() {
		return generatedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratedType(String newGeneratedType) {
		String oldGeneratedType = generatedType;
		generatedType = newGeneratedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.CUSTOM_GENERATOR__GENERATED_TYPE, oldGeneratedType, generatedType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.CUSTOM_GENERATOR__CLAZZ, oldClazz, clazz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysismetamodelPackage.CUSTOM_GENERATOR__GENERATED_TYPE:
				return getGeneratedType();
			case AnalysismetamodelPackage.CUSTOM_GENERATOR__CLAZZ:
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
			case AnalysismetamodelPackage.CUSTOM_GENERATOR__GENERATED_TYPE:
				setGeneratedType((String)newValue);
				return;
			case AnalysismetamodelPackage.CUSTOM_GENERATOR__CLAZZ:
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
			case AnalysismetamodelPackage.CUSTOM_GENERATOR__GENERATED_TYPE:
				setGeneratedType(GENERATED_TYPE_EDEFAULT);
				return;
			case AnalysismetamodelPackage.CUSTOM_GENERATOR__CLAZZ:
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
			case AnalysismetamodelPackage.CUSTOM_GENERATOR__GENERATED_TYPE:
				return GENERATED_TYPE_EDEFAULT == null ? generatedType != null : !GENERATED_TYPE_EDEFAULT.equals(generatedType);
			case AnalysismetamodelPackage.CUSTOM_GENERATOR__CLAZZ:
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
		result.append(" (GeneratedType: ");
		result.append(generatedType);
		result.append(", Clazz: ");
		result.append(clazz);
		result.append(')');
		return result.toString();
	}

} //CustomGeneratorImpl
