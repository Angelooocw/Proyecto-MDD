/**
 */
package proyectoDeportista.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import proyectoDeportista.Objetivo;
import proyectoDeportista.ProyectoDeportistaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objetivo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectoDeportista.impl.ObjetivoImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link proyectoDeportista.impl.ObjetivoImpl#getCantidad <em>Cantidad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjetivoImpl extends MinimalEObjectImpl.Container implements Objetivo {
	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

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
	protected ObjetivoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectoDeportistaPackage.Literals.OBJETIVO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.OBJETIVO__TIPO, oldTipo, tipo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.OBJETIVO__CANTIDAD, oldCantidad, cantidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectoDeportistaPackage.OBJETIVO__TIPO:
				return getTipo();
			case ProyectoDeportistaPackage.OBJETIVO__CANTIDAD:
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
			case ProyectoDeportistaPackage.OBJETIVO__TIPO:
				setTipo((String)newValue);
				return;
			case ProyectoDeportistaPackage.OBJETIVO__CANTIDAD:
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
			case ProyectoDeportistaPackage.OBJETIVO__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case ProyectoDeportistaPackage.OBJETIVO__CANTIDAD:
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
			case ProyectoDeportistaPackage.OBJETIVO__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
			case ProyectoDeportistaPackage.OBJETIVO__CANTIDAD:
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
		result.append(" (tipo: ");
		result.append(tipo);
		result.append(", cantidad: ");
		result.append(cantidad);
		result.append(')');
		return result.toString();
	}

} //ObjetivoImpl
