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

import proyectoDeportista.Comida;
import proyectoDeportista.Deportista;
import proyectoDeportista.PlanNutricional;
import proyectoDeportista.ProyectoDeportistaPackage;
import proyectoDeportista.Resultado;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Nutricional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectoDeportista.impl.PlanNutricionalImpl#getPN_Tiene_C <em>PN Tiene C</em>}</li>
 *   <li>{@link proyectoDeportista.impl.PlanNutricionalImpl#getId <em>Id</em>}</li>
 *   <li>{@link proyectoDeportista.impl.PlanNutricionalImpl#getTipoP <em>Tipo P</em>}</li>
 *   <li>{@link proyectoDeportista.impl.PlanNutricionalImpl#getPN_Tiene_R <em>PN Tiene R</em>}</li>
 *   <li>{@link proyectoDeportista.impl.PlanNutricionalImpl#getPN_asignado_D <em>PN asignado D</em>}</li>
 *   <li>{@link proyectoDeportista.impl.PlanNutricionalImpl#getMinCalorias <em>Min Calorias</em>}</li>
 *   <li>{@link proyectoDeportista.impl.PlanNutricionalImpl#getMaxCalorias <em>Max Calorias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanNutricionalImpl extends MinimalEObjectImpl.Container implements PlanNutricional {
	/**
	 * The cached value of the '{@link #getPN_Tiene_C() <em>PN Tiene C</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPN_Tiene_C()
	 * @generated
	 * @ordered
	 */
	protected EList<Comida> pN_Tiene_C;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoP() <em>Tipo P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoP()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_P_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoP() <em>Tipo P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoP()
	 * @generated
	 * @ordered
	 */
	protected String tipoP = TIPO_P_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPN_Tiene_R() <em>PN Tiene R</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPN_Tiene_R()
	 * @generated
	 * @ordered
	 */
	protected EList<Resultado> pN_Tiene_R;

	/**
	 * The cached value of the '{@link #getPN_asignado_D() <em>PN asignado D</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPN_asignado_D()
	 * @generated
	 * @ordered
	 */
	protected Deportista pN_asignado_D;

	/**
	 * The default value of the '{@link #getMinCalorias() <em>Min Calorias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCalorias()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_CALORIAS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinCalorias() <em>Min Calorias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCalorias()
	 * @generated
	 * @ordered
	 */
	protected int minCalorias = MIN_CALORIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCalorias() <em>Max Calorias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCalorias()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_CALORIAS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxCalorias() <em>Max Calorias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCalorias()
	 * @generated
	 * @ordered
	 */
	protected int maxCalorias = MAX_CALORIAS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanNutricionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectoDeportistaPackage.Literals.PLAN_NUTRICIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comida> getPN_Tiene_C() {
		if (pN_Tiene_C == null) {
			pN_Tiene_C = new EObjectContainmentEList<Comida>(Comida.class, this, ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_TIENE_C);
		}
		return pN_Tiene_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.PLAN_NUTRICIONAL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipoP() {
		return tipoP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoP(String newTipoP) {
		String oldTipoP = tipoP;
		tipoP = newTipoP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.PLAN_NUTRICIONAL__TIPO_P, oldTipoP, tipoP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resultado> getPN_Tiene_R() {
		if (pN_Tiene_R == null) {
			pN_Tiene_R = new EObjectContainmentEList<Resultado>(Resultado.class, this, ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_TIENE_R);
		}
		return pN_Tiene_R;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deportista getPN_asignado_D() {
		if (pN_asignado_D != null && pN_asignado_D.eIsProxy()) {
			InternalEObject oldPN_asignado_D = (InternalEObject)pN_asignado_D;
			pN_asignado_D = (Deportista)eResolveProxy(oldPN_asignado_D);
			if (pN_asignado_D != oldPN_asignado_D) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_ASIGNADO_D, oldPN_asignado_D, pN_asignado_D));
			}
		}
		return pN_asignado_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deportista basicGetPN_asignado_D() {
		return pN_asignado_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPN_asignado_D(Deportista newPN_asignado_D, NotificationChain msgs) {
		Deportista oldPN_asignado_D = pN_asignado_D;
		pN_asignado_D = newPN_asignado_D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_ASIGNADO_D, oldPN_asignado_D, newPN_asignado_D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPN_asignado_D(Deportista newPN_asignado_D) {
		if (newPN_asignado_D != pN_asignado_D) {
			NotificationChain msgs = null;
			if (pN_asignado_D != null)
				msgs = ((InternalEObject)pN_asignado_D).eInverseRemove(this, ProyectoDeportistaPackage.DEPORTISTA__DRIGE_POR_PN, Deportista.class, msgs);
			if (newPN_asignado_D != null)
				msgs = ((InternalEObject)newPN_asignado_D).eInverseAdd(this, ProyectoDeportistaPackage.DEPORTISTA__DRIGE_POR_PN, Deportista.class, msgs);
			msgs = basicSetPN_asignado_D(newPN_asignado_D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_ASIGNADO_D, newPN_asignado_D, newPN_asignado_D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinCalorias() {
		return minCalorias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCalorias(int newMinCalorias) {
		int oldMinCalorias = minCalorias;
		minCalorias = newMinCalorias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.PLAN_NUTRICIONAL__MIN_CALORIAS, oldMinCalorias, minCalorias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxCalorias() {
		return maxCalorias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCalorias(int newMaxCalorias) {
		int oldMaxCalorias = maxCalorias;
		maxCalorias = newMaxCalorias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.PLAN_NUTRICIONAL__MAX_CALORIAS, oldMaxCalorias, maxCalorias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_ASIGNADO_D:
				if (pN_asignado_D != null)
					msgs = ((InternalEObject)pN_asignado_D).eInverseRemove(this, ProyectoDeportistaPackage.DEPORTISTA__DRIGE_POR_PN, Deportista.class, msgs);
				return basicSetPN_asignado_D((Deportista)otherEnd, msgs);
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
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_TIENE_C:
				return ((InternalEList<?>)getPN_Tiene_C()).basicRemove(otherEnd, msgs);
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_TIENE_R:
				return ((InternalEList<?>)getPN_Tiene_R()).basicRemove(otherEnd, msgs);
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_ASIGNADO_D:
				return basicSetPN_asignado_D(null, msgs);
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
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_TIENE_C:
				return getPN_Tiene_C();
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__ID:
				return getId();
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__TIPO_P:
				return getTipoP();
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_TIENE_R:
				return getPN_Tiene_R();
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_ASIGNADO_D:
				if (resolve) return getPN_asignado_D();
				return basicGetPN_asignado_D();
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__MIN_CALORIAS:
				return getMinCalorias();
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__MAX_CALORIAS:
				return getMaxCalorias();
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
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_TIENE_C:
				getPN_Tiene_C().clear();
				getPN_Tiene_C().addAll((Collection<? extends Comida>)newValue);
				return;
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__ID:
				setId((Integer)newValue);
				return;
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__TIPO_P:
				setTipoP((String)newValue);
				return;
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_TIENE_R:
				getPN_Tiene_R().clear();
				getPN_Tiene_R().addAll((Collection<? extends Resultado>)newValue);
				return;
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_ASIGNADO_D:
				setPN_asignado_D((Deportista)newValue);
				return;
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__MIN_CALORIAS:
				setMinCalorias((Integer)newValue);
				return;
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__MAX_CALORIAS:
				setMaxCalorias((Integer)newValue);
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
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_TIENE_C:
				getPN_Tiene_C().clear();
				return;
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__ID:
				setId(ID_EDEFAULT);
				return;
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__TIPO_P:
				setTipoP(TIPO_P_EDEFAULT);
				return;
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_TIENE_R:
				getPN_Tiene_R().clear();
				return;
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_ASIGNADO_D:
				setPN_asignado_D((Deportista)null);
				return;
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__MIN_CALORIAS:
				setMinCalorias(MIN_CALORIAS_EDEFAULT);
				return;
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__MAX_CALORIAS:
				setMaxCalorias(MAX_CALORIAS_EDEFAULT);
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
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_TIENE_C:
				return pN_Tiene_C != null && !pN_Tiene_C.isEmpty();
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__ID:
				return id != ID_EDEFAULT;
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__TIPO_P:
				return TIPO_P_EDEFAULT == null ? tipoP != null : !TIPO_P_EDEFAULT.equals(tipoP);
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_TIENE_R:
				return pN_Tiene_R != null && !pN_Tiene_R.isEmpty();
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__PN_ASIGNADO_D:
				return pN_asignado_D != null;
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__MIN_CALORIAS:
				return minCalorias != MIN_CALORIAS_EDEFAULT;
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL__MAX_CALORIAS:
				return maxCalorias != MAX_CALORIAS_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", tipoP: ");
		result.append(tipoP);
		result.append(", minCalorias: ");
		result.append(minCalorias);
		result.append(", maxCalorias: ");
		result.append(maxCalorias);
		result.append(')');
		return result.toString();
	}

} //PlanNutricionalImpl
