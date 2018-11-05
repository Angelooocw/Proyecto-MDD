/**
 */
package proyectoDeportista.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import proyectoDeportista.Deportista;
import proyectoDeportista.Objetivo;
import proyectoDeportista.PlanNutricional;
import proyectoDeportista.ProyectoDeportistaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deportista</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectoDeportista.impl.DeportistaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectoDeportista.impl.DeportistaImpl#getD_Tiene_O <em>DTiene O</em>}</li>
 *   <li>{@link proyectoDeportista.impl.DeportistaImpl#getEdad <em>Edad</em>}</li>
 *   <li>{@link proyectoDeportista.impl.DeportistaImpl#getPeso <em>Peso</em>}</li>
 *   <li>{@link proyectoDeportista.impl.DeportistaImpl#getEstatura <em>Estatura</em>}</li>
 *   <li>{@link proyectoDeportista.impl.DeportistaImpl#getD_RigePor_PN <em>DRige Por PN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeportistaImpl extends MinimalEObjectImpl.Container implements Deportista {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getD_Tiene_O() <em>DTiene O</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_Tiene_O()
	 * @generated
	 * @ordered
	 */
	protected EList<Objetivo> d_Tiene_O;

	/**
	 * The default value of the '{@link #getEdad() <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdad()
	 * @generated
	 * @ordered
	 */
	protected static final int EDAD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEdad() <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdad()
	 * @generated
	 * @ordered
	 */
	protected int edad = EDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeso() <em>Peso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeso()
	 * @generated
	 * @ordered
	 */
	protected static final int PESO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeso() <em>Peso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeso()
	 * @generated
	 * @ordered
	 */
	protected int peso = PESO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstatura() <em>Estatura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstatura()
	 * @generated
	 * @ordered
	 */
	protected static final int ESTATURA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEstatura() <em>Estatura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstatura()
	 * @generated
	 * @ordered
	 */
	protected int estatura = ESTATURA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getD_RigePor_PN() <em>DRige Por PN</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_RigePor_PN()
	 * @generated
	 * @ordered
	 */
	protected PlanNutricional d_RigePor_PN;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeportistaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectoDeportistaPackage.Literals.DEPORTISTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.DEPORTISTA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objetivo> getD_Tiene_O() {
		if (d_Tiene_O == null) {
			d_Tiene_O = new EObjectContainmentEList<Objetivo>(Objetivo.class, this, ProyectoDeportistaPackage.DEPORTISTA__DTIENE_O);
		}
		return d_Tiene_O;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdad(int newEdad) {
		int oldEdad = edad;
		edad = newEdad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.DEPORTISTA__EDAD, oldEdad, edad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeso(int newPeso) {
		int oldPeso = peso;
		peso = newPeso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.DEPORTISTA__PESO, oldPeso, peso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEstatura() {
		return estatura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstatura(int newEstatura) {
		int oldEstatura = estatura;
		estatura = newEstatura;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.DEPORTISTA__ESTATURA, oldEstatura, estatura));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanNutricional getD_RigePor_PN() {
		if (d_RigePor_PN != null && d_RigePor_PN.eIsProxy()) {
			InternalEObject oldD_RigePor_PN = (InternalEObject)d_RigePor_PN;
			d_RigePor_PN = (PlanNutricional)eResolveProxy(oldD_RigePor_PN);
			if (d_RigePor_PN != oldD_RigePor_PN) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProyectoDeportistaPackage.DEPORTISTA__DRIGE_POR_PN, oldD_RigePor_PN, d_RigePor_PN));
			}
		}
		return d_RigePor_PN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanNutricional basicGetD_RigePor_PN() {
		return d_RigePor_PN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetD_RigePor_PN(PlanNutricional newD_RigePor_PN, NotificationChain msgs) {
		PlanNutricional oldD_RigePor_PN = d_RigePor_PN;
		d_RigePor_PN = newD_RigePor_PN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.DEPORTISTA__DRIGE_POR_PN, oldD_RigePor_PN, newD_RigePor_PN);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD_RigePor_PN(PlanNutricional newD_RigePor_PN) {
		if (newD_RigePor_PN != d_RigePor_PN) {
			NotificationChain msgs = null;
			if (d_RigePor_PN != null)
				msgs = ((InternalEObject)d_RigePor_PN).eInverseRemove(this, ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_ASIGNADO_D, PlanNutricional.class, msgs);
			if (newD_RigePor_PN != null)
				msgs = ((InternalEObject)newD_RigePor_PN).eInverseAdd(this, ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_ASIGNADO_D, PlanNutricional.class, msgs);
			msgs = basicSetD_RigePor_PN(newD_RigePor_PN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.DEPORTISTA__DRIGE_POR_PN, newD_RigePor_PN, newD_RigePor_PN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProyectoDeportistaPackage.DEPORTISTA__DRIGE_POR_PN:
				if (d_RigePor_PN != null)
					msgs = ((InternalEObject)d_RigePor_PN).eInverseRemove(this, ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_ASIGNADO_D, PlanNutricional.class, msgs);
				return basicSetD_RigePor_PN((PlanNutricional)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProyectoDeportistaPackage.DEPORTISTA__DTIENE_O:
				return ((InternalEList<?>)getD_Tiene_O()).basicRemove(otherEnd, msgs);
			case ProyectoDeportistaPackage.DEPORTISTA__DRIGE_POR_PN:
				return basicSetD_RigePor_PN(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectoDeportistaPackage.DEPORTISTA__NOMBRE:
				return getNombre();
			case ProyectoDeportistaPackage.DEPORTISTA__DTIENE_O:
				return getD_Tiene_O();
			case ProyectoDeportistaPackage.DEPORTISTA__EDAD:
				return getEdad();
			case ProyectoDeportistaPackage.DEPORTISTA__PESO:
				return getPeso();
			case ProyectoDeportistaPackage.DEPORTISTA__ESTATURA:
				return getEstatura();
			case ProyectoDeportistaPackage.DEPORTISTA__DRIGE_POR_PN:
				if (resolve) return getD_RigePor_PN();
				return basicGetD_RigePor_PN();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProyectoDeportistaPackage.DEPORTISTA__NOMBRE:
				setNombre((String)newValue);
				return;
			case ProyectoDeportistaPackage.DEPORTISTA__DTIENE_O:
				getD_Tiene_O().clear();
				getD_Tiene_O().addAll((Collection<? extends Objetivo>)newValue);
				return;
			case ProyectoDeportistaPackage.DEPORTISTA__EDAD:
				setEdad((Integer)newValue);
				return;
			case ProyectoDeportistaPackage.DEPORTISTA__PESO:
				setPeso((Integer)newValue);
				return;
			case ProyectoDeportistaPackage.DEPORTISTA__ESTATURA:
				setEstatura((Integer)newValue);
				return;
			case ProyectoDeportistaPackage.DEPORTISTA__DRIGE_POR_PN:
				setD_RigePor_PN((PlanNutricional)newValue);
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
			case ProyectoDeportistaPackage.DEPORTISTA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ProyectoDeportistaPackage.DEPORTISTA__DTIENE_O:
				getD_Tiene_O().clear();
				return;
			case ProyectoDeportistaPackage.DEPORTISTA__EDAD:
				setEdad(EDAD_EDEFAULT);
				return;
			case ProyectoDeportistaPackage.DEPORTISTA__PESO:
				setPeso(PESO_EDEFAULT);
				return;
			case ProyectoDeportistaPackage.DEPORTISTA__ESTATURA:
				setEstatura(ESTATURA_EDEFAULT);
				return;
			case ProyectoDeportistaPackage.DEPORTISTA__DRIGE_POR_PN:
				setD_RigePor_PN((PlanNutricional)null);
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
			case ProyectoDeportistaPackage.DEPORTISTA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ProyectoDeportistaPackage.DEPORTISTA__DTIENE_O:
				return d_Tiene_O != null && !d_Tiene_O.isEmpty();
			case ProyectoDeportistaPackage.DEPORTISTA__EDAD:
				return edad != EDAD_EDEFAULT;
			case ProyectoDeportistaPackage.DEPORTISTA__PESO:
				return peso != PESO_EDEFAULT;
			case ProyectoDeportistaPackage.DEPORTISTA__ESTATURA:
				return estatura != ESTATURA_EDEFAULT;
			case ProyectoDeportistaPackage.DEPORTISTA__DRIGE_POR_PN:
				return d_RigePor_PN != null;
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", edad: ");
		result.append(edad);
		result.append(", peso: ");
		result.append(peso);
		result.append(", estatura: ");
		result.append(estatura);
		result.append(')');
		return result.toString();
	}

} //DeportistaImpl
