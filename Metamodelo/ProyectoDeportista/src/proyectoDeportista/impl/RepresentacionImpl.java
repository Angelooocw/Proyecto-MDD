/**
 */
package proyectoDeportista.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import proyectoDeportista.Comida;
import proyectoDeportista.Deportista;
import proyectoDeportista.Nutriente;
import proyectoDeportista.Objetivo;
import proyectoDeportista.PlanNutricional;
import proyectoDeportista.ProyectoDeportistaPackage;
import proyectoDeportista.Representacion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Representacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectoDeportista.impl.RepresentacionImpl#getR_Tiene_D <em>RTiene D</em>}</li>
 *   <li>{@link proyectoDeportista.impl.RepresentacionImpl#getR_Tiene_PN <em>RTiene PN</em>}</li>
 *   <li>{@link proyectoDeportista.impl.RepresentacionImpl#getR_Tiene_O <em>RTiene O</em>}</li>
 *   <li>{@link proyectoDeportista.impl.RepresentacionImpl#getR_Tiene_C <em>RTiene C</em>}</li>
 *   <li>{@link proyectoDeportista.impl.RepresentacionImpl#getR_Tiene_N <em>RTiene N</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepresentacionImpl extends MinimalEObjectImpl.Container implements Representacion {
	/**
	 * The cached value of the '{@link #getR_Tiene_D() <em>RTiene D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR_Tiene_D()
	 * @generated
	 * @ordered
	 */
	protected EList<Deportista> r_Tiene_D;

	/**
	 * The cached value of the '{@link #getR_Tiene_PN() <em>RTiene PN</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR_Tiene_PN()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanNutricional> r_Tiene_PN;

	/**
	 * The cached value of the '{@link #getR_Tiene_O() <em>RTiene O</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR_Tiene_O()
	 * @generated
	 * @ordered
	 */
	protected EList<Objetivo> r_Tiene_O;

	/**
	 * The cached value of the '{@link #getR_Tiene_C() <em>RTiene C</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR_Tiene_C()
	 * @generated
	 * @ordered
	 */
	protected EList<Comida> r_Tiene_C;

	/**
	 * The cached value of the '{@link #getR_Tiene_N() <em>RTiene N</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR_Tiene_N()
	 * @generated
	 * @ordered
	 */
	protected EList<Nutriente> r_Tiene_N;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectoDeportistaPackage.Literals.REPRESENTACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deportista> getR_Tiene_D() {
		if (r_Tiene_D == null) {
			r_Tiene_D = new EObjectContainmentEList<Deportista>(Deportista.class, this, ProyectoDeportistaPackage.REPRESENTACION__RTIENE_D);
		}
		return r_Tiene_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlanNutricional> getR_Tiene_PN() {
		if (r_Tiene_PN == null) {
			r_Tiene_PN = new EObjectContainmentEList<PlanNutricional>(PlanNutricional.class, this, ProyectoDeportistaPackage.REPRESENTACION__RTIENE_PN);
		}
		return r_Tiene_PN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objetivo> getR_Tiene_O() {
		if (r_Tiene_O == null) {
			r_Tiene_O = new EObjectContainmentEList<Objetivo>(Objetivo.class, this, ProyectoDeportistaPackage.REPRESENTACION__RTIENE_O);
		}
		return r_Tiene_O;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comida> getR_Tiene_C() {
		if (r_Tiene_C == null) {
			r_Tiene_C = new EObjectContainmentEList<Comida>(Comida.class, this, ProyectoDeportistaPackage.REPRESENTACION__RTIENE_C);
		}
		return r_Tiene_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nutriente> getR_Tiene_N() {
		if (r_Tiene_N == null) {
			r_Tiene_N = new EObjectContainmentEList<Nutriente>(Nutriente.class, this, ProyectoDeportistaPackage.REPRESENTACION__RTIENE_N);
		}
		return r_Tiene_N;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_D:
				return ((InternalEList<?>)getR_Tiene_D()).basicRemove(otherEnd, msgs);
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_PN:
				return ((InternalEList<?>)getR_Tiene_PN()).basicRemove(otherEnd, msgs);
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_O:
				return ((InternalEList<?>)getR_Tiene_O()).basicRemove(otherEnd, msgs);
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_C:
				return ((InternalEList<?>)getR_Tiene_C()).basicRemove(otherEnd, msgs);
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_N:
				return ((InternalEList<?>)getR_Tiene_N()).basicRemove(otherEnd, msgs);
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
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_D:
				return getR_Tiene_D();
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_PN:
				return getR_Tiene_PN();
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_O:
				return getR_Tiene_O();
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_C:
				return getR_Tiene_C();
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_N:
				return getR_Tiene_N();
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
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_D:
				getR_Tiene_D().clear();
				getR_Tiene_D().addAll((Collection<? extends Deportista>)newValue);
				return;
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_PN:
				getR_Tiene_PN().clear();
				getR_Tiene_PN().addAll((Collection<? extends PlanNutricional>)newValue);
				return;
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_O:
				getR_Tiene_O().clear();
				getR_Tiene_O().addAll((Collection<? extends Objetivo>)newValue);
				return;
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_C:
				getR_Tiene_C().clear();
				getR_Tiene_C().addAll((Collection<? extends Comida>)newValue);
				return;
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_N:
				getR_Tiene_N().clear();
				getR_Tiene_N().addAll((Collection<? extends Nutriente>)newValue);
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
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_D:
				getR_Tiene_D().clear();
				return;
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_PN:
				getR_Tiene_PN().clear();
				return;
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_O:
				getR_Tiene_O().clear();
				return;
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_C:
				getR_Tiene_C().clear();
				return;
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_N:
				getR_Tiene_N().clear();
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
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_D:
				return r_Tiene_D != null && !r_Tiene_D.isEmpty();
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_PN:
				return r_Tiene_PN != null && !r_Tiene_PN.isEmpty();
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_O:
				return r_Tiene_O != null && !r_Tiene_O.isEmpty();
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_C:
				return r_Tiene_C != null && !r_Tiene_C.isEmpty();
			case ProyectoDeportistaPackage.REPRESENTACION__RTIENE_N:
				return r_Tiene_N != null && !r_Tiene_N.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RepresentacionImpl
