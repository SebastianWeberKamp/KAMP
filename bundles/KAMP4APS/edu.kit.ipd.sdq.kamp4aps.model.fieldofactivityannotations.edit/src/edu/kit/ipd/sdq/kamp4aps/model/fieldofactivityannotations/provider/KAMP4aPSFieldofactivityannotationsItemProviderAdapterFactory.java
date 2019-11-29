/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.provider;

import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.util.KAMP4aPSFieldofactivityannotationsAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KAMP4aPSFieldofactivityannotationsItemProviderAdapterFactory extends KAMP4aPSFieldofactivityannotationsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAMP4aPSFieldofactivityannotationsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldOfActivityAnnotationRepositoryItemProvider fieldOfActivityAnnotationRepositoryItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFieldOfActivityAnnotationRepositoryAdapter() {
		if (fieldOfActivityAnnotationRepositoryItemProvider == null) {
			fieldOfActivityAnnotationRepositoryItemProvider = new FieldOfActivityAnnotationRepositoryItemProvider(this);
		}

		return fieldOfActivityAnnotationRepositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSpecificationItemProvider testSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTestSpecificationAdapter() {
		if (testSpecificationItemProvider == null) {
			testSpecificationItemProvider = new TestSpecificationItemProvider(this);
		}

		return testSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StockSpecificationItemProvider stockSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStockSpecificationAdapter() {
		if (stockSpecificationItemProvider == null) {
			stockSpecificationItemProvider = new StockSpecificationItemProvider(this);
		}

		return stockSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMISpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMISpecificationItemProvider hmiSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMISpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHMISpecificationAdapter() {
		if (hmiSpecificationItemProvider == null) {
			hmiSpecificationItemProvider = new HMISpecificationItemProvider(this);
		}

		return hmiSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ECADSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECADSpecificationItemProvider ecadSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ECADSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createECADSpecificationAdapter() {
		if (ecadSpecificationItemProvider == null) {
			ecadSpecificationItemProvider = new ECADSpecificationItemProvider(this);
		}

		return ecadSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationSpecificationItemProvider documentationSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentationSpecificationAdapter() {
		if (documentationSpecificationItemProvider == null) {
			documentationSpecificationItemProvider = new DocumentationSpecificationItemProvider(this);
		}

		return documentationSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StaffSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffSpecificationItemProvider staffSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StaffSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStaffSpecificationAdapter() {
		if (staffSpecificationItemProvider == null) {
			staffSpecificationItemProvider = new StaffSpecificationItemProvider(this);
		}

		return staffSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalibrationSpecificationItemProvider calibrationSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCalibrationSpecificationAdapter() {
		if (calibrationSpecificationItemProvider == null) {
			calibrationSpecificationItemProvider = new CalibrationSpecificationItemProvider(this);
		}

		return calibrationSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalibrationConfigurationItemProvider calibrationConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCalibrationConfigurationAdapter() {
		if (calibrationConfigurationItemProvider == null) {
			calibrationConfigurationItemProvider = new CalibrationConfigurationItemProvider(this);
		}

		return calibrationConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMIConfigurationItemProvider hmiConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHMIConfigurationAdapter() {
		if (hmiConfigurationItemProvider == null) {
			hmiConfigurationItemProvider = new HMIConfigurationItemProvider(this);
		}

		return hmiConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.PersonList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonListItemProvider personListItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.PersonList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPersonListAdapter() {
		if (personListItemProvider == null) {
			personListItemProvider = new PersonListItemProvider(this);
		}

		return personListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Person} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonItemProvider personItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPersonAdapter() {
		if (personItemProvider == null) {
			personItemProvider = new PersonItemProvider(this);
		}

		return personItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.RoleList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleListItemProvider roleListItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.RoleList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleListAdapter() {
		if (roleListItemProvider == null) {
			roleListItemProvider = new RoleListItemProvider(this);
		}

		return roleListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.SystemTest} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemTestItemProvider systemTestItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.SystemTest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemTestAdapter() {
		if (systemTestItemProvider == null) {
			systemTestItemProvider = new SystemTestItemProvider(this);
		}

		return systemTestItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Engineer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineerItemProvider engineerItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Engineer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEngineerAdapter() {
		if (engineerItemProvider == null) {
			engineerItemProvider = new EngineerItemProvider(this);
		}

		return engineerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Purchaser} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurchaserItemProvider purchaserItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Purchaser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPurchaserAdapter() {
		if (purchaserItemProvider == null) {
			purchaserItemProvider = new PurchaserItemProvider(this);
		}

		return purchaserItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Mechanic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MechanicItemProvider mechanicItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Mechanic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMechanicAdapter() {
		if (mechanicItemProvider == null) {
			mechanicItemProvider = new MechanicItemProvider(this);
		}

		return mechanicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Documentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationItemProvider documentationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Documentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentationAdapter() {
		if (documentationItemProvider == null) {
			documentationItemProvider = new DocumentationItemProvider(this);
		}

		return documentationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Drawing} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrawingItemProvider drawingItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Drawing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDrawingAdapter() {
		if (drawingItemProvider == null) {
			drawingItemProvider = new DrawingItemProvider(this);
		}

		return drawingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDrawing} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDrawingItemProvider componentDrawingItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDrawing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentDrawingAdapter() {
		if (componentDrawingItemProvider == null) {
			componentDrawingItemProvider = new ComponentDrawingItemProvider(this);
		}

		return componentDrawingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDrawing} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleDrawingItemProvider moduleDrawingItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDrawing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuleDrawingAdapter() {
		if (moduleDrawingItemProvider == null) {
			moduleDrawingItemProvider = new ModuleDrawingItemProvider(this);
		}

		return moduleDrawingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDrawing} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDrawingItemProvider interfaceDrawingItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDrawing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterfaceDrawingAdapter() {
		if (interfaceDrawingItemProvider == null) {
			interfaceDrawingItemProvider = new InterfaceDrawingItemProvider(this);
		}

		return interfaceDrawingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDrawing} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureDrawingItemProvider structureDrawingItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDrawing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructureDrawingAdapter() {
		if (structureDrawingItemProvider == null) {
			structureDrawingItemProvider = new StructureDrawingItemProvider(this);
		}

		return structureDrawingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.MainteneanceDocumentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainteneanceDocumentationItemProvider mainteneanceDocumentationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.MainteneanceDocumentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMainteneanceDocumentationAdapter() {
		if (mainteneanceDocumentationItemProvider == null) {
			mainteneanceDocumentationItemProvider = new MainteneanceDocumentationItemProvider(this);
		}

		return mainteneanceDocumentationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.OperatorInstructions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorInstructionsItemProvider operatorInstructionsItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.OperatorInstructions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperatorInstructionsAdapter() {
		if (operatorInstructionsItemProvider == null) {
			operatorInstructionsItemProvider = new OperatorInstructionsItemProvider(this);
		}

		return operatorInstructionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocIntern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainingDocInternItemProvider trainingDocInternItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocIntern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrainingDocInternAdapter() {
		if (trainingDocInternItemProvider == null) {
			trainingDocInternItemProvider = new TrainingDocInternItemProvider(this);
		}

		return trainingDocInternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocExternal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainingDocExternalItemProvider trainingDocExternalItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocExternal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrainingDocExternalAdapter() {
		if (trainingDocExternalItemProvider == null) {
			trainingDocExternalItemProvider = new TrainingDocExternalItemProvider(this);
		}

		return trainingDocExternalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDocumentationFiles} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDocumentationFilesItemProvider componentDocumentationFilesItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDocumentationFiles}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentDocumentationFilesAdapter() {
		if (componentDocumentationFilesItemProvider == null) {
			componentDocumentationFilesItemProvider = new ComponentDocumentationFilesItemProvider(this);
		}

		return componentDocumentationFilesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDocumentationFiles} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleDocumentationFilesItemProvider moduleDocumentationFilesItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDocumentationFiles}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuleDocumentationFilesAdapter() {
		if (moduleDocumentationFilesItemProvider == null) {
			moduleDocumentationFilesItemProvider = new ModuleDocumentationFilesItemProvider(this);
		}

		return moduleDocumentationFilesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDocumentationFiles} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDocumentationFilesItemProvider interfaceDocumentationFilesItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDocumentationFiles}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterfaceDocumentationFilesAdapter() {
		if (interfaceDocumentationFilesItemProvider == null) {
			interfaceDocumentationFilesItemProvider = new InterfaceDocumentationFilesItemProvider(this);
		}

		return interfaceDocumentationFilesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDocumentationFiles} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureDocumentationFilesItemProvider structureDocumentationFilesItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDocumentationFiles}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructureDocumentationFilesAdapter() {
		if (structureDocumentationFilesItemProvider == null) {
			structureDocumentationFilesItemProvider = new StructureDocumentationFilesItemProvider(this);
		}

		return structureDocumentationFilesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StockListItemProvider stockListItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStockListAdapter() {
		if (stockListItemProvider == null) {
			stockListItemProvider = new StockListItemProvider(this);
		}

		return stockListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentStockList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentStockListItemProvider componentStockListItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentStockList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentStockListAdapter() {
		if (componentStockListItemProvider == null) {
			componentStockListItemProvider = new ComponentStockListItemProvider(this);
		}

		return componentStockListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceStockList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceStockListItemProvider interfaceStockListItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceStockList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterfaceStockListAdapter() {
		if (interfaceStockListItemProvider == null) {
			interfaceStockListItemProvider = new InterfaceStockListItemProvider(this);
		}

		return interfaceStockListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleStockList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleStockListItemProvider moduleStockListItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleStockList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuleStockListAdapter() {
		if (moduleStockListItemProvider == null) {
			moduleStockListItemProvider = new ModuleStockListItemProvider(this);
		}

		return moduleStockListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureStockList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureStockListItemProvider structureStockListItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureStockList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructureStockListAdapter() {
		if (structureStockListItemProvider == null) {
			structureStockListItemProvider = new StructureStockListItemProvider(this);
		}

		return structureStockListItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (fieldOfActivityAnnotationRepositoryItemProvider != null) fieldOfActivityAnnotationRepositoryItemProvider.dispose();
		if (testSpecificationItemProvider != null) testSpecificationItemProvider.dispose();
		if (stockSpecificationItemProvider != null) stockSpecificationItemProvider.dispose();
		if (hmiSpecificationItemProvider != null) hmiSpecificationItemProvider.dispose();
		if (ecadSpecificationItemProvider != null) ecadSpecificationItemProvider.dispose();
		if (documentationSpecificationItemProvider != null) documentationSpecificationItemProvider.dispose();
		if (staffSpecificationItemProvider != null) staffSpecificationItemProvider.dispose();
		if (calibrationSpecificationItemProvider != null) calibrationSpecificationItemProvider.dispose();
		if (calibrationConfigurationItemProvider != null) calibrationConfigurationItemProvider.dispose();
		if (hmiConfigurationItemProvider != null) hmiConfigurationItemProvider.dispose();
		if (personListItemProvider != null) personListItemProvider.dispose();
		if (personItemProvider != null) personItemProvider.dispose();
		if (roleListItemProvider != null) roleListItemProvider.dispose();
		if (systemTestItemProvider != null) systemTestItemProvider.dispose();
		if (engineerItemProvider != null) engineerItemProvider.dispose();
		if (purchaserItemProvider != null) purchaserItemProvider.dispose();
		if (mechanicItemProvider != null) mechanicItemProvider.dispose();
		if (documentationItemProvider != null) documentationItemProvider.dispose();
		if (drawingItemProvider != null) drawingItemProvider.dispose();
		if (componentDrawingItemProvider != null) componentDrawingItemProvider.dispose();
		if (moduleDrawingItemProvider != null) moduleDrawingItemProvider.dispose();
		if (interfaceDrawingItemProvider != null) interfaceDrawingItemProvider.dispose();
		if (structureDrawingItemProvider != null) structureDrawingItemProvider.dispose();
		if (mainteneanceDocumentationItemProvider != null) mainteneanceDocumentationItemProvider.dispose();
		if (operatorInstructionsItemProvider != null) operatorInstructionsItemProvider.dispose();
		if (trainingDocInternItemProvider != null) trainingDocInternItemProvider.dispose();
		if (trainingDocExternalItemProvider != null) trainingDocExternalItemProvider.dispose();
		if (componentDocumentationFilesItemProvider != null) componentDocumentationFilesItemProvider.dispose();
		if (moduleDocumentationFilesItemProvider != null) moduleDocumentationFilesItemProvider.dispose();
		if (interfaceDocumentationFilesItemProvider != null) interfaceDocumentationFilesItemProvider.dispose();
		if (structureDocumentationFilesItemProvider != null) structureDocumentationFilesItemProvider.dispose();
		if (stockListItemProvider != null) stockListItemProvider.dispose();
		if (componentStockListItemProvider != null) componentStockListItemProvider.dispose();
		if (interfaceStockListItemProvider != null) interfaceStockListItemProvider.dispose();
		if (moduleStockListItemProvider != null) moduleStockListItemProvider.dispose();
		if (structureStockListItemProvider != null) structureStockListItemProvider.dispose();
	}

}
