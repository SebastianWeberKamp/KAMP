/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.provider;


import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IECMethodItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECMethodItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addImplementsPropertyDescriptor(object);
			addHasDerivedReturnTypePropertyDescriptor(object);
			addInstantiatesInterfacePropertyDescriptor(object);
			addInstantiatesFunctionBlockPropertyDescriptor(object);
			addReadsGlobalVariablePropertyDescriptor(object);
			addWritesGlobalVariablePropertyDescriptor(object);
			addReadsPropertyPropertyDescriptor(object);
			addWritesPropertyPropertyDescriptor(object);
			addCallsMethodPropertyDescriptor(object);
			addCallsFunctionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Implements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IECMethod_implements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IECMethod_implements_feature", "_UI_IECMethod_type"),
				 IECRepositoryPackage.Literals.IEC_METHOD__IMPLEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Derived Return Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasDerivedReturnTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IECMethod_HasDerivedReturnType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IECMethod_HasDerivedReturnType_feature", "_UI_IECMethod_type"),
				 IECRepositoryPackage.Literals.IEC_METHOD__HAS_DERIVED_RETURN_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instantiates Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstantiatesInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IECMethod_InstantiatesInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IECMethod_InstantiatesInterface_feature", "_UI_IECMethod_type"),
				 IECRepositoryPackage.Literals.IEC_METHOD__INSTANTIATES_INTERFACE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instantiates Function Block feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstantiatesFunctionBlockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IECMethod_InstantiatesFunctionBlock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IECMethod_InstantiatesFunctionBlock_feature", "_UI_IECMethod_type"),
				 IECRepositoryPackage.Literals.IEC_METHOD__INSTANTIATES_FUNCTION_BLOCK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reads Global Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadsGlobalVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IECMethod_ReadsGlobalVariable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IECMethod_ReadsGlobalVariable_feature", "_UI_IECMethod_type"),
				 IECRepositoryPackage.Literals.IEC_METHOD__READS_GLOBAL_VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Writes Global Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWritesGlobalVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IECMethod_WritesGlobalVariable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IECMethod_WritesGlobalVariable_feature", "_UI_IECMethod_type"),
				 IECRepositoryPackage.Literals.IEC_METHOD__WRITES_GLOBAL_VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reads Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadsPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IECMethod_ReadsProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IECMethod_ReadsProperty_feature", "_UI_IECMethod_type"),
				 IECRepositoryPackage.Literals.IEC_METHOD__READS_PROPERTY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Writes Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWritesPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IECMethod_WritesProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IECMethod_WritesProperty_feature", "_UI_IECMethod_type"),
				 IECRepositoryPackage.Literals.IEC_METHOD__WRITES_PROPERTY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Calls Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCallsMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IECMethod_CallsMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IECMethod_CallsMethod_feature", "_UI_IECMethod_type"),
				 IECRepositoryPackage.Literals.IEC_METHOD__CALLS_METHOD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Calls Function feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCallsFunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IECMethod_CallsFunction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IECMethod_CallsFunction_feature", "_UI_IECMethod_type"),
				 IECRepositoryPackage.Literals.IEC_METHOD__CALLS_FUNCTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IECMethod.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IECMethod"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IECMethod)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IECMethod_type") :
			getString("_UI_IECMethod_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
