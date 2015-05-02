/**
 */
package analysismetamodel.impl;

import analysismetamodel.AnalysismetamodelPackage;
import analysismetamodel.Knowledge;
import analysismetamodel.ProcessInvocableByCustomFunc;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Invocable By Custom Func</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link analysismetamodel.impl.ProcessInvocableByCustomFuncImpl#getInputKnowledges <em>Input Knowledges</em>}</li>
 *   <li>{@link analysismetamodel.impl.ProcessInvocableByCustomFuncImpl#getOutputKnowledge <em>Output Knowledge</em>}</li>
 *   <li>{@link analysismetamodel.impl.ProcessInvocableByCustomFuncImpl#isDoCartesianProduct <em>Do Cartesian Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessInvocableByCustomFuncImpl extends MinimalEObjectImpl.Container implements ProcessInvocableByCustomFunc {
	/**
	 * The cached value of the '{@link #getInputKnowledges() <em>Input Knowledges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputKnowledges()
	 * @generated
	 * @ordered
	 */
	protected EList<Knowledge> inputKnowledges;

	/**
	 * The cached value of the '{@link #getOutputKnowledge() <em>Output Knowledge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputKnowledge()
	 * @generated
	 * @ordered
	 */
	protected Knowledge outputKnowledge;

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
	protected ProcessInvocableByCustomFuncImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysismetamodelPackage.Literals.PROCESS_INVOCABLE_BY_CUSTOM_FUNC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Knowledge> getInputKnowledges() {
		if (inputKnowledges == null) {
			inputKnowledges = new EObjectResolvingEList<Knowledge>(Knowledge.class, this, AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_CUSTOM_FUNC__INPUT_KNOWLEDGES);
		}
		return inputKnowledges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knowledge getOutputKnowledge() {
		if (outputKnowledge != null && outputKnowledge.eIsProxy()) {
			InternalEObject oldOutputKnowledge = (InternalEObject)outputKnowledge;
			outputKnowledge = (Knowledge)eResolveProxy(oldOutputKnowledge);
			if (outputKnowledge != oldOutputKnowledge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE, oldOutputKnowledge, outputKnowledge));
			}
		}
		return outputKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knowledge basicGetOutputKnowledge() {
		return outputKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputKnowledge(Knowledge newOutputKnowledge) {
		Knowledge oldOutputKnowledge = outputKnowledge;
		outputKnowledge = newOutputKnowledge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE, oldOutputKnowledge, outputKnowledge));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_CUSTOM_FUNC__DO_CARTESIAN_PRODUCT, oldDoCartesianProduct, doCartesianProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_CUSTOM_FUNC__INPUT_KNOWLEDGES:
				return getInputKnowledges();
			case AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE:
				if (resolve) return getOutputKnowledge();
				return basicGetOutputKnowledge();
			case AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_CUSTOM_FUNC__DO_CARTESIAN_PRODUCT:
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
			case AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_CUSTOM_FUNC__INPUT_KNOWLEDGES:
				getInputKnowledges().clear();
				getInputKnowledges().addAll((Collection<? extends Knowledge>)newValue);
				return;
			case AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE:
				setOutputKnowledge((Knowledge)newValue);
				return;
			case AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_CUSTOM_FUNC__DO_CARTESIAN_PRODUCT:
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
			case AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_CUSTOM_FUNC__INPUT_KNOWLEDGES:
				getInputKnowledges().clear();
				return;
			case AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE:
				setOutputKnowledge((Knowledge)null);
				return;
			case AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_CUSTOM_FUNC__DO_CARTESIAN_PRODUCT:
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
			case AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_CUSTOM_FUNC__INPUT_KNOWLEDGES:
				return inputKnowledges != null && !inputKnowledges.isEmpty();
			case AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE:
				return outputKnowledge != null;
			case AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_CUSTOM_FUNC__DO_CARTESIAN_PRODUCT:
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

} //ProcessInvocableByCustomFuncImpl
