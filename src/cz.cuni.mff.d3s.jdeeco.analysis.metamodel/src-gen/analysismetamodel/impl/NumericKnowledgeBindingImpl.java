/**
 */
package analysismetamodel.impl;

import analysismetamodel.AnalysismetamodelPackage;
import analysismetamodel.EnsembleSide;
import analysismetamodel.NumericKnowledge;
import analysismetamodel.NumericKnowledgeBinding;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Knowledge Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link analysismetamodel.impl.NumericKnowledgeBindingImpl#getKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link analysismetamodel.impl.NumericKnowledgeBindingImpl#getEnsembleSide <em>Ensemble Side</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericKnowledgeBindingImpl extends MinimalEObjectImpl.Container implements NumericKnowledgeBinding {
	/**
	 * The cached value of the '{@link #getKnowledge() <em>Knowledge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledge()
	 * @generated
	 * @ordered
	 */
	protected NumericKnowledge knowledge;

	/**
	 * The default value of the '{@link #getEnsembleSide() <em>Ensemble Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnsembleSide()
	 * @generated
	 * @ordered
	 */
	protected static final EnsembleSide ENSEMBLE_SIDE_EDEFAULT = EnsembleSide.MEMBER;

	/**
	 * The cached value of the '{@link #getEnsembleSide() <em>Ensemble Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnsembleSide()
	 * @generated
	 * @ordered
	 */
	protected EnsembleSide ensembleSide = ENSEMBLE_SIDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericKnowledgeBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysismetamodelPackage.Literals.NUMERIC_KNOWLEDGE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericKnowledge getKnowledge() {
		if (knowledge != null && knowledge.eIsProxy()) {
			InternalEObject oldKnowledge = (InternalEObject)knowledge;
			knowledge = (NumericKnowledge)eResolveProxy(oldKnowledge);
			if (knowledge != oldKnowledge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysismetamodelPackage.NUMERIC_KNOWLEDGE_BINDING__KNOWLEDGE, oldKnowledge, knowledge));
			}
		}
		return knowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericKnowledge basicGetKnowledge() {
		return knowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKnowledge(NumericKnowledge newKnowledge) {
		NumericKnowledge oldKnowledge = knowledge;
		knowledge = newKnowledge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.NUMERIC_KNOWLEDGE_BINDING__KNOWLEDGE, oldKnowledge, knowledge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnsembleSide getEnsembleSide() {
		return ensembleSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnsembleSide(EnsembleSide newEnsembleSide) {
		EnsembleSide oldEnsembleSide = ensembleSide;
		ensembleSide = newEnsembleSide == null ? ENSEMBLE_SIDE_EDEFAULT : newEnsembleSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.NUMERIC_KNOWLEDGE_BINDING__ENSEMBLE_SIDE, oldEnsembleSide, ensembleSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE_BINDING__KNOWLEDGE:
				if (resolve) return getKnowledge();
				return basicGetKnowledge();
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE_BINDING__ENSEMBLE_SIDE:
				return getEnsembleSide();
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
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE_BINDING__KNOWLEDGE:
				setKnowledge((NumericKnowledge)newValue);
				return;
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE_BINDING__ENSEMBLE_SIDE:
				setEnsembleSide((EnsembleSide)newValue);
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
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE_BINDING__KNOWLEDGE:
				setKnowledge((NumericKnowledge)null);
				return;
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE_BINDING__ENSEMBLE_SIDE:
				setEnsembleSide(ENSEMBLE_SIDE_EDEFAULT);
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
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE_BINDING__KNOWLEDGE:
				return knowledge != null;
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE_BINDING__ENSEMBLE_SIDE:
				return ensembleSide != ENSEMBLE_SIDE_EDEFAULT;
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
		result.append(" (EnsembleSide: ");
		result.append(ensembleSide);
		result.append(')');
		return result.toString();
	}

} //NumericKnowledgeBindingImpl
