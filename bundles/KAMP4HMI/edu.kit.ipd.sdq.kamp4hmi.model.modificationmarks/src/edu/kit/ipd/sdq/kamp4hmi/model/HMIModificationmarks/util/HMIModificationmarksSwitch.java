/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.util;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.*;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Step;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationmarksPackage
 * @generated
 */
public class HMIModificationmarksSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HMIModificationmarksPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMIModificationmarksSwitch() {
		if (modelPackage == null) {
			modelPackage = HMIModificationmarksPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HMIModificationmarksPackage.ABSTRACT_KAMP4HMI_MODIFICATION_REPOSITORY: {
				AbstractKAMP4HMIModificationRepository<?> abstractKAMP4HMIModificationRepository = (AbstractKAMP4HMIModificationRepository<?>)theEObject;
				T1 result = caseAbstractKAMP4HMIModificationRepository(abstractKAMP4HMIModificationRepository);
				if (result == null) result = caseAbstractModificationRepository(abstractKAMP4HMIModificationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMIModificationmarksPackage.HMI_MODIFICATION_MARKS_REPOSITORY: {
				HMIModificationMarksRepository hmiModificationMarksRepository = (HMIModificationMarksRepository)theEObject;
				T1 result = caseHMIModificationMarksRepository(hmiModificationMarksRepository);
				if (result == null) result = caseAbstractKAMP4HMIModificationRepository(hmiModificationMarksRepository);
				if (result == null) result = caseAbstractModificationRepository(hmiModificationMarksRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMIModificationmarksPackage.HMI_SEED_MODIFICATIONS: {
				HMISeedModifications hmiSeedModifications = (HMISeedModifications)theEObject;
				T1 result = caseHMISeedModifications(hmiSeedModifications);
				if (result == null) result = caseAbstractSeedModifications(hmiSeedModifications);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMIModificationmarksPackage.HMI_MODIFICATION_REPOSITORY: {
				HMIModificationRepository hmiModificationRepository = (HMIModificationRepository)theEObject;
				T1 result = caseHMIModificationRepository(hmiModificationRepository);
				if (result == null) result = caseAbstractKAMP4HMIModificationRepository(hmiModificationRepository);
				if (result == null) result = caseAbstractModificationRepository(hmiModificationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMIModificationmarksPackage.HMI_CHANGE_PROPAGATION_DUE_TO_SOFTWARE_DEPENDENCY: {
				HMIChangePropagationDueToSoftwareDependency hmiChangePropagationDueToSoftwareDependency = (HMIChangePropagationDueToSoftwareDependency)theEObject;
				T1 result = caseHMIChangePropagationDueToSoftwareDependency(hmiChangePropagationDueToSoftwareDependency);
				if (result == null) result = caseChangePropagationStep(hmiChangePropagationDueToSoftwareDependency);
				if (result == null) result = caseAbstractChangePropagationStep(hmiChangePropagationDueToSoftwareDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMIModificationmarksPackage.HMI_MODIFY_STEP: {
				HMIModifyStep<?> hmiModifyStep = (HMIModifyStep<?>)theEObject;
				T1 result = caseHMIModifyStep(hmiModifyStep);
				if (result == null) result = caseAbstractModification(hmiModifyStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMIModificationmarksPackage.HMI_MODIFY_ACTOR_STEP: {
				HMIModifyActorStep hmiModifyActorStep = (HMIModifyActorStep)theEObject;
				T1 result = caseHMIModifyActorStep(hmiModifyActorStep);
				if (result == null) result = caseHMIModifyStep(hmiModifyActorStep);
				if (result == null) result = caseAbstractModification(hmiModifyActorStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMIModificationmarksPackage.HMI_MODIFY_SYSTEM_STEP: {
				HMIModifySystemStep hmiModifySystemStep = (HMIModifySystemStep)theEObject;
				T1 result = caseHMIModifySystemStep(hmiModifySystemStep);
				if (result == null) result = caseHMIModifyStep(hmiModifySystemStep);
				if (result == null) result = caseAbstractModification(hmiModifySystemStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract KAMP4HMI Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract KAMP4HMI Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends HMISeedModifications> T1 caseAbstractKAMP4HMIModificationRepository(AbstractKAMP4HMIModificationRepository<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMI Modification Marks Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMI Modification Marks Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHMIModificationMarksRepository(HMIModificationMarksRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMI Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMI Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHMISeedModifications(HMISeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMI Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMI Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHMIModificationRepository(HMIModificationRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMI Change Propagation Due To Software Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMI Change Propagation Due To Software Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHMIChangePropagationDueToSoftwareDependency(HMIChangePropagationDueToSoftwareDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMI Modify Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMI Modify Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Step> T1 caseHMIModifyStep(HMIModifyStep<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMI Modify Actor Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMI Modify Actor Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHMIModifyActorStep(HMIModifyActorStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMI Modify System Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMI Modify System Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHMIModifySystemStep(HMIModifySystemStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S extends AbstractSeedModifications, T extends AbstractChangePropagationStep> T1 caseAbstractModificationRepository(AbstractModificationRepository<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractSeedModifications(AbstractSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Change Propagation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractChangePropagationStep(AbstractChangePropagationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Propagation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChangePropagationStep(ChangePropagationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Modification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S, T> T1 caseAbstractModification(AbstractModification<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //HMIModificationmarksSwitch
