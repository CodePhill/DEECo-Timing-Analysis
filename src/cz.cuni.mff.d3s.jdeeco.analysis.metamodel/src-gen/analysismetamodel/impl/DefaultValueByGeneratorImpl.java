/**
 */
package analysismetamodel.impl;

import analysismetamodel.AnalysismetamodelPackage;
import analysismetamodel.CustomGenerator;
import analysismetamodel.DefaultValueByGenerator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Value By Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link analysismetamodel.impl.DefaultValueByGeneratorImpl#getStart <em>Start</em>}</li>
 *   <li>{@link analysismetamodel.impl.DefaultValueByGeneratorImpl#getEnd <em>End</em>}</li>
 *   <li>{@link analysismetamodel.impl.DefaultValueByGeneratorImpl#getCount <em>Count</em>}</li>
 *   <li>{@link analysismetamodel.impl.DefaultValueByGeneratorImpl#getGenerator <em>Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultValueByGeneratorImpl extends DefaultValueImpl implements DefaultValueByGenerator {
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final String START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected String start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected String end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenerator() <em>Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected CustomGenerator generator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultValueByGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysismetamodelPackage.Literals.DEFAULT_VALUE_BY_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(String newStart) {
		String oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(String newEnd) {
		String oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomGenerator getGenerator() {
		if (generator != null && generator.eIsProxy()) {
			InternalEObject oldGenerator = (InternalEObject)generator;
			generator = (CustomGenerator)eResolveProxy(oldGenerator);
			if (generator != oldGenerator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__GENERATOR, oldGenerator, generator));
			}
		}
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomGenerator basicGetGenerator() {
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(CustomGenerator newGenerator) {
		CustomGenerator oldGenerator = generator;
		generator = newGenerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__GENERATOR, oldGenerator, generator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__START:
				return getStart();
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__END:
				return getEnd();
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__COUNT:
				return getCount();
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__GENERATOR:
				if (resolve) return getGenerator();
				return basicGetGenerator();
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
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__START:
				setStart((String)newValue);
				return;
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__END:
				setEnd((String)newValue);
				return;
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__COUNT:
				setCount((Integer)newValue);
				return;
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__GENERATOR:
				setGenerator((CustomGenerator)newValue);
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
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__START:
				setStart(START_EDEFAULT);
				return;
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__END:
				setEnd(END_EDEFAULT);
				return;
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__GENERATOR:
				setGenerator((CustomGenerator)null);
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
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__COUNT:
				return count != COUNT_EDEFAULT;
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR__GENERATOR:
				return generator != null;
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
		result.append(" (Start: ");
		result.append(start);
		result.append(", End: ");
		result.append(end);
		result.append(", Count: ");
		result.append(count);
		result.append(')');
		return result.toString();
	}

} //DefaultValueByGeneratorImpl
