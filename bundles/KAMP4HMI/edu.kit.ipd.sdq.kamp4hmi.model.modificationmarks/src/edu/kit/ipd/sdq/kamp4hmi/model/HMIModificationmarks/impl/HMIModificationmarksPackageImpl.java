/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.AbstractKAMP4HMIModificationRepository;
import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIChangePropagationDueToSoftwareDependency;
import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationMarksRepository;
import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationRepository;
import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModifyActorStep;
import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModifyStep;
import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModifySystemStep;
import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMISeedModifications;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HMIModificationmarksPackageImpl extends EPackageImpl implements HMIModificationmarksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractKAMP4HMIModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmiModificationMarksRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmiSeedModificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmiModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmiChangePropagationDueToSoftwareDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmiModifyStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmiModifyActorStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmiModifySystemStepEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationmarksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HMIModificationmarksPackageImpl() {
		super(eNS_URI, HMIModificationmarksFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HMIModificationmarksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HMIModificationmarksPackage init() {
		if (isInited) return (HMIModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(HMIModificationmarksPackage.eNS_URI);

		// Obtain or create and register package
		HMIModificationmarksPackageImpl theHMIModificationmarksPackage = (HMIModificationmarksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HMIModificationmarksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HMIModificationmarksPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		IECRepositoryPackage.eINSTANCE.eClass();
		Kamp4hmiModelPackage.eINSTANCE.eClass();
		ModificationmarksPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHMIModificationmarksPackage.createPackageContents();

		// Initialize created meta-data
		theHMIModificationmarksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHMIModificationmarksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HMIModificationmarksPackage.eNS_URI, theHMIModificationmarksPackage);
		return theHMIModificationmarksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractKAMP4HMIModificationRepository() {
		return abstractKAMP4HMIModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMIModificationMarksRepository() {
		return hmiModificationMarksRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMISeedModifications() {
		return hmiSeedModificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMISeedModifications_ActorStepModification() {
		return (EReference)hmiSeedModificationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMISeedModifications_SystemStepModification() {
		return (EReference)hmiSeedModificationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMIModificationRepository() {
		return hmiModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMIChangePropagationDueToSoftwareDependency() {
		return hmiChangePropagationDueToSoftwareDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMIChangePropagationDueToSoftwareDependency_ActorStepModification() {
		return (EReference)hmiChangePropagationDueToSoftwareDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMIChangePropagationDueToSoftwareDependency_SystemStepModification() {
		return (EReference)hmiChangePropagationDueToSoftwareDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMIModifyStep() {
		return hmiModifyStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMIModifyActorStep() {
		return hmiModifyActorStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMIModifySystemStep() {
		return hmiModifySystemStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMIModificationmarksFactory getHMIModificationmarksFactory() {
		return (HMIModificationmarksFactory)getEFactoryInstance();
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
		abstractKAMP4HMIModificationRepositoryEClass = createEClass(ABSTRACT_KAMP4HMI_MODIFICATION_REPOSITORY);

		hmiModificationMarksRepositoryEClass = createEClass(HMI_MODIFICATION_MARKS_REPOSITORY);

		hmiSeedModificationsEClass = createEClass(HMI_SEED_MODIFICATIONS);
		createEReference(hmiSeedModificationsEClass, HMI_SEED_MODIFICATIONS__ACTOR_STEP_MODIFICATION);
		createEReference(hmiSeedModificationsEClass, HMI_SEED_MODIFICATIONS__SYSTEM_STEP_MODIFICATION);

		hmiModificationRepositoryEClass = createEClass(HMI_MODIFICATION_REPOSITORY);

		hmiChangePropagationDueToSoftwareDependencyEClass = createEClass(HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY);
		createEReference(hmiChangePropagationDueToSoftwareDependencyEClass, HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY__ACTOR_STEP_MODIFICATION);
		createEReference(hmiChangePropagationDueToSoftwareDependencyEClass, HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY__SYSTEM_STEP_MODIFICATION);

		hmiModifyStepEClass = createEClass(HMI_MODIFY_STEP);

		hmiModifyActorStepEClass = createEClass(HMI_MODIFY_ACTOR_STEP);

		hmiModifySystemStepEClass = createEClass(HMI_MODIFY_SYSTEM_STEP);
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

		// Obtain other dependent packages
		ModificationmarksPackage theModificationmarksPackage = (ModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(ModificationmarksPackage.eNS_URI);
		Kamp4hmiModelPackage theKamp4hmiModelPackage = (Kamp4hmiModelPackage)EPackage.Registry.INSTANCE.getEPackage(Kamp4hmiModelPackage.eNS_URI);

		// Create type parameters
		ETypeParameter abstractKAMP4HMIModificationRepositoryEClass_T = addETypeParameter(abstractKAMP4HMIModificationRepositoryEClass, "T");
		ETypeParameter hmiModifyStepEClass_T = addETypeParameter(hmiModifyStepEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getHMISeedModifications());
		abstractKAMP4HMIModificationRepositoryEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theKamp4hmiModelPackage.getStep());
		hmiModifyStepEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModificationRepository());
		EGenericType g2 = createEGenericType(abstractKAMP4HMIModificationRepositoryEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theModificationmarksPackage.getChangePropagationStep());
		g1.getETypeArguments().add(g2);
		abstractKAMP4HMIModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractKAMP4HMIModificationRepository());
		g2 = createEGenericType(this.getHMISeedModifications());
		g1.getETypeArguments().add(g2);
		hmiModificationMarksRepositoryEClass.getEGenericSuperTypes().add(g1);
		hmiSeedModificationsEClass.getESuperTypes().add(theModificationmarksPackage.getAbstractSeedModifications());
		g1 = createEGenericType(this.getAbstractKAMP4HMIModificationRepository());
		g2 = createEGenericType(this.getHMISeedModifications());
		g1.getETypeArguments().add(g2);
		hmiModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		hmiChangePropagationDueToSoftwareDependencyEClass.getESuperTypes().add(theModificationmarksPackage.getChangePropagationStep());
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModification());
		g2 = createEGenericType(hmiModifyStepEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		hmiModifyStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getHMIModifyStep());
		g2 = createEGenericType(theKamp4hmiModelPackage.getActorStep());
		g1.getETypeArguments().add(g2);
		hmiModifyActorStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getHMIModifyStep());
		g2 = createEGenericType(theKamp4hmiModelPackage.getSystemStep());
		g1.getETypeArguments().add(g2);
		hmiModifySystemStepEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractKAMP4HMIModificationRepositoryEClass, AbstractKAMP4HMIModificationRepository.class, "AbstractKAMP4HMIModificationRepository", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hmiModificationMarksRepositoryEClass, HMIModificationMarksRepository.class, "HMIModificationMarksRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hmiSeedModificationsEClass, HMISeedModifications.class, "HMISeedModifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHMISeedModifications_ActorStepModification(), this.getHMIModifyActorStep(), null, "actorStepModification", null, 0, -1, HMISeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMISeedModifications_SystemStepModification(), this.getHMIModifySystemStep(), null, "systemStepModification", null, 0, -1, HMISeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hmiModificationRepositoryEClass, HMIModificationRepository.class, "HMIModificationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hmiChangePropagationDueToSoftwareDependencyEClass, HMIChangePropagationDueToSoftwareDependency.class, "HMIChangePropagationDueToSoftwareDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHMIChangePropagationDueToSoftwareDependency_ActorStepModification(), this.getHMIModifyActorStep(), null, "actorStepModification", null, 0, -1, HMIChangePropagationDueToSoftwareDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMIChangePropagationDueToSoftwareDependency_SystemStepModification(), this.getHMIModifySystemStep(), null, "systemStepModification", null, 0, -1, HMIChangePropagationDueToSoftwareDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hmiModifyStepEClass, HMIModifyStep.class, "HMIModifyStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hmiModifyActorStepEClass, HMIModifyActorStep.class, "HMIModifyActorStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hmiModifySystemStepEClass, HMIModifySystemStep.class, "HMIModifySystemStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //HMIModificationmarksPackageImpl
