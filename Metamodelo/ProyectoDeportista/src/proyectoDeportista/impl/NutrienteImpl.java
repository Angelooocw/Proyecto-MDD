/**
 */
package proyectoDeportista.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import proyectoDeportista.NType;
import proyectoDeportista.Nutriente;
import proyectoDeportista.ProyectoDeportistaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutriente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectoDeportista.impl.NutrienteImpl#getNombreN <em>Nombre N</em>}</li>
 *   <li>{@link proyectoDeportista.impl.NutrienteImpl#getCantidad <em>Cantidad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutrienteImpl extends MinimalEObjectImpl.Container implements Nutriente {
	/**
	 * The default value of the '{@link #getNombreN() <em>Nombre N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreN()
	 * @generated
	 * @ordered
	 */
	protected static final NType NOMBRE_N_EDEFAULT = NType.PROTEINA;

	/**
	 * The cached value of the '{@link #getNombreN() <em>Nombre N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreN()
	 * @generated
	 * @ordered
	 */
	protected NType nombreN = NOMBRE_N_EDEFAULT;

	/**
	 * The default value of the '{@link #getCantidad() <em>Cantidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantidad()
	 * @generated
	 * @ordered
	 */
	protected static final int CANTIDAD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCantidad() <em>Cantidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantidad()
	 * @generated
	 * @ordered
	 */
	protected int cantidad = CANTIDAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutrienteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectoDeportistaPackage.Literals.NUTRIENTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NType getNombreN() {
		return nombreN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreN(NType newNombreN) {
		NType oldNombreN = nombreN;
		nombreN = newNombreN == null ? NOMBRE_N_EDEFAULT : newNombreN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.NUTRIENTE__NOMBRE_N, oldNombreN, nombreN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCantidad(int newCantidad) {
		int oldCantidad = cantidad;
		cantidad = newCantidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.NUTRIENTE__CANTIDAD, oldCantidad, cantidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectoDeportistaPackage.NUTRIENTE__NOMBRE_N:
				return getNombreN();
			case ProyectoDeportistaPackage.NUTRIENTE__CANTIDAD:
				return getCantidad();
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
			case ProyectoDeportistaPackage.NUTRIENTE__NOMBRE_N:
				setNombreN((NType)newValue);
				return;
			case ProyectoDeportistaPackage.NUTRIENTE__CANTIDAD:
				setCantidad((Integer)newValue);
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
			case ProyectoDeportistaPackage.NUTRIENTE__NOMBRE_N:
				setNombreN(NOMBRE_N_EDEFAULT);
				return;
			case ProyectoDeportistaPackage.NUTRIENTE__CANTIDAD:
				setCantidad(CANTIDAD_EDEFAULT);
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
			case ProyectoDeportistaPackage.NUTRIENTE__NOMBRE_N:
				return nombreN != NOMBRE_N_EDEFAULT;
			case ProyectoDeportistaPackage.NUTRIENTE__CANTIDAD:
				return cantidad != CANTIDAD_EDEFAULT;
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
		result.append(" (nombreN: ");
		result.append(nombreN);
		result.append(", cantidad: ");
		result.append(cantidad);
		result.append(')');
		return result.toString();
	}

} //NutrienteImpl
