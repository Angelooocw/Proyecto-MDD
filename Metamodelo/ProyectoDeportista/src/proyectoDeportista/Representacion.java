/**
 */
package proyectoDeportista;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectoDeportista.Representacion#getR_Tiene_D <em>RTiene D</em>}</li>
 *   <li>{@link proyectoDeportista.Representacion#getR_Tiene_PN <em>RTiene PN</em>}</li>
 *   <li>{@link proyectoDeportista.Representacion#getR_Tiene_O <em>RTiene O</em>}</li>
 *   <li>{@link proyectoDeportista.Representacion#getR_Tiene_C <em>RTiene C</em>}</li>
 *   <li>{@link proyectoDeportista.Representacion#getR_Tiene_N <em>RTiene N</em>}</li>
 * </ul>
 *
 * @see proyectoDeportista.ProyectoDeportistaPackage#getRepresentacion()
 * @model
 * @generated
 */
public interface Representacion extends EObject {
	/**
	 * Returns the value of the '<em><b>RTiene D</b></em>' containment reference list.
	 * The list contents are of type {@link proyectoDeportista.Deportista}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RTiene D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RTiene D</em>' containment reference list.
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getRepresentacion_R_Tiene_D()
	 * @model containment="true"
	 * @generated
	 */
	EList<Deportista> getR_Tiene_D();

	/**
	 * Returns the value of the '<em><b>RTiene PN</b></em>' containment reference list.
	 * The list contents are of type {@link proyectoDeportista.PlanNutricional}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RTiene PN</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RTiene PN</em>' containment reference list.
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getRepresentacion_R_Tiene_PN()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlanNutricional> getR_Tiene_PN();

	/**
	 * Returns the value of the '<em><b>RTiene O</b></em>' containment reference list.
	 * The list contents are of type {@link proyectoDeportista.Objetivo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RTiene O</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RTiene O</em>' containment reference list.
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getRepresentacion_R_Tiene_O()
	 * @model containment="true"
	 * @generated
	 */
	EList<Objetivo> getR_Tiene_O();

	/**
	 * Returns the value of the '<em><b>RTiene C</b></em>' containment reference list.
	 * The list contents are of type {@link proyectoDeportista.Comida}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RTiene C</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RTiene C</em>' containment reference list.
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getRepresentacion_R_Tiene_C()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comida> getR_Tiene_C();

	/**
	 * Returns the value of the '<em><b>RTiene N</b></em>' containment reference list.
	 * The list contents are of type {@link proyectoDeportista.Nutriente}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RTiene N</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RTiene N</em>' containment reference list.
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getRepresentacion_R_Tiene_N()
	 * @model containment="true"
	 * @generated
	 */
	EList<Nutriente> getR_Tiene_N();

} // Representacion
