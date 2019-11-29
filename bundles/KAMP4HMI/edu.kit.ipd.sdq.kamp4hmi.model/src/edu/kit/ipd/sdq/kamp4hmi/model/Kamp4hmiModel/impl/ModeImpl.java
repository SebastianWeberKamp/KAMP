/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl;

import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Mode;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsMethod;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ModeImpl#getAffectedFunctionBlocks <em>Affected Function Blocks</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ModeImpl#getAffectedMethods <em>Affected Methods</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ModeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeImpl extends MinimalEObjectImpl.Container implements Mode {
	/**
	 * The cached value of the '{@link #getAffectedFunctionBlocks() <em>Affected Function Blocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedFunctionBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionBlock> affectedFunctionBlocks;

	/**
	 * The cached value of the '{@link #getAffectedMethods() <em>Affected Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<IsMethod> affectedMethods;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Kamp4hmiModelPackage.Literals.MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionBlock> getAffectedFunctionBlocks() {
		if (affectedFunctionBlocks == null) {
			affectedFunctionBlocks = new EObjectResolvingEList<FunctionBlock>(FunctionBlock.class, this, Kamp4hmiModelPackage.MODE__AFFECTED_FUNCTION_BLOCKS);
		}
		return affectedFunctionBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IsMethod> getAffectedMethods() {
		if (affectedMethods == null) {
			affectedMethods = new EObjectResolvingEList<IsMethod>(IsMethod.class, this, Kamp4hmiModelPackage.MODE__AFFECTED_METHODS);
		}
		return affectedMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kamp4hmiModelPackage.MODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Kamp4hmiModelPackage.MODE__AFFECTED_FUNCTION_BLOCKS:
				return getAffectedFunctionBlocks();
			case Kamp4hmiModelPackage.MODE__AFFECTED_METHODS:
				return getAffectedMethods();
			case Kamp4hmiModelPackage.MODE__NAME:
				return getName();
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
			case Kamp4hmiModelPackage.MODE__AFFECTED_FUNCTION_BLOCKS:
				getAffectedFunctionBlocks().clear();
				getAffectedFunctionBlocks().addAll((Collection<? extends FunctionBlock>)newValue);
				return;
			case Kamp4hmiModelPackage.MODE__AFFECTED_METHODS:
				getAffectedMethods().clear();
				getAffectedMethods().addAll((Collection<? extends IsMethod>)newValue);
				return;
			case Kamp4hmiModelPackage.MODE__NAME:
				setName((String)newValue);
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
			case Kamp4hmiModelPackage.MODE__AFFECTED_FUNCTION_BLOCKS:
				getAffectedFunctionBlocks().clear();
				return;
			case Kamp4hmiModelPackage.MODE__AFFECTED_METHODS:
				getAffectedMethods().clear();
				return;
			case Kamp4hmiModelPackage.MODE__NAME:
				setName(NAME_EDEFAULT);
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
			case Kamp4hmiModelPackage.MODE__AFFECTED_FUNCTION_BLOCKS:
				return affectedFunctionBlocks != null && !affectedFunctionBlocks.isEmpty();
			case Kamp4hmiModelPackage.MODE__AFFECTED_METHODS:
				return affectedMethods != null && !affectedMethods.isEmpty();
			case Kamp4hmiModelPackage.MODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModeImpl
