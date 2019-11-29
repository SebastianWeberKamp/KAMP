/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsProperty;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getHasMethod <em>Has Method</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getHasProperty <em>Has Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getInstantiatesInterface <em>Instantiates Interface</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getInstantiatesFunctionBlock <em>Instantiates Function Block</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getReadsGlobalVariable <em>Reads Global Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getWritesGlobalVariable <em>Writes Global Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getReadsProperty <em>Reads Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getWritesProperty <em>Writes Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getCallsMethod <em>Calls Method</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getCallsFunction <em>Calls Function</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getExtendsFunctionBlock <em>Extends Function Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionBlockImpl extends IdentifierImpl implements FunctionBlock {
	/**
	 * The cached value of the '{@link #getHasMethod() <em>Has Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<IECMethod> hasMethod;

	/**
	 * The cached value of the '{@link #getHasProperty() <em>Has Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<IECProperty> hasProperty;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<IECInterface> implements_;

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
	 * The cached value of the '{@link #getExtendsFunctionBlock() <em>Extends Function Block</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendsFunctionBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionBlock> extendsFunctionBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECRepositoryPackage.Literals.FUNCTION_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECMethod> getHasMethod() {
		if (hasMethod == null) {
			hasMethod = new EObjectContainmentEList<IECMethod>(IECMethod.class, this, IECRepositoryPackage.FUNCTION_BLOCK__HAS_METHOD);
		}
		return hasMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECProperty> getHasProperty() {
		if (hasProperty == null) {
			hasProperty = new EObjectContainmentEList<IECProperty>(IECProperty.class, this, IECRepositoryPackage.FUNCTION_BLOCK__HAS_PROPERTY);
		}
		return hasProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECInterface> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectResolvingEList<IECInterface>(IECInterface.class, this, IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECInterface> getInstantiatesInterface() {
		if (instantiatesInterface == null) {
			instantiatesInterface = new EObjectResolvingEList<IECInterface>(IECInterface.class, this, IECRepositoryPackage.FUNCTION_BLOCK__INSTANTIATES_INTERFACE);
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
			instantiatesFunctionBlock = new EObjectResolvingEList<FunctionBlock>(FunctionBlock.class, this, IECRepositoryPackage.FUNCTION_BLOCK__INSTANTIATES_FUNCTION_BLOCK);
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
			readsGlobalVariable = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, IECRepositoryPackage.FUNCTION_BLOCK__READS_GLOBAL_VARIABLE);
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
			writesGlobalVariable = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, IECRepositoryPackage.FUNCTION_BLOCK__WRITES_GLOBAL_VARIABLE);
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
			readsProperty = new EObjectResolvingEList<IsProperty>(IsProperty.class, this, IECRepositoryPackage.FUNCTION_BLOCK__READS_PROPERTY);
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
			writesProperty = new EObjectResolvingEList<IsProperty>(IsProperty.class, this, IECRepositoryPackage.FUNCTION_BLOCK__WRITES_PROPERTY);
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
			callsMethod = new EObjectResolvingEList<IsMethod>(IsMethod.class, this, IECRepositoryPackage.FUNCTION_BLOCK__CALLS_METHOD);
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
			callsFunction = new EObjectResolvingEList<Function>(Function.class, this, IECRepositoryPackage.FUNCTION_BLOCK__CALLS_FUNCTION);
		}
		return callsFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionBlock> getExtendsFunctionBlock() {
		if (extendsFunctionBlock == null) {
			extendsFunctionBlock = new EObjectResolvingEList<FunctionBlock>(FunctionBlock.class, this, IECRepositoryPackage.FUNCTION_BLOCK__EXTENDS_FUNCTION_BLOCK);
		}
		return extendsFunctionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_METHOD:
				return ((InternalEList<?>)getHasMethod()).basicRemove(otherEnd, msgs);
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_PROPERTY:
				return ((InternalEList<?>)getHasProperty()).basicRemove(otherEnd, msgs);
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
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_METHOD:
				return getHasMethod();
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_PROPERTY:
				return getHasProperty();
			case IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS:
				return getImplements();
			case IECRepositoryPackage.FUNCTION_BLOCK__INSTANTIATES_INTERFACE:
				return getInstantiatesInterface();
			case IECRepositoryPackage.FUNCTION_BLOCK__INSTANTIATES_FUNCTION_BLOCK:
				return getInstantiatesFunctionBlock();
			case IECRepositoryPackage.FUNCTION_BLOCK__READS_GLOBAL_VARIABLE:
				return getReadsGlobalVariable();
			case IECRepositoryPackage.FUNCTION_BLOCK__WRITES_GLOBAL_VARIABLE:
				return getWritesGlobalVariable();
			case IECRepositoryPackage.FUNCTION_BLOCK__READS_PROPERTY:
				return getReadsProperty();
			case IECRepositoryPackage.FUNCTION_BLOCK__WRITES_PROPERTY:
				return getWritesProperty();
			case IECRepositoryPackage.FUNCTION_BLOCK__CALLS_METHOD:
				return getCallsMethod();
			case IECRepositoryPackage.FUNCTION_BLOCK__CALLS_FUNCTION:
				return getCallsFunction();
			case IECRepositoryPackage.FUNCTION_BLOCK__EXTENDS_FUNCTION_BLOCK:
				return getExtendsFunctionBlock();
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
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_METHOD:
				getHasMethod().clear();
				getHasMethod().addAll((Collection<? extends IECMethod>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_PROPERTY:
				getHasProperty().clear();
				getHasProperty().addAll((Collection<? extends IECProperty>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends IECInterface>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__INSTANTIATES_INTERFACE:
				getInstantiatesInterface().clear();
				getInstantiatesInterface().addAll((Collection<? extends IECInterface>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__INSTANTIATES_FUNCTION_BLOCK:
				getInstantiatesFunctionBlock().clear();
				getInstantiatesFunctionBlock().addAll((Collection<? extends FunctionBlock>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__READS_GLOBAL_VARIABLE:
				getReadsGlobalVariable().clear();
				getReadsGlobalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__WRITES_GLOBAL_VARIABLE:
				getWritesGlobalVariable().clear();
				getWritesGlobalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__READS_PROPERTY:
				getReadsProperty().clear();
				getReadsProperty().addAll((Collection<? extends IsProperty>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__WRITES_PROPERTY:
				getWritesProperty().clear();
				getWritesProperty().addAll((Collection<? extends IsProperty>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__CALLS_METHOD:
				getCallsMethod().clear();
				getCallsMethod().addAll((Collection<? extends IsMethod>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__CALLS_FUNCTION:
				getCallsFunction().clear();
				getCallsFunction().addAll((Collection<? extends Function>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__EXTENDS_FUNCTION_BLOCK:
				getExtendsFunctionBlock().clear();
				getExtendsFunctionBlock().addAll((Collection<? extends FunctionBlock>)newValue);
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
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_METHOD:
				getHasMethod().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_PROPERTY:
				getHasProperty().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS:
				getImplements().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__INSTANTIATES_INTERFACE:
				getInstantiatesInterface().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__INSTANTIATES_FUNCTION_BLOCK:
				getInstantiatesFunctionBlock().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__READS_GLOBAL_VARIABLE:
				getReadsGlobalVariable().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__WRITES_GLOBAL_VARIABLE:
				getWritesGlobalVariable().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__READS_PROPERTY:
				getReadsProperty().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__WRITES_PROPERTY:
				getWritesProperty().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__CALLS_METHOD:
				getCallsMethod().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__CALLS_FUNCTION:
				getCallsFunction().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__EXTENDS_FUNCTION_BLOCK:
				getExtendsFunctionBlock().clear();
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
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_METHOD:
				return hasMethod != null && !hasMethod.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_PROPERTY:
				return hasProperty != null && !hasProperty.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__INSTANTIATES_INTERFACE:
				return instantiatesInterface != null && !instantiatesInterface.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__INSTANTIATES_FUNCTION_BLOCK:
				return instantiatesFunctionBlock != null && !instantiatesFunctionBlock.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__READS_GLOBAL_VARIABLE:
				return readsGlobalVariable != null && !readsGlobalVariable.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__WRITES_GLOBAL_VARIABLE:
				return writesGlobalVariable != null && !writesGlobalVariable.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__READS_PROPERTY:
				return readsProperty != null && !readsProperty.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__WRITES_PROPERTY:
				return writesProperty != null && !writesProperty.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__CALLS_METHOD:
				return callsMethod != null && !callsMethod.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__CALLS_FUNCTION:
				return callsFunction != null && !callsFunction.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__EXTENDS_FUNCTION_BLOCK:
				return extendsFunctionBlock != null && !extendsFunctionBlock.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionBlockImpl
