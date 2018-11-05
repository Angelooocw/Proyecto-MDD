/**
 */
package proyectoDeportista;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutriente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectoDeportista.Nutriente#getNombreN <em>Nombre N</em>}</li>
 *   <li>{@link proyectoDeportista.Nutriente#getCantidad <em>Cantidad</em>}</li>
 * </ul>
 *
 * @see proyectoDeportista.ProyectoDeportistaPackage#getNutriente()
 * @model
 * @generated
 */
public interface Nutriente extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre N</b></em>' attribute.
	 * The default value is <code>"Proteina"</code>.
	 * The literals are from the enumeration {@link proyectoDeportista.NType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre N</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre N</em>' attribute.
	 * @see proyectoDeportista.NType
	 * @see #setNombreN(NType)
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getNutriente_NombreN()
	 * @model default="Proteina"
	 * @generated
	 */
	NType getNombreN();

	/**
	 * Sets the value of the '{@link proyectoDeportista.Nutriente#getNombreN <em>Nombre N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre N</em>' attribute.
	 * @see proyectoDeportista.NType
	 * @see #getNombreN()
	 * @generated
	 */
	void setNombreN(NType value);

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
	 * @see proyectoDeportista.ProyectoDeportistaPackage#getNutriente_Cantidad()
	 * @model
	 * @generated
	 */
	int getCantidad();

	/**
	 * Sets the value of the '{@link proyectoDeportista.Nutriente#getCantidad <em>Cantidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cantidad</em>' attribute.
	 * @see #getCantidad()
	 * @generated
	 */
	void setCantidad(int value);

} // Nutriente
