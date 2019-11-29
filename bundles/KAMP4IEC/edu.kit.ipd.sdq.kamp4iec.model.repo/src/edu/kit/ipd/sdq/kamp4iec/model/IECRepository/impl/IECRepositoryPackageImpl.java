/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.DerivedType;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IECRepositoryPackageImpl extends EPackageImpl implements IECRepositoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecAbstractPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecAbstractMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isPropertyEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IECRepositoryPackageImpl() {
		super(eNS_URI, IECRepositoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IECRepositoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IECRepositoryPackage init() {
		if (isInited) return (IECRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(IECRepositoryPackage.eNS_URI);

		// Obtain or create and register package
		IECRepositoryPackageImpl theIECRepositoryPackage = (IECRepositoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IECRepositoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IECRepositoryPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIECRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theIECRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIECRepositoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IECRepositoryPackage.eNS_URI, theIECRepositoryPackage);
		return theIECRepositoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_ContainsInterface() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_ContainsFunctionBlock() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_ContainsFunction() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_ContainsGlobalVariable() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionBlock() {
		return functionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_HasMethod() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_HasProperty() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_Implements() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_InstantiatesInterface() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_InstantiatesFunctionBlock() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_ReadsGlobalVariable() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_WritesGlobalVariable() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_ReadsProperty() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_WritesProperty() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_CallsMethod() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_CallsFunction() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_ExtendsFunctionBlock() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVariable() {
		return globalVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalVariable_HasDerivedType() {
		return (EReference)globalVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_CallsFunction() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_HasDerivedReturnType() {
		return (EReference)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_CallsFunctionBlockConstructor() {
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECMethod() {
		return iecMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMethod_Implements() {
		return (EReference)iecMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMethod_HasDerivedReturnType() {
		return (EReference)iecMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMethod_InstantiatesInterface() {
		return (EReference)iecMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMethod_InstantiatesFunctionBlock() {
		return (EReference)iecMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMethod_ReadsGlobalVariable() {
		return (EReference)iecMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMethod_WritesGlobalVariable() {
		return (EReference)iecMethodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMethod_ReadsProperty() {
		return (EReference)iecMethodEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMethod_WritesProperty() {
		return (EReference)iecMethodEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMethod_CallsMethod() {
		return (EReference)iecMethodEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMethod_CallsFunction() {
		return (EReference)iecMethodEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECInterface() {
		return iecInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECInterface_HasMethod() {
		return (EReference)iecInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECInterface_HasProperty() {
		return (EReference)iecInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECInterface_ExtendsInterface() {
		return (EReference)iecInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECProperty() {
		return iecPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECProperty_Implements() {
		return (EReference)iecPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECProperty_HasDerivedType() {
		return (EReference)iecPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECAbstractProperty() {
		return iecAbstractPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECAbstractProperty_HasDerivedType() {
		return (EReference)iecAbstractPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECAbstractMethod() {
		return iecAbstractMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECAbstractMethod_HasDerivedReturnType() {
		return (EReference)iecAbstractMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECComponent() {
		return iecComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifier() {
		return identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifier_Id() {
		return (EAttribute)identifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifier_Name() {
		return (EAttribute)identifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedType() {
		return derivedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsMethod() {
		return isMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsProperty() {
		return isPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECRepositoryFactory getIECRepositoryFactory() {
		return (IECRepositoryFactory)getEFactoryInstance();
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
		repositoryEClass = createEClass(REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__CONTAINS_INTERFACE);
		createEReference(repositoryEClass, REPOSITORY__CONTAINS_FUNCTION_BLOCK);
		createEReference(repositoryEClass, REPOSITORY__CONTAINS_FUNCTION);
		createEReference(repositoryEClass, REPOSITORY__CONTAINS_GLOBAL_VARIABLE);

		functionBlockEClass = createEClass(FUNCTION_BLOCK);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__HAS_METHOD);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__HAS_PROPERTY);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__IMPLEMENTS);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__INSTANTIATES_INTERFACE);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__INSTANTIATES_FUNCTION_BLOCK);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__READS_GLOBAL_VARIABLE);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__WRITES_GLOBAL_VARIABLE);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__READS_PROPERTY);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__WRITES_PROPERTY);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__CALLS_METHOD);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__CALLS_FUNCTION);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__EXTENDS_FUNCTION_BLOCK);

		globalVariableEClass = createEClass(GLOBAL_VARIABLE);
		createEReference(globalVariableEClass, GLOBAL_VARIABLE__HAS_DERIVED_TYPE);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__CALLS_FUNCTION);
		createEReference(functionEClass, FUNCTION__HAS_DERIVED_RETURN_TYPE);
		createEReference(functionEClass, FUNCTION__CALLS_FUNCTION_BLOCK_CONSTRUCTOR);

		iecInterfaceEClass = createEClass(IEC_INTERFACE);
		createEReference(iecInterfaceEClass, IEC_INTERFACE__HAS_METHOD);
		createEReference(iecInterfaceEClass, IEC_INTERFACE__HAS_PROPERTY);
		createEReference(iecInterfaceEClass, IEC_INTERFACE__EXTENDS_INTERFACE);

		iecMethodEClass = createEClass(IEC_METHOD);
		createEReference(iecMethodEClass, IEC_METHOD__IMPLEMENTS);
		createEReference(iecMethodEClass, IEC_METHOD__HAS_DERIVED_RETURN_TYPE);
		createEReference(iecMethodEClass, IEC_METHOD__INSTANTIATES_INTERFACE);
		createEReference(iecMethodEClass, IEC_METHOD__INSTANTIATES_FUNCTION_BLOCK);
		createEReference(iecMethodEClass, IEC_METHOD__READS_GLOBAL_VARIABLE);
		createEReference(iecMethodEClass, IEC_METHOD__WRITES_GLOBAL_VARIABLE);
		createEReference(iecMethodEClass, IEC_METHOD__READS_PROPERTY);
		createEReference(iecMethodEClass, IEC_METHOD__WRITES_PROPERTY);
		createEReference(iecMethodEClass, IEC_METHOD__CALLS_METHOD);
		createEReference(iecMethodEClass, IEC_METHOD__CALLS_FUNCTION);

		iecPropertyEClass = createEClass(IEC_PROPERTY);
		createEReference(iecPropertyEClass, IEC_PROPERTY__IMPLEMENTS);
		createEReference(iecPropertyEClass, IEC_PROPERTY__HAS_DERIVED_TYPE);

		iecAbstractPropertyEClass = createEClass(IEC_ABSTRACT_PROPERTY);
		createEReference(iecAbstractPropertyEClass, IEC_ABSTRACT_PROPERTY__HAS_DERIVED_TYPE);

		iecAbstractMethodEClass = createEClass(IEC_ABSTRACT_METHOD);
		createEReference(iecAbstractMethodEClass, IEC_ABSTRACT_METHOD__HAS_DERIVED_RETURN_TYPE);

		iecComponentEClass = createEClass(IEC_COMPONENT);

		identifierEClass = createEClass(IDENTIFIER);
		createEAttribute(identifierEClass, IDENTIFIER__ID);
		createEAttribute(identifierEClass, IDENTIFIER__NAME);

		derivedTypeEClass = createEClass(DERIVED_TYPE);

		isMethodEClass = createEClass(IS_METHOD);

		isPropertyEClass = createEClass(IS_PROPERTY);
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
		functionBlockEClass.getESuperTypes().add(this.getIECComponent());
		functionBlockEClass.getESuperTypes().add(this.getDerivedType());
		globalVariableEClass.getESuperTypes().add(this.getIECComponent());
		functionEClass.getESuperTypes().add(this.getIECComponent());
		iecInterfaceEClass.getESuperTypes().add(this.getIECComponent());
		iecInterfaceEClass.getESuperTypes().add(this.getDerivedType());
		iecMethodEClass.getESuperTypes().add(this.getIECComponent());
		iecMethodEClass.getESuperTypes().add(this.getIsMethod());
		iecPropertyEClass.getESuperTypes().add(this.getIECComponent());
		iecPropertyEClass.getESuperTypes().add(this.getIsProperty());
		iecAbstractPropertyEClass.getESuperTypes().add(this.getIECComponent());
		iecAbstractPropertyEClass.getESuperTypes().add(this.getIsProperty());
		iecAbstractMethodEClass.getESuperTypes().add(this.getIECComponent());
		iecAbstractMethodEClass.getESuperTypes().add(this.getIsMethod());
		iecComponentEClass.getESuperTypes().add(this.getIdentifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepository_ContainsInterface(), this.getIECInterface(), null, "ContainsInterface", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_ContainsFunctionBlock(), this.getFunctionBlock(), null, "ContainsFunctionBlock", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_ContainsFunction(), this.getFunction(), null, "ContainsFunction", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_ContainsGlobalVariable(), this.getGlobalVariable(), null, "ContainsGlobalVariable", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionBlockEClass, FunctionBlock.class, "FunctionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionBlock_HasMethod(), this.getIECMethod(), null, "HasMethod", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_HasProperty(), this.getIECProperty(), null, "HasProperty", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_Implements(), this.getIECInterface(), null, "Implements", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_InstantiatesInterface(), this.getIECInterface(), null, "InstantiatesInterface", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_InstantiatesFunctionBlock(), this.getFunctionBlock(), null, "InstantiatesFunctionBlock", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_ReadsGlobalVariable(), this.getGlobalVariable(), null, "ReadsGlobalVariable", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_WritesGlobalVariable(), this.getGlobalVariable(), null, "WritesGlobalVariable", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_ReadsProperty(), this.getIsProperty(), null, "ReadsProperty", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_WritesProperty(), this.getIsProperty(), null, "WritesProperty", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_CallsMethod(), this.getIsMethod(), null, "CallsMethod", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_CallsFunction(), this.getFunction(), null, "CallsFunction", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_ExtendsFunctionBlock(), this.getFunctionBlock(), null, "ExtendsFunctionBlock", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalVariableEClass, GlobalVariable.class, "GlobalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalVariable_HasDerivedType(), this.getDerivedType(), null, "HasDerivedType", null, 0, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_CallsFunction(), this.getFunction(), null, "CallsFunction", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_HasDerivedReturnType(), this.getDerivedType(), null, "HasDerivedReturnType", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_CallsFunctionBlockConstructor(), this.getFunctionBlock(), null, "CallsFunctionBlockConstructor", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecInterfaceEClass, IECInterface.class, "IECInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECInterface_HasMethod(), this.getIECAbstractMethod(), null, "HasMethod", null, 0, -1, IECInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECInterface_HasProperty(), this.getIECAbstractProperty(), null, "HasProperty", null, 0, -1, IECInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECInterface_ExtendsInterface(), this.getIECInterface(), null, "ExtendsInterface", null, 0, 1, IECInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecMethodEClass, IECMethod.class, "IECMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECMethod_Implements(), this.getIECAbstractMethod(), null, "implements", null, 0, 1, IECMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECMethod_HasDerivedReturnType(), this.getDerivedType(), null, "HasDerivedReturnType", null, 0, 1, IECMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECMethod_InstantiatesInterface(), this.getIECInterface(), null, "InstantiatesInterface", null, 0, -1, IECMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECMethod_InstantiatesFunctionBlock(), this.getFunctionBlock(), null, "InstantiatesFunctionBlock", null, 0, -1, IECMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECMethod_ReadsGlobalVariable(), this.getGlobalVariable(), null, "ReadsGlobalVariable", null, 0, -1, IECMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECMethod_WritesGlobalVariable(), this.getGlobalVariable(), null, "WritesGlobalVariable", null, 0, -1, IECMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECMethod_ReadsProperty(), this.getIsProperty(), null, "ReadsProperty", null, 0, -1, IECMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECMethod_WritesProperty(), this.getIsProperty(), null, "WritesProperty", null, 0, -1, IECMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECMethod_CallsMethod(), this.getIsMethod(), null, "CallsMethod", null, 0, -1, IECMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECMethod_CallsFunction(), this.getFunction(), null, "CallsFunction", null, 0, -1, IECMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecPropertyEClass, IECProperty.class, "IECProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECProperty_Implements(), this.getIECAbstractProperty(), null, "implements", null, 0, 1, IECProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECProperty_HasDerivedType(), this.getDerivedType(), null, "HasDerivedType", null, 0, 1, IECProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecAbstractPropertyEClass, IECAbstractProperty.class, "IECAbstractProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECAbstractProperty_HasDerivedType(), this.getDerivedType(), null, "HasDerivedType", null, 0, 1, IECAbstractProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecAbstractMethodEClass, IECAbstractMethod.class, "IECAbstractMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECAbstractMethod_HasDerivedReturnType(), this.getDerivedType(), null, "HasDerivedReturnType", null, 0, 1, IECAbstractMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecComponentEClass, IECComponent.class, "IECComponent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identifierEClass, Identifier.class, "Identifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifier_Id(), ecorePackage.getEString(), "id", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifier_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedTypeEClass, DerivedType.class, "DerivedType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isMethodEClass, IsMethod.class, "IsMethod", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isPropertyEClass, IsProperty.class, "IsProperty", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //IECRepositoryPackageImpl
