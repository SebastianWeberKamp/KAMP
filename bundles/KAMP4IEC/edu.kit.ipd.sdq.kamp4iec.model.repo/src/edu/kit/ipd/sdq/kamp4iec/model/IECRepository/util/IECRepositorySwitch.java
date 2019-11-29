/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.util;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.*;

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
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage
 * @generated
 */
public class IECRepositorySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IECRepositoryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECRepositorySwitch() {
		if (modelPackage == null) {
			modelPackage = IECRepositoryPackage.eINSTANCE;
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IECRepositoryPackage.REPOSITORY: {
				Repository repository = (Repository)theEObject;
				T result = caseRepository(repository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECRepositoryPackage.FUNCTION_BLOCK: {
				FunctionBlock functionBlock = (FunctionBlock)theEObject;
				T result = caseFunctionBlock(functionBlock);
				if (result == null) result = caseIECComponent(functionBlock);
				if (result == null) result = caseDerivedType(functionBlock);
				if (result == null) result = caseIdentifier(functionBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECRepositoryPackage.GLOBAL_VARIABLE: {
				GlobalVariable globalVariable = (GlobalVariable)theEObject;
				T result = caseGlobalVariable(globalVariable);
				if (result == null) result = caseIECComponent(globalVariable);
				if (result == null) result = caseIdentifier(globalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECRepositoryPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseIECComponent(function);
				if (result == null) result = caseIdentifier(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECRepositoryPackage.IEC_INTERFACE: {
				IECInterface iecInterface = (IECInterface)theEObject;
				T result = caseIECInterface(iecInterface);
				if (result == null) result = caseIECComponent(iecInterface);
				if (result == null) result = caseDerivedType(iecInterface);
				if (result == null) result = caseIdentifier(iecInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECRepositoryPackage.IEC_METHOD: {
				IECMethod iecMethod = (IECMethod)theEObject;
				T result = caseIECMethod(iecMethod);
				if (result == null) result = caseIECComponent(iecMethod);
				if (result == null) result = caseIsMethod(iecMethod);
				if (result == null) result = caseIdentifier(iecMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECRepositoryPackage.IEC_PROPERTY: {
				IECProperty iecProperty = (IECProperty)theEObject;
				T result = caseIECProperty(iecProperty);
				if (result == null) result = caseIECComponent(iecProperty);
				if (result == null) result = caseIsProperty(iecProperty);
				if (result == null) result = caseIdentifier(iecProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECRepositoryPackage.IEC_ABSTRACT_PROPERTY: {
				IECAbstractProperty iecAbstractProperty = (IECAbstractProperty)theEObject;
				T result = caseIECAbstractProperty(iecAbstractProperty);
				if (result == null) result = caseIECComponent(iecAbstractProperty);
				if (result == null) result = caseIsProperty(iecAbstractProperty);
				if (result == null) result = caseIdentifier(iecAbstractProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECRepositoryPackage.IEC_ABSTRACT_METHOD: {
				IECAbstractMethod iecAbstractMethod = (IECAbstractMethod)theEObject;
				T result = caseIECAbstractMethod(iecAbstractMethod);
				if (result == null) result = caseIECComponent(iecAbstractMethod);
				if (result == null) result = caseIsMethod(iecAbstractMethod);
				if (result == null) result = caseIdentifier(iecAbstractMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECRepositoryPackage.IEC_COMPONENT: {
				IECComponent iecComponent = (IECComponent)theEObject;
				T result = caseIECComponent(iecComponent);
				if (result == null) result = caseIdentifier(iecComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECRepositoryPackage.IDENTIFIER: {
				Identifier identifier = (Identifier)theEObject;
				T result = caseIdentifier(identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECRepositoryPackage.DERIVED_TYPE: {
				DerivedType derivedType = (DerivedType)theEObject;
				T result = caseDerivedType(derivedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECRepositoryPackage.IS_METHOD: {
				IsMethod isMethod = (IsMethod)theEObject;
				T result = caseIsMethod(isMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECRepositoryPackage.IS_PROPERTY: {
				IsProperty isProperty = (IsProperty)theEObject;
				T result = caseIsProperty(isProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepository(Repository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionBlock(FunctionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVariable(GlobalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECMethod(IECMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECInterface(IECInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECProperty(IECProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Abstract Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Abstract Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECAbstractProperty(IECAbstractProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Abstract Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Abstract Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECAbstractMethod(IECAbstractMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECComponent(IECComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedType(DerivedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsMethod(IsMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsProperty(IsProperty object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //IECRepositorySwitch
