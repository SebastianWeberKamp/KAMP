/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.DerivedType;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionImpl#getCallsFunction <em>Calls Function</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionImpl#getHasDerivedReturnType <em>Has Derived Return Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionImpl#getCallsFunctionBlockConstructor <em>Calls Function Block Constructor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends IdentifierImpl implements Function {
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
	 * The cached value of the '{@link #getHasDerivedReturnType() <em>Has Derived Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDerivedReturnType()
	 * @generated
	 * @ordered
	 */
	protected DerivedType hasDerivedReturnType;

	/**
	 * The cached value of the '{@link #getCallsFunctionBlockConstructor() <em>Calls Function Block Constructor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallsFunctionBlockConstructor()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionBlock> callsFunctionBlockConstructor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECRepositoryPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getCallsFunction() {
		if (callsFunction == null) {
			callsFunction = new EObjectResolvingEList<Function>(Function.class, this, IECRepositoryPackage.FUNCTION__CALLS_FUNCTION);
		}
		return callsFunction;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IECRepositoryPackage.FUNCTION__HAS_DERIVED_RETURN_TYPE, oldHasDerivedReturnType, hasDerivedReturnType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IECRepositoryPackage.FUNCTION__HAS_DERIVED_RETURN_TYPE, oldHasDerivedReturnType, hasDerivedReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionBlock> getCallsFunctionBlockConstructor() {
		if (callsFunctionBlockConstructor == null) {
			callsFunctionBlockConstructor = new EObjectResolvingEList<FunctionBlock>(FunctionBlock.class, this, IECRepositoryPackage.FUNCTION__CALLS_FUNCTION_BLOCK_CONSTRUCTOR);
		}
		return callsFunctionBlockConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IECRepositoryPackage.FUNCTION__CALLS_FUNCTION:
				return getCallsFunction();
			case IECRepositoryPackage.FUNCTION__HAS_DERIVED_RETURN_TYPE:
				if (resolve) return getHasDerivedReturnType();
				return basicGetHasDerivedReturnType();
			case IECRepositoryPackage.FUNCTION__CALLS_FUNCTION_BLOCK_CONSTRUCTOR:
				return getCallsFunctionBlockConstructor();
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
			case IECRepositoryPackage.FUNCTION__CALLS_FUNCTION:
				getCallsFunction().clear();
				getCallsFunction().addAll((Collection<? extends Function>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION__HAS_DERIVED_RETURN_TYPE:
				setHasDerivedReturnType((DerivedType)newValue);
				return;
			case IECRepositoryPackage.FUNCTION__CALLS_FUNCTION_BLOCK_CONSTRUCTOR:
				getCallsFunctionBlockConstructor().clear();
				getCallsFunctionBlockConstructor().addAll((Collection<? extends FunctionBlock>)newValue);
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
			case IECRepositoryPackage.FUNCTION__CALLS_FUNCTION:
				getCallsFunction().clear();
				return;
			case IECRepositoryPackage.FUNCTION__HAS_DERIVED_RETURN_TYPE:
				setHasDerivedReturnType((DerivedType)null);
				return;
			case IECRepositoryPackage.FUNCTION__CALLS_FUNCTION_BLOCK_CONSTRUCTOR:
				getCallsFunctionBlockConstructor().clear();
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
			case IECRepositoryPackage.FUNCTION__CALLS_FUNCTION:
				return callsFunction != null && !callsFunction.isEmpty();
			case IECRepositoryPackage.FUNCTION__HAS_DERIVED_RETURN_TYPE:
				return hasDerivedReturnType != null;
			case IECRepositoryPackage.FUNCTION__CALLS_FUNCTION_BLOCK_CONSTRUCTOR:
				return callsFunctionBlockConstructor != null && !callsFunctionBlockConstructor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionImpl
