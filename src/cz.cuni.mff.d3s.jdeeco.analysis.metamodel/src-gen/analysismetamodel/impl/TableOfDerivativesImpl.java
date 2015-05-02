/**
 */
package analysismetamodel.impl;

import analysismetamodel.AnalysismetamodelPackage;
import analysismetamodel.LowerBoundTable;
import analysismetamodel.TableOfDerivatives;
import analysismetamodel.UpperBoundTable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Of Derivatives</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link analysismetamodel.impl.TableOfDerivativesImpl#getUpperBoundTable <em>Upper Bound Table</em>}</li>
 *   <li>{@link analysismetamodel.impl.TableOfDerivativesImpl#getName <em>Name</em>}</li>
 *   <li>{@link analysismetamodel.impl.TableOfDerivativesImpl#getValuesMultiplier <em>Values Multiplier</em>}</li>
 *   <li>{@link analysismetamodel.impl.TableOfDerivativesImpl#getLowerBoundTable <em>Lower Bound Table</em>}</li>
 *   <li>{@link analysismetamodel.impl.TableOfDerivativesImpl#getDerivativesMutliplier <em>Derivatives Mutliplier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableOfDerivativesImpl extends MinimalEObjectImpl.Container implements TableOfDerivatives {
	/**
	 * The cached value of the '{@link #getUpperBoundTable() <em>Upper Bound Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBoundTable()
	 * @generated
	 * @ordered
	 */
	protected UpperBoundTable upperBoundTable;

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
	 * The default value of the '{@link #getValuesMultiplier() <em>Values Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuesMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUES_MULTIPLIER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValuesMultiplier() <em>Values Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuesMultiplier()
	 * @generated
	 * @ordered
	 */
	protected double valuesMultiplier = VALUES_MULTIPLIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLowerBoundTable() <em>Lower Bound Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBoundTable()
	 * @generated
	 * @ordered
	 */
	protected LowerBoundTable lowerBoundTable;

	/**
	 * The default value of the '{@link #getDerivativesMutliplier() <em>Derivatives Mutliplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivativesMutliplier()
	 * @generated
	 * @ordered
	 */
	protected static final double DERIVATIVES_MUTLIPLIER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDerivativesMutliplier() <em>Derivatives Mutliplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivativesMutliplier()
	 * @generated
	 * @ordered
	 */
	protected double derivativesMutliplier = DERIVATIVES_MUTLIPLIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableOfDerivativesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysismetamodelPackage.Literals.TABLE_OF_DERIVATIVES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundTable getUpperBoundTable() {
		return upperBoundTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBoundTable(UpperBoundTable newUpperBoundTable, NotificationChain msgs) {
		UpperBoundTable oldUpperBoundTable = upperBoundTable;
		upperBoundTable = newUpperBoundTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__UPPER_BOUND_TABLE, oldUpperBoundTable, newUpperBoundTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBoundTable(UpperBoundTable newUpperBoundTable) {
		if (newUpperBoundTable != upperBoundTable) {
			NotificationChain msgs = null;
			if (upperBoundTable != null)
				msgs = ((InternalEObject)upperBoundTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__UPPER_BOUND_TABLE, null, msgs);
			if (newUpperBoundTable != null)
				msgs = ((InternalEObject)newUpperBoundTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__UPPER_BOUND_TABLE, null, msgs);
			msgs = basicSetUpperBoundTable(newUpperBoundTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__UPPER_BOUND_TABLE, newUpperBoundTable, newUpperBoundTable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValuesMultiplier() {
		return valuesMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuesMultiplier(double newValuesMultiplier) {
		double oldValuesMultiplier = valuesMultiplier;
		valuesMultiplier = newValuesMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__VALUES_MULTIPLIER, oldValuesMultiplier, valuesMultiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerBoundTable getLowerBoundTable() {
		return lowerBoundTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerBoundTable(LowerBoundTable newLowerBoundTable, NotificationChain msgs) {
		LowerBoundTable oldLowerBoundTable = lowerBoundTable;
		lowerBoundTable = newLowerBoundTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__LOWER_BOUND_TABLE, oldLowerBoundTable, newLowerBoundTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBoundTable(LowerBoundTable newLowerBoundTable) {
		if (newLowerBoundTable != lowerBoundTable) {
			NotificationChain msgs = null;
			if (lowerBoundTable != null)
				msgs = ((InternalEObject)lowerBoundTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__LOWER_BOUND_TABLE, null, msgs);
			if (newLowerBoundTable != null)
				msgs = ((InternalEObject)newLowerBoundTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__LOWER_BOUND_TABLE, null, msgs);
			msgs = basicSetLowerBoundTable(newLowerBoundTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__LOWER_BOUND_TABLE, newLowerBoundTable, newLowerBoundTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDerivativesMutliplier() {
		return derivativesMutliplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivativesMutliplier(double newDerivativesMutliplier) {
		double oldDerivativesMutliplier = derivativesMutliplier;
		derivativesMutliplier = newDerivativesMutliplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__DERIVATIVES_MUTLIPLIER, oldDerivativesMutliplier, derivativesMutliplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__UPPER_BOUND_TABLE:
				return basicSetUpperBoundTable(null, msgs);
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__LOWER_BOUND_TABLE:
				return basicSetLowerBoundTable(null, msgs);
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
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__UPPER_BOUND_TABLE:
				return getUpperBoundTable();
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__NAME:
				return getName();
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__VALUES_MULTIPLIER:
				return getValuesMultiplier();
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__LOWER_BOUND_TABLE:
				return getLowerBoundTable();
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__DERIVATIVES_MUTLIPLIER:
				return getDerivativesMutliplier();
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
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__UPPER_BOUND_TABLE:
				setUpperBoundTable((UpperBoundTable)newValue);
				return;
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__NAME:
				setName((String)newValue);
				return;
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__VALUES_MULTIPLIER:
				setValuesMultiplier((Double)newValue);
				return;
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__LOWER_BOUND_TABLE:
				setLowerBoundTable((LowerBoundTable)newValue);
				return;
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__DERIVATIVES_MUTLIPLIER:
				setDerivativesMutliplier((Double)newValue);
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
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__UPPER_BOUND_TABLE:
				setUpperBoundTable((UpperBoundTable)null);
				return;
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__VALUES_MULTIPLIER:
				setValuesMultiplier(VALUES_MULTIPLIER_EDEFAULT);
				return;
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__LOWER_BOUND_TABLE:
				setLowerBoundTable((LowerBoundTable)null);
				return;
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__DERIVATIVES_MUTLIPLIER:
				setDerivativesMutliplier(DERIVATIVES_MUTLIPLIER_EDEFAULT);
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
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__UPPER_BOUND_TABLE:
				return upperBoundTable != null;
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__VALUES_MULTIPLIER:
				return valuesMultiplier != VALUES_MULTIPLIER_EDEFAULT;
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__LOWER_BOUND_TABLE:
				return lowerBoundTable != null;
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES__DERIVATIVES_MUTLIPLIER:
				return derivativesMutliplier != DERIVATIVES_MUTLIPLIER_EDEFAULT;
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
		result.append(", ValuesMultiplier: ");
		result.append(valuesMultiplier);
		result.append(", DerivativesMutliplier: ");
		result.append(derivativesMutliplier);
		result.append(')');
		return result.toString();
	}

} //TableOfDerivativesImpl
