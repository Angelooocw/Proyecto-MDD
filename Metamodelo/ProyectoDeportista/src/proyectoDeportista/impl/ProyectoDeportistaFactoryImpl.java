/**
 */
package proyectoDeportista.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import proyectoDeportista.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProyectoDeportistaFactoryImpl extends EFactoryImpl implements ProyectoDeportistaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProyectoDeportistaFactory init() {
		try {
			ProyectoDeportistaFactory theProyectoDeportistaFactory = (ProyectoDeportistaFactory)EPackage.Registry.INSTANCE.getEFactory(ProyectoDeportistaPackage.eNS_URI);
			if (theProyectoDeportistaFactory != null) {
				return theProyectoDeportistaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProyectoDeportistaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectoDeportistaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProyectoDeportistaPackage.REPRESENTACION: return createRepresentacion();
			case ProyectoDeportistaPackage.DEPORTISTA: return createDeportista();
			case ProyectoDeportistaPackage.PLAN_NUTRICIONAL: return createPlanNutricional();
			case ProyectoDeportistaPackage.COMIDA: return createComida();
			case ProyectoDeportistaPackage.OBJETIVO: return createObjetivo();
			case ProyectoDeportistaPackage.NUTRIENTE: return createNutriente();
			case ProyectoDeportistaPackage.RESULTADO: return createResultado();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ProyectoDeportistaPackage.NTYPE:
				return createNTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ProyectoDeportistaPackage.NTYPE:
				return convertNTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Representacion createRepresentacion() {
		RepresentacionImpl representacion = new RepresentacionImpl();
		return representacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deportista createDeportista() {
		DeportistaImpl deportista = new DeportistaImpl();
		return deportista;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanNutricional createPlanNutricional() {
		PlanNutricionalImpl planNutricional = new PlanNutricionalImpl();
		return planNutricional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comida createComida() {
		ComidaImpl comida = new ComidaImpl();
		return comida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objetivo createObjetivo() {
		ObjetivoImpl objetivo = new ObjetivoImpl();
		return objetivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nutriente createNutriente() {
		NutrienteImpl nutriente = new NutrienteImpl();
		return nutriente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resultado createResultado() {
		ResultadoImpl resultado = new ResultadoImpl();
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NType createNTypeFromString(EDataType eDataType, String initialValue) {
		NType result = NType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectoDeportistaPackage getProyectoDeportistaPackage() {
		return (ProyectoDeportistaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProyectoDeportistaPackage getPackage() {
		return ProyectoDeportistaPackage.eINSTANCE;
	}

} //ProyectoDeportistaFactoryImpl
