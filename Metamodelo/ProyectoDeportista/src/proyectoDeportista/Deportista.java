/**
 */
package proyectoDeportista;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deportista</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectoDeportista.Deportista#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectoDeportista.Deportista#getD_Tiene_O <em>DTiene O</em>}</li>
 *   <li>{@link proyectoDeportista.Deportista#getEdad <em>Edad</em>}</li>
 *   <li>{@link proyectoDeportista.Deportista#getPeso <em>Peso</em>}</li>
 *   <li>{@link proyectoDeportista.Deportista#getEstatura <em>Estatura</em>}</li>
 *   <li>{@link proyectoDeportista.Deportista#getD_RigePor_PN <em>DRige Por PN</em>}</li>
 * </ul>
 *
 * @see proyectoDeportista.ProyectoDeportistaPackage#getDeportista()
 * @model
 * @generated
 */
public interface Deportista extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getDeportista_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyectoDeportista.Deportista#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>DTiene O</b></em>' containment reference list.
	 * The list contents are of type {@link proyectoDeportista.Objetivo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DTiene O</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DTiene O</em>' containment reference list.
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getDeportista_D_Tiene_O()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Objetivo> getD_Tiene_O();

	/**
	 * Returns the value of the '<em><b>Edad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edad</em>' attribute.
	 * @see #setEdad(int)
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getDeportista_Edad()
	 * @model
	 * @generated
	 */
	int getEdad();

	/**
	 * Sets the value of the '{@link proyectoDeportista.Deportista#getEdad <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edad</em>' attribute.
	 * @see #getEdad()
	 * @generated
	 */
	void setEdad(int value);

	/**
	 * Returns the value of the '<em><b>Peso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peso</em>' attribute.
	 * @see #setPeso(int)
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getDeportista_Peso()
	 * @model
	 * @generated
	 */
	int getPeso();

	/**
	 * Sets the value of the '{@link proyectoDeportista.Deportista#getPeso <em>Peso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peso</em>' attribute.
	 * @see #getPeso()
	 * @generated
	 */
	void setPeso(int value);

	/**
	 * Returns the value of the '<em><b>Estatura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estatura</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estatura</em>' attribute.
	 * @see #setEstatura(int)
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getDeportista_Estatura()
	 * @model
	 * @generated
	 */
	int getEstatura();

	/**
	 * Sets the value of the '{@link proyectoDeportista.Deportista#getEstatura <em>Estatura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estatura</em>' attribute.
	 * @see #getEstatura()
	 * @generated
	 */
	void setEstatura(int value);

	/**
	 * Returns the value of the '<em><b>DRige Por PN</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link proyectoDeportista.PlanNutricional#getPN_asignado_D <em>PN asignado D</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DRige Por PN</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DRige Por PN</em>' reference.
	 * @see #setD_RigePor_PN(PlanNutricional)
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getDeportista_D_RigePor_PN()
	 * @see proyectoDeportista.PlanNutricional#getPN_asignado_D
	 * @model opposite="PN_asignado_D" required="true"
	 * @generated
	 */
	PlanNutricional getD_RigePor_PN();

	/**
	 * Sets the value of the '{@link proyectoDeportista.Deportista#getD_RigePor_PN <em>DRige Por PN</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DRige Por PN</em>' reference.
	 * @see #getD_RigePor_PN()
	 * @generated
	 */
	void setD_RigePor_PN(PlanNutricional value);

} // Deportista
