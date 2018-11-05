/**
 */
package proyectoDeportista.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import proyectoDeportista.Comida;
import proyectoDeportista.Deportista;
import proyectoDeportista.NType;
import proyectoDeportista.Nutriente;
import proyectoDeportista.Objetivo;
import proyectoDeportista.PlanNutricional;
import proyectoDeportista.ProyectoDeportistaFactory;
import proyectoDeportista.ProyectoDeportistaPackage;
import proyectoDeportista.Representacion;
import proyectoDeportista.Resultado;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProyectoDeportistaPackageImpl extends EPackageImpl implements ProyectoDeportistaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deportistaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planNutricionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comidaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objetivoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutrienteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see proyectoDeportista.ProyectoDeportistaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProyectoDeportistaPackageImpl() {
		super(eNS_URI, ProyectoDeportistaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ProyectoDeportistaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProyectoDeportistaPackage init() {
		if (isInited) return (ProyectoDeportistaPackage)EPackage.Registry.INSTANCE.getEPackage(ProyectoDeportistaPackage.eNS_URI);

		// Obtain or create and register package
		ProyectoDeportistaPackageImpl theProyectoDeportistaPackage = (ProyectoDeportistaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProyectoDeportistaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProyectoDeportistaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theProyectoDeportistaPackage.createPackageContents();

		// Initialize created meta-data
		theProyectoDeportistaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProyectoDeportistaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProyectoDeportistaPackage.eNS_URI, theProyectoDeportistaPackage);
		return theProyectoDeportistaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentacion() {
		return representacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentacion_R_Tiene_D() {
		return (EReference)representacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentacion_R_Tiene_PN() {
		return (EReference)representacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentacion_R_Tiene_O() {
		return (EReference)representacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentacion_R_Tiene_C() {
		return (EReference)representacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentacion_R_Tiene_N() {
		return (EReference)representacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeportista() {
		return deportistaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeportista_Nombre() {
		return (EAttribute)deportistaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeportista_D_Tiene_O() {
		return (EReference)deportistaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeportista_Edad() {
		return (EAttribute)deportistaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeportista_Peso() {
		return (EAttribute)deportistaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeportista_Estatura() {
		return (EAttribute)deportistaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeportista_D_RigePor_PN() {
		return (EReference)deportistaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanNutricional() {
		return planNutricionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanNutricional_PN_Tiene_C() {
		return (EReference)planNutricionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanNutricional_Id() {
		return (EAttribute)planNutricionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanNutricional_TipoP() {
		return (EAttribute)planNutricionalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanNutricional_PN_Tiene_R() {
		return (EReference)planNutricionalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanNutricional_PN_asignado_D() {
		return (EReference)planNutricionalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanNutricional_MinCalorias() {
		return (EAttribute)planNutricionalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanNutricional_MaxCalorias() {
		return (EAttribute)planNutricionalEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComida() {
		return comidaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComida_C_Tiene_N() {
		return (EReference)comidaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComida_NCalorias() {
		return (EAttribute)comidaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComida_Momento_dia() {
		return (EAttribute)comidaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComida_C_Asociado_PN() {
		return (EReference)comidaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjetivo() {
		return objetivoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjetivo_Tipo() {
		return (EAttribute)objetivoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjetivo_Cantidad() {
		return (EAttribute)objetivoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutriente() {
		return nutrienteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNutriente_NombreN() {
		return (EAttribute)nutrienteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNutriente_Cantidad() {
		return (EAttribute)nutrienteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultado() {
		return resultadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultado_Cantidad() {
		return (EAttribute)resultadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNType() {
		return nTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectoDeportistaFactory getProyectoDeportistaFactory() {
		return (ProyectoDeportistaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		representacionEClass = createEClass(REPRESENTACION);
		createEReference(representacionEClass, REPRESENTACION__RTIENE_D);
		createEReference(representacionEClass, REPRESENTACION__RTIENE_PN);
		createEReference(representacionEClass, REPRESENTACION__RTIENE_O);
		createEReference(representacionEClass, REPRESENTACION__RTIENE_C);
		createEReference(representacionEClass, REPRESENTACION__RTIENE_N);

		deportistaEClass = createEClass(DEPORTISTA);
		createEAttribute(deportistaEClass, DEPORTISTA__NOMBRE);
		createEReference(deportistaEClass, DEPORTISTA__DTIENE_O);
		createEAttribute(deportistaEClass, DEPORTISTA__EDAD);
		createEAttribute(deportistaEClass, DEPORTISTA__PESO);
		createEAttribute(deportistaEClass, DEPORTISTA__ESTATURA);
		createEReference(deportistaEClass, DEPORTISTA__DRIGE_POR_PN);

		planNutricionalEClass = createEClass(PLAN_NUTRICIONAL);
		createEReference(planNutricionalEClass, PLAN_NUTRICIONAL__PN_TIENE_C);
		createEAttribute(planNutricionalEClass, PLAN_NUTRICIONAL__ID);
		createEAttribute(planNutricionalEClass, PLAN_NUTRICIONAL__TIPO_P);
		createEReference(planNutricionalEClass, PLAN_NUTRICIONAL__PN_TIENE_R);
		createEReference(planNutricionalEClass, PLAN_NUTRICIONAL__PN_ASIGNADO_D);
		createEAttribute(planNutricionalEClass, PLAN_NUTRICIONAL__MIN_CALORIAS);
		createEAttribute(planNutricionalEClass, PLAN_NUTRICIONAL__MAX_CALORIAS);

		comidaEClass = createEClass(COMIDA);
		createEReference(comidaEClass, COMIDA__CTIENE_N);
		createEAttribute(comidaEClass, COMIDA__NCALORIAS);
		createEAttribute(comidaEClass, COMIDA__MOMENTO_DIA);
		createEReference(comidaEClass, COMIDA__CASOCIADO_PN);

		objetivoEClass = createEClass(OBJETIVO);
		createEAttribute(objetivoEClass, OBJETIVO__TIPO);
		createEAttribute(objetivoEClass, OBJETIVO__CANTIDAD);

		nutrienteEClass = createEClass(NUTRIENTE);
		createEAttribute(nutrienteEClass, NUTRIENTE__NOMBRE_N);
		createEAttribute(nutrienteEClass, NUTRIENTE__CANTIDAD);

		resultadoEClass = createEClass(RESULTADO);
		createEAttribute(resultadoEClass, RESULTADO__CANTIDAD);

		// Create enums
		nTypeEEnum = createEEnum(NTYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(representacionEClass, Representacion.class, "Representacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepresentacion_R_Tiene_D(), this.getDeportista(), null, "R_Tiene_D", null, 0, -1, Representacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentacion_R_Tiene_PN(), this.getPlanNutricional(), null, "R_Tiene_PN", null, 0, -1, Representacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentacion_R_Tiene_O(), this.getObjetivo(), null, "R_Tiene_O", null, 0, -1, Representacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentacion_R_Tiene_C(), this.getComida(), null, "R_Tiene_C", null, 0, -1, Representacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentacion_R_Tiene_N(), this.getNutriente(), null, "R_Tiene_N", null, 0, -1, Representacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deportistaEClass, Deportista.class, "Deportista", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeportista_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Deportista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeportista_D_Tiene_O(), this.getObjetivo(), null, "D_Tiene_O", null, 1, -1, Deportista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeportista_Edad(), ecorePackage.getEInt(), "edad", null, 0, 1, Deportista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeportista_Peso(), ecorePackage.getEInt(), "peso", null, 0, 1, Deportista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeportista_Estatura(), ecorePackage.getEInt(), "estatura", null, 0, 1, Deportista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeportista_D_RigePor_PN(), this.getPlanNutricional(), this.getPlanNutricional_PN_asignado_D(), "D_RigePor_PN", null, 1, 1, Deportista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planNutricionalEClass, PlanNutricional.class, "PlanNutricional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlanNutricional_PN_Tiene_C(), this.getComida(), null, "PN_Tiene_C", null, 3, 6, PlanNutricional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanNutricional_Id(), ecorePackage.getEInt(), "id", null, 0, 1, PlanNutricional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanNutricional_TipoP(), ecorePackage.getEString(), "tipoP", null, 0, 1, PlanNutricional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanNutricional_PN_Tiene_R(), this.getResultado(), null, "PN_Tiene_R", null, 0, -1, PlanNutricional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanNutricional_PN_asignado_D(), this.getDeportista(), this.getDeportista_D_RigePor_PN(), "PN_asignado_D", null, 1, 1, PlanNutricional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanNutricional_MinCalorias(), ecorePackage.getEInt(), "minCalorias", null, 0, 1, PlanNutricional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanNutricional_MaxCalorias(), ecorePackage.getEInt(), "maxCalorias", null, 0, 1, PlanNutricional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comidaEClass, Comida.class, "Comida", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComida_C_Tiene_N(), this.getNutriente(), null, "C_Tiene_N", null, 1, -1, Comida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComida_NCalorias(), ecorePackage.getEInt(), "nCalorias", null, 0, 1, Comida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComida_Momento_dia(), ecorePackage.getEString(), "momento_dia", null, 0, 1, Comida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComida_C_Asociado_PN(), this.getPlanNutricional(), null, "C_Asociado_PN", null, 0, 1, Comida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objetivoEClass, Objetivo.class, "Objetivo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjetivo_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, Objetivo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjetivo_Cantidad(), ecorePackage.getEInt(), "cantidad", null, 0, 1, Objetivo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nutrienteEClass, Nutriente.class, "Nutriente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNutriente_NombreN(), this.getNType(), "nombreN", "Proteina", 0, 1, Nutriente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNutriente_Cantidad(), ecorePackage.getEInt(), "cantidad", null, 0, 1, Nutriente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultadoEClass, Resultado.class, "Resultado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultado_Cantidad(), ecorePackage.getEInt(), "cantidad", null, 0, 1, Resultado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nTypeEEnum, NType.class, "NType");
		addEEnumLiteral(nTypeEEnum, NType.PROTEINA);
		addEEnumLiteral(nTypeEEnum, NType.GRASA);
		addEEnumLiteral(nTypeEEnum, NType.CARBOHIDRATO);

		// Create resource
		createResource(eNS_URI);
	}

} //ProyectoDeportistaPackageImpl
