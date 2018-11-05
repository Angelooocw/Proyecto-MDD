/**
 */
package proyectoDeportista;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>NType</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see proyectoDeportista.ProyectoDeportistaPackage#getNType()
 * @model
 * @generated
 */
public enum NType implements Enumerator {
	/**
	 * The '<em><b>Proteina</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTEINA_VALUE
	 * @generated
	 * @ordered
	 */
	PROTEINA(0, "Proteina", "Proteina"),

	/**
	 * The '<em><b>Grasa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRASA_VALUE
	 * @generated
	 * @ordered
	 */
	GRASA(1, "Grasa", "Grasa"),

	/**
	 * The '<em><b>Carbohidrato</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARBOHIDRATO_VALUE
	 * @generated
	 * @ordered
	 */
	CARBOHIDRATO(2, "Carbohidrato", "Carbohidrato");

	/**
	 * The '<em><b>Proteina</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Proteina</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTEINA
	 * @model name="Proteina"
	 * @generated
	 * @ordered
	 */
	public static final int PROTEINA_VALUE = 0;

	/**
	 * The '<em><b>Grasa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Grasa</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRASA
	 * @model name="Grasa"
	 * @generated
	 * @ordered
	 */
	public static final int GRASA_VALUE = 1;

	/**
	 * The '<em><b>Carbohidrato</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Carbohidrato</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARBOHIDRATO
	 * @model name="Carbohidrato"
	 * @generated
	 * @ordered
	 */
	public static final int CARBOHIDRATO_VALUE = 2;

	/**
	 * An array of all the '<em><b>NType</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NType[] VALUES_ARRAY =
		new NType[] {
			PROTEINA,
			GRASA,
			CARBOHIDRATO,
		};

	/**
	 * A public read-only list of all the '<em><b>NType</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>NType</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>NType</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>NType</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NType get(int value) {
		switch (value) {
			case PROTEINA_VALUE: return PROTEINA;
			case GRASA_VALUE: return GRASA;
			case CARBOHIDRATO_VALUE: return CARBOHIDRATO;
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
	private NType(int value, String name, String literal) {
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
	
} //NType
