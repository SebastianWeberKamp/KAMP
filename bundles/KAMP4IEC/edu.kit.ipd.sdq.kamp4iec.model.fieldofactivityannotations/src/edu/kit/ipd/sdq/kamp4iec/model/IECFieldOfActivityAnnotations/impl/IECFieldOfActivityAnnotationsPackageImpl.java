/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECAcceptanceTestCase;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECAcceptanceTestCaseAggregation;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDeployer;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDeveloper;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFile;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFileAggregation;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFile;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFileAggregation;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPerson;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPersonList;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRoleList;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFile;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFileAggregation;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECStaffSpecification;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestCase;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestCaseAggregation;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestDeveloper;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestSpecification;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTester;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCase;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCaseAggregation;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

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
public class IECFieldOfActivityAnnotationsPackageImpl extends EPackageImpl implements IECFieldOfActivityAnnotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecFieldOfActivityAnnotationsRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecDevelopmentArtefactSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecSourceFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecSourceFileAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecMetadataFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecMetadataFileAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecTestSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecUnitTestCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecAcceptanceTestCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecUnitTestCaseAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecAcceptanceTestCaseAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecStaffSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecPersonListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecPersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecRoleListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecDeveloperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecTestDeveloperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecTesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecDeployerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecFileAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecTestCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecTestCaseAggregationEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IECFieldOfActivityAnnotationsPackageImpl() {
		super(eNS_URI, IECFieldOfActivityAnnotationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IECFieldOfActivityAnnotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IECFieldOfActivityAnnotationsPackage init() {
		if (isInited) return (IECFieldOfActivityAnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(IECFieldOfActivityAnnotationsPackage.eNS_URI);

		// Obtain or create and register package
		IECFieldOfActivityAnnotationsPackageImpl theIECFieldOfActivityAnnotationsPackage = (IECFieldOfActivityAnnotationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IECFieldOfActivityAnnotationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IECFieldOfActivityAnnotationsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		IECRepositoryPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIECFieldOfActivityAnnotationsPackage.createPackageContents();

		// Initialize created meta-data
		theIECFieldOfActivityAnnotationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIECFieldOfActivityAnnotationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IECFieldOfActivityAnnotationsPackage.eNS_URI, theIECFieldOfActivityAnnotationsPackage);
		return theIECFieldOfActivityAnnotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECFieldOfActivityAnnotationsRepository() {
		return iecFieldOfActivityAnnotationsRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECFieldOfActivityAnnotationsRepository_DevelopmentArtefactSpecification() {
		return (EReference)iecFieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECFieldOfActivityAnnotationsRepository_TestSpecification() {
		return (EReference)iecFieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECFieldOfActivityAnnotationsRepository_StaffSpecification() {
		return (EReference)iecFieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECDevelopmentArtefactSpecification() {
		return iecDevelopmentArtefactSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECDevelopmentArtefactSpecification_Parent() {
		return (EReference)iecDevelopmentArtefactSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECDevelopmentArtefactSpecification_SourceFiles() {
		return (EReference)iecDevelopmentArtefactSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECDevelopmentArtefactSpecification_SourceFileAggregations() {
		return (EReference)iecDevelopmentArtefactSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECDevelopmentArtefactSpecification_MetadataFiles() {
		return (EReference)iecDevelopmentArtefactSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECDevelopmentArtefactSpecification_MetadataFileAggregations() {
		return (EReference)iecDevelopmentArtefactSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECSourceFile() {
		return iecSourceFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECSourceFile_Parent() {
		return (EReference)iecSourceFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECSourceFile_Component() {
		return (EReference)iecSourceFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECSourceFileAggregation() {
		return iecSourceFileAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECSourceFileAggregation_Parent() {
		return (EReference)iecSourceFileAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECSourceFileAggregation_Component() {
		return (EReference)iecSourceFileAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECMetadataFile() {
		return iecMetadataFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMetadataFile_Parent() {
		return (EReference)iecMetadataFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMetadataFile_Component() {
		return (EReference)iecMetadataFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECMetadataFileAggregation() {
		return iecMetadataFileAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMetadataFileAggregation_Parent() {
		return (EReference)iecMetadataFileAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMetadataFileAggregation_Component() {
		return (EReference)iecMetadataFileAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECTestSpecification() {
		return iecTestSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECTestSpecification_Parent() {
		return (EReference)iecTestSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECTestSpecification_UnitTestCases() {
		return (EReference)iecTestSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECTestSpecification_AcceptanceTestCases() {
		return (EReference)iecTestSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECTestSpecification_UnitTestCaseAggregations() {
		return (EReference)iecTestSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECTestSpecification_AcceptanceTestCaseAggregations() {
		return (EReference)iecTestSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECUnitTestCase() {
		return iecUnitTestCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECUnitTestCase_Parent() {
		return (EReference)iecUnitTestCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECUnitTestCase_Component() {
		return (EReference)iecUnitTestCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECAcceptanceTestCase() {
		return iecAcceptanceTestCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECAcceptanceTestCase_Parent() {
		return (EReference)iecAcceptanceTestCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECAcceptanceTestCase_Component() {
		return (EReference)iecAcceptanceTestCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECUnitTestCaseAggregation() {
		return iecUnitTestCaseAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECUnitTestCaseAggregation_Parent() {
		return (EReference)iecUnitTestCaseAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECUnitTestCaseAggregation_Component() {
		return (EReference)iecUnitTestCaseAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECAcceptanceTestCaseAggregation() {
		return iecAcceptanceTestCaseAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECAcceptanceTestCaseAggregation_Parent() {
		return (EReference)iecAcceptanceTestCaseAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECAcceptanceTestCaseAggregation_Component() {
		return (EReference)iecAcceptanceTestCaseAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECStaffSpecification() {
		return iecStaffSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECStaffSpecification_Parent() {
		return (EReference)iecStaffSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECStaffSpecification_PersonList() {
		return (EReference)iecStaffSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECStaffSpecification_RoleList() {
		return (EReference)iecStaffSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECPersonList() {
		return iecPersonListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECPersonList_Parent() {
		return (EReference)iecPersonListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECPersonList_Persons() {
		return (EReference)iecPersonListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECPerson() {
		return iecPersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECPerson_Parent() {
		return (EReference)iecPersonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECPerson_Roles() {
		return (EReference)iecPersonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIECPerson_Name() {
		return (EAttribute)iecPersonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECRole() {
		return iecRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECRole_Parent() {
		return (EReference)iecRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECRole_Person() {
		return (EReference)iecRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIECRole_Description() {
		return (EAttribute)iecRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECRole_Components() {
		return (EReference)iecRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECRoleList() {
		return iecRoleListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECRoleList_Parent() {
		return (EReference)iecRoleListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECRoleList_Roles() {
		return (EReference)iecRoleListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECDeveloper() {
		return iecDeveloperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECTestDeveloper() {
		return iecTestDeveloperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECTester() {
		return iecTesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECDeployer() {
		return iecDeployerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECFile() {
		return iecFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIECFile_Filename() {
		return (EAttribute)iecFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECFileAggregation() {
		return iecFileAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIECFileAggregation_NumberOfFiles() {
		return (EAttribute)iecFileAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECTestCase() {
		return iecTestCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIECTestCase_NameOfTest() {
		return (EAttribute)iecTestCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECTestCaseAggregation() {
		return iecTestCaseAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIECTestCaseAggregation_NumberOfTestcases() {
		return (EAttribute)iecTestCaseAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIECTestCaseAggregation_NameOfTestSuite() {
		return (EAttribute)iecTestCaseAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECFieldOfActivityAnnotationsFactory getIECFieldOfActivityAnnotationsFactory() {
		return (IECFieldOfActivityAnnotationsFactory)getEFactoryInstance();
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
		iecFieldOfActivityAnnotationsRepositoryEClass = createEClass(IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY);
		createEReference(iecFieldOfActivityAnnotationsRepositoryEClass, IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION);
		createEReference(iecFieldOfActivityAnnotationsRepositoryEClass, IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION);
		createEReference(iecFieldOfActivityAnnotationsRepositoryEClass, IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION);

		iecDevelopmentArtefactSpecificationEClass = createEClass(IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION);
		createEReference(iecDevelopmentArtefactSpecificationEClass, IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT);
		createEReference(iecDevelopmentArtefactSpecificationEClass, IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES);
		createEReference(iecDevelopmentArtefactSpecificationEClass, IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS);
		createEReference(iecDevelopmentArtefactSpecificationEClass, IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES);
		createEReference(iecDevelopmentArtefactSpecificationEClass, IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS);

		iecSourceFileEClass = createEClass(IEC_SOURCE_FILE);
		createEReference(iecSourceFileEClass, IEC_SOURCE_FILE__PARENT);
		createEReference(iecSourceFileEClass, IEC_SOURCE_FILE__COMPONENT);

		iecSourceFileAggregationEClass = createEClass(IEC_SOURCE_FILE_AGGREGATION);
		createEReference(iecSourceFileAggregationEClass, IEC_SOURCE_FILE_AGGREGATION__PARENT);
		createEReference(iecSourceFileAggregationEClass, IEC_SOURCE_FILE_AGGREGATION__COMPONENT);

		iecMetadataFileEClass = createEClass(IEC_METADATA_FILE);
		createEReference(iecMetadataFileEClass, IEC_METADATA_FILE__PARENT);
		createEReference(iecMetadataFileEClass, IEC_METADATA_FILE__COMPONENT);

		iecMetadataFileAggregationEClass = createEClass(IEC_METADATA_FILE_AGGREGATION);
		createEReference(iecMetadataFileAggregationEClass, IEC_METADATA_FILE_AGGREGATION__PARENT);
		createEReference(iecMetadataFileAggregationEClass, IEC_METADATA_FILE_AGGREGATION__COMPONENT);

		iecTestSpecificationEClass = createEClass(IEC_TEST_SPECIFICATION);
		createEReference(iecTestSpecificationEClass, IEC_TEST_SPECIFICATION__PARENT);
		createEReference(iecTestSpecificationEClass, IEC_TEST_SPECIFICATION__UNIT_TEST_CASES);
		createEReference(iecTestSpecificationEClass, IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES);
		createEReference(iecTestSpecificationEClass, IEC_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS);
		createEReference(iecTestSpecificationEClass, IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS);

		iecUnitTestCaseEClass = createEClass(IEC_UNIT_TEST_CASE);
		createEReference(iecUnitTestCaseEClass, IEC_UNIT_TEST_CASE__PARENT);
		createEReference(iecUnitTestCaseEClass, IEC_UNIT_TEST_CASE__COMPONENT);

		iecAcceptanceTestCaseEClass = createEClass(IEC_ACCEPTANCE_TEST_CASE);
		createEReference(iecAcceptanceTestCaseEClass, IEC_ACCEPTANCE_TEST_CASE__PARENT);
		createEReference(iecAcceptanceTestCaseEClass, IEC_ACCEPTANCE_TEST_CASE__COMPONENT);

		iecUnitTestCaseAggregationEClass = createEClass(IEC_UNIT_TEST_CASE_AGGREGATION);
		createEReference(iecUnitTestCaseAggregationEClass, IEC_UNIT_TEST_CASE_AGGREGATION__PARENT);
		createEReference(iecUnitTestCaseAggregationEClass, IEC_UNIT_TEST_CASE_AGGREGATION__COMPONENT);

		iecAcceptanceTestCaseAggregationEClass = createEClass(IEC_ACCEPTANCE_TEST_CASE_AGGREGATION);
		createEReference(iecAcceptanceTestCaseAggregationEClass, IEC_ACCEPTANCE_TEST_CASE_AGGREGATION__PARENT);
		createEReference(iecAcceptanceTestCaseAggregationEClass, IEC_ACCEPTANCE_TEST_CASE_AGGREGATION__COMPONENT);

		iecStaffSpecificationEClass = createEClass(IEC_STAFF_SPECIFICATION);
		createEReference(iecStaffSpecificationEClass, IEC_STAFF_SPECIFICATION__PARENT);
		createEReference(iecStaffSpecificationEClass, IEC_STAFF_SPECIFICATION__PERSON_LIST);
		createEReference(iecStaffSpecificationEClass, IEC_STAFF_SPECIFICATION__ROLE_LIST);

		iecPersonListEClass = createEClass(IEC_PERSON_LIST);
		createEReference(iecPersonListEClass, IEC_PERSON_LIST__PARENT);
		createEReference(iecPersonListEClass, IEC_PERSON_LIST__PERSONS);

		iecPersonEClass = createEClass(IEC_PERSON);
		createEReference(iecPersonEClass, IEC_PERSON__PARENT);
		createEReference(iecPersonEClass, IEC_PERSON__ROLES);
		createEAttribute(iecPersonEClass, IEC_PERSON__NAME);

		iecRoleEClass = createEClass(IEC_ROLE);
		createEReference(iecRoleEClass, IEC_ROLE__PARENT);
		createEReference(iecRoleEClass, IEC_ROLE__PERSON);
		createEAttribute(iecRoleEClass, IEC_ROLE__DESCRIPTION);
		createEReference(iecRoleEClass, IEC_ROLE__COMPONENTS);

		iecRoleListEClass = createEClass(IEC_ROLE_LIST);
		createEReference(iecRoleListEClass, IEC_ROLE_LIST__PARENT);
		createEReference(iecRoleListEClass, IEC_ROLE_LIST__ROLES);

		iecDeveloperEClass = createEClass(IEC_DEVELOPER);

		iecTestDeveloperEClass = createEClass(IEC_TEST_DEVELOPER);

		iecTesterEClass = createEClass(IEC_TESTER);

		iecDeployerEClass = createEClass(IEC_DEPLOYER);

		iecFileEClass = createEClass(IEC_FILE);
		createEAttribute(iecFileEClass, IEC_FILE__FILENAME);

		iecFileAggregationEClass = createEClass(IEC_FILE_AGGREGATION);
		createEAttribute(iecFileAggregationEClass, IEC_FILE_AGGREGATION__NUMBER_OF_FILES);

		iecTestCaseEClass = createEClass(IEC_TEST_CASE);
		createEAttribute(iecTestCaseEClass, IEC_TEST_CASE__NAME_OF_TEST);

		iecTestCaseAggregationEClass = createEClass(IEC_TEST_CASE_AGGREGATION);
		createEAttribute(iecTestCaseAggregationEClass, IEC_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES);
		createEAttribute(iecTestCaseAggregationEClass, IEC_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE);
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
		IECRepositoryPackage theIECRepositoryPackage = (IECRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(IECRepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iecSourceFileEClass.getESuperTypes().add(this.getIECFile());
		iecSourceFileAggregationEClass.getESuperTypes().add(this.getIECFileAggregation());
		iecMetadataFileEClass.getESuperTypes().add(this.getIECFile());
		iecMetadataFileAggregationEClass.getESuperTypes().add(this.getIECFileAggregation());
		iecUnitTestCaseEClass.getESuperTypes().add(this.getIECTestCase());
		iecAcceptanceTestCaseEClass.getESuperTypes().add(this.getIECTestCase());
		iecUnitTestCaseAggregationEClass.getESuperTypes().add(this.getIECTestCaseAggregation());
		iecAcceptanceTestCaseAggregationEClass.getESuperTypes().add(this.getIECTestCaseAggregation());
		iecDeveloperEClass.getESuperTypes().add(this.getIECRole());
		iecTestDeveloperEClass.getESuperTypes().add(this.getIECRole());
		iecTesterEClass.getESuperTypes().add(this.getIECRole());
		iecDeployerEClass.getESuperTypes().add(this.getIECRole());

		// Initialize classes, features, and operations; add parameters
		initEClass(iecFieldOfActivityAnnotationsRepositoryEClass, IECFieldOfActivityAnnotationsRepository.class, "IECFieldOfActivityAnnotationsRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECFieldOfActivityAnnotationsRepository_DevelopmentArtefactSpecification(), this.getIECDevelopmentArtefactSpecification(), this.getIECDevelopmentArtefactSpecification_Parent(), "developmentArtefactSpecification", null, 0, 1, IECFieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECFieldOfActivityAnnotationsRepository_TestSpecification(), this.getIECTestSpecification(), this.getIECTestSpecification_Parent(), "testSpecification", null, 0, 1, IECFieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECFieldOfActivityAnnotationsRepository_StaffSpecification(), this.getIECStaffSpecification(), this.getIECStaffSpecification_Parent(), "staffSpecification", null, 0, 1, IECFieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecDevelopmentArtefactSpecificationEClass, IECDevelopmentArtefactSpecification.class, "IECDevelopmentArtefactSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECDevelopmentArtefactSpecification_Parent(), this.getIECFieldOfActivityAnnotationsRepository(), this.getIECFieldOfActivityAnnotationsRepository_DevelopmentArtefactSpecification(), "parent", null, 1, 1, IECDevelopmentArtefactSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECDevelopmentArtefactSpecification_SourceFiles(), this.getIECSourceFile(), this.getIECSourceFile_Parent(), "sourceFiles", null, 0, -1, IECDevelopmentArtefactSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECDevelopmentArtefactSpecification_SourceFileAggregations(), this.getIECSourceFileAggregation(), this.getIECSourceFileAggregation_Parent(), "sourceFileAggregations", null, 0, -1, IECDevelopmentArtefactSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECDevelopmentArtefactSpecification_MetadataFiles(), this.getIECMetadataFile(), this.getIECMetadataFile_Parent(), "metadataFiles", null, 0, -1, IECDevelopmentArtefactSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECDevelopmentArtefactSpecification_MetadataFileAggregations(), this.getIECMetadataFileAggregation(), this.getIECMetadataFileAggregation_Parent(), "metadataFileAggregations", null, 0, -1, IECDevelopmentArtefactSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecSourceFileEClass, IECSourceFile.class, "IECSourceFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECSourceFile_Parent(), this.getIECDevelopmentArtefactSpecification(), this.getIECDevelopmentArtefactSpecification_SourceFiles(), "parent", null, 1, 1, IECSourceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECSourceFile_Component(), theIECRepositoryPackage.getIECComponent(), null, "component", null, 0, 1, IECSourceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecSourceFileAggregationEClass, IECSourceFileAggregation.class, "IECSourceFileAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECSourceFileAggregation_Parent(), this.getIECDevelopmentArtefactSpecification(), this.getIECDevelopmentArtefactSpecification_SourceFileAggregations(), "parent", null, 1, 1, IECSourceFileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECSourceFileAggregation_Component(), theIECRepositoryPackage.getIECComponent(), null, "component", null, 0, 1, IECSourceFileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecMetadataFileEClass, IECMetadataFile.class, "IECMetadataFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECMetadataFile_Parent(), this.getIECDevelopmentArtefactSpecification(), this.getIECDevelopmentArtefactSpecification_MetadataFiles(), "parent", null, 1, 1, IECMetadataFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECMetadataFile_Component(), theIECRepositoryPackage.getIECComponent(), null, "component", null, 0, 1, IECMetadataFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecMetadataFileAggregationEClass, IECMetadataFileAggregation.class, "IECMetadataFileAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECMetadataFileAggregation_Parent(), this.getIECDevelopmentArtefactSpecification(), this.getIECDevelopmentArtefactSpecification_MetadataFileAggregations(), "parent", null, 1, 1, IECMetadataFileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECMetadataFileAggregation_Component(), theIECRepositoryPackage.getIECComponent(), null, "component", null, 0, 1, IECMetadataFileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecTestSpecificationEClass, IECTestSpecification.class, "IECTestSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECTestSpecification_Parent(), this.getIECFieldOfActivityAnnotationsRepository(), this.getIECFieldOfActivityAnnotationsRepository_TestSpecification(), "parent", null, 1, 1, IECTestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECTestSpecification_UnitTestCases(), this.getIECUnitTestCase(), this.getIECUnitTestCase_Parent(), "unitTestCases", null, 0, -1, IECTestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECTestSpecification_AcceptanceTestCases(), this.getIECAcceptanceTestCase(), this.getIECAcceptanceTestCase_Parent(), "acceptanceTestCases", null, 0, -1, IECTestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECTestSpecification_UnitTestCaseAggregations(), this.getIECUnitTestCaseAggregation(), this.getIECUnitTestCaseAggregation_Parent(), "unitTestCaseAggregations", null, 0, -1, IECTestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECTestSpecification_AcceptanceTestCaseAggregations(), this.getIECAcceptanceTestCaseAggregation(), this.getIECAcceptanceTestCaseAggregation_Parent(), "acceptanceTestCaseAggregations", null, 0, -1, IECTestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecUnitTestCaseEClass, IECUnitTestCase.class, "IECUnitTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECUnitTestCase_Parent(), this.getIECTestSpecification(), this.getIECTestSpecification_UnitTestCases(), "parent", null, 1, 1, IECUnitTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECUnitTestCase_Component(), theIECRepositoryPackage.getIECComponent(), null, "component", null, 0, 1, IECUnitTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecAcceptanceTestCaseEClass, IECAcceptanceTestCase.class, "IECAcceptanceTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECAcceptanceTestCase_Parent(), this.getIECTestSpecification(), this.getIECTestSpecification_AcceptanceTestCases(), "parent", null, 1, 1, IECAcceptanceTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECAcceptanceTestCase_Component(), theIECRepositoryPackage.getIECComponent(), null, "component", null, 0, 1, IECAcceptanceTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecUnitTestCaseAggregationEClass, IECUnitTestCaseAggregation.class, "IECUnitTestCaseAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECUnitTestCaseAggregation_Parent(), this.getIECTestSpecification(), this.getIECTestSpecification_UnitTestCaseAggregations(), "parent", null, 1, 1, IECUnitTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECUnitTestCaseAggregation_Component(), theIECRepositoryPackage.getIECComponent(), null, "component", null, 0, 1, IECUnitTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecAcceptanceTestCaseAggregationEClass, IECAcceptanceTestCaseAggregation.class, "IECAcceptanceTestCaseAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECAcceptanceTestCaseAggregation_Parent(), this.getIECTestSpecification(), this.getIECTestSpecification_AcceptanceTestCaseAggregations(), "parent", null, 1, 1, IECAcceptanceTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECAcceptanceTestCaseAggregation_Component(), theIECRepositoryPackage.getIECComponent(), null, "component", null, 0, 1, IECAcceptanceTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecStaffSpecificationEClass, IECStaffSpecification.class, "IECStaffSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECStaffSpecification_Parent(), this.getIECFieldOfActivityAnnotationsRepository(), this.getIECFieldOfActivityAnnotationsRepository_StaffSpecification(), "parent", null, 1, 1, IECStaffSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECStaffSpecification_PersonList(), this.getIECPersonList(), this.getIECPersonList_Parent(), "personList", null, 1, 1, IECStaffSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECStaffSpecification_RoleList(), this.getIECRoleList(), this.getIECRoleList_Parent(), "roleList", null, 1, 1, IECStaffSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecPersonListEClass, IECPersonList.class, "IECPersonList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECPersonList_Parent(), this.getIECStaffSpecification(), this.getIECStaffSpecification_PersonList(), "parent", null, 1, 1, IECPersonList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECPersonList_Persons(), this.getIECPerson(), this.getIECPerson_Parent(), "persons", null, 0, -1, IECPersonList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecPersonEClass, IECPerson.class, "IECPerson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECPerson_Parent(), this.getIECPersonList(), this.getIECPersonList_Persons(), "parent", null, 1, 1, IECPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECPerson_Roles(), this.getIECRole(), this.getIECRole_Person(), "roles", null, 0, -1, IECPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIECPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, IECPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecRoleEClass, IECRole.class, "IECRole", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECRole_Parent(), this.getIECRoleList(), this.getIECRoleList_Roles(), "parent", null, 1, 1, IECRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECRole_Person(), this.getIECPerson(), this.getIECPerson_Roles(), "person", null, 0, -1, IECRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIECRole_Description(), ecorePackage.getEString(), "description", null, 0, 1, IECRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECRole_Components(), theIECRepositoryPackage.getIECComponent(), null, "components", null, 0, -1, IECRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecRoleListEClass, IECRoleList.class, "IECRoleList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECRoleList_Parent(), this.getIECStaffSpecification(), this.getIECStaffSpecification_RoleList(), "parent", null, 1, 1, IECRoleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECRoleList_Roles(), this.getIECRole(), this.getIECRole_Parent(), "roles", null, 0, -1, IECRoleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecDeveloperEClass, IECDeveloper.class, "IECDeveloper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iecTestDeveloperEClass, IECTestDeveloper.class, "IECTestDeveloper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iecTesterEClass, IECTester.class, "IECTester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iecDeployerEClass, IECDeployer.class, "IECDeployer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iecFileEClass, IECFile.class, "IECFile", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIECFile_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, IECFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecFileAggregationEClass, IECFileAggregation.class, "IECFileAggregation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIECFileAggregation_NumberOfFiles(), ecorePackage.getEInt(), "numberOfFiles", null, 0, 1, IECFileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecTestCaseEClass, IECTestCase.class, "IECTestCase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIECTestCase_NameOfTest(), ecorePackage.getEString(), "nameOfTest", null, 0, 1, IECTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecTestCaseAggregationEClass, IECTestCaseAggregation.class, "IECTestCaseAggregation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIECTestCaseAggregation_NumberOfTestcases(), ecorePackage.getEInt(), "numberOfTestcases", null, 0, 1, IECTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIECTestCaseAggregation_NameOfTestSuite(), ecorePackage.getEString(), "nameOfTestSuite", null, 0, 1, IECTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IECFieldOfActivityAnnotationsPackageImpl
