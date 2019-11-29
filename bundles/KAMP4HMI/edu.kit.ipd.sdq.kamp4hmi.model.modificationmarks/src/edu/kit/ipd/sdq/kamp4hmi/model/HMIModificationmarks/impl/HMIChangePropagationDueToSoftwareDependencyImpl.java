/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ChangePropagationStepImpl;

import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIChangePropagationDueToSoftwareDependency;
import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModifyActorStep;
import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModifySystemStep;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMI Change Propagation Due To Software Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIChangePropagationDueToSoftwareDependencyImpl#getActorStepModification <em>Actor Step Modification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIChangePropagationDueToSoftwareDependencyImpl#getSystemStepModification <em>System Step Modification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HMIChangePropagationDueToSoftwareDependencyImpl extends ChangePropagationStepImpl implements HMIChangePropagationDueToSoftwareDependency {
	/**
	 * The cached value of the '{@link #getActorStepModification() <em>Actor Step Modification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorStepModification()
	 * @generated
	 * @ordered
	 */
	protected EList<HMIModifyActorStep> actorStepModification;
	/**
	 * The cached value of the '{@link #getSystemStepModification() <em>System Step Modification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemStepModification()
	 * @generated
	 * @ordered
	 */
	protected EList<HMIModifySystemStep> systemStepModification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMIChangePropagationDueToSoftwareDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HMIModificationmarksPackage.Literals.HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HMIModifyActorStep> getActorStepModification() {
		if (actorStepModification == null) {
			actorStepModification = new EObjectContainmentEList<HMIModifyActorStep>(HMIModifyActorStep.class, this, HMIModificationmarksPackage.HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY__ACTOR_STEP_MODIFICATION);
		}
		return actorStepModification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HMIModifySystemStep> getSystemStepModification() {
		if (systemStepModification == null) {
			systemStepModification = new EObjectContainmentEList<HMIModifySystemStep>(HMIModifySystemStep.class, this, HMIModificationmarksPackage.HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY__SYSTEM_STEP_MODIFICATION);
		}
		return systemStepModification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HMIModificationmarksPackage.HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY__ACTOR_STEP_MODIFICATION:
				return ((InternalEList<?>)getActorStepModification()).basicRemove(otherEnd, msgs);
			case HMIModificationmarksPackage.HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY__SYSTEM_STEP_MODIFICATION:
				return ((InternalEList<?>)getSystemStepModification()).basicRemove(otherEnd, msgs);
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
			case HMIModificationmarksPackage.HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY__ACTOR_STEP_MODIFICATION:
				return getActorStepModification();
			case HMIModificationmarksPackage.HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY__SYSTEM_STEP_MODIFICATION:
				return getSystemStepModification();
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
			case HMIModificationmarksPackage.HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY__ACTOR_STEP_MODIFICATION:
				getActorStepModification().clear();
				getActorStepModification().addAll((Collection<? extends HMIModifyActorStep>)newValue);
				return;
			case HMIModificationmarksPackage.HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY__SYSTEM_STEP_MODIFICATION:
				getSystemStepModification().clear();
				getSystemStepModification().addAll((Collection<? extends HMIModifySystemStep>)newValue);
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
			case HMIModificationmarksPackage.HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY__ACTOR_STEP_MODIFICATION:
				getActorStepModification().clear();
				return;
			case HMIModificationmarksPackage.HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY__SYSTEM_STEP_MODIFICATION:
				getSystemStepModification().clear();
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
			case HMIModificationmarksPackage.HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY__ACTOR_STEP_MODIFICATION:
				return actorStepModification != null && !actorStepModification.isEmpty();
			case HMIModificationmarksPackage.HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY__SYSTEM_STEP_MODIFICATION:
				return systemStepModification != null && !systemStepModification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HMIChangePropagationDueToSoftwareDependencyImpl
