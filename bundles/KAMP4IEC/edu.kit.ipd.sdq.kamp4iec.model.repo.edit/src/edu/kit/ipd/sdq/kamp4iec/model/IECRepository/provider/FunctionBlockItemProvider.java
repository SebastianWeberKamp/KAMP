/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.provider;


import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionBlockItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockItemProvider(AdapterFactory adapterFactory) {
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
			addInstantiatesInterfacePropertyDescriptor(object);
			addInstantiatesFunctionBlockPropertyDescriptor(object);
			addReadsGlobalVariablePropertyDescriptor(object);
			addWritesGlobalVariablePropertyDescriptor(object);
			addReadsPropertyPropertyDescriptor(object);
			addWritesPropertyPropertyDescriptor(object);
			addCallsMethodPropertyDescriptor(object);
			addCallsFunctionPropertyDescriptor(object);
			addExtendsFunctionBlockPropertyDescriptor(object);
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
				 getString("_UI_FunctionBlock_Implements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionBlock_Implements_feature", "_UI_FunctionBlock_type"),
				 IECRepositoryPackage.Literals.FUNCTION_BLOCK__IMPLEMENTS,
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
				 getString("_UI_FunctionBlock_InstantiatesInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionBlock_InstantiatesInterface_feature", "_UI_FunctionBlock_type"),
				 IECRepositoryPackage.Literals.FUNCTION_BLOCK__INSTANTIATES_INTERFACE,
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
				 getString("_UI_FunctionBlock_InstantiatesFunctionBlock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionBlock_InstantiatesFunctionBlock_feature", "_UI_FunctionBlock_type"),
				 IECRepositoryPackage.Literals.FUNCTION_BLOCK__INSTANTIATES_FUNCTION_BLOCK,
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
				 getString("_UI_FunctionBlock_ReadsGlobalVariable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionBlock_ReadsGlobalVariable_feature", "_UI_FunctionBlock_type"),
				 IECRepositoryPackage.Literals.FUNCTION_BLOCK__READS_GLOBAL_VARIABLE,
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
				 getString("_UI_FunctionBlock_WritesGlobalVariable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionBlock_WritesGlobalVariable_feature", "_UI_FunctionBlock_type"),
				 IECRepositoryPackage.Literals.FUNCTION_BLOCK__WRITES_GLOBAL_VARIABLE,
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
				 getString("_UI_FunctionBlock_ReadsProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionBlock_ReadsProperty_feature", "_UI_FunctionBlock_type"),
				 IECRepositoryPackage.Literals.FUNCTION_BLOCK__READS_PROPERTY,
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
				 getString("_UI_FunctionBlock_WritesProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionBlock_WritesProperty_feature", "_UI_FunctionBlock_type"),
				 IECRepositoryPackage.Literals.FUNCTION_BLOCK__WRITES_PROPERTY,
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
				 getString("_UI_FunctionBlock_CallsMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionBlock_CallsMethod_feature", "_UI_FunctionBlock_type"),
				 IECRepositoryPackage.Literals.FUNCTION_BLOCK__CALLS_METHOD,
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
				 getString("_UI_FunctionBlock_CallsFunction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionBlock_CallsFunction_feature", "_UI_FunctionBlock_type"),
				 IECRepositoryPackage.Literals.FUNCTION_BLOCK__CALLS_FUNCTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extends Function Block feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendsFunctionBlockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionBlock_ExtendsFunctionBlock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionBlock_ExtendsFunctionBlock_feature", "_UI_FunctionBlock_type"),
				 IECRepositoryPackage.Literals.FUNCTION_BLOCK__EXTENDS_FUNCTION_BLOCK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(IECRepositoryPackage.Literals.FUNCTION_BLOCK__HAS_METHOD);
			childrenFeatures.add(IECRepositoryPackage.Literals.FUNCTION_BLOCK__HAS_PROPERTY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FunctionBlock.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionBlock"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FunctionBlock)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FunctionBlock_type") :
			getString("_UI_FunctionBlock_type") + " " + label;
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

		switch (notification.getFeatureID(FunctionBlock.class)) {
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_METHOD:
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_PROPERTY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
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

		newChildDescriptors.add
			(createChildParameter
				(IECRepositoryPackage.Literals.FUNCTION_BLOCK__HAS_METHOD,
				 IECRepositoryFactory.eINSTANCE.createIECMethod()));

		newChildDescriptors.add
			(createChildParameter
				(IECRepositoryPackage.Literals.FUNCTION_BLOCK__HAS_PROPERTY,
				 IECRepositoryFactory.eINSTANCE.createIECProperty()));
	}

}
