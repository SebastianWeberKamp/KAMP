/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.util;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.*;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;

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
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage
 * @generated
 */
public class IECModificationmarksSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IECModificationmarksPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModificationmarksSwitch() {
		if (modelPackage == null) {
			modelPackage = IECModificationmarksPackage.eINSTANCE;
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
			case IECModificationmarksPackage.ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY: {
				AbstractKAMP4IECModificationRepository<?> abstractKAMP4IECModificationRepository = (AbstractKAMP4IECModificationRepository<?>)theEObject;
				T1 result = caseAbstractKAMP4IECModificationRepository(abstractKAMP4IECModificationRepository);
				if (result == null) result = caseAbstractModificationRepository(abstractKAMP4IECModificationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECModificationmarksPackage.IEC_MODIFICATION_REPOSITORY: {
				IECModificationRepository iecModificationRepository = (IECModificationRepository)theEObject;
				T1 result = caseIECModificationRepository(iecModificationRepository);
				if (result == null) result = caseAbstractKAMP4IECModificationRepository(iecModificationRepository);
				if (result == null) result = caseAbstractModificationRepository(iecModificationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECModificationmarksPackage.IEC_SEED_MODIFICATIONS: {
				IECSeedModifications iecSeedModifications = (IECSeedModifications)theEObject;
				T1 result = caseIECSeedModifications(iecSeedModifications);
				if (result == null) result = caseAbstractSeedModifications(iecSeedModifications);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY: {
				IECChangePropagationDueToDataDependency iecChangePropagationDueToDataDependency = (IECChangePropagationDueToDataDependency)theEObject;
				T1 result = caseIECChangePropagationDueToDataDependency(iecChangePropagationDueToDataDependency);
				if (result == null) result = caseChangePropagationStep(iecChangePropagationDueToDataDependency);
				if (result == null) result = caseAbstractChangePropagationStep(iecChangePropagationDueToDataDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECModificationmarksPackage.IEC_MODIFY_COMPONENT: {
				IECModifyComponent<?> iecModifyComponent = (IECModifyComponent<?>)theEObject;
				T1 result = caseIECModifyComponent(iecModifyComponent);
				if (result == null) result = caseAbstractModification(iecModifyComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECModificationmarksPackage.IEC_MODIFY_GLOBAL_VARIABLE: {
				IECModifyGlobalVariable iecModifyGlobalVariable = (IECModifyGlobalVariable)theEObject;
				T1 result = caseIECModifyGlobalVariable(iecModifyGlobalVariable);
				if (result == null) result = caseIECModifyComponent(iecModifyGlobalVariable);
				if (result == null) result = caseAbstractModification(iecModifyGlobalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECModificationmarksPackage.IEC_MODIFY_FUNCTION_BLOCK: {
				IECModifyFunctionBlock iecModifyFunctionBlock = (IECModifyFunctionBlock)theEObject;
				T1 result = caseIECModifyFunctionBlock(iecModifyFunctionBlock);
				if (result == null) result = caseIECModifyComponent(iecModifyFunctionBlock);
				if (result == null) result = caseAbstractModification(iecModifyFunctionBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECModificationmarksPackage.IEC_MODIFY_FUNCTION: {
				IECModifyFunction iecModifyFunction = (IECModifyFunction)theEObject;
				T1 result = caseIECModifyFunction(iecModifyFunction);
				if (result == null) result = caseIECModifyComponent(iecModifyFunction);
				if (result == null) result = caseAbstractModification(iecModifyFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECModificationmarksPackage.IEC_MODIFY_INTERFACE: {
				IECModifyInterface iecModifyInterface = (IECModifyInterface)theEObject;
				T1 result = caseIECModifyInterface(iecModifyInterface);
				if (result == null) result = caseIECModifyComponent(iecModifyInterface);
				if (result == null) result = caseAbstractModification(iecModifyInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECModificationmarksPackage.IEC_MODIFY_METHOD: {
				IECModifyMethod iecModifyMethod = (IECModifyMethod)theEObject;
				T1 result = caseIECModifyMethod(iecModifyMethod);
				if (result == null) result = caseIECModifyComponent(iecModifyMethod);
				if (result == null) result = caseAbstractModification(iecModifyMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECModificationmarksPackage.IEC_MODIFY_ABSTRACT_METHOD: {
				IECModifyAbstractMethod iecModifyAbstractMethod = (IECModifyAbstractMethod)theEObject;
				T1 result = caseIECModifyAbstractMethod(iecModifyAbstractMethod);
				if (result == null) result = caseIECModifyComponent(iecModifyAbstractMethod);
				if (result == null) result = caseAbstractModification(iecModifyAbstractMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECModificationmarksPackage.IEC_MODIFY_PROPERTY: {
				IECModifyProperty iecModifyProperty = (IECModifyProperty)theEObject;
				T1 result = caseIECModifyProperty(iecModifyProperty);
				if (result == null) result = caseIECModifyComponent(iecModifyProperty);
				if (result == null) result = caseAbstractModification(iecModifyProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECModificationmarksPackage.IEC_MODIFY_ABSTRACT_PROPERTY: {
				IECModifyAbstractProperty iecModifyAbstractProperty = (IECModifyAbstractProperty)theEObject;
				T1 result = caseIECModifyAbstractProperty(iecModifyAbstractProperty);
				if (result == null) result = caseIECModifyComponent(iecModifyAbstractProperty);
				if (result == null) result = caseAbstractModification(iecModifyAbstractProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECModificationmarksPackage.IEC_MODIFY_PROGRAM: {
				IECModifyProgram iecModifyProgram = (IECModifyProgram)theEObject;
				T1 result = caseIECModifyProgram(iecModifyProgram);
				if (result == null) result = caseIECModifyComponent(iecModifyProgram);
				if (result == null) result = caseAbstractModification(iecModifyProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECModificationmarksPackage.IEC_MODIFY_CONFIGURATION: {
				IECModifyConfiguration iecModifyConfiguration = (IECModifyConfiguration)theEObject;
				T1 result = caseIECModifyConfiguration(iecModifyConfiguration);
				if (result == null) result = caseIECModifyComponent(iecModifyConfiguration);
				if (result == null) result = caseAbstractModification(iecModifyConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract KAMP4IEC Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract KAMP4IEC Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends IECSeedModifications> T1 caseAbstractKAMP4IECModificationRepository(AbstractKAMP4IECModificationRepository<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIECModificationRepository(IECModificationRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIECSeedModifications(IECSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Change Propagation Due To Data Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Change Propagation Due To Data Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIECChangePropagationDueToDataDependency(IECChangePropagationDueToDataDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Modify Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Modify Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends IECComponent> T1 caseIECModifyComponent(IECModifyComponent<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Modify Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Modify Global Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIECModifyGlobalVariable(IECModifyGlobalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Modify Function Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Modify Function Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIECModifyFunctionBlock(IECModifyFunctionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Modify Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Modify Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIECModifyFunction(IECModifyFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Modify Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Modify Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIECModifyInterface(IECModifyInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Modify Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Modify Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIECModifyMethod(IECModifyMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Modify Abstract Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Modify Abstract Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIECModifyAbstractMethod(IECModifyAbstractMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Modify Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Modify Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIECModifyProperty(IECModifyProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Modify Abstract Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Modify Abstract Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIECModifyAbstractProperty(IECModifyAbstractProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Modify Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Modify Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIECModifyProgram(IECModifyProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Modify Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Modify Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIECModifyConfiguration(IECModifyConfiguration object) {
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

} //IECModificationmarksSwitch
