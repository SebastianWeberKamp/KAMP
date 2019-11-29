/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.provider;


import edu.kit.ipd.sdq.kamp.model.modificationmarks.provider.ChangePropagationStepItemProvider;

import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECChangePropagationDueToDataDependency;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECChangePropagationDueToDataDependency} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IECChangePropagationDueToDataDependencyItemProvider extends ChangePropagationStepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECChangePropagationDueToDataDependencyItemProvider(AdapterFactory adapterFactory) {
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

			addChangedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Changed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IECChangePropagationDueToDataDependency_changed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IECChangePropagationDueToDataDependency_changed_feature", "_UI_IECChangePropagationDueToDataDependency_type"),
				 IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CHANGED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_BLOCK_MODIFICATIONS);
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__GLOBAL_VARIABLE_MODIFICATIONS);
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_MODIFICATIONS);
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__INTERFACE_MODIFICATIONS);
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_METHOD_MODIFICATIONS);
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_PROPERTY_MODIFICATIONS);
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROGRAM_MODIFICATIONS);
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CONFIGURATION_MODIFICATIONS);
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__METHOD_MODIFICATIONS);
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROPERTY_MODIFICATIONS);
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
	 * This returns IECChangePropagationDueToDataDependency.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IECChangePropagationDueToDataDependency"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IECChangePropagationDueToDataDependency iecChangePropagationDueToDataDependency = (IECChangePropagationDueToDataDependency)object;
		return getString("_UI_IECChangePropagationDueToDataDependency_type") + " " + iecChangePropagationDueToDataDependency.isChanged();
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

		switch (notification.getFeatureID(IECChangePropagationDueToDataDependency.class)) {
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CHANGED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_BLOCK_MODIFICATIONS:
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__GLOBAL_VARIABLE_MODIFICATIONS:
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_MODIFICATIONS:
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__INTERFACE_MODIFICATIONS:
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_METHOD_MODIFICATIONS:
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_PROPERTY_MODIFICATIONS:
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROGRAM_MODIFICATIONS:
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CONFIGURATION_MODIFICATIONS:
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__METHOD_MODIFICATIONS:
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROPERTY_MODIFICATIONS:
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
				(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_BLOCK_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyFunctionBlock()));

		newChildDescriptors.add
			(createChildParameter
				(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__GLOBAL_VARIABLE_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyGlobalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyFunction()));

		newChildDescriptors.add
			(createChildParameter
				(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__INTERFACE_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyInterface()));

		newChildDescriptors.add
			(createChildParameter
				(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_METHOD_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyAbstractMethod()));

		newChildDescriptors.add
			(createChildParameter
				(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_PROPERTY_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyAbstractProperty()));

		newChildDescriptors.add
			(createChildParameter
				(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROGRAM_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyProgram()));

		newChildDescriptors.add
			(createChildParameter
				(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CONFIGURATION_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__METHOD_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyMethod()));

		newChildDescriptors.add
			(createChildParameter
				(IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROPERTY_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyProperty()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return IECModificationmarksEditPlugin.INSTANCE;
	}

}
