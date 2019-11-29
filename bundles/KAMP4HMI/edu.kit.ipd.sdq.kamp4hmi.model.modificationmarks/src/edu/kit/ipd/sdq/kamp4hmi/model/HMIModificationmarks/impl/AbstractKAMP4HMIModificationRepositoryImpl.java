/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationRepositoryImpl;

import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.AbstractKAMP4HMIModificationRepository;
import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMISeedModifications;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract KAMP4HMI Modification Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractKAMP4HMIModificationRepositoryImpl<T extends HMISeedModifications> extends AbstractModificationRepositoryImpl<T, ChangePropagationStep> implements AbstractKAMP4HMIModificationRepository<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractKAMP4HMIModificationRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HMIModificationmarksPackage.Literals.ABSTRACT_KAMP4HMI_MODIFICATION_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetSeedModifications(T newSeedModifications, NotificationChain msgs) {
		return super.basicSetSeedModifications(newSeedModifications, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<ChangePropagationStep> getChangePropagationSteps() {
		if (changePropagationSteps == null) {
			changePropagationSteps = new EObjectContainmentEList<ChangePropagationStep>(ChangePropagationStep.class, this, HMIModificationmarksPackage.ABSTRACT_KAMP4HMI_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS);
		}
		return changePropagationSteps;
	}

} //AbstractKAMP4HMIModificationRepositoryImpl
