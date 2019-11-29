/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;
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
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ConfigurationImpl#getInstantiatesProgram <em>Instantiates Program</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ConfigurationImpl#getDeclaresGlobalVariable <em>Declares Global Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends IdentifierImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getInstantiatesProgram() <em>Instantiates Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesProgram()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> instantiatesProgram;

	/**
	 * The cached value of the '{@link #getDeclaresGlobalVariable() <em>Declares Global Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaresGlobalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> declaresGlobalVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECModelPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Program> getInstantiatesProgram() {
		if (instantiatesProgram == null) {
			instantiatesProgram = new EObjectContainmentEList<Program>(Program.class, this, IECModelPackage.CONFIGURATION__INSTANTIATES_PROGRAM);
		}
		return instantiatesProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getDeclaresGlobalVariable() {
		if (declaresGlobalVariable == null) {
			declaresGlobalVariable = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, IECModelPackage.CONFIGURATION__DECLARES_GLOBAL_VARIABLE);
		}
		return declaresGlobalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECModelPackage.CONFIGURATION__INSTANTIATES_PROGRAM:
				return ((InternalEList<?>)getInstantiatesProgram()).basicRemove(otherEnd, msgs);
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
			case IECModelPackage.CONFIGURATION__INSTANTIATES_PROGRAM:
				return getInstantiatesProgram();
			case IECModelPackage.CONFIGURATION__DECLARES_GLOBAL_VARIABLE:
				return getDeclaresGlobalVariable();
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
			case IECModelPackage.CONFIGURATION__INSTANTIATES_PROGRAM:
				getInstantiatesProgram().clear();
				getInstantiatesProgram().addAll((Collection<? extends Program>)newValue);
				return;
			case IECModelPackage.CONFIGURATION__DECLARES_GLOBAL_VARIABLE:
				getDeclaresGlobalVariable().clear();
				getDeclaresGlobalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
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
			case IECModelPackage.CONFIGURATION__INSTANTIATES_PROGRAM:
				getInstantiatesProgram().clear();
				return;
			case IECModelPackage.CONFIGURATION__DECLARES_GLOBAL_VARIABLE:
				getDeclaresGlobalVariable().clear();
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
			case IECModelPackage.CONFIGURATION__INSTANTIATES_PROGRAM:
				return instantiatesProgram != null && !instantiatesProgram.isEmpty();
			case IECModelPackage.CONFIGURATION__DECLARES_GLOBAL_VARIABLE:
				return declaresGlobalVariable != null && !declaresGlobalVariable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
