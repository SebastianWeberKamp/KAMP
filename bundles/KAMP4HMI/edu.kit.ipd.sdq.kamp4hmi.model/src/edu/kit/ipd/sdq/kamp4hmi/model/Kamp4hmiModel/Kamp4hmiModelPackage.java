/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelFactory
 * @model kind="package"
 * @generated
 */
public interface Kamp4hmiModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Kamp4hmiModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/Kamp4hmiModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Kamp4hmiModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Kamp4hmiModelPackage eINSTANCE = edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.HMIElementImpl <em>HMI Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.HMIElementImpl
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl#getHMIElement()
	 * @generated
	 */
	int HMI_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_ELEMENT__ID = IECRepositoryPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_ELEMENT__NAME = IECRepositoryPackage.IDENTIFIER__NAME;

	/**
	 * The number of structural features of the '<em>HMI Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_ELEMENT_FEATURE_COUNT = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HMI Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_ELEMENT_OPERATION_COUNT = IECRepositoryPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Step <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Step
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ID = HMI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = HMI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SUCCESSOR = HMI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = HMI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = HMI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ActorStepImpl <em>Actor Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ActorStepImpl
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl#getActorStep()
	 * @generated
	 */
	int ACTOR_STEP = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STEP__ID = STEP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STEP__SUCCESSOR = STEP__SUCCESSOR;

	/**
	 * The number of structural features of the '<em>Actor Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actor Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.SystemStepImpl <em>System Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.SystemStepImpl
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl#getSystemStep()
	 * @generated
	 */
	int SYSTEM_STEP = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP__ID = STEP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP__SUCCESSOR = STEP__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP__MODE = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ModeImpl <em>Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ModeImpl
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 3;

	/**
	 * The feature id for the '<em><b>Affected Function Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__AFFECTED_FUNCTION_BLOCKS = 0;

	/**
	 * The feature id for the '<em><b>Affected Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__AFFECTED_METHODS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.RepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 4;

	/**
	 * The feature id for the '<em><b>Starting Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__STARTING_STEP = 0;

	/**
	 * The feature id for the '<em><b>Hmi Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__HMI_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__MODES = 2;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.IfImpl
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl#getIf()
	 * @generated
	 */
	int IF = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ID = HMI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__NAME = HMI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = HMI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>True Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__TRUE_SUCCESSOR = HMI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>False Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__FALSE_SUCCESSOR = HMI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = HMI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = HMI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ForImpl <em>For</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ForImpl
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl#getFor()
	 * @generated
	 */
	int FOR = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__ID = HMI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__NAME = HMI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__CONDITION = HMI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__LOOP_SUCCESSOR = HMI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loop End Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__LOOP_END_SUCCESSOR = HMI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_FEATURE_COUNT = HMI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_OPERATION_COUNT = HMI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ConditionImpl
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Step#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Successor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Step#getSuccessor()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Successor();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.ActorStep <em>Actor Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Step</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.ActorStep
	 * @generated
	 */
	EClass getActorStep();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.SystemStep <em>System Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Step</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.SystemStep
	 * @generated
	 */
	EClass getSystemStep();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.SystemStep#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mode</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.SystemStep#getMode()
	 * @see #getSystemStep()
	 * @generated
	 */
	EReference getSystemStep_Mode();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Mode
	 * @generated
	 */
	EClass getMode();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Mode#getAffectedFunctionBlocks <em>Affected Function Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected Function Blocks</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Mode#getAffectedFunctionBlocks()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_AffectedFunctionBlocks();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Mode#getAffectedMethods <em>Affected Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected Methods</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Mode#getAffectedMethods()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_AffectedMethods();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Mode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Mode#getName()
	 * @see #getMode()
	 * @generated
	 */
	EAttribute getMode_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Repository#getStartingStep <em>Starting Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting Step</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Repository#getStartingStep()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_StartingStep();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Repository#getHmiElement <em>Hmi Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hmi Element</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Repository#getHmiElement()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_HmiElement();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Repository#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modes</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Repository#getModes()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Modes();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.If#getTrueSuccessor <em>True Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>True Successor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.If#getTrueSuccessor()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_TrueSuccessor();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.If#getFalseSuccessor <em>False Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>False Successor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.If#getFalseSuccessor()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_FalseSuccessor();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.For <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.For
	 * @generated
	 */
	EClass getFor();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.For#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.For#getCondition()
	 * @see #getFor()
	 * @generated
	 */
	EReference getFor_Condition();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.For#getLoopSuccessor <em>Loop Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loop Successor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.For#getLoopSuccessor()
	 * @see #getFor()
	 * @generated
	 */
	EReference getFor_LoopSuccessor();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.For#getLoopEndSuccessor <em>Loop End Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loop End Successor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.For#getLoopEndSuccessor()
	 * @see #getFor()
	 * @generated
	 */
	EReference getFor_LoopEndSuccessor();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.HMIElement <em>HMI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMI Element</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.HMIElement
	 * @generated
	 */
	EClass getHMIElement();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Condition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Condition#getCondition()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Condition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Kamp4hmiModelFactory getKamp4hmiModelFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Step <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Step
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__SUCCESSOR = eINSTANCE.getStep_Successor();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ActorStepImpl <em>Actor Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ActorStepImpl
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl#getActorStep()
		 * @generated
		 */
		EClass ACTOR_STEP = eINSTANCE.getActorStep();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.SystemStepImpl <em>System Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.SystemStepImpl
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl#getSystemStep()
		 * @generated
		 */
		EClass SYSTEM_STEP = eINSTANCE.getSystemStep();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_STEP__MODE = eINSTANCE.getSystemStep_Mode();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ModeImpl <em>Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ModeImpl
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl#getMode()
		 * @generated
		 */
		EClass MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '<em><b>Affected Function Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__AFFECTED_FUNCTION_BLOCKS = eINSTANCE.getMode_AffectedFunctionBlocks();

		/**
		 * The meta object literal for the '<em><b>Affected Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__AFFECTED_METHODS = eINSTANCE.getMode_AffectedMethods();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODE__NAME = eINSTANCE.getMode_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.RepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Starting Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__STARTING_STEP = eINSTANCE.getRepository_StartingStep();

		/**
		 * The meta object literal for the '<em><b>Hmi Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__HMI_ELEMENT = eINSTANCE.getRepository_HmiElement();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__MODES = eINSTANCE.getRepository_Modes();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.IfImpl
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '<em><b>True Successor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__TRUE_SUCCESSOR = eINSTANCE.getIf_TrueSuccessor();

		/**
		 * The meta object literal for the '<em><b>False Successor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__FALSE_SUCCESSOR = eINSTANCE.getIf_FalseSuccessor();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ForImpl <em>For</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ForImpl
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl#getFor()
		 * @generated
		 */
		EClass FOR = eINSTANCE.getFor();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR__CONDITION = eINSTANCE.getFor_Condition();

		/**
		 * The meta object literal for the '<em><b>Loop Successor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR__LOOP_SUCCESSOR = eINSTANCE.getFor_LoopSuccessor();

		/**
		 * The meta object literal for the '<em><b>Loop End Successor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR__LOOP_END_SUCCESSOR = eINSTANCE.getFor_LoopEndSuccessor();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.HMIElementImpl <em>HMI Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.HMIElementImpl
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl#getHMIElement()
		 * @generated
		 */
		EClass HMI_ELEMENT = eINSTANCE.getHMIElement();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ConditionImpl
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.Kamp4hmiModelPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__CONDITION = eINSTANCE.getCondition_Condition();

	}

} //Kamp4hmiModelPackage
