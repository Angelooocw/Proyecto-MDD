/**
 */
package proyectoDeportista;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Nutricional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectoDeportista.PlanNutricional#getPN_Tiene_C <em>PN Tiene C</em>}</li>
 *   <li>{@link proyectoDeportista.PlanNutricional#getId <em>Id</em>}</li>
 *   <li>{@link proyectoDeportista.PlanNutricional#getTipoP <em>Tipo P</em>}</li>
 *   <li>{@link proyectoDeportista.PlanNutricional#getPN_Tiene_R <em>PN Tiene R</em>}</li>
 *   <li>{@link proyectoDeportista.PlanNutricional#getPN_asignado_D <em>PN asignado D</em>}</li>
 *   <li>{@link proyectoDeportista.PlanNutricional#getMinCalorias <em>Min Calorias</em>}</li>
 *   <li>{@link proyectoDeportista.PlanNutricional#getMaxCalorias <em>Max Calorias</em>}</li>
 * </ul>
 *
 * @see proyectoDeportista.ProyectoDeportistaPackage#getPlanNutricional()
 * @model
 * @generated
 */
public interface PlanNutricional extends EObject {
	/**
	 * Returns the value of the '<em><b>PN Tiene C</b></em>' containment reference list.
	 * The list contents are of type {@link proyectoDeportista.Comida}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PN Tiene C</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PN Tiene C</em>' containment reference list.
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getPlanNutricional_PN_Tiene_C()
	 * @model containment="true" lower="3" upper="6"
	 * @generated
	 */
	EList<Comida> getPN_Tiene_C();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getPlanNutricional_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link proyectoDeportista.PlanNutricional#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Tipo P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo P</em>' attribute.
	 * @see #setTipoP(String)
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getPlanNutricional_TipoP()
	 * @model
	 * @generated
	 */
	String getTipoP();

	/**
	 * Sets the value of the '{@link proyectoDeportista.PlanNutricional#getTipoP <em>Tipo P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo P</em>' attribute.
	 * @see #getTipoP()
	 * @generated
	 */
	void setTipoP(String value);

	/**
	 * Returns the value of the '<em><b>PN Tiene R</b></em>' containment reference list.
	 * The list contents are of type {@link proyectoDeportista.Resultado}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PN Tiene R</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PN Tiene R</em>' containment reference list.
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getPlanNutricional_PN_Tiene_R()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resultado> getPN_Tiene_R();

	/**
	 * Returns the value of the '<em><b>PN asignado D</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link proyectoDeportista.Deportista#getD_RigePor_PN <em>DRige Por PN</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PN asignado D</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PN asignado D</em>' reference.
	 * @see #setPN_asignado_D(Deportista)
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getPlanNutricional_PN_asignado_D()
	 * @see proyectoDeportista.Deportista#getD_RigePor_PN
	 * @model opposite="D_RigePor_PN" required="true"
	 * @generated
	 */
	Deportista getPN_asignado_D();

	/**
	 * Sets the value of the '{@link proyectoDeportista.PlanNutricional#getPN_asignado_D <em>PN asignado D</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PN asignado D</em>' reference.
	 * @see #getPN_asignado_D()
	 * @generated
	 */
	void setPN_asignado_D(Deportista value);

	/**
	 * Returns the value of the '<em><b>Min Calorias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Calorias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Calorias</em>' attribute.
	 * @see #setMinCalorias(int)
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getPlanNutricional_MinCalorias()
	 * @model
	 * @generated
	 */
	int getMinCalorias();

	/**
	 * Sets the value of the '{@link proyectoDeportista.PlanNutricional#getMinCalorias <em>Min Calorias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Calorias</em>' attribute.
	 * @see #getMinCalorias()
	 * @generated
	 */
	void setMinCalorias(int value);

	/**
	 * Returns the value of the '<em><b>Max Calorias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Calorias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Calorias</em>' attribute.
	 * @see #setMaxCalorias(int)
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getPlanNutricional_MaxCalorias()
	 * @model
	 * @generated
	 */
	int getMaxCalorias();

	/**
	 * Sets the value of the '{@link proyectoDeportista.PlanNutricional#getMaxCalorias <em>Max Calorias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Calorias</em>' attribute.
	 * @see #getMaxCalorias()
	 * @generated
	 */
	void setMaxCalorias(int value);

} // PlanNutricional
