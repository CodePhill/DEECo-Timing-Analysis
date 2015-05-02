/**
 */
package analysismetamodel.impl;

import analysismetamodel.AnalysismetamodelPackage;
import analysismetamodel.EnsembleSide;
import analysismetamodel.Knowledge;
import analysismetamodel.KnowledgeBinding;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link analysismetamodel.impl.KnowledgeBindingImpl#getEnsembleSide <em>Ensemble Side</em>}</li>
 *   <li>{@link analysismetamodel.impl.KnowledgeBindingImpl#getKnowledge <em>Knowledge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KnowledgeBindingImpl extends MinimalEObjectImpl.Container implements KnowledgeBinding {
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
	 * The cached value of the '{@link #getKnowledge() <em>Knowledge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledge()
	 * @generated
	 * @ordered
	 */
	protected Knowledge knowledge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnowledgeBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysismetamodelPackage.Literals.KNOWLEDGE_BINDING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.KNOWLEDGE_BINDING__ENSEMBLE_SIDE, oldEnsembleSide, ensembleSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knowledge getKnowledge() {
		if (knowledge != null && knowledge.eIsProxy()) {
			InternalEObject oldKnowledge = (InternalEObject)knowledge;
			knowledge = (Knowledge)eResolveProxy(oldKnowledge);
			if (knowledge != oldKnowledge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysismetamodelPackage.KNOWLEDGE_BINDING__KNOWLEDGE, oldKnowledge, knowledge));
			}
		}
		return knowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knowledge basicGetKnowledge() {
		return knowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKnowledge(Knowledge newKnowledge) {
		Knowledge oldKnowledge = knowledge;
		knowledge = newKnowledge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.KNOWLEDGE_BINDING__KNOWLEDGE, oldKnowledge, knowledge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysismetamodelPackage.KNOWLEDGE_BINDING__ENSEMBLE_SIDE:
				return getEnsembleSide();
			case AnalysismetamodelPackage.KNOWLEDGE_BINDING__KNOWLEDGE:
				if (resolve) return getKnowledge();
				return basicGetKnowledge();
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
			case AnalysismetamodelPackage.KNOWLEDGE_BINDING__ENSEMBLE_SIDE:
				setEnsembleSide((EnsembleSide)newValue);
				return;
			case AnalysismetamodelPackage.KNOWLEDGE_BINDING__KNOWLEDGE:
				setKnowledge((Knowledge)newValue);
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
			case AnalysismetamodelPackage.KNOWLEDGE_BINDING__ENSEMBLE_SIDE:
				setEnsembleSide(ENSEMBLE_SIDE_EDEFAULT);
				return;
			case AnalysismetamodelPackage.KNOWLEDGE_BINDING__KNOWLEDGE:
				setKnowledge((Knowledge)null);
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
			case AnalysismetamodelPackage.KNOWLEDGE_BINDING__ENSEMBLE_SIDE:
				return ensembleSide != ENSEMBLE_SIDE_EDEFAULT;
			case AnalysismetamodelPackage.KNOWLEDGE_BINDING__KNOWLEDGE:
				return knowledge != null;
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

} //KnowledgeBindingImpl
