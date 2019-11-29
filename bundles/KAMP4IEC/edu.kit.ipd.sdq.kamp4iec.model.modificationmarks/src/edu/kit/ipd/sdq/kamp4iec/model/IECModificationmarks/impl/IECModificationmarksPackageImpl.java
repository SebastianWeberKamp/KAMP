/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage;

import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.AbstractKAMP4IECModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECChangePropagationDueToDataDependency;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyAbstractMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyAbstractProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyComponent;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyConfiguration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyFunction;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyFunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyGlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyProgram;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECSeedModifications;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

import org.eclipse.emf.ecore.EAttribute;
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
public class IECModificationmarksPackageImpl extends EPackageImpl implements IECModificationmarksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractKAMP4IECModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecSeedModificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecChangePropagationDueToDataDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecModifyComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecModifyGlobalVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecModifyFunctionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecModifyFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecModifyInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecModifyMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecModifyAbstractMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecModifyPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecModifyAbstractPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecModifyProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecModifyConfigurationEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IECModificationmarksPackageImpl() {
		super(eNS_URI, IECModificationmarksFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IECModificationmarksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IECModificationmarksPackage init() {
		if (isInited) return (IECModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(IECModificationmarksPackage.eNS_URI);

		// Obtain or create and register package
		IECModificationmarksPackageImpl theIECModificationmarksPackage = (IECModificationmarksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IECModificationmarksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IECModificationmarksPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		IECModelPackage.eINSTANCE.eClass();
		IECRepositoryPackage.eINSTANCE.eClass();
		ModificationmarksPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIECModificationmarksPackage.createPackageContents();

		// Initialize created meta-data
		theIECModificationmarksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIECModificationmarksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IECModificationmarksPackage.eNS_URI, theIECModificationmarksPackage);
		return theIECModificationmarksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractKAMP4IECModificationRepository() {
		return abstractKAMP4IECModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECModificationRepository() {
		return iecModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECSeedModifications() {
		return iecSeedModificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECSeedModifications_GlobalVariableModifications() {
		return (EReference)iecSeedModificationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECSeedModifications_InterfaceModifications() {
		return (EReference)iecSeedModificationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECSeedModifications_AbstractMethodModifications() {
		return (EReference)iecSeedModificationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECSeedModifications_AbstractPropertyModifications() {
		return (EReference)iecSeedModificationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECSeedModifications_FunctionBlockModifications() {
		return (EReference)iecSeedModificationsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECSeedModifications_MethodModifications() {
		return (EReference)iecSeedModificationsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECSeedModifications_PropertyModifications() {
		return (EReference)iecSeedModificationsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECSeedModifications_FunctionModifications() {
		return (EReference)iecSeedModificationsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECSeedModifications_ProgramModifications() {
		return (EReference)iecSeedModificationsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECChangePropagationDueToDataDependency() {
		return iecChangePropagationDueToDataDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECChangePropagationDueToDataDependency_FunctionBlockModifications() {
		return (EReference)iecChangePropagationDueToDataDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECChangePropagationDueToDataDependency_GlobalVariableModifications() {
		return (EReference)iecChangePropagationDueToDataDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECChangePropagationDueToDataDependency_FunctionModifications() {
		return (EReference)iecChangePropagationDueToDataDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECChangePropagationDueToDataDependency_InterfaceModifications() {
		return (EReference)iecChangePropagationDueToDataDependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECChangePropagationDueToDataDependency_AbstractMethodModifications() {
		return (EReference)iecChangePropagationDueToDataDependencyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECChangePropagationDueToDataDependency_AbstractPropertyModifications() {
		return (EReference)iecChangePropagationDueToDataDependencyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECChangePropagationDueToDataDependency_ProgramModifications() {
		return (EReference)iecChangePropagationDueToDataDependencyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECChangePropagationDueToDataDependency_ConfigurationModifications() {
		return (EReference)iecChangePropagationDueToDataDependencyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECChangePropagationDueToDataDependency_MethodModifications() {
		return (EReference)iecChangePropagationDueToDataDependencyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECChangePropagationDueToDataDependency_PropertyModifications() {
		return (EReference)iecChangePropagationDueToDataDependencyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIECChangePropagationDueToDataDependency_Changed() {
		return (EAttribute)iecChangePropagationDueToDataDependencyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECModifyComponent() {
		return iecModifyComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECModifyGlobalVariable() {
		return iecModifyGlobalVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECModifyFunctionBlock() {
		return iecModifyFunctionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECModifyFunction() {
		return iecModifyFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECModifyInterface() {
		return iecModifyInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECModifyMethod() {
		return iecModifyMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECModifyAbstractMethod() {
		return iecModifyAbstractMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECModifyProperty() {
		return iecModifyPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECModifyAbstractProperty() {
		return iecModifyAbstractPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECModifyProgram() {
		return iecModifyProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECModifyConfiguration() {
		return iecModifyConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModificationmarksFactory getIECModificationmarksFactory() {
		return (IECModificationmarksFactory)getEFactoryInstance();
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
		abstractKAMP4IECModificationRepositoryEClass = createEClass(ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY);

		iecModificationRepositoryEClass = createEClass(IEC_MODIFICATION_REPOSITORY);

		iecSeedModificationsEClass = createEClass(IEC_SEED_MODIFICATIONS);
		createEReference(iecSeedModificationsEClass, IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS);
		createEReference(iecSeedModificationsEClass, IEC_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS);
		createEReference(iecSeedModificationsEClass, IEC_SEED_MODIFICATIONS__ABSTRACT_METHOD_MODIFICATIONS);
		createEReference(iecSeedModificationsEClass, IEC_SEED_MODIFICATIONS__ABSTRACT_PROPERTY_MODIFICATIONS);
		createEReference(iecSeedModificationsEClass, IEC_SEED_MODIFICATIONS__FUNCTION_BLOCK_MODIFICATIONS);
		createEReference(iecSeedModificationsEClass, IEC_SEED_MODIFICATIONS__METHOD_MODIFICATIONS);
		createEReference(iecSeedModificationsEClass, IEC_SEED_MODIFICATIONS__PROPERTY_MODIFICATIONS);
		createEReference(iecSeedModificationsEClass, IEC_SEED_MODIFICATIONS__FUNCTION_MODIFICATIONS);
		createEReference(iecSeedModificationsEClass, IEC_SEED_MODIFICATIONS__PROGRAM_MODIFICATIONS);

		iecChangePropagationDueToDataDependencyEClass = createEClass(IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY);
		createEReference(iecChangePropagationDueToDataDependencyEClass, IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_BLOCK_MODIFICATIONS);
		createEReference(iecChangePropagationDueToDataDependencyEClass, IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__GLOBAL_VARIABLE_MODIFICATIONS);
		createEReference(iecChangePropagationDueToDataDependencyEClass, IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_MODIFICATIONS);
		createEReference(iecChangePropagationDueToDataDependencyEClass, IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__INTERFACE_MODIFICATIONS);
		createEReference(iecChangePropagationDueToDataDependencyEClass, IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_METHOD_MODIFICATIONS);
		createEReference(iecChangePropagationDueToDataDependencyEClass, IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_PROPERTY_MODIFICATIONS);
		createEReference(iecChangePropagationDueToDataDependencyEClass, IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROGRAM_MODIFICATIONS);
		createEReference(iecChangePropagationDueToDataDependencyEClass, IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CONFIGURATION_MODIFICATIONS);
		createEReference(iecChangePropagationDueToDataDependencyEClass, IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__METHOD_MODIFICATIONS);
		createEReference(iecChangePropagationDueToDataDependencyEClass, IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROPERTY_MODIFICATIONS);
		createEAttribute(iecChangePropagationDueToDataDependencyEClass, IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CHANGED);

		iecModifyComponentEClass = createEClass(IEC_MODIFY_COMPONENT);

		iecModifyGlobalVariableEClass = createEClass(IEC_MODIFY_GLOBAL_VARIABLE);

		iecModifyFunctionBlockEClass = createEClass(IEC_MODIFY_FUNCTION_BLOCK);

		iecModifyFunctionEClass = createEClass(IEC_MODIFY_FUNCTION);

		iecModifyInterfaceEClass = createEClass(IEC_MODIFY_INTERFACE);

		iecModifyMethodEClass = createEClass(IEC_MODIFY_METHOD);

		iecModifyAbstractMethodEClass = createEClass(IEC_MODIFY_ABSTRACT_METHOD);

		iecModifyPropertyEClass = createEClass(IEC_MODIFY_PROPERTY);

		iecModifyAbstractPropertyEClass = createEClass(IEC_MODIFY_ABSTRACT_PROPERTY);

		iecModifyProgramEClass = createEClass(IEC_MODIFY_PROGRAM);

		iecModifyConfigurationEClass = createEClass(IEC_MODIFY_CONFIGURATION);
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
		IECRepositoryPackage theIECRepositoryPackage = (IECRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(IECRepositoryPackage.eNS_URI);
		IECModelPackage theIECModelPackage = (IECModelPackage)EPackage.Registry.INSTANCE.getEPackage(IECModelPackage.eNS_URI);

		// Create type parameters
		ETypeParameter abstractKAMP4IECModificationRepositoryEClass_T = addETypeParameter(abstractKAMP4IECModificationRepositoryEClass, "T");
		ETypeParameter iecModifyComponentEClass_T = addETypeParameter(iecModifyComponentEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getIECSeedModifications());
		abstractKAMP4IECModificationRepositoryEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theIECRepositoryPackage.getIECComponent());
		iecModifyComponentEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModificationRepository());
		EGenericType g2 = createEGenericType(abstractKAMP4IECModificationRepositoryEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theModificationmarksPackage.getChangePropagationStep());
		g1.getETypeArguments().add(g2);
		abstractKAMP4IECModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractKAMP4IECModificationRepository());
		g2 = createEGenericType(this.getIECSeedModifications());
		g1.getETypeArguments().add(g2);
		iecModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		iecSeedModificationsEClass.getESuperTypes().add(theModificationmarksPackage.getAbstractSeedModifications());
		iecChangePropagationDueToDataDependencyEClass.getESuperTypes().add(theModificationmarksPackage.getChangePropagationStep());
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModification());
		g2 = createEGenericType(iecModifyComponentEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		iecModifyComponentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIECModifyComponent());
		g2 = createEGenericType(theIECRepositoryPackage.getGlobalVariable());
		g1.getETypeArguments().add(g2);
		iecModifyGlobalVariableEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIECModifyComponent());
		g2 = createEGenericType(theIECRepositoryPackage.getFunctionBlock());
		g1.getETypeArguments().add(g2);
		iecModifyFunctionBlockEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIECModifyComponent());
		g2 = createEGenericType(theIECRepositoryPackage.getFunction());
		g1.getETypeArguments().add(g2);
		iecModifyFunctionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIECModifyComponent());
		g2 = createEGenericType(theIECRepositoryPackage.getIECInterface());
		g1.getETypeArguments().add(g2);
		iecModifyInterfaceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIECModifyComponent());
		g2 = createEGenericType(theIECRepositoryPackage.getIECMethod());
		g1.getETypeArguments().add(g2);
		iecModifyMethodEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIECModifyComponent());
		g2 = createEGenericType(theIECRepositoryPackage.getIECAbstractMethod());
		g1.getETypeArguments().add(g2);
		iecModifyAbstractMethodEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIECModifyComponent());
		g2 = createEGenericType(theIECRepositoryPackage.getIECProperty());
		g1.getETypeArguments().add(g2);
		iecModifyPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIECModifyComponent());
		g2 = createEGenericType(theIECRepositoryPackage.getIECAbstractProperty());
		g1.getETypeArguments().add(g2);
		iecModifyAbstractPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIECModifyComponent());
		g2 = createEGenericType(theIECModelPackage.getProgram());
		g1.getETypeArguments().add(g2);
		iecModifyProgramEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIECModifyComponent());
		g2 = createEGenericType(theIECModelPackage.getConfiguration());
		g1.getETypeArguments().add(g2);
		iecModifyConfigurationEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractKAMP4IECModificationRepositoryEClass, AbstractKAMP4IECModificationRepository.class, "AbstractKAMP4IECModificationRepository", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iecModificationRepositoryEClass, IECModificationRepository.class, "IECModificationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iecSeedModificationsEClass, IECSeedModifications.class, "IECSeedModifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECSeedModifications_GlobalVariableModifications(), this.getIECModifyGlobalVariable(), null, "globalVariableModifications", null, 0, -1, IECSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECSeedModifications_InterfaceModifications(), this.getIECModifyInterface(), null, "interfaceModifications", null, 0, -1, IECSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECSeedModifications_AbstractMethodModifications(), this.getIECModifyAbstractMethod(), null, "abstractMethodModifications", null, 0, -1, IECSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECSeedModifications_AbstractPropertyModifications(), this.getIECModifyAbstractProperty(), null, "abstractPropertyModifications", null, 0, -1, IECSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECSeedModifications_FunctionBlockModifications(), this.getIECModifyFunctionBlock(), null, "functionBlockModifications", null, 0, -1, IECSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECSeedModifications_MethodModifications(), this.getIECModifyMethod(), null, "methodModifications", null, 0, -1, IECSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECSeedModifications_PropertyModifications(), this.getIECModifyProperty(), null, "propertyModifications", null, 0, -1, IECSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECSeedModifications_FunctionModifications(), this.getIECModifyFunction(), null, "functionModifications", null, 0, -1, IECSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECSeedModifications_ProgramModifications(), this.getIECModifyProgram(), null, "programModifications", null, 0, -1, IECSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecChangePropagationDueToDataDependencyEClass, IECChangePropagationDueToDataDependency.class, "IECChangePropagationDueToDataDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECChangePropagationDueToDataDependency_FunctionBlockModifications(), this.getIECModifyFunctionBlock(), null, "functionBlockModifications", null, 0, -1, IECChangePropagationDueToDataDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECChangePropagationDueToDataDependency_GlobalVariableModifications(), this.getIECModifyGlobalVariable(), null, "globalVariableModifications", null, 0, -1, IECChangePropagationDueToDataDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECChangePropagationDueToDataDependency_FunctionModifications(), this.getIECModifyFunction(), null, "functionModifications", null, 0, -1, IECChangePropagationDueToDataDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECChangePropagationDueToDataDependency_InterfaceModifications(), this.getIECModifyInterface(), null, "interfaceModifications", null, 0, -1, IECChangePropagationDueToDataDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECChangePropagationDueToDataDependency_AbstractMethodModifications(), this.getIECModifyAbstractMethod(), null, "abstractMethodModifications", null, 0, -1, IECChangePropagationDueToDataDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECChangePropagationDueToDataDependency_AbstractPropertyModifications(), this.getIECModifyAbstractProperty(), null, "abstractPropertyModifications", null, 0, -1, IECChangePropagationDueToDataDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECChangePropagationDueToDataDependency_ProgramModifications(), this.getIECModifyProgram(), null, "programModifications", null, 0, -1, IECChangePropagationDueToDataDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECChangePropagationDueToDataDependency_ConfigurationModifications(), this.getIECModifyConfiguration(), null, "configurationModifications", null, 0, -1, IECChangePropagationDueToDataDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECChangePropagationDueToDataDependency_MethodModifications(), this.getIECModifyMethod(), null, "methodModifications", null, 0, -1, IECChangePropagationDueToDataDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECChangePropagationDueToDataDependency_PropertyModifications(), this.getIECModifyProperty(), null, "propertyModifications", null, 0, -1, IECChangePropagationDueToDataDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIECChangePropagationDueToDataDependency_Changed(), ecorePackage.getEBoolean(), "changed", null, 0, 1, IECChangePropagationDueToDataDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecModifyComponentEClass, IECModifyComponent.class, "IECModifyComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iecModifyGlobalVariableEClass, IECModifyGlobalVariable.class, "IECModifyGlobalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iecModifyFunctionBlockEClass, IECModifyFunctionBlock.class, "IECModifyFunctionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iecModifyFunctionEClass, IECModifyFunction.class, "IECModifyFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iecModifyInterfaceEClass, IECModifyInterface.class, "IECModifyInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iecModifyMethodEClass, IECModifyMethod.class, "IECModifyMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iecModifyAbstractMethodEClass, IECModifyAbstractMethod.class, "IECModifyAbstractMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iecModifyPropertyEClass, IECModifyProperty.class, "IECModifyProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iecModifyAbstractPropertyEClass, IECModifyAbstractProperty.class, "IECModifyAbstractProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iecModifyProgramEClass, IECModifyProgram.class, "IECModifyProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iecModifyConfigurationEClass, IECModifyConfiguration.class, "IECModifyConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //IECModificationmarksPackageImpl
