/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IdentifierImpl;

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
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl#getInstantiatesInterface <em>Instantiates Interface</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl#getInstantiatesFunctionBlock <em>Instantiates Function Block</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl#getDeclaresGlobalVariable <em>Declares Global Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl#getReadsGlobalVariable <em>Reads Global Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl#getWritesGlobalVariable <em>Writes Global Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl#getReadsProperty <em>Reads Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl#getWritesProperty <em>Writes Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl#getCallsMethod <em>Calls Method</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl#getCallsFunction <em>Calls Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends IdentifierImpl implements Program {
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
	 * The cached value of the '{@link #getDeclaresGlobalVariable() <em>Declares Global Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaresGlobalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> declaresGlobalVariable;

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
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECModelPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECInterface> getInstantiatesInterface() {
		if (instantiatesInterface == null) {
			instantiatesInterface = new EObjectResolvingEList<IECInterface>(IECInterface.class, this, IECModelPackage.PROGRAM__INSTANTIATES_INTERFACE);
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
			instantiatesFunctionBlock = new EObjectResolvingEList<FunctionBlock>(FunctionBlock.class, this, IECModelPackage.PROGRAM__INSTANTIATES_FUNCTION_BLOCK);
		}
		return instantiatesFunctionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getDeclaresGlobalVariable() {
		if (declaresGlobalVariable == null) {
			declaresGlobalVariable = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, IECModelPackage.PROGRAM__DECLARES_GLOBAL_VARIABLE);
		}
		return declaresGlobalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getReadsGlobalVariable() {
		if (readsGlobalVariable == null) {
			readsGlobalVariable = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, IECModelPackage.PROGRAM__READS_GLOBAL_VARIABLE);
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
			writesGlobalVariable = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, IECModelPackage.PROGRAM__WRITES_GLOBAL_VARIABLE);
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
			readsProperty = new EObjectResolvingEList<IsProperty>(IsProperty.class, this, IECModelPackage.PROGRAM__READS_PROPERTY);
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
			writesProperty = new EObjectResolvingEList<IsProperty>(IsProperty.class, this, IECModelPackage.PROGRAM__WRITES_PROPERTY);
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
			callsMethod = new EObjectResolvingEList<IsMethod>(IsMethod.class, this, IECModelPackage.PROGRAM__CALLS_METHOD);
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
			callsFunction = new EObjectResolvingEList<Function>(Function.class, this, IECModelPackage.PROGRAM__CALLS_FUNCTION);
		}
		return callsFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECModelPackage.PROGRAM__DECLARES_GLOBAL_VARIABLE:
				return ((InternalEList<?>)getDeclaresGlobalVariable()).basicRemove(otherEnd, msgs);
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
			case IECModelPackage.PROGRAM__INSTANTIATES_INTERFACE:
				return getInstantiatesInterface();
			case IECModelPackage.PROGRAM__INSTANTIATES_FUNCTION_BLOCK:
				return getInstantiatesFunctionBlock();
			case IECModelPackage.PROGRAM__DECLARES_GLOBAL_VARIABLE:
				return getDeclaresGlobalVariable();
			case IECModelPackage.PROGRAM__READS_GLOBAL_VARIABLE:
				return getReadsGlobalVariable();
			case IECModelPackage.PROGRAM__WRITES_GLOBAL_VARIABLE:
				return getWritesGlobalVariable();
			case IECModelPackage.PROGRAM__READS_PROPERTY:
				return getReadsProperty();
			case IECModelPackage.PROGRAM__WRITES_PROPERTY:
				return getWritesProperty();
			case IECModelPackage.PROGRAM__CALLS_METHOD:
				return getCallsMethod();
			case IECModelPackage.PROGRAM__CALLS_FUNCTION:
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
			case IECModelPackage.PROGRAM__INSTANTIATES_INTERFACE:
				getInstantiatesInterface().clear();
				getInstantiatesInterface().addAll((Collection<? extends IECInterface>)newValue);
				return;
			case IECModelPackage.PROGRAM__INSTANTIATES_FUNCTION_BLOCK:
				getInstantiatesFunctionBlock().clear();
				getInstantiatesFunctionBlock().addAll((Collection<? extends FunctionBlock>)newValue);
				return;
			case IECModelPackage.PROGRAM__DECLARES_GLOBAL_VARIABLE:
				getDeclaresGlobalVariable().clear();
				getDeclaresGlobalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case IECModelPackage.PROGRAM__READS_GLOBAL_VARIABLE:
				getReadsGlobalVariable().clear();
				getReadsGlobalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case IECModelPackage.PROGRAM__WRITES_GLOBAL_VARIABLE:
				getWritesGlobalVariable().clear();
				getWritesGlobalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case IECModelPackage.PROGRAM__READS_PROPERTY:
				getReadsProperty().clear();
				getReadsProperty().addAll((Collection<? extends IsProperty>)newValue);
				return;
			case IECModelPackage.PROGRAM__WRITES_PROPERTY:
				getWritesProperty().clear();
				getWritesProperty().addAll((Collection<? extends IsProperty>)newValue);
				return;
			case IECModelPackage.PROGRAM__CALLS_METHOD:
				getCallsMethod().clear();
				getCallsMethod().addAll((Collection<? extends IsMethod>)newValue);
				return;
			case IECModelPackage.PROGRAM__CALLS_FUNCTION:
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
			case IECModelPackage.PROGRAM__INSTANTIATES_INTERFACE:
				getInstantiatesInterface().clear();
				return;
			case IECModelPackage.PROGRAM__INSTANTIATES_FUNCTION_BLOCK:
				getInstantiatesFunctionBlock().clear();
				return;
			case IECModelPackage.PROGRAM__DECLARES_GLOBAL_VARIABLE:
				getDeclaresGlobalVariable().clear();
				return;
			case IECModelPackage.PROGRAM__READS_GLOBAL_VARIABLE:
				getReadsGlobalVariable().clear();
				return;
			case IECModelPackage.PROGRAM__WRITES_GLOBAL_VARIABLE:
				getWritesGlobalVariable().clear();
				return;
			case IECModelPackage.PROGRAM__READS_PROPERTY:
				getReadsProperty().clear();
				return;
			case IECModelPackage.PROGRAM__WRITES_PROPERTY:
				getWritesProperty().clear();
				return;
			case IECModelPackage.PROGRAM__CALLS_METHOD:
				getCallsMethod().clear();
				return;
			case IECModelPackage.PROGRAM__CALLS_FUNCTION:
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
			case IECModelPackage.PROGRAM__INSTANTIATES_INTERFACE:
				return instantiatesInterface != null && !instantiatesInterface.isEmpty();
			case IECModelPackage.PROGRAM__INSTANTIATES_FUNCTION_BLOCK:
				return instantiatesFunctionBlock != null && !instantiatesFunctionBlock.isEmpty();
			case IECModelPackage.PROGRAM__DECLARES_GLOBAL_VARIABLE:
				return declaresGlobalVariable != null && !declaresGlobalVariable.isEmpty();
			case IECModelPackage.PROGRAM__READS_GLOBAL_VARIABLE:
				return readsGlobalVariable != null && !readsGlobalVariable.isEmpty();
			case IECModelPackage.PROGRAM__WRITES_GLOBAL_VARIABLE:
				return writesGlobalVariable != null && !writesGlobalVariable.isEmpty();
			case IECModelPackage.PROGRAM__READS_PROPERTY:
				return readsProperty != null && !readsProperty.isEmpty();
			case IECModelPackage.PROGRAM__WRITES_PROPERTY:
				return writesProperty != null && !writesProperty.isEmpty();
			case IECModelPackage.PROGRAM__CALLS_METHOD:
				return callsMethod != null && !callsMethod.isEmpty();
			case IECModelPackage.PROGRAM__CALLS_FUNCTION:
				return callsFunction != null && !callsFunction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgramImpl
