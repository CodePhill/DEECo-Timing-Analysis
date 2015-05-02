/**
 */
package analysismetamodel.impl;

import analysismetamodel.AnalysismetamodelPackage;
import analysismetamodel.EnsembleInvocableByEQSet;
import analysismetamodel.NumericKnowledgeBinding;

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
 * An implementation of the model object '<em><b>Ensemble Invocable By EQ Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link analysismetamodel.impl.EnsembleInvocableByEQSetImpl#getInputKnowledgeBindings <em>Input Knowledge Bindings</em>}</li>
 *   <li>{@link analysismetamodel.impl.EnsembleInvocableByEQSetImpl#getOutputKnowledgeBinding <em>Output Knowledge Binding</em>}</li>
 *   <li>{@link analysismetamodel.impl.EnsembleInvocableByEQSetImpl#isDoCartesianProduct <em>Do Cartesian Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnsembleInvocableByEQSetImpl extends MinimalEObjectImpl.Container implements EnsembleInvocableByEQSet {
	/**
	 * The cached value of the '{@link #getInputKnowledgeBindings() <em>Input Knowledge Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputKnowledgeBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<NumericKnowledgeBinding> inputKnowledgeBindings;

	/**
	 * The cached value of the '{@link #getOutputKnowledgeBinding() <em>Output Knowledge Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputKnowledgeBinding()
	 * @generated
	 * @ordered
	 */
	protected NumericKnowledgeBinding outputKnowledgeBinding;

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
	protected EnsembleInvocableByEQSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysismetamodelPackage.Literals.ENSEMBLE_INVOCABLE_BY_EQ_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumericKnowledgeBinding> getInputKnowledgeBindings() {
		if (inputKnowledgeBindings == null) {
			inputKnowledgeBindings = new EObjectContainmentEList<NumericKnowledgeBinding>(NumericKnowledgeBinding.class, this, AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__INPUT_KNOWLEDGE_BINDINGS);
		}
		return inputKnowledgeBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericKnowledgeBinding getOutputKnowledgeBinding() {
		return outputKnowledgeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputKnowledgeBinding(NumericKnowledgeBinding newOutputKnowledgeBinding, NotificationChain msgs) {
		NumericKnowledgeBinding oldOutputKnowledgeBinding = outputKnowledgeBinding;
		outputKnowledgeBinding = newOutputKnowledgeBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__OUTPUT_KNOWLEDGE_BINDING, oldOutputKnowledgeBinding, newOutputKnowledgeBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputKnowledgeBinding(NumericKnowledgeBinding newOutputKnowledgeBinding) {
		if (newOutputKnowledgeBinding != outputKnowledgeBinding) {
			NotificationChain msgs = null;
			if (outputKnowledgeBinding != null)
				msgs = ((InternalEObject)outputKnowledgeBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__OUTPUT_KNOWLEDGE_BINDING, null, msgs);
			if (newOutputKnowledgeBinding != null)
				msgs = ((InternalEObject)newOutputKnowledgeBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__OUTPUT_KNOWLEDGE_BINDING, null, msgs);
			msgs = basicSetOutputKnowledgeBinding(newOutputKnowledgeBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__OUTPUT_KNOWLEDGE_BINDING, newOutputKnowledgeBinding, newOutputKnowledgeBinding));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__DO_CARTESIAN_PRODUCT, oldDoCartesianProduct, doCartesianProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__INPUT_KNOWLEDGE_BINDINGS:
				return ((InternalEList<?>)getInputKnowledgeBindings()).basicRemove(otherEnd, msgs);
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__OUTPUT_KNOWLEDGE_BINDING:
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
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__INPUT_KNOWLEDGE_BINDINGS:
				return getInputKnowledgeBindings();
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__OUTPUT_KNOWLEDGE_BINDING:
				return getOutputKnowledgeBinding();
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__DO_CARTESIAN_PRODUCT:
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
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__INPUT_KNOWLEDGE_BINDINGS:
				getInputKnowledgeBindings().clear();
				getInputKnowledgeBindings().addAll((Collection<? extends NumericKnowledgeBinding>)newValue);
				return;
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__OUTPUT_KNOWLEDGE_BINDING:
				setOutputKnowledgeBinding((NumericKnowledgeBinding)newValue);
				return;
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__DO_CARTESIAN_PRODUCT:
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
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__INPUT_KNOWLEDGE_BINDINGS:
				getInputKnowledgeBindings().clear();
				return;
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__OUTPUT_KNOWLEDGE_BINDING:
				setOutputKnowledgeBinding((NumericKnowledgeBinding)null);
				return;
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__DO_CARTESIAN_PRODUCT:
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
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__INPUT_KNOWLEDGE_BINDINGS:
				return inputKnowledgeBindings != null && !inputKnowledgeBindings.isEmpty();
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__OUTPUT_KNOWLEDGE_BINDING:
				return outputKnowledgeBinding != null;
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET__DO_CARTESIAN_PRODUCT:
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

} //EnsembleInvocableByEQSetImpl
