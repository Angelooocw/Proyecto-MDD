/**
 */
package proyectoDeportista;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see proyectoDeportista.ProyectoDeportistaPackage
 * @generated
 */
public interface ProyectoDeportistaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProyectoDeportistaFactory eINSTANCE = proyectoDeportista.impl.ProyectoDeportistaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Representacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representacion</em>'.
	 * @generated
	 */
	Representacion createRepresentacion();

	/**
	 * Returns a new object of class '<em>Deportista</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deportista</em>'.
	 * @generated
	 */
	Deportista createDeportista();

	/**
	 * Returns a new object of class '<em>Plan Nutricional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Nutricional</em>'.
	 * @generated
	 */
	PlanNutricional createPlanNutricional();

	/**
	 * Returns a new object of class '<em>Comida</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comida</em>'.
	 * @generated
	 */
	Comida createComida();

	/**
	 * Returns a new object of class '<em>Objetivo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objetivo</em>'.
	 * @generated
	 */
	Objetivo createObjetivo();

	/**
	 * Returns a new object of class '<em>Nutriente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutriente</em>'.
	 * @generated
	 */
	Nutriente createNutriente();

	/**
	 * Returns a new object of class '<em>Resultado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resultado</em>'.
	 * @generated
	 */
	Resultado createResultado();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProyectoDeportistaPackage getProyectoDeportistaPackage();

} //ProyectoDeportistaFactory
