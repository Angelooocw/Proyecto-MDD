/**
 */
package proyectoDeportista;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resultado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectoDeportista.Resultado#getCantidad <em>Cantidad</em>}</li>
 * </ul>
 *
 * @see proyectoDeportista.ProyectoDeportistaPackage#getResultado()
 * @model
 * @generated
 */
public interface Resultado extends EObject {
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
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getResultado_Cantidad()
	 * @model
	 * @generated
	 */
	int getCantidad();

	/**
	 * Sets the value of the '{@link proyectoDeportista.Resultado#getCantidad <em>Cantidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cantidad</em>' attribute.
	 * @see #getCantidad()
	 * @generated
	 */
	void setCantidad(int value);

} // Resultado
