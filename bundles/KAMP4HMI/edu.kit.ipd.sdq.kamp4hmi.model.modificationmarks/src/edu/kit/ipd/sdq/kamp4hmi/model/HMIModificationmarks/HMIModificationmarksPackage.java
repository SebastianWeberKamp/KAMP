/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

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
 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationmarksFactory
 * @model kind="package"
 * @generated
 */
public interface HMIModificationmarksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HMIModificationmarks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/HMIModificationmarks";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "HMIModificationmarks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HMIModificationmarksPackage eINSTANCE = edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationmarksPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.AbstractKAMP4HMIModificationRepositoryImpl <em>Abstract KAMP4HMI Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.AbstractKAMP4HMIModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationmarksPackageImpl#getAbstractKAMP4HMIModificationRepository()
	 * @generated
	 */
	int ABSTRACT_KAMP4HMI_MODIFICATION_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP4HMI_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP4HMI_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>Abstract KAMP4HMI Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP4HMI_MODIFICATION_REPOSITORY_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract KAMP4HMI Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP4HMI_MODIFICATION_REPOSITORY_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationMarksRepositoryImpl <em>HMI Modification Marks Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationMarksRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationmarksPackageImpl#getHMIModificationMarksRepository()
	 * @generated
	 */
	int HMI_MODIFICATION_MARKS_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFICATION_MARKS_REPOSITORY__SEED_MODIFICATIONS = ABSTRACT_KAMP4HMI_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFICATION_MARKS_REPOSITORY__CHANGE_PROPAGATION_STEPS = ABSTRACT_KAMP4HMI_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>HMI Modification Marks Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFICATION_MARKS_REPOSITORY_FEATURE_COUNT = ABSTRACT_KAMP4HMI_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HMI Modification Marks Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFICATION_MARKS_REPOSITORY_OPERATION_COUNT = ABSTRACT_KAMP4HMI_MODIFICATION_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMISeedModificationsImpl <em>HMI Seed Modifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMISeedModificationsImpl
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationmarksPackageImpl#getHMISeedModifications()
	 * @generated
	 */
	int HMI_SEED_MODIFICATIONS = 2;

	/**
	 * The feature id for the '<em><b>Actor Step Modification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_SEED_MODIFICATIONS__ACTOR_STEP_MODIFICATION = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Step Modification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_SEED_MODIFICATIONS__SYSTEM_STEP_MODIFICATION = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HMI Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_SEED_MODIFICATIONS_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>HMI Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_SEED_MODIFICATIONS_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationRepositoryImpl <em>HMI Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationmarksPackageImpl#getHMIModificationRepository()
	 * @generated
	 */
	int HMI_MODIFICATION_REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = ABSTRACT_KAMP4HMI_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = ABSTRACT_KAMP4HMI_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>HMI Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFICATION_REPOSITORY_FEATURE_COUNT = ABSTRACT_KAMP4HMI_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HMI Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFICATION_REPOSITORY_OPERATION_COUNT = ABSTRACT_KAMP4HMI_MODIFICATION_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIChangePropagationDueToSoftwareDependencyImpl <em>HMI Change Propagation Due To Software Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIChangePropagationDueToSoftwareDependencyImpl
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationmarksPackageImpl#getHMIChangePropagationDueToSoftwareDependency()
	 * @generated
	 */
	int HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY = 4;

	/**
	 * The feature id for the '<em><b>Actor Step Modification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY__ACTOR_STEP_MODIFICATION = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Step Modification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY__SYSTEM_STEP_MODIFICATION = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HMI Change Propagation Due To Software Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY_FEATURE_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>HMI Change Propagation Due To Software Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY_OPERATION_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModifyStepImpl <em>HMI Modify Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModifyStepImpl
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationmarksPackageImpl#getHMIModifyStep()
	 * @generated
	 */
	int HMI_MODIFY_STEP = 5;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_STEP__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_STEP__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_STEP__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_STEP__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_STEP__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>HMI Modify Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_STEP_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HMI Modify Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_STEP_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModifyActorStepImpl <em>HMI Modify Actor Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModifyActorStepImpl
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationmarksPackageImpl#getHMIModifyActorStep()
	 * @generated
	 */
	int HMI_MODIFY_ACTOR_STEP = 6;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_ACTOR_STEP__AFFECTED_ELEMENT = HMI_MODIFY_STEP__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_ACTOR_STEP__CAUSING_ELEMENTS = HMI_MODIFY_STEP__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_ACTOR_STEP__ID = HMI_MODIFY_STEP__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_ACTOR_STEP__TOOLDERIVED = HMI_MODIFY_STEP__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_ACTOR_STEP__USER_DECISION = HMI_MODIFY_STEP__USER_DECISION;

	/**
	 * The number of structural features of the '<em>HMI Modify Actor Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_ACTOR_STEP_FEATURE_COUNT = HMI_MODIFY_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HMI Modify Actor Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_ACTOR_STEP_OPERATION_COUNT = HMI_MODIFY_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModifySystemStepImpl <em>HMI Modify System Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModifySystemStepImpl
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationmarksPackageImpl#getHMIModifySystemStep()
	 * @generated
	 */
	int HMI_MODIFY_SYSTEM_STEP = 7;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_SYSTEM_STEP__AFFECTED_ELEMENT = HMI_MODIFY_STEP__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_SYSTEM_STEP__CAUSING_ELEMENTS = HMI_MODIFY_STEP__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_SYSTEM_STEP__ID = HMI_MODIFY_STEP__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_SYSTEM_STEP__TOOLDERIVED = HMI_MODIFY_STEP__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_SYSTEM_STEP__USER_DECISION = HMI_MODIFY_STEP__USER_DECISION;

	/**
	 * The number of structural features of the '<em>HMI Modify System Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_SYSTEM_STEP_FEATURE_COUNT = HMI_MODIFY_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HMI Modify System Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_MODIFY_SYSTEM_STEP_OPERATION_COUNT = HMI_MODIFY_STEP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.AbstractKAMP4HMIModificationRepository <em>Abstract KAMP4HMI Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract KAMP4HMI Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.AbstractKAMP4HMIModificationRepository
	 * @generated
	 */
	EClass getAbstractKAMP4HMIModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationMarksRepository <em>HMI Modification Marks Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMI Modification Marks Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationMarksRepository
	 * @generated
	 */
	EClass getHMIModificationMarksRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMISeedModifications <em>HMI Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMI Seed Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMISeedModifications
	 * @generated
	 */
	EClass getHMISeedModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMISeedModifications#getActorStepModification <em>Actor Step Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor Step Modification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMISeedModifications#getActorStepModification()
	 * @see #getHMISeedModifications()
	 * @generated
	 */
	EReference getHMISeedModifications_ActorStepModification();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMISeedModifications#getSystemStepModification <em>System Step Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Step Modification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMISeedModifications#getSystemStepModification()
	 * @see #getHMISeedModifications()
	 * @generated
	 */
	EReference getHMISeedModifications_SystemStepModification();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationRepository <em>HMI Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMI Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationRepository
	 * @generated
	 */
	EClass getHMIModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIChangePropagationDueToSoftwareDependency <em>HMI Change Propagation Due To Software Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMI Change Propagation Due To Software Dependency</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIChangePropagationDueToSoftwareDependency
	 * @generated
	 */
	EClass getHMIChangePropagationDueToSoftwareDependency();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIChangePropagationDueToSoftwareDependency#getActorStepModification <em>Actor Step Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor Step Modification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIChangePropagationDueToSoftwareDependency#getActorStepModification()
	 * @see #getHMIChangePropagationDueToSoftwareDependency()
	 * @generated
	 */
	EReference getHMIChangePropagationDueToSoftwareDependency_ActorStepModification();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIChangePropagationDueToSoftwareDependency#getSystemStepModification <em>System Step Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Step Modification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIChangePropagationDueToSoftwareDependency#getSystemStepModification()
	 * @see #getHMIChangePropagationDueToSoftwareDependency()
	 * @generated
	 */
	EReference getHMIChangePropagationDueToSoftwareDependency_SystemStepModification();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModifyStep <em>HMI Modify Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMI Modify Step</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModifyStep
	 * @generated
	 */
	EClass getHMIModifyStep();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModifyActorStep <em>HMI Modify Actor Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMI Modify Actor Step</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModifyActorStep
	 * @generated
	 */
	EClass getHMIModifyActorStep();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModifySystemStep <em>HMI Modify System Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMI Modify System Step</em>'.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModifySystemStep
	 * @generated
	 */
	EClass getHMIModifySystemStep();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HMIModificationmarksFactory getHMIModificationmarksFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.AbstractKAMP4HMIModificationRepositoryImpl <em>Abstract KAMP4HMI Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.AbstractKAMP4HMIModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationmarksPackageImpl#getAbstractKAMP4HMIModificationRepository()
		 * @generated
		 */
		EClass ABSTRACT_KAMP4HMI_MODIFICATION_REPOSITORY = eINSTANCE.getAbstractKAMP4HMIModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationMarksRepositoryImpl <em>HMI Modification Marks Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationMarksRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationmarksPackageImpl#getHMIModificationMarksRepository()
		 * @generated
		 */
		EClass HMI_MODIFICATION_MARKS_REPOSITORY = eINSTANCE.getHMIModificationMarksRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMISeedModificationsImpl <em>HMI Seed Modifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMISeedModificationsImpl
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationmarksPackageImpl#getHMISeedModifications()
		 * @generated
		 */
		EClass HMI_SEED_MODIFICATIONS = eINSTANCE.getHMISeedModifications();

		/**
		 * The meta object literal for the '<em><b>Actor Step Modification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_SEED_MODIFICATIONS__ACTOR_STEP_MODIFICATION = eINSTANCE.getHMISeedModifications_ActorStepModification();

		/**
		 * The meta object literal for the '<em><b>System Step Modification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_SEED_MODIFICATIONS__SYSTEM_STEP_MODIFICATION = eINSTANCE.getHMISeedModifications_SystemStepModification();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationRepositoryImpl <em>HMI Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationmarksPackageImpl#getHMIModificationRepository()
		 * @generated
		 */
		EClass HMI_MODIFICATION_REPOSITORY = eINSTANCE.getHMIModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIChangePropagationDueToSoftwareDependencyImpl <em>HMI Change Propagation Due To Software Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIChangePropagationDueToSoftwareDependencyImpl
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationmarksPackageImpl#getHMIChangePropagationDueToSoftwareDependency()
		 * @generated
		 */
		EClass HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY = eINSTANCE.getHMIChangePropagationDueToSoftwareDependency();

		/**
		 * The meta object literal for the '<em><b>Actor Step Modification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY__ACTOR_STEP_MODIFICATION = eINSTANCE.getHMIChangePropagationDueToSoftwareDependency_ActorStepModification();

		/**
		 * The meta object literal for the '<em><b>System Step Modification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY__SYSTEM_STEP_MODIFICATION = eINSTANCE.getHMIChangePropagationDueToSoftwareDependency_SystemStepModification();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModifyStepImpl <em>HMI Modify Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModifyStepImpl
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationmarksPackageImpl#getHMIModifyStep()
		 * @generated
		 */
		EClass HMI_MODIFY_STEP = eINSTANCE.getHMIModifyStep();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModifyActorStepImpl <em>HMI Modify Actor Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModifyActorStepImpl
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationmarksPackageImpl#getHMIModifyActorStep()
		 * @generated
		 */
		EClass HMI_MODIFY_ACTOR_STEP = eINSTANCE.getHMIModifyActorStep();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModifySystemStepImpl <em>HMI Modify System Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModifySystemStepImpl
		 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationmarksPackageImpl#getHMIModifySystemStep()
		 * @generated
		 */
		EClass HMI_MODIFY_SYSTEM_STEP = eINSTANCE.getHMIModifySystemStep();

	}

} //HMIModificationmarksPackage
