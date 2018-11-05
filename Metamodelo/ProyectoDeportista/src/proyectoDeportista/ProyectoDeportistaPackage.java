/**
 */
package proyectoDeportista;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see proyectoDeportista.ProyectoDeportistaFactory
 * @model kind="package"
 * @generated
 */
public interface ProyectoDeportistaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "proyectoDeportista";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/proyectoDeportista";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "proyectoDeportista";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProyectoDeportistaPackage eINSTANCE = proyectoDeportista.impl.ProyectoDeportistaPackageImpl.init();

	/**
	 * The meta object id for the '{@link proyectoDeportista.impl.RepresentacionImpl <em>Representacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectoDeportista.impl.RepresentacionImpl
	 * @see proyectoDeportista.impl.ProyectoDeportistaPackageImpl#getRepresentacion()
	 * @generated
	 */
	int REPRESENTACION = 0;

	/**
	 * The feature id for the '<em><b>RTiene D</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTACION__RTIENE_D = 0;

	/**
	 * The feature id for the '<em><b>RTiene PN</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTACION__RTIENE_PN = 1;

	/**
	 * The feature id for the '<em><b>RTiene O</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTACION__RTIENE_O = 2;

	/**
	 * The feature id for the '<em><b>RTiene C</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTACION__RTIENE_C = 3;

	/**
	 * The feature id for the '<em><b>RTiene N</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTACION__RTIENE_N = 4;

	/**
	 * The number of structural features of the '<em>Representacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTACION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Representacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link proyectoDeportista.impl.DeportistaImpl <em>Deportista</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectoDeportista.impl.DeportistaImpl
	 * @see proyectoDeportista.impl.ProyectoDeportistaPackageImpl#getDeportista()
	 * @generated
	 */
	int DEPORTISTA = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPORTISTA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>DTiene O</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPORTISTA__DTIENE_O = 1;

	/**
	 * The feature id for the '<em><b>Edad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPORTISTA__EDAD = 2;

	/**
	 * The feature id for the '<em><b>Peso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPORTISTA__PESO = 3;

	/**
	 * The feature id for the '<em><b>Estatura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPORTISTA__ESTATURA = 4;

	/**
	 * The feature id for the '<em><b>DRige Por PN</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPORTISTA__DRIGE_POR_PN = 5;

	/**
	 * The number of structural features of the '<em>Deportista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPORTISTA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Deportista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPORTISTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link proyectoDeportista.impl.PlanNutricionalImpl <em>Plan Nutricional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectoDeportista.impl.PlanNutricionalImpl
	 * @see proyectoDeportista.impl.ProyectoDeportistaPackageImpl#getPlanNutricional()
	 * @generated
	 */
	int PLAN_NUTRICIONAL = 2;

	/**
	 * The feature id for the '<em><b>PN Tiene C</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_NUTRICIONAL__PN_TIENE_C = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_NUTRICIONAL__ID = 1;

	/**
	 * The feature id for the '<em><b>Tipo P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_NUTRICIONAL__TIPO_P = 2;

	/**
	 * The feature id for the '<em><b>PN Tiene R</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_NUTRICIONAL__PN_TIENE_R = 3;

	/**
	 * The feature id for the '<em><b>PN asignado D</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_NUTRICIONAL__PN_ASIGNADO_D = 4;

	/**
	 * The feature id for the '<em><b>Min Calorias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_NUTRICIONAL__MIN_CALORIAS = 5;

	/**
	 * The feature id for the '<em><b>Max Calorias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_NUTRICIONAL__MAX_CALORIAS = 6;

	/**
	 * The number of structural features of the '<em>Plan Nutricional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_NUTRICIONAL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Plan Nutricional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_NUTRICIONAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link proyectoDeportista.impl.ComidaImpl <em>Comida</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectoDeportista.impl.ComidaImpl
	 * @see proyectoDeportista.impl.ProyectoDeportistaPackageImpl#getComida()
	 * @generated
	 */
	int COMIDA = 3;

	/**
	 * The feature id for the '<em><b>CTiene N</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMIDA__CTIENE_N = 0;

	/**
	 * The feature id for the '<em><b>NCalorias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMIDA__NCALORIAS = 1;

	/**
	 * The feature id for the '<em><b>Momento dia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMIDA__MOMENTO_DIA = 2;

	/**
	 * The feature id for the '<em><b>CAsociado PN</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMIDA__CASOCIADO_PN = 3;

	/**
	 * The number of structural features of the '<em>Comida</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMIDA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Comida</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMIDA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link proyectoDeportista.impl.ObjetivoImpl <em>Objetivo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectoDeportista.impl.ObjetivoImpl
	 * @see proyectoDeportista.impl.ProyectoDeportistaPackageImpl#getObjetivo()
	 * @generated
	 */
	int OBJETIVO = 4;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETIVO__TIPO = 0;

	/**
	 * The feature id for the '<em><b>Cantidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETIVO__CANTIDAD = 1;

	/**
	 * The number of structural features of the '<em>Objetivo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETIVO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Objetivo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETIVO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link proyectoDeportista.impl.NutrienteImpl <em>Nutriente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectoDeportista.impl.NutrienteImpl
	 * @see proyectoDeportista.impl.ProyectoDeportistaPackageImpl#getNutriente()
	 * @generated
	 */
	int NUTRIENTE = 5;

	/**
	 * The feature id for the '<em><b>Nombre N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRIENTE__NOMBRE_N = 0;

	/**
	 * The feature id for the '<em><b>Cantidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRIENTE__CANTIDAD = 1;

	/**
	 * The number of structural features of the '<em>Nutriente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRIENTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Nutriente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRIENTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link proyectoDeportista.impl.ResultadoImpl <em>Resultado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectoDeportista.impl.ResultadoImpl
	 * @see proyectoDeportista.impl.ProyectoDeportistaPackageImpl#getResultado()
	 * @generated
	 */
	int RESULTADO = 6;

	/**
	 * The feature id for the '<em><b>Cantidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTADO__CANTIDAD = 0;

	/**
	 * The number of structural features of the '<em>Resultado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTADO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resultado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTADO_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link proyectoDeportista.NType <em>NType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectoDeportista.NType
	 * @see proyectoDeportista.impl.ProyectoDeportistaPackageImpl#getNType()
	 * @generated
	 */
	int NTYPE = 7;


	/**
	 * Returns the meta object for class '{@link proyectoDeportista.Representacion <em>Representacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representacion</em>'.
	 * @see proyectoDeportista.Representacion
	 * @generated
	 */
	EClass getRepresentacion();

	/**
	 * Returns the meta object for the containment reference list '{@link proyectoDeportista.Representacion#getR_Tiene_D <em>RTiene D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RTiene D</em>'.
	 * @see proyectoDeportista.Representacion#getR_Tiene_D()
	 * @see #getRepresentacion()
	 * @generated
	 */
	EReference getRepresentacion_R_Tiene_D();

	/**
	 * Returns the meta object for the containment reference list '{@link proyectoDeportista.Representacion#getR_Tiene_PN <em>RTiene PN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RTiene PN</em>'.
	 * @see proyectoDeportista.Representacion#getR_Tiene_PN()
	 * @see #getRepresentacion()
	 * @generated
	 */
	EReference getRepresentacion_R_Tiene_PN();

	/**
	 * Returns the meta object for the containment reference list '{@link proyectoDeportista.Representacion#getR_Tiene_O <em>RTiene O</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RTiene O</em>'.
	 * @see proyectoDeportista.Representacion#getR_Tiene_O()
	 * @see #getRepresentacion()
	 * @generated
	 */
	EReference getRepresentacion_R_Tiene_O();

	/**
	 * Returns the meta object for the containment reference list '{@link proyectoDeportista.Representacion#getR_Tiene_C <em>RTiene C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RTiene C</em>'.
	 * @see proyectoDeportista.Representacion#getR_Tiene_C()
	 * @see #getRepresentacion()
	 * @generated
	 */
	EReference getRepresentacion_R_Tiene_C();

	/**
	 * Returns the meta object for the containment reference list '{@link proyectoDeportista.Representacion#getR_Tiene_N <em>RTiene N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RTiene N</em>'.
	 * @see proyectoDeportista.Representacion#getR_Tiene_N()
	 * @see #getRepresentacion()
	 * @generated
	 */
	EReference getRepresentacion_R_Tiene_N();

	/**
	 * Returns the meta object for class '{@link proyectoDeportista.Deportista <em>Deportista</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deportista</em>'.
	 * @see proyectoDeportista.Deportista
	 * @generated
	 */
	EClass getDeportista();

	/**
	 * Returns the meta object for the attribute '{@link proyectoDeportista.Deportista#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see proyectoDeportista.Deportista#getNombre()
	 * @see #getDeportista()
	 * @generated
	 */
	EAttribute getDeportista_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link proyectoDeportista.Deportista#getD_Tiene_O <em>DTiene O</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DTiene O</em>'.
	 * @see proyectoDeportista.Deportista#getD_Tiene_O()
	 * @see #getDeportista()
	 * @generated
	 */
	EReference getDeportista_D_Tiene_O();

	/**
	 * Returns the meta object for the attribute '{@link proyectoDeportista.Deportista#getEdad <em>Edad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edad</em>'.
	 * @see proyectoDeportista.Deportista#getEdad()
	 * @see #getDeportista()
	 * @generated
	 */
	EAttribute getDeportista_Edad();

	/**
	 * Returns the meta object for the attribute '{@link proyectoDeportista.Deportista#getPeso <em>Peso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peso</em>'.
	 * @see proyectoDeportista.Deportista#getPeso()
	 * @see #getDeportista()
	 * @generated
	 */
	EAttribute getDeportista_Peso();

	/**
	 * Returns the meta object for the attribute '{@link proyectoDeportista.Deportista#getEstatura <em>Estatura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estatura</em>'.
	 * @see proyectoDeportista.Deportista#getEstatura()
	 * @see #getDeportista()
	 * @generated
	 */
	EAttribute getDeportista_Estatura();

	/**
	 * Returns the meta object for the reference '{@link proyectoDeportista.Deportista#getD_RigePor_PN <em>DRige Por PN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DRige Por PN</em>'.
	 * @see proyectoDeportista.Deportista#getD_RigePor_PN()
	 * @see #getDeportista()
	 * @generated
	 */
	EReference getDeportista_D_RigePor_PN();

	/**
	 * Returns the meta object for class '{@link proyectoDeportista.PlanNutricional <em>Plan Nutricional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Nutricional</em>'.
	 * @see proyectoDeportista.PlanNutricional
	 * @generated
	 */
	EClass getPlanNutricional();

	/**
	 * Returns the meta object for the containment reference list '{@link proyectoDeportista.PlanNutricional#getPN_Tiene_C <em>PN Tiene C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>PN Tiene C</em>'.
	 * @see proyectoDeportista.PlanNutricional#getPN_Tiene_C()
	 * @see #getPlanNutricional()
	 * @generated
	 */
	EReference getPlanNutricional_PN_Tiene_C();

	/**
	 * Returns the meta object for the attribute '{@link proyectoDeportista.PlanNutricional#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see proyectoDeportista.PlanNutricional#getId()
	 * @see #getPlanNutricional()
	 * @generated
	 */
	EAttribute getPlanNutricional_Id();

	/**
	 * Returns the meta object for the attribute '{@link proyectoDeportista.PlanNutricional#getTipoP <em>Tipo P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo P</em>'.
	 * @see proyectoDeportista.PlanNutricional#getTipoP()
	 * @see #getPlanNutricional()
	 * @generated
	 */
	EAttribute getPlanNutricional_TipoP();

	/**
	 * Returns the meta object for the containment reference list '{@link proyectoDeportista.PlanNutricional#getPN_Tiene_R <em>PN Tiene R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>PN Tiene R</em>'.
	 * @see proyectoDeportista.PlanNutricional#getPN_Tiene_R()
	 * @see #getPlanNutricional()
	 * @generated
	 */
	EReference getPlanNutricional_PN_Tiene_R();

	/**
	 * Returns the meta object for the reference '{@link proyectoDeportista.PlanNutricional#getPN_asignado_D <em>PN asignado D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PN asignado D</em>'.
	 * @see proyectoDeportista.PlanNutricional#getPN_asignado_D()
	 * @see #getPlanNutricional()
	 * @generated
	 */
	EReference getPlanNutricional_PN_asignado_D();

	/**
	 * Returns the meta object for the attribute '{@link proyectoDeportista.PlanNutricional#getMinCalorias <em>Min Calorias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Calorias</em>'.
	 * @see proyectoDeportista.PlanNutricional#getMinCalorias()
	 * @see #getPlanNutricional()
	 * @generated
	 */
	EAttribute getPlanNutricional_MinCalorias();

	/**
	 * Returns the meta object for the attribute '{@link proyectoDeportista.PlanNutricional#getMaxCalorias <em>Max Calorias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Calorias</em>'.
	 * @see proyectoDeportista.PlanNutricional#getMaxCalorias()
	 * @see #getPlanNutricional()
	 * @generated
	 */
	EAttribute getPlanNutricional_MaxCalorias();

	/**
	 * Returns the meta object for class '{@link proyectoDeportista.Comida <em>Comida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comida</em>'.
	 * @see proyectoDeportista.Comida
	 * @generated
	 */
	EClass getComida();

	/**
	 * Returns the meta object for the containment reference list '{@link proyectoDeportista.Comida#getC_Tiene_N <em>CTiene N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CTiene N</em>'.
	 * @see proyectoDeportista.Comida#getC_Tiene_N()
	 * @see #getComida()
	 * @generated
	 */
	EReference getComida_C_Tiene_N();

	/**
	 * Returns the meta object for the attribute '{@link proyectoDeportista.Comida#getNCalorias <em>NCalorias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NCalorias</em>'.
	 * @see proyectoDeportista.Comida#getNCalorias()
	 * @see #getComida()
	 * @generated
	 */
	EAttribute getComida_NCalorias();

	/**
	 * Returns the meta object for the attribute '{@link proyectoDeportista.Comida#getMomento_dia <em>Momento dia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Momento dia</em>'.
	 * @see proyectoDeportista.Comida#getMomento_dia()
	 * @see #getComida()
	 * @generated
	 */
	EAttribute getComida_Momento_dia();

	/**
	 * Returns the meta object for the reference '{@link proyectoDeportista.Comida#getC_Asociado_PN <em>CAsociado PN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CAsociado PN</em>'.
	 * @see proyectoDeportista.Comida#getC_Asociado_PN()
	 * @see #getComida()
	 * @generated
	 */
	EReference getComida_C_Asociado_PN();

	/**
	 * Returns the meta object for class '{@link proyectoDeportista.Objetivo <em>Objetivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objetivo</em>'.
	 * @see proyectoDeportista.Objetivo
	 * @generated
	 */
	EClass getObjetivo();

	/**
	 * Returns the meta object for the attribute '{@link proyectoDeportista.Objetivo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see proyectoDeportista.Objetivo#getTipo()
	 * @see #getObjetivo()
	 * @generated
	 */
	EAttribute getObjetivo_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link proyectoDeportista.Objetivo#getCantidad <em>Cantidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cantidad</em>'.
	 * @see proyectoDeportista.Objetivo#getCantidad()
	 * @see #getObjetivo()
	 * @generated
	 */
	EAttribute getObjetivo_Cantidad();

	/**
	 * Returns the meta object for class '{@link proyectoDeportista.Nutriente <em>Nutriente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nutriente</em>'.
	 * @see proyectoDeportista.Nutriente
	 * @generated
	 */
	EClass getNutriente();

	/**
	 * Returns the meta object for the attribute '{@link proyectoDeportista.Nutriente#getNombreN <em>Nombre N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre N</em>'.
	 * @see proyectoDeportista.Nutriente#getNombreN()
	 * @see #getNutriente()
	 * @generated
	 */
	EAttribute getNutriente_NombreN();

	/**
	 * Returns the meta object for the attribute '{@link proyectoDeportista.Nutriente#getCantidad <em>Cantidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cantidad</em>'.
	 * @see proyectoDeportista.Nutriente#getCantidad()
	 * @see #getNutriente()
	 * @generated
	 */
	EAttribute getNutriente_Cantidad();

	/**
	 * Returns the meta object for class '{@link proyectoDeportista.Resultado <em>Resultado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resultado</em>'.
	 * @see proyectoDeportista.Resultado
	 * @generated
	 */
	EClass getResultado();

	/**
	 * Returns the meta object for the attribute '{@link proyectoDeportista.Resultado#getCantidad <em>Cantidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cantidad</em>'.
	 * @see proyectoDeportista.Resultado#getCantidad()
	 * @see #getResultado()
	 * @generated
	 */
	EAttribute getResultado_Cantidad();

	/**
	 * Returns the meta object for enum '{@link proyectoDeportista.NType <em>NType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>NType</em>'.
	 * @see proyectoDeportista.NType
	 * @generated
	 */
	EEnum getNType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProyectoDeportistaFactory getProyectoDeportistaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link proyectoDeportista.impl.RepresentacionImpl <em>Representacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectoDeportista.impl.RepresentacionImpl
		 * @see proyectoDeportista.impl.ProyectoDeportistaPackageImpl#getRepresentacion()
		 * @generated
		 */
		EClass REPRESENTACION = eINSTANCE.getRepresentacion();

		/**
		 * The meta object literal for the '<em><b>RTiene D</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTACION__RTIENE_D = eINSTANCE.getRepresentacion_R_Tiene_D();

		/**
		 * The meta object literal for the '<em><b>RTiene PN</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTACION__RTIENE_PN = eINSTANCE.getRepresentacion_R_Tiene_PN();

		/**
		 * The meta object literal for the '<em><b>RTiene O</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTACION__RTIENE_O = eINSTANCE.getRepresentacion_R_Tiene_O();

		/**
		 * The meta object literal for the '<em><b>RTiene C</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTACION__RTIENE_C = eINSTANCE.getRepresentacion_R_Tiene_C();

		/**
		 * The meta object literal for the '<em><b>RTiene N</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTACION__RTIENE_N = eINSTANCE.getRepresentacion_R_Tiene_N();

		/**
		 * The meta object literal for the '{@link proyectoDeportista.impl.DeportistaImpl <em>Deportista</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectoDeportista.impl.DeportistaImpl
		 * @see proyectoDeportista.impl.ProyectoDeportistaPackageImpl#getDeportista()
		 * @generated
		 */
		EClass DEPORTISTA = eINSTANCE.getDeportista();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPORTISTA__NOMBRE = eINSTANCE.getDeportista_Nombre();

		/**
		 * The meta object literal for the '<em><b>DTiene O</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPORTISTA__DTIENE_O = eINSTANCE.getDeportista_D_Tiene_O();

		/**
		 * The meta object literal for the '<em><b>Edad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPORTISTA__EDAD = eINSTANCE.getDeportista_Edad();

		/**
		 * The meta object literal for the '<em><b>Peso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPORTISTA__PESO = eINSTANCE.getDeportista_Peso();

		/**
		 * The meta object literal for the '<em><b>Estatura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPORTISTA__ESTATURA = eINSTANCE.getDeportista_Estatura();

		/**
		 * The meta object literal for the '<em><b>DRige Por PN</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPORTISTA__DRIGE_POR_PN = eINSTANCE.getDeportista_D_RigePor_PN();

		/**
		 * The meta object literal for the '{@link proyectoDeportista.impl.PlanNutricionalImpl <em>Plan Nutricional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectoDeportista.impl.PlanNutricionalImpl
		 * @see proyectoDeportista.impl.ProyectoDeportistaPackageImpl#getPlanNutricional()
		 * @generated
		 */
		EClass PLAN_NUTRICIONAL = eINSTANCE.getPlanNutricional();

		/**
		 * The meta object literal for the '<em><b>PN Tiene C</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_NUTRICIONAL__PN_TIENE_C = eINSTANCE.getPlanNutricional_PN_Tiene_C();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_NUTRICIONAL__ID = eINSTANCE.getPlanNutricional_Id();

		/**
		 * The meta object literal for the '<em><b>Tipo P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_NUTRICIONAL__TIPO_P = eINSTANCE.getPlanNutricional_TipoP();

		/**
		 * The meta object literal for the '<em><b>PN Tiene R</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_NUTRICIONAL__PN_TIENE_R = eINSTANCE.getPlanNutricional_PN_Tiene_R();

		/**
		 * The meta object literal for the '<em><b>PN asignado D</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_NUTRICIONAL__PN_ASIGNADO_D = eINSTANCE.getPlanNutricional_PN_asignado_D();

		/**
		 * The meta object literal for the '<em><b>Min Calorias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_NUTRICIONAL__MIN_CALORIAS = eINSTANCE.getPlanNutricional_MinCalorias();

		/**
		 * The meta object literal for the '<em><b>Max Calorias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_NUTRICIONAL__MAX_CALORIAS = eINSTANCE.getPlanNutricional_MaxCalorias();

		/**
		 * The meta object literal for the '{@link proyectoDeportista.impl.ComidaImpl <em>Comida</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectoDeportista.impl.ComidaImpl
		 * @see proyectoDeportista.impl.ProyectoDeportistaPackageImpl#getComida()
		 * @generated
		 */
		EClass COMIDA = eINSTANCE.getComida();

		/**
		 * The meta object literal for the '<em><b>CTiene N</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMIDA__CTIENE_N = eINSTANCE.getComida_C_Tiene_N();

		/**
		 * The meta object literal for the '<em><b>NCalorias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMIDA__NCALORIAS = eINSTANCE.getComida_NCalorias();

		/**
		 * The meta object literal for the '<em><b>Momento dia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMIDA__MOMENTO_DIA = eINSTANCE.getComida_Momento_dia();

		/**
		 * The meta object literal for the '<em><b>CAsociado PN</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMIDA__CASOCIADO_PN = eINSTANCE.getComida_C_Asociado_PN();

		/**
		 * The meta object literal for the '{@link proyectoDeportista.impl.ObjetivoImpl <em>Objetivo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectoDeportista.impl.ObjetivoImpl
		 * @see proyectoDeportista.impl.ProyectoDeportistaPackageImpl#getObjetivo()
		 * @generated
		 */
		EClass OBJETIVO = eINSTANCE.getObjetivo();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJETIVO__TIPO = eINSTANCE.getObjetivo_Tipo();

		/**
		 * The meta object literal for the '<em><b>Cantidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJETIVO__CANTIDAD = eINSTANCE.getObjetivo_Cantidad();

		/**
		 * The meta object literal for the '{@link proyectoDeportista.impl.NutrienteImpl <em>Nutriente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectoDeportista.impl.NutrienteImpl
		 * @see proyectoDeportista.impl.ProyectoDeportistaPackageImpl#getNutriente()
		 * @generated
		 */
		EClass NUTRIENTE = eINSTANCE.getNutriente();

		/**
		 * The meta object literal for the '<em><b>Nombre N</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUTRIENTE__NOMBRE_N = eINSTANCE.getNutriente_NombreN();

		/**
		 * The meta object literal for the '<em><b>Cantidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUTRIENTE__CANTIDAD = eINSTANCE.getNutriente_Cantidad();

		/**
		 * The meta object literal for the '{@link proyectoDeportista.impl.ResultadoImpl <em>Resultado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectoDeportista.impl.ResultadoImpl
		 * @see proyectoDeportista.impl.ProyectoDeportistaPackageImpl#getResultado()
		 * @generated
		 */
		EClass RESULTADO = eINSTANCE.getResultado();

		/**
		 * The meta object literal for the '<em><b>Cantidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTADO__CANTIDAD = eINSTANCE.getResultado_Cantidad();

		/**
		 * The meta object literal for the '{@link proyectoDeportista.NType <em>NType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectoDeportista.NType
		 * @see proyectoDeportista.impl.ProyectoDeportistaPackageImpl#getNType()
		 * @generated
		 */
		EEnum NTYPE = eINSTANCE.getNType();

	}

} //ProyectoDeportistaPackage
