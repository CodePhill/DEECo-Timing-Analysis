/**
 */
package analysismetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ensemble Side</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see analysismetamodel.AnalysismetamodelPackage#getEnsembleSide()
 * @model
 * @generated
 */
public enum EnsembleSide implements Enumerator {
	/**
	 * The '<em><b>Member</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBER_VALUE
	 * @generated
	 * @ordered
	 */
	MEMBER(0, "Member", "Member"),

	/**
	 * The '<em><b>Coordinator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COORDINATOR_VALUE
	 * @generated
	 * @ordered
	 */
	COORDINATOR(1, "Coordinator", "Coordinator");

	/**
	 * The '<em><b>Member</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Member</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMBER
	 * @model name="Member"
	 * @generated
	 * @ordered
	 */
	public static final int MEMBER_VALUE = 0;

	/**
	 * The '<em><b>Coordinator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coordinator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COORDINATOR
	 * @model name="Coordinator"
	 * @generated
	 * @ordered
	 */
	public static final int COORDINATOR_VALUE = 1;

	/**
	 * An array of all the '<em><b>Ensemble Side</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnsembleSide[] VALUES_ARRAY =
		new EnsembleSide[] {
			MEMBER,
			COORDINATOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Ensemble Side</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnsembleSide> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ensemble Side</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnsembleSide get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnsembleSide result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ensemble Side</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnsembleSide getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnsembleSide result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ensemble Side</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnsembleSide get(int value) {
		switch (value) {
			case MEMBER_VALUE: return MEMBER;
			case COORDINATOR_VALUE: return COORDINATOR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EnsembleSide(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EnsembleSide
