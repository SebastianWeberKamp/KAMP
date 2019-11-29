/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl#getContainsInterface <em>Contains Interface</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl#getContainsFunctionBlock <em>Contains Function Block</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl#getContainsFunction <em>Contains Function</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl#getContainsGlobalVariable <em>Contains Global Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends MinimalEObjectImpl.Container implements Repository {
	/**
	 * The cached value of the '{@link #getContainsInterface() <em>Contains Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<IECInterface> containsInterface;

	/**
	 * The cached value of the '{@link #getContainsFunctionBlock() <em>Contains Function Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsFunctionBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionBlock> containsFunctionBlock;

	/**
	 * The cached value of the '{@link #getContainsFunction() <em>Contains Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> containsFunction;

	/**
	 * The cached value of the '{@link #getContainsGlobalVariable() <em>Contains Global Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsGlobalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> containsGlobalVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECRepositoryPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECInterface> getContainsInterface() {
		if (containsInterface == null) {
			containsInterface = new EObjectContainmentEList<IECInterface>(IECInterface.class, this, IECRepositoryPackage.REPOSITORY__CONTAINS_INTERFACE);
		}
		return containsInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionBlock> getContainsFunctionBlock() {
		if (containsFunctionBlock == null) {
			containsFunctionBlock = new EObjectContainmentEList<FunctionBlock>(FunctionBlock.class, this, IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION_BLOCK);
		}
		return containsFunctionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getContainsFunction() {
		if (containsFunction == null) {
			containsFunction = new EObjectContainmentEList<Function>(Function.class, this, IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION);
		}
		return containsFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getContainsGlobalVariable() {
		if (containsGlobalVariable == null) {
			containsGlobalVariable = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, IECRepositoryPackage.REPOSITORY__CONTAINS_GLOBAL_VARIABLE);
		}
		return containsGlobalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECRepositoryPackage.REPOSITORY__CONTAINS_INTERFACE:
				return ((InternalEList<?>)getContainsInterface()).basicRemove(otherEnd, msgs);
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION_BLOCK:
				return ((InternalEList<?>)getContainsFunctionBlock()).basicRemove(otherEnd, msgs);
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION:
				return ((InternalEList<?>)getContainsFunction()).basicRemove(otherEnd, msgs);
			case IECRepositoryPackage.REPOSITORY__CONTAINS_GLOBAL_VARIABLE:
				return ((InternalEList<?>)getContainsGlobalVariable()).basicRemove(otherEnd, msgs);
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
			case IECRepositoryPackage.REPOSITORY__CONTAINS_INTERFACE:
				return getContainsInterface();
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION_BLOCK:
				return getContainsFunctionBlock();
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION:
				return getContainsFunction();
			case IECRepositoryPackage.REPOSITORY__CONTAINS_GLOBAL_VARIABLE:
				return getContainsGlobalVariable();
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
			case IECRepositoryPackage.REPOSITORY__CONTAINS_INTERFACE:
				getContainsInterface().clear();
				getContainsInterface().addAll((Collection<? extends IECInterface>)newValue);
				return;
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION_BLOCK:
				getContainsFunctionBlock().clear();
				getContainsFunctionBlock().addAll((Collection<? extends FunctionBlock>)newValue);
				return;
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION:
				getContainsFunction().clear();
				getContainsFunction().addAll((Collection<? extends Function>)newValue);
				return;
			case IECRepositoryPackage.REPOSITORY__CONTAINS_GLOBAL_VARIABLE:
				getContainsGlobalVariable().clear();
				getContainsGlobalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
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
			case IECRepositoryPackage.REPOSITORY__CONTAINS_INTERFACE:
				getContainsInterface().clear();
				return;
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION_BLOCK:
				getContainsFunctionBlock().clear();
				return;
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION:
				getContainsFunction().clear();
				return;
			case IECRepositoryPackage.REPOSITORY__CONTAINS_GLOBAL_VARIABLE:
				getContainsGlobalVariable().clear();
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
			case IECRepositoryPackage.REPOSITORY__CONTAINS_INTERFACE:
				return containsInterface != null && !containsInterface.isEmpty();
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION_BLOCK:
				return containsFunctionBlock != null && !containsFunctionBlock.isEmpty();
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION:
				return containsFunction != null && !containsFunction.isEmpty();
			case IECRepositoryPackage.REPOSITORY__CONTAINS_GLOBAL_VARIABLE:
				return containsGlobalVariable != null && !containsGlobalVariable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RepositoryImpl
