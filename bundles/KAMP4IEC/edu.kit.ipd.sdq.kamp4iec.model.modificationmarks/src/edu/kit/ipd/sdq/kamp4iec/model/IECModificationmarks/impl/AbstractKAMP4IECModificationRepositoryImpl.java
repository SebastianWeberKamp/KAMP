/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationRepositoryImpl;

import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.AbstractKAMP4IECModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECSeedModifications;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract KAMP4IEC Modification Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractKAMP4IECModificationRepositoryImpl<T extends IECSeedModifications> extends AbstractModificationRepositoryImpl<T, ChangePropagationStep> implements AbstractKAMP4IECModificationRepository<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractKAMP4IECModificationRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECModificationmarksPackage.Literals.ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY;
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
			changePropagationSteps = new EObjectContainmentEList<ChangePropagationStep>(ChangePropagationStep.class, this, IECModificationmarksPackage.ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS);
		}
		return changePropagationSteps;
	}

} //AbstractKAMP4IECModificationRepositoryImpl
