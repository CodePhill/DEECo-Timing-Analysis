/**
 */
package analysismetamodel.impl;

import analysismetamodel.AnalysismetamodelPackage;
import analysismetamodel.NumericKnowledge;
import analysismetamodel.TableOfDerivatives;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Knowledge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link analysismetamodel.impl.NumericKnowledgeImpl#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link analysismetamodel.impl.NumericKnowledgeImpl#getTableOfDerivatives <em>Table Of Derivatives</em>}</li>
 *   <li>{@link analysismetamodel.impl.NumericKnowledgeImpl#getPrecision <em>Precision</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericKnowledgeImpl extends KnowledgeImpl implements NumericKnowledge {
	/**
	 * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final double MULTIPLIER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected double multiplier = MULTIPLIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTableOfDerivatives() <em>Table Of Derivatives</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableOfDerivatives()
	 * @generated
	 * @ordered
	 */
	protected TableOfDerivatives tableOfDerivatives;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final int PRECISION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected int precision = PRECISION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericKnowledgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysismetamodelPackage.Literals.NUMERIC_KNOWLEDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMultiplier() {
		return multiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplier(double newMultiplier) {
		double oldMultiplier = multiplier;
		multiplier = newMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.NUMERIC_KNOWLEDGE__MULTIPLIER, oldMultiplier, multiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableOfDerivatives getTableOfDerivatives() {
		if (tableOfDerivatives != null && tableOfDerivatives.eIsProxy()) {
			InternalEObject oldTableOfDerivatives = (InternalEObject)tableOfDerivatives;
			tableOfDerivatives = (TableOfDerivatives)eResolveProxy(oldTableOfDerivatives);
			if (tableOfDerivatives != oldTableOfDerivatives) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysismetamodelPackage.NUMERIC_KNOWLEDGE__TABLE_OF_DERIVATIVES, oldTableOfDerivatives, tableOfDerivatives));
			}
		}
		return tableOfDerivatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableOfDerivatives basicGetTableOfDerivatives() {
		return tableOfDerivatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableOfDerivatives(TableOfDerivatives newTableOfDerivatives) {
		TableOfDerivatives oldTableOfDerivatives = tableOfDerivatives;
		tableOfDerivatives = newTableOfDerivatives;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.NUMERIC_KNOWLEDGE__TABLE_OF_DERIVATIVES, oldTableOfDerivatives, tableOfDerivatives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(int newPrecision) {
		int oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.NUMERIC_KNOWLEDGE__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE__MULTIPLIER:
				return getMultiplier();
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE__TABLE_OF_DERIVATIVES:
				if (resolve) return getTableOfDerivatives();
				return basicGetTableOfDerivatives();
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE__PRECISION:
				return getPrecision();
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
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE__MULTIPLIER:
				setMultiplier((Double)newValue);
				return;
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE__TABLE_OF_DERIVATIVES:
				setTableOfDerivatives((TableOfDerivatives)newValue);
				return;
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE__PRECISION:
				setPrecision((Integer)newValue);
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
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE__MULTIPLIER:
				setMultiplier(MULTIPLIER_EDEFAULT);
				return;
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE__TABLE_OF_DERIVATIVES:
				setTableOfDerivatives((TableOfDerivatives)null);
				return;
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
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
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE__MULTIPLIER:
				return multiplier != MULTIPLIER_EDEFAULT;
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE__TABLE_OF_DERIVATIVES:
				return tableOfDerivatives != null;
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE__PRECISION:
				return precision != PRECISION_EDEFAULT;
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
		result.append(" (Multiplier: ");
		result.append(multiplier);
		result.append(", Precision: ");
		result.append(precision);
		result.append(')');
		return result.toString();
	}

} //NumericKnowledgeImpl
