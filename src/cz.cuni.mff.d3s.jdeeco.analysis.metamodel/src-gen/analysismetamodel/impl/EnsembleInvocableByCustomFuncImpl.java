/**
 */
package analysismetamodel.impl;

import analysismetamodel.AnalysismetamodelPackage;
import analysismetamodel.EnsembleInvocableByCustomFunc;
import analysismetamodel.KnowledgeBinding;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ensemble Invocable By Custom Func</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link analysismetamodel.impl.EnsembleInvocableByCustomFuncImpl#getOutputKnowledgeBinding <em>Output Knowledge Binding</em>}</li>
 *   <li>{@link analysismetamodel.impl.EnsembleInvocableByCustomFuncImpl#getInputKnowledgeBindings <em>Input Knowledge Bindings</em>}</li>
 *   <li>{@link analysismetamodel.impl.EnsembleInvocableByCustomFuncImpl#isDoCartesianProduct <em>Do Cartesian Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnsembleInvocableByCustomFuncImpl extends MinimalEObjectImpl.Container implements EnsembleInvocableByCustomFunc {
	/**
	 * The cached value of the '{@link #getOutputKnowledgeBinding() <em>Output Knowledge Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputKnowledgeBinding()
	 * @generated
	 * @ordered
	 */
	protected KnowledgeBinding outputKnowledgeBinding;

	/**
	 * The cached value of the '{@link #getInputKnowledgeBindings() <em>Input Knowledge Bindings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputKnowledgeBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<KnowledgeBinding> inputKnowledgeBindings;

	/**
	 * The default value of the '{@link #isDoCartesianProduct() <em>Do Cartesian Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDoCartesianProduct()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DO_CARTESIAN_PRODUCT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDoCartesianProduct() <em>Do Cartesian Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDoCartesianProduct()
	 * @generated
	 * @ordered
	 */
	protected boolean doCartesianProduct = DO_CARTESIAN_PRODUCT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnsembleInvocableByCustomFuncImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysismetamodelPackage.Literals.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeBinding getOutputKnowledgeBinding() {
		return outputKnowledgeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputKnowledgeBinding(KnowledgeBinding newOutputKnowledgeBinding, NotificationChain msgs) {
		KnowledgeBinding oldOutputKnowledgeBinding = outputKnowledgeBinding;
		outputKnowledgeBinding = newOutputKnowledgeBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE_BINDING, oldOutputKnowledgeBinding, newOutputKnowledgeBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputKnowledgeBinding(KnowledgeBinding newOutputKnowledgeBinding) {
		if (newOutputKnowledgeBinding != outputKnowledgeBinding) {
			NotificationChain msgs = null;
			if (outputKnowledgeBinding != null)
				msgs = ((InternalEObject)outputKnowledgeBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE_BINDING, null, msgs);
			if (newOutputKnowledgeBinding != null)
				msgs = ((InternalEObject)newOutputKnowledgeBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE_BINDING, null, msgs);
			msgs = basicSetOutputKnowledgeBinding(newOutputKnowledgeBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE_BINDING, newOutputKnowledgeBinding, newOutputKnowledgeBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KnowledgeBinding> getInputKnowledgeBindings() {
		if (inputKnowledgeBindings == null) {
			inputKnowledgeBindings = new EObjectResolvingEList<KnowledgeBinding>(KnowledgeBinding.class, this, AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__INPUT_KNOWLEDGE_BINDINGS);
		}
		return inputKnowledgeBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDoCartesianProduct() {
		return doCartesianProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoCartesianProduct(boolean newDoCartesianProduct) {
		boolean oldDoCartesianProduct = doCartesianProduct;
		doCartesianProduct = newDoCartesianProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__DO_CARTESIAN_PRODUCT, oldDoCartesianProduct, doCartesianProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE_BINDING:
				return basicSetOutputKnowledgeBinding(null, msgs);
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
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE_BINDING:
				return getOutputKnowledgeBinding();
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__INPUT_KNOWLEDGE_BINDINGS:
				return getInputKnowledgeBindings();
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__DO_CARTESIAN_PRODUCT:
				return isDoCartesianProduct();
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
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE_BINDING:
				setOutputKnowledgeBinding((KnowledgeBinding)newValue);
				return;
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__INPUT_KNOWLEDGE_BINDINGS:
				getInputKnowledgeBindings().clear();
				getInputKnowledgeBindings().addAll((Collection<? extends KnowledgeBinding>)newValue);
				return;
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__DO_CARTESIAN_PRODUCT:
				setDoCartesianProduct((Boolean)newValue);
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
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE_BINDING:
				setOutputKnowledgeBinding((KnowledgeBinding)null);
				return;
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__INPUT_KNOWLEDGE_BINDINGS:
				getInputKnowledgeBindings().clear();
				return;
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__DO_CARTESIAN_PRODUCT:
				setDoCartesianProduct(DO_CARTESIAN_PRODUCT_EDEFAULT);
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
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE_BINDING:
				return outputKnowledgeBinding != null;
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__INPUT_KNOWLEDGE_BINDINGS:
				return inputKnowledgeBindings != null && !inputKnowledgeBindings.isEmpty();
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__DO_CARTESIAN_PRODUCT:
				return doCartesianProduct != DO_CARTESIAN_PRODUCT_EDEFAULT;
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
		result.append(" (DoCartesianProduct: ");
		result.append(doCartesianProduct);
		result.append(')');
		return result.toString();
	}

} //EnsembleInvocableByCustomFuncImpl
