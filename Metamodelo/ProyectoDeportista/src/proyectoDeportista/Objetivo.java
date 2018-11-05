/**
 */
package proyectoDeportista;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objetivo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectoDeportista.Objetivo#getTipo <em>Tipo</em>}</li>
 *   <li>{@link proyectoDeportista.Objetivo#getCantidad <em>Cantidad</em>}</li>
 * </ul>
 *
 * @see proyectoDeportista.ProyectoDeportistaPackage#getObjetivo()
 * @model
 * @generated
 */
public interface Objetivo extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getObjetivo_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link proyectoDeportista.Objetivo#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Cantidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cantidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cantidad</em>' attribute.
	 * @see #setCantidad(int)
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getObjetivo_Cantidad()
	 * @model
	 * @generated
	 */
	int getCantidad();

	/**
	 * Sets the value of the '{@link proyectoDeportista.Objetivo#getCantidad <em>Cantidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cantidad</em>' attribute.
	 * @see #getCantidad()
	 * @generated
	 */
	void setCantidad(int value);

} // Objetivo
