/**
 */
package proyectoDeportista;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comida</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectoDeportista.Comida#getC_Tiene_N <em>CTiene N</em>}</li>
 *   <li>{@link proyectoDeportista.Comida#getNCalorias <em>NCalorias</em>}</li>
 *   <li>{@link proyectoDeportista.Comida#getMomento_dia <em>Momento dia</em>}</li>
 *   <li>{@link proyectoDeportista.Comida#getC_Asociado_PN <em>CAsociado PN</em>}</li>
 * </ul>
 *
 * @see proyectoDeportista.ProyectoDeportistaPackage#getComida()
 * @model
 * @generated
 */
public interface Comida extends EObject {
	/**
	 * Returns the value of the '<em><b>CTiene N</b></em>' containment reference list.
	 * The list contents are of type {@link proyectoDeportista.Nutriente}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTiene N</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTiene N</em>' containment reference list.
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getComida_C_Tiene_N()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Nutriente> getC_Tiene_N();

	/**
	 * Returns the value of the '<em><b>NCalorias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NCalorias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NCalorias</em>' attribute.
	 * @see #setNCalorias(int)
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getComida_NCalorias()
	 * @model
	 * @generated
	 */
	int getNCalorias();

	/**
	 * Sets the value of the '{@link proyectoDeportista.Comida#getNCalorias <em>NCalorias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NCalorias</em>' attribute.
	 * @see #getNCalorias()
	 * @generated
	 */
	void setNCalorias(int value);

	/**
	 * Returns the value of the '<em><b>Momento dia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Momento dia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Momento dia</em>' attribute.
	 * @see #setMomento_dia(String)
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getComida_Momento_dia()
	 * @model
	 * @generated
	 */
	String getMomento_dia();

	/**
	 * Sets the value of the '{@link proyectoDeportista.Comida#getMomento_dia <em>Momento dia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Momento dia</em>' attribute.
	 * @see #getMomento_dia()
	 * @generated
	 */
	void setMomento_dia(String value);

	/**
	 * Returns the value of the '<em><b>CAsociado PN</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CAsociado PN</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CAsociado PN</em>' reference.
	 * @see #setC_Asociado_PN(PlanNutricional)
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getComida_C_Asociado_PN()
	 * @model
	 * @generated
	 */
	PlanNutricional getC_Asociado_PN();

	/**
	 * Sets the value of the '{@link proyectoDeportista.Comida#getC_Asociado_PN <em>CAsociado PN</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CAsociado PN</em>' reference.
	 * @see #getC_Asociado_PN()
	 * @generated
	 */
	void setC_Asociado_PN(PlanNutricional value);

} // Comida
