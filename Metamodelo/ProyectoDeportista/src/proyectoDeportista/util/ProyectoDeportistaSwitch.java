/**
 */
package proyectoDeportista.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import proyectoDeportista.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see proyectoDeportista.ProyectoDeportistaPackage
 * @generated
 */
public class ProyectoDeportistaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProyectoDeportistaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectoDeportistaSwitch() {
		if (modelPackage == null) {
			modelPackage = ProyectoDeportistaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProyectoDeportistaPackage.REPRESENTACION: {
				Representacion representacion = (Representacion)theEObject;
				T result = caseRepresentacion(representacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectoDeportistaPackage.DEPORTISTA: {
				Deportista deportista = (Deportista)theEObject;
				T result = caseDeportista(deportista);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL: {
				PlanNutricional planNutricional = (PlanNutricional)theEObject;
				T result = casePlanNutricional(planNutricional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectoDeportistaPackage.COMIDA: {
				Comida comida = (Comida)theEObject;
				T result = caseComida(comida);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectoDeportistaPackage.OBJETIVO: {
				Objetivo objetivo = (Objetivo)theEObject;
				T result = caseObjetivo(objetivo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectoDeportistaPackage.NUTRIENTE: {
				Nutriente nutriente = (Nutriente)theEObject;
				T result = caseNutriente(nutriente);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectoDeportistaPackage.RESULTADO: {
				Resultado resultado = (Resultado)theEObject;
				T result = caseResultado(resultado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentacion(Representacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deportista</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deportista</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeportista(Deportista object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Nutricional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Nutricional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanNutricional(PlanNutricional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comida</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comida</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComida(Comida object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objetivo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objetivo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjetivo(Objetivo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutriente</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutriente</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutriente(Nutriente object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resultado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resultado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultado(Resultado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProyectoDeportistaSwitch
