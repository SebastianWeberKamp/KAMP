/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.DerivedType;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsProperty;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl#getHasDerivedReturnType <em>Has Derived Return Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl#getInstantiatesInterface <em>Instantiates Interface</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl#getInstantiatesFunctionBlock <em>Instantiates Function Block</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl#getReadsGlobalVariable <em>Reads Global Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl#getWritesGlobalVariable <em>Writes Global Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl#getReadsProperty <em>Reads Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl#getWritesProperty <em>Writes Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl#getCallsMethod <em>Calls Method</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl#getCallsFunction <em>Calls Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IECMethodImpl extends IdentifierImpl implements IECMethod {
	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected IECAbstractMethod implements_;

	/**
	 * The cached value of the '{@link #getHasDerivedReturnType() <em>Has Derived Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDerivedReturnType()
	 * @generated
	 * @ordered
	 */
	protected DerivedType hasDerivedReturnType;

	/**
	 * The cached value of the '{@link #getInstantiatesInterface() <em>Instantiates Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<IECInterface> instantiatesInterface;

	/**
	 * The cached value of the '{@link #getInstantiatesFunctionBlock() <em>Instantiates Function Block</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesFunctionBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionBlock> instantiatesFunctionBlock;

	/**
	 * The cached value of the '{@link #getReadsGlobalVariable() <em>Reads Global Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadsGlobalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> readsGlobalVariable;

	/**
	 * The cached value of the '{@link #getWritesGlobalVariable() <em>Writes Global Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritesGlobalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> writesGlobalVariable;

	/**
	 * The cached value of the '{@link #getReadsProperty() <em>Reads Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadsProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<IsProperty> readsProperty;

	/**
	 * The cached value of the '{@link #getWritesProperty() <em>Writes Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritesProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<IsProperty> writesProperty;

	/**
	 * The cached value of the '{@link #getCallsMethod() <em>Calls Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallsMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<IsMethod> callsMethod;

	/**
	 * The cached value of the '{@link #getCallsFunction() <em>Calls Function</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallsFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> callsFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECRepositoryPackage.Literals.IEC_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECAbstractMethod getImplements() {
		if (implements_ != null && implements_.eIsProxy()) {
			InternalEObject oldImplements = (InternalEObject)implements_;
			implements_ = (IECAbstractMethod)eResolveProxy(oldImplements);
			if (implements_ != oldImplements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IECRepositoryPackage.IEC_METHOD__IMPLEMENTS, oldImplements, implements_));
			}
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECAbstractMethod basicGetImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplements(IECAbstractMethod newImplements) {
		IECAbstractMethod oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECRepositoryPackage.IEC_METHOD__IMPLEMENTS, oldImplements, implements_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedType getHasDerivedReturnType() {
		if (hasDerivedReturnType != null && hasDerivedReturnType.eIsProxy()) {
			InternalEObject oldHasDerivedReturnType = (InternalEObject)hasDerivedReturnType;
			hasDerivedReturnType = (DerivedType)eResolveProxy(oldHasDerivedReturnType);
			if (hasDerivedReturnType != oldHasDerivedReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IECRepositoryPackage.IEC_METHOD__HAS_DERIVED_RETURN_TYPE, oldHasDerivedReturnType, hasDerivedReturnType));
			}
		}
		return hasDerivedReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedType basicGetHasDerivedReturnType() {
		return hasDerivedReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDerivedReturnType(DerivedType newHasDerivedReturnType) {
		DerivedType oldHasDerivedReturnType = hasDerivedReturnType;
		hasDerivedReturnType = newHasDerivedReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECRepositoryPackage.IEC_METHOD__HAS_DERIVED_RETURN_TYPE, oldHasDerivedReturnType, hasDerivedReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECInterface> getInstantiatesInterface() {
		if (instantiatesInterface == null) {
			instantiatesInterface = new EObjectResolvingEList<IECInterface>(IECInterface.class, this, IECRepositoryPackage.IEC_METHOD__INSTANTIATES_INTERFACE);
		}
		return instantiatesInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionBlock> getInstantiatesFunctionBlock() {
		if (instantiatesFunctionBlock == null) {
			instantiatesFunctionBlock = new EObjectResolvingEList<FunctionBlock>(FunctionBlock.class, this, IECRepositoryPackage.IEC_METHOD__INSTANTIATES_FUNCTION_BLOCK);
		}
		return instantiatesFunctionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getReadsGlobalVariable() {
		if (readsGlobalVariable == null) {
			readsGlobalVariable = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, IECRepositoryPackage.IEC_METHOD__READS_GLOBAL_VARIABLE);
		}
		return readsGlobalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getWritesGlobalVariable() {
		if (writesGlobalVariable == null) {
			writesGlobalVariable = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, IECRepositoryPackage.IEC_METHOD__WRITES_GLOBAL_VARIABLE);
		}
		return writesGlobalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IsProperty> getReadsProperty() {
		if (readsProperty == null) {
			readsProperty = new EObjectResolvingEList<IsProperty>(IsProperty.class, this, IECRepositoryPackage.IEC_METHOD__READS_PROPERTY);
		}
		return readsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IsProperty> getWritesProperty() {
		if (writesProperty == null) {
			writesProperty = new EObjectResolvingEList<IsProperty>(IsProperty.class, this, IECRepositoryPackage.IEC_METHOD__WRITES_PROPERTY);
		}
		return writesProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IsMethod> getCallsMethod() {
		if (callsMethod == null) {
			callsMethod = new EObjectResolvingEList<IsMethod>(IsMethod.class, this, IECRepositoryPackage.IEC_METHOD__CALLS_METHOD);
		}
		return callsMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getCallsFunction() {
		if (callsFunction == null) {
			callsFunction = new EObjectResolvingEList<Function>(Function.class, this, IECRepositoryPackage.IEC_METHOD__CALLS_FUNCTION);
		}
		return callsFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IECRepositoryPackage.IEC_METHOD__IMPLEMENTS:
				if (resolve) return getImplements();
				return basicGetImplements();
			case IECRepositoryPackage.IEC_METHOD__HAS_DERIVED_RETURN_TYPE:
				if (resolve) return getHasDerivedReturnType();
				return basicGetHasDerivedReturnType();
			case IECRepositoryPackage.IEC_METHOD__INSTANTIATES_INTERFACE:
				return getInstantiatesInterface();
			case IECRepositoryPackage.IEC_METHOD__INSTANTIATES_FUNCTION_BLOCK:
				return getInstantiatesFunctionBlock();
			case IECRepositoryPackage.IEC_METHOD__READS_GLOBAL_VARIABLE:
				return getReadsGlobalVariable();
			case IECRepositoryPackage.IEC_METHOD__WRITES_GLOBAL_VARIABLE:
				return getWritesGlobalVariable();
			case IECRepositoryPackage.IEC_METHOD__READS_PROPERTY:
				return getReadsProperty();
			case IECRepositoryPackage.IEC_METHOD__WRITES_PROPERTY:
				return getWritesProperty();
			case IECRepositoryPackage.IEC_METHOD__CALLS_METHOD:
				return getCallsMethod();
			case IECRepositoryPackage.IEC_METHOD__CALLS_FUNCTION:
				return getCallsFunction();
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
			case IECRepositoryPackage.IEC_METHOD__IMPLEMENTS:
				setImplements((IECAbstractMethod)newValue);
				return;
			case IECRepositoryPackage.IEC_METHOD__HAS_DERIVED_RETURN_TYPE:
				setHasDerivedReturnType((DerivedType)newValue);
				return;
			case IECRepositoryPackage.IEC_METHOD__INSTANTIATES_INTERFACE:
				getInstantiatesInterface().clear();
				getInstantiatesInterface().addAll((Collection<? extends IECInterface>)newValue);
				return;
			case IECRepositoryPackage.IEC_METHOD__INSTANTIATES_FUNCTION_BLOCK:
				getInstantiatesFunctionBlock().clear();
				getInstantiatesFunctionBlock().addAll((Collection<? extends FunctionBlock>)newValue);
				return;
			case IECRepositoryPackage.IEC_METHOD__READS_GLOBAL_VARIABLE:
				getReadsGlobalVariable().clear();
				getReadsGlobalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case IECRepositoryPackage.IEC_METHOD__WRITES_GLOBAL_VARIABLE:
				getWritesGlobalVariable().clear();
				getWritesGlobalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case IECRepositoryPackage.IEC_METHOD__READS_PROPERTY:
				getReadsProperty().clear();
				getReadsProperty().addAll((Collection<? extends IsProperty>)newValue);
				return;
			case IECRepositoryPackage.IEC_METHOD__WRITES_PROPERTY:
				getWritesProperty().clear();
				getWritesProperty().addAll((Collection<? extends IsProperty>)newValue);
				return;
			case IECRepositoryPackage.IEC_METHOD__CALLS_METHOD:
				getCallsMethod().clear();
				getCallsMethod().addAll((Collection<? extends IsMethod>)newValue);
				return;
			case IECRepositoryPackage.IEC_METHOD__CALLS_FUNCTION:
				getCallsFunction().clear();
				getCallsFunction().addAll((Collection<? extends Function>)newValue);
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
			case IECRepositoryPackage.IEC_METHOD__IMPLEMENTS:
				setImplements((IECAbstractMethod)null);
				return;
			case IECRepositoryPackage.IEC_METHOD__HAS_DERIVED_RETURN_TYPE:
				setHasDerivedReturnType((DerivedType)null);
				return;
			case IECRepositoryPackage.IEC_METHOD__INSTANTIATES_INTERFACE:
				getInstantiatesInterface().clear();
				return;
			case IECRepositoryPackage.IEC_METHOD__INSTANTIATES_FUNCTION_BLOCK:
				getInstantiatesFunctionBlock().clear();
				return;
			case IECRepositoryPackage.IEC_METHOD__READS_GLOBAL_VARIABLE:
				getReadsGlobalVariable().clear();
				return;
			case IECRepositoryPackage.IEC_METHOD__WRITES_GLOBAL_VARIABLE:
				getWritesGlobalVariable().clear();
				return;
			case IECRepositoryPackage.IEC_METHOD__READS_PROPERTY:
				getReadsProperty().clear();
				return;
			case IECRepositoryPackage.IEC_METHOD__WRITES_PROPERTY:
				getWritesProperty().clear();
				return;
			case IECRepositoryPackage.IEC_METHOD__CALLS_METHOD:
				getCallsMethod().clear();
				return;
			case IECRepositoryPackage.IEC_METHOD__CALLS_FUNCTION:
				getCallsFunction().clear();
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
			case IECRepositoryPackage.IEC_METHOD__IMPLEMENTS:
				return implements_ != null;
			case IECRepositoryPackage.IEC_METHOD__HAS_DERIVED_RETURN_TYPE:
				return hasDerivedReturnType != null;
			case IECRepositoryPackage.IEC_METHOD__INSTANTIATES_INTERFACE:
				return instantiatesInterface != null && !instantiatesInterface.isEmpty();
			case IECRepositoryPackage.IEC_METHOD__INSTANTIATES_FUNCTION_BLOCK:
				return instantiatesFunctionBlock != null && !instantiatesFunctionBlock.isEmpty();
			case IECRepositoryPackage.IEC_METHOD__READS_GLOBAL_VARIABLE:
				return readsGlobalVariable != null && !readsGlobalVariable.isEmpty();
			case IECRepositoryPackage.IEC_METHOD__WRITES_GLOBAL_VARIABLE:
				return writesGlobalVariable != null && !writesGlobalVariable.isEmpty();
			case IECRepositoryPackage.IEC_METHOD__READS_PROPERTY:
				return readsProperty != null && !readsProperty.isEmpty();
			case IECRepositoryPackage.IEC_METHOD__WRITES_PROPERTY:
				return writesProperty != null && !writesProperty.isEmpty();
			case IECRepositoryPackage.IEC_METHOD__CALLS_METHOD:
				return callsMethod != null && !callsMethod.isEmpty();
			case IECRepositoryPackage.IEC_METHOD__CALLS_FUNCTION:
				return callsFunction != null && !callsFunction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IECMethodImpl
