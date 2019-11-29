/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ChangePropagationStepImpl;

import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECChangePropagationDueToDataDependency;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyAbstractMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyAbstractProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyConfiguration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyFunction;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyFunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyGlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyProgram;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC Change Propagation Due To Data Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.impl.IECChangePropagationDueToDataDependencyImpl#getFunctionBlockModifications <em>Function Block Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.impl.IECChangePropagationDueToDataDependencyImpl#getGlobalVariableModifications <em>Global Variable Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.impl.IECChangePropagationDueToDataDependencyImpl#getFunctionModifications <em>Function Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.impl.IECChangePropagationDueToDataDependencyImpl#getInterfaceModifications <em>Interface Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.impl.IECChangePropagationDueToDataDependencyImpl#getAbstractMethodModifications <em>Abstract Method Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.impl.IECChangePropagationDueToDataDependencyImpl#getAbstractPropertyModifications <em>Abstract Property Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.impl.IECChangePropagationDueToDataDependencyImpl#getProgramModifications <em>Program Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.impl.IECChangePropagationDueToDataDependencyImpl#getConfigurationModifications <em>Configuration Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.impl.IECChangePropagationDueToDataDependencyImpl#getMethodModifications <em>Method Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.impl.IECChangePropagationDueToDataDependencyImpl#getPropertyModifications <em>Property Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.impl.IECChangePropagationDueToDataDependencyImpl#isChanged <em>Changed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IECChangePropagationDueToDataDependencyImpl extends ChangePropagationStepImpl implements IECChangePropagationDueToDataDependency {
	/**
	 * The cached value of the '{@link #getFunctionBlockModifications() <em>Function Block Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionBlockModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyFunctionBlock> functionBlockModifications;

	/**
	 * The cached value of the '{@link #getGlobalVariableModifications() <em>Global Variable Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariableModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyGlobalVariable> globalVariableModifications;

	/**
	 * The cached value of the '{@link #getFunctionModifications() <em>Function Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyFunction> functionModifications;

	/**
	 * The cached value of the '{@link #getInterfaceModifications() <em>Interface Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyInterface> interfaceModifications;

	/**
	 * The cached value of the '{@link #getAbstractMethodModifications() <em>Abstract Method Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractMethodModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyAbstractMethod> abstractMethodModifications;

	/**
	 * The cached value of the '{@link #getAbstractPropertyModifications() <em>Abstract Property Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractPropertyModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyAbstractProperty> abstractPropertyModifications;

	/**
	 * The cached value of the '{@link #getProgramModifications() <em>Program Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyProgram> programModifications;

	/**
	 * The cached value of the '{@link #getConfigurationModifications() <em>Configuration Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyConfiguration> configurationModifications;

	/**
	 * The cached value of the '{@link #getMethodModifications() <em>Method Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyMethod> methodModifications;

	/**
	 * The cached value of the '{@link #getPropertyModifications() <em>Property Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyProperty> propertyModifications;

	/**
	 * The default value of the '{@link #isChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChanged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChanged()
	 * @generated
	 * @ordered
	 */
	protected boolean changed = CHANGED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECChangePropagationDueToDataDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECModificationmarksPackage.Literals.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyFunctionBlock> getFunctionBlockModifications() {
		if (functionBlockModifications == null) {
			functionBlockModifications = new EObjectContainmentEList<IECModifyFunctionBlock>(IECModifyFunctionBlock.class, this, IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_BLOCK_MODIFICATIONS);
		}
		return functionBlockModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyGlobalVariable> getGlobalVariableModifications() {
		if (globalVariableModifications == null) {
			globalVariableModifications = new EObjectContainmentEList<IECModifyGlobalVariable>(IECModifyGlobalVariable.class, this, IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__GLOBAL_VARIABLE_MODIFICATIONS);
		}
		return globalVariableModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyFunction> getFunctionModifications() {
		if (functionModifications == null) {
			functionModifications = new EObjectContainmentEList<IECModifyFunction>(IECModifyFunction.class, this, IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_MODIFICATIONS);
		}
		return functionModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyInterface> getInterfaceModifications() {
		if (interfaceModifications == null) {
			interfaceModifications = new EObjectContainmentEList<IECModifyInterface>(IECModifyInterface.class, this, IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__INTERFACE_MODIFICATIONS);
		}
		return interfaceModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyAbstractMethod> getAbstractMethodModifications() {
		if (abstractMethodModifications == null) {
			abstractMethodModifications = new EObjectContainmentEList<IECModifyAbstractMethod>(IECModifyAbstractMethod.class, this, IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_METHOD_MODIFICATIONS);
		}
		return abstractMethodModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyAbstractProperty> getAbstractPropertyModifications() {
		if (abstractPropertyModifications == null) {
			abstractPropertyModifications = new EObjectContainmentEList<IECModifyAbstractProperty>(IECModifyAbstractProperty.class, this, IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_PROPERTY_MODIFICATIONS);
		}
		return abstractPropertyModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyProgram> getProgramModifications() {
		if (programModifications == null) {
			programModifications = new EObjectContainmentEList<IECModifyProgram>(IECModifyProgram.class, this, IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROGRAM_MODIFICATIONS);
		}
		return programModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyConfiguration> getConfigurationModifications() {
		if (configurationModifications == null) {
			configurationModifications = new EObjectContainmentEList<IECModifyConfiguration>(IECModifyConfiguration.class, this, IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CONFIGURATION_MODIFICATIONS);
		}
		return configurationModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyMethod> getMethodModifications() {
		if (methodModifications == null) {
			methodModifications = new EObjectContainmentEList<IECModifyMethod>(IECModifyMethod.class, this, IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__METHOD_MODIFICATIONS);
		}
		return methodModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyProperty> getPropertyModifications() {
		if (propertyModifications == null) {
			propertyModifications = new EObjectContainmentEList<IECModifyProperty>(IECModifyProperty.class, this, IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROPERTY_MODIFICATIONS);
		}
		return propertyModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChanged() {
		return changed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChanged(boolean newChanged) {
		boolean oldChanged = changed;
		changed = newChanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CHANGED, oldChanged, changed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_BLOCK_MODIFICATIONS:
				return ((InternalEList<?>)getFunctionBlockModifications()).basicRemove(otherEnd, msgs);
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__GLOBAL_VARIABLE_MODIFICATIONS:
				return ((InternalEList<?>)getGlobalVariableModifications()).basicRemove(otherEnd, msgs);
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_MODIFICATIONS:
				return ((InternalEList<?>)getFunctionModifications()).basicRemove(otherEnd, msgs);
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__INTERFACE_MODIFICATIONS:
				return ((InternalEList<?>)getInterfaceModifications()).basicRemove(otherEnd, msgs);
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_METHOD_MODIFICATIONS:
				return ((InternalEList<?>)getAbstractMethodModifications()).basicRemove(otherEnd, msgs);
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_PROPERTY_MODIFICATIONS:
				return ((InternalEList<?>)getAbstractPropertyModifications()).basicRemove(otherEnd, msgs);
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROGRAM_MODIFICATIONS:
				return ((InternalEList<?>)getProgramModifications()).basicRemove(otherEnd, msgs);
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CONFIGURATION_MODIFICATIONS:
				return ((InternalEList<?>)getConfigurationModifications()).basicRemove(otherEnd, msgs);
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__METHOD_MODIFICATIONS:
				return ((InternalEList<?>)getMethodModifications()).basicRemove(otherEnd, msgs);
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROPERTY_MODIFICATIONS:
				return ((InternalEList<?>)getPropertyModifications()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_BLOCK_MODIFICATIONS:
				return getFunctionBlockModifications();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__GLOBAL_VARIABLE_MODIFICATIONS:
				return getGlobalVariableModifications();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_MODIFICATIONS:
				return getFunctionModifications();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__INTERFACE_MODIFICATIONS:
				return getInterfaceModifications();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_METHOD_MODIFICATIONS:
				return getAbstractMethodModifications();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_PROPERTY_MODIFICATIONS:
				return getAbstractPropertyModifications();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROGRAM_MODIFICATIONS:
				return getProgramModifications();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CONFIGURATION_MODIFICATIONS:
				return getConfigurationModifications();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__METHOD_MODIFICATIONS:
				return getMethodModifications();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROPERTY_MODIFICATIONS:
				return getPropertyModifications();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CHANGED:
				return isChanged();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_BLOCK_MODIFICATIONS:
				getFunctionBlockModifications().clear();
				getFunctionBlockModifications().addAll((Collection<? extends IECModifyFunctionBlock>)newValue);
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__GLOBAL_VARIABLE_MODIFICATIONS:
				getGlobalVariableModifications().clear();
				getGlobalVariableModifications().addAll((Collection<? extends IECModifyGlobalVariable>)newValue);
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_MODIFICATIONS:
				getFunctionModifications().clear();
				getFunctionModifications().addAll((Collection<? extends IECModifyFunction>)newValue);
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__INTERFACE_MODIFICATIONS:
				getInterfaceModifications().clear();
				getInterfaceModifications().addAll((Collection<? extends IECModifyInterface>)newValue);
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_METHOD_MODIFICATIONS:
				getAbstractMethodModifications().clear();
				getAbstractMethodModifications().addAll((Collection<? extends IECModifyAbstractMethod>)newValue);
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_PROPERTY_MODIFICATIONS:
				getAbstractPropertyModifications().clear();
				getAbstractPropertyModifications().addAll((Collection<? extends IECModifyAbstractProperty>)newValue);
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROGRAM_MODIFICATIONS:
				getProgramModifications().clear();
				getProgramModifications().addAll((Collection<? extends IECModifyProgram>)newValue);
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CONFIGURATION_MODIFICATIONS:
				getConfigurationModifications().clear();
				getConfigurationModifications().addAll((Collection<? extends IECModifyConfiguration>)newValue);
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__METHOD_MODIFICATIONS:
				getMethodModifications().clear();
				getMethodModifications().addAll((Collection<? extends IECModifyMethod>)newValue);
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROPERTY_MODIFICATIONS:
				getPropertyModifications().clear();
				getPropertyModifications().addAll((Collection<? extends IECModifyProperty>)newValue);
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CHANGED:
				setChanged((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_BLOCK_MODIFICATIONS:
				getFunctionBlockModifications().clear();
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__GLOBAL_VARIABLE_MODIFICATIONS:
				getGlobalVariableModifications().clear();
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_MODIFICATIONS:
				getFunctionModifications().clear();
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__INTERFACE_MODIFICATIONS:
				getInterfaceModifications().clear();
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_METHOD_MODIFICATIONS:
				getAbstractMethodModifications().clear();
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_PROPERTY_MODIFICATIONS:
				getAbstractPropertyModifications().clear();
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROGRAM_MODIFICATIONS:
				getProgramModifications().clear();
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CONFIGURATION_MODIFICATIONS:
				getConfigurationModifications().clear();
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__METHOD_MODIFICATIONS:
				getMethodModifications().clear();
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROPERTY_MODIFICATIONS:
				getPropertyModifications().clear();
				return;
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CHANGED:
				setChanged(CHANGED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_BLOCK_MODIFICATIONS:
				return functionBlockModifications != null && !functionBlockModifications.isEmpty();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__GLOBAL_VARIABLE_MODIFICATIONS:
				return globalVariableModifications != null && !globalVariableModifications.isEmpty();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_MODIFICATIONS:
				return functionModifications != null && !functionModifications.isEmpty();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__INTERFACE_MODIFICATIONS:
				return interfaceModifications != null && !interfaceModifications.isEmpty();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_METHOD_MODIFICATIONS:
				return abstractMethodModifications != null && !abstractMethodModifications.isEmpty();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_PROPERTY_MODIFICATIONS:
				return abstractPropertyModifications != null && !abstractPropertyModifications.isEmpty();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROGRAM_MODIFICATIONS:
				return programModifications != null && !programModifications.isEmpty();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CONFIGURATION_MODIFICATIONS:
				return configurationModifications != null && !configurationModifications.isEmpty();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__METHOD_MODIFICATIONS:
				return methodModifications != null && !methodModifications.isEmpty();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROPERTY_MODIFICATIONS:
				return propertyModifications != null && !propertyModifications.isEmpty();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CHANGED:
				return changed != CHANGED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (changed: ");
		result.append(changed);
		result.append(')');
		return result.toString();
	}

} //IECChangePropagationDueToDataDependencyImpl
