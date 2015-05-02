/**
 */
package analysismetamodel.impl;

import analysismetamodel.AnalysismetamodelPackage;
import analysismetamodel.DefaultValue;
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
 * An implementation of the model object '<em><b>Knowledge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link analysismetamodel.impl.KnowledgeImpl#getName <em>Name</em>}</li>
 *   <li>{@link analysismetamodel.impl.KnowledgeImpl#isIsPivot <em>Is Pivot</em>}</li>
 *   <li>{@link analysismetamodel.impl.KnowledgeImpl#isShowPivot <em>Show Pivot</em>}</li>
 *   <li>{@link analysismetamodel.impl.KnowledgeImpl#getDefaultValues <em>Default Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class KnowledgeImpl extends MinimalEObjectImpl.Container implements Knowledge {
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
	 * The default value of the '{@link #isIsPivot() <em>Is Pivot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPivot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PIVOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPivot() <em>Is Pivot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPivot()
	 * @generated
	 * @ordered
	 */
	protected boolean isPivot = IS_PIVOT_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowPivot() <em>Show Pivot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowPivot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_PIVOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowPivot() <em>Show Pivot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowPivot()
	 * @generated
	 * @ordered
	 */
	protected boolean showPivot = SHOW_PIVOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultValues() <em>Default Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValues()
	 * @generated
	 * @ordered
	 */
	protected EList<DefaultValue> defaultValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnowledgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysismetamodelPackage.Literals.KNOWLEDGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.KNOWLEDGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPivot() {
		return isPivot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPivot(boolean newIsPivot) {
		boolean oldIsPivot = isPivot;
		isPivot = newIsPivot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.KNOWLEDGE__IS_PIVOT, oldIsPivot, isPivot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowPivot() {
		return showPivot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowPivot(boolean newShowPivot) {
		boolean oldShowPivot = showPivot;
		showPivot = newShowPivot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.KNOWLEDGE__SHOW_PIVOT, oldShowPivot, showPivot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefaultValue> getDefaultValues() {
		if (defaultValues == null) {
			defaultValues = new EObjectContainmentEList<DefaultValue>(DefaultValue.class, this, AnalysismetamodelPackage.KNOWLEDGE__DEFAULT_VALUES);
		}
		return defaultValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysismetamodelPackage.KNOWLEDGE__DEFAULT_VALUES:
				return ((InternalEList<?>)getDefaultValues()).basicRemove(otherEnd, msgs);
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
			case AnalysismetamodelPackage.KNOWLEDGE__NAME:
				return getName();
			case AnalysismetamodelPackage.KNOWLEDGE__IS_PIVOT:
				return isIsPivot();
			case AnalysismetamodelPackage.KNOWLEDGE__SHOW_PIVOT:
				return isShowPivot();
			case AnalysismetamodelPackage.KNOWLEDGE__DEFAULT_VALUES:
				return getDefaultValues();
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
			case AnalysismetamodelPackage.KNOWLEDGE__NAME:
				setName((String)newValue);
				return;
			case AnalysismetamodelPackage.KNOWLEDGE__IS_PIVOT:
				setIsPivot((Boolean)newValue);
				return;
			case AnalysismetamodelPackage.KNOWLEDGE__SHOW_PIVOT:
				setShowPivot((Boolean)newValue);
				return;
			case AnalysismetamodelPackage.KNOWLEDGE__DEFAULT_VALUES:
				getDefaultValues().clear();
				getDefaultValues().addAll((Collection<? extends DefaultValue>)newValue);
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
			case AnalysismetamodelPackage.KNOWLEDGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnalysismetamodelPackage.KNOWLEDGE__IS_PIVOT:
				setIsPivot(IS_PIVOT_EDEFAULT);
				return;
			case AnalysismetamodelPackage.KNOWLEDGE__SHOW_PIVOT:
				setShowPivot(SHOW_PIVOT_EDEFAULT);
				return;
			case AnalysismetamodelPackage.KNOWLEDGE__DEFAULT_VALUES:
				getDefaultValues().clear();
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
			case AnalysismetamodelPackage.KNOWLEDGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnalysismetamodelPackage.KNOWLEDGE__IS_PIVOT:
				return isPivot != IS_PIVOT_EDEFAULT;
			case AnalysismetamodelPackage.KNOWLEDGE__SHOW_PIVOT:
				return showPivot != SHOW_PIVOT_EDEFAULT;
			case AnalysismetamodelPackage.KNOWLEDGE__DEFAULT_VALUES:
				return defaultValues != null && !defaultValues.isEmpty();
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
		result.append(", IsPivot: ");
		result.append(isPivot);
		result.append(", ShowPivot: ");
		result.append(showPivot);
		result.append(')');
		return result.toString();
	}

} //KnowledgeImpl
