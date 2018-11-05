/**
 */
package proyectoDeportista.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import proyectoDeportista.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see proyectoDeportista.ProyectoDeportistaPackage
 * @generated
 */
public class ProyectoDeportistaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProyectoDeportistaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectoDeportistaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProyectoDeportistaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProyectoDeportistaSwitch<Adapter> modelSwitch =
		new ProyectoDeportistaSwitch<Adapter>() {
			@Override
			public Adapter caseRepresentacion(Representacion object) {
				return createRepresentacionAdapter();
			}
			@Override
			public Adapter caseDeportista(Deportista object) {
				return createDeportistaAdapter();
			}
			@Override
			public Adapter casePlanNutricional(PlanNutricional object) {
				return createPlanNutricionalAdapter();
			}
			@Override
			public Adapter caseComida(Comida object) {
				return createComidaAdapter();
			}
			@Override
			public Adapter caseObjetivo(Objetivo object) {
				return createObjetivoAdapter();
			}
			@Override
			public Adapter caseNutriente(Nutriente object) {
				return createNutrienteAdapter();
			}
			@Override
			public Adapter caseResultado(Resultado object) {
				return createResultadoAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link proyectoDeportista.Representacion <em>Representacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectoDeportista.Representacion
	 * @generated
	 */
	public Adapter createRepresentacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectoDeportista.Deportista <em>Deportista</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectoDeportista.Deportista
	 * @generated
	 */
	public Adapter createDeportistaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectoDeportista.PlanNutricional <em>Plan Nutricional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectoDeportista.PlanNutricional
	 * @generated
	 */
	public Adapter createPlanNutricionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectoDeportista.Comida <em>Comida</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectoDeportista.Comida
	 * @generated
	 */
	public Adapter createComidaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectoDeportista.Objetivo <em>Objetivo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectoDeportista.Objetivo
	 * @generated
	 */
	public Adapter createObjetivoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectoDeportista.Nutriente <em>Nutriente</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectoDeportista.Nutriente
	 * @generated
	 */
	public Adapter createNutrienteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectoDeportista.Resultado <em>Resultado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectoDeportista.Resultado
	 * @generated
	 */
	public Adapter createResultadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProyectoDeportistaAdapterFactory
