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
import proyectoDeportista.Nutriente;
import proyectoDeportista.PlanNutricional;
import proyectoDeportista.ProyectoDeportistaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comida</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectoDeportista.impl.ComidaImpl#getC_Tiene_N <em>CTiene N</em>}</li>
 *   <li>{@link proyectoDeportista.impl.ComidaImpl#getNCalorias <em>NCalorias</em>}</li>
 *   <li>{@link proyectoDeportista.impl.ComidaImpl#getMomento_dia <em>Momento dia</em>}</li>
 *   <li>{@link proyectoDeportista.impl.ComidaImpl#getC_Asociado_PN <em>CAsociado PN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComidaImpl extends MinimalEObjectImpl.Container implements Comida {
	/**
	 * The cached value of the '{@link #getC_Tiene_N() <em>CTiene N</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC_Tiene_N()
	 * @generated
	 * @ordered
	 */
	protected EList<Nutriente> c_Tiene_N;

	/**
	 * The default value of the '{@link #getNCalorias() <em>NCalorias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNCalorias()
	 * @generated
	 * @ordered
	 */
	protected static final int NCALORIAS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNCalorias() <em>NCalorias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNCalorias()
	 * @generated
	 * @ordered
	 */
	protected int nCalorias = NCALORIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMomento_dia() <em>Momento dia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomento_dia()
	 * @generated
	 * @ordered
	 */
	protected static final String MOMENTO_DIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMomento_dia() <em>Momento dia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomento_dia()
	 * @generated
	 * @ordered
	 */
	protected String momento_dia = MOMENTO_DIA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getC_Asociado_PN() <em>CAsociado PN</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC_Asociado_PN()
	 * @generated
	 * @ordered
	 */
	protected PlanNutricional c_Asociado_PN;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComidaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectoDeportistaPackage.Literals.COMIDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nutriente> getC_Tiene_N() {
		if (c_Tiene_N == null) {
			c_Tiene_N = new EObjectContainmentEList<Nutriente>(Nutriente.class, this, ProyectoDeportistaPackage.COMIDA__CTIENE_N);
		}
		return c_Tiene_N;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNCalorias() {
		return nCalorias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNCalorias(int newNCalorias) {
		int oldNCalorias = nCalorias;
		nCalorias = newNCalorias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.COMIDA__NCALORIAS, oldNCalorias, nCalorias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMomento_dia() {
		return momento_dia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomento_dia(String newMomento_dia) {
		String oldMomento_dia = momento_dia;
		momento_dia = newMomento_dia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.COMIDA__MOMENTO_DIA, oldMomento_dia, momento_dia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanNutricional getC_Asociado_PN() {
		if (c_Asociado_PN != null && c_Asociado_PN.eIsProxy()) {
			InternalEObject oldC_Asociado_PN = (InternalEObject)c_Asociado_PN;
			c_Asociado_PN = (PlanNutricional)eResolveProxy(oldC_Asociado_PN);
			if (c_Asociado_PN != oldC_Asociado_PN) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProyectoDeportistaPackage.COMIDA__CASOCIADO_PN, oldC_Asociado_PN, c_Asociado_PN));
			}
		}
		return c_Asociado_PN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanNutricional basicGetC_Asociado_PN() {
		return c_Asociado_PN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC_Asociado_PN(PlanNutricional newC_Asociado_PN) {
		PlanNutricional oldC_Asociado_PN = c_Asociado_PN;
		c_Asociado_PN = newC_Asociado_PN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoDeportistaPackage.COMIDA__CASOCIADO_PN, oldC_Asociado_PN, c_Asociado_PN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProyectoDeportistaPackage.COMIDA__CTIENE_N:
				return ((InternalEList<?>)getC_Tiene_N()).basicRemove(otherEnd, msgs);
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
			case ProyectoDeportistaPackage.COMIDA__CTIENE_N:
				return getC_Tiene_N();
			case ProyectoDeportistaPackage.COMIDA__NCALORIAS:
				return getNCalorias();
			case ProyectoDeportistaPackage.COMIDA__MOMENTO_DIA:
				return getMomento_dia();
			case ProyectoDeportistaPackage.COMIDA__CASOCIADO_PN:
				if (resolve) return getC_Asociado_PN();
				return basicGetC_Asociado_PN();
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
			case ProyectoDeportistaPackage.COMIDA__CTIENE_N:
				getC_Tiene_N().clear();
				getC_Tiene_N().addAll((Collection<? extends Nutriente>)newValue);
				return;
			case ProyectoDeportistaPackage.COMIDA__NCALORIAS:
				setNCalorias((Integer)newValue);
				return;
			case ProyectoDeportistaPackage.COMIDA__MOMENTO_DIA:
				setMomento_dia((String)newValue);
				return;
			case ProyectoDeportistaPackage.COMIDA__CASOCIADO_PN:
				setC_Asociado_PN((PlanNutricional)newValue);
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
			case ProyectoDeportistaPackage.COMIDA__CTIENE_N:
				getC_Tiene_N().clear();
				return;
			case ProyectoDeportistaPackage.COMIDA__NCALORIAS:
				setNCalorias(NCALORIAS_EDEFAULT);
				return;
			case ProyectoDeportistaPackage.COMIDA__MOMENTO_DIA:
				setMomento_dia(MOMENTO_DIA_EDEFAULT);
				return;
			case ProyectoDeportistaPackage.COMIDA__CASOCIADO_PN:
				setC_Asociado_PN((PlanNutricional)null);
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
			case ProyectoDeportistaPackage.COMIDA__CTIENE_N:
				return c_Tiene_N != null && !c_Tiene_N.isEmpty();
			case ProyectoDeportistaPackage.COMIDA__NCALORIAS:
				return nCalorias != NCALORIAS_EDEFAULT;
			case ProyectoDeportistaPackage.COMIDA__MOMENTO_DIA:
				return MOMENTO_DIA_EDEFAULT == null ? momento_dia != null : !MOMENTO_DIA_EDEFAULT.equals(momento_dia);
			case ProyectoDeportistaPackage.COMIDA__CASOCIADO_PN:
				return c_Asociado_PN != null;
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
		result.append(" (nCalorias: ");
		result.append(nCalorias);
		result.append(", momento_dia: ");
		result.append(momento_dia);
		result.append(')');
		return result.toString();
	}

} //ComidaImpl
