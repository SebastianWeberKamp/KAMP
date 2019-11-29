/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECSeedModifications#getGlobalVariableModifications <em>Global Variable Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECSeedModifications#getInterfaceModifications <em>Interface Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECSeedModifications#getAbstractMethodModifications <em>Abstract Method Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECSeedModifications#getAbstractPropertyModifications <em>Abstract Property Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECSeedModifications#getFunctionBlockModifications <em>Function Block Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECSeedModifications#getMethodModifications <em>Method Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECSeedModifications#getPropertyModifications <em>Property Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECSeedModifications#getFunctionModifications <em>Function Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECSeedModifications#getProgramModifications <em>Program Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECSeedModifications()
 * @model
 * @generated
 */
public interface IECSeedModifications extends AbstractSeedModifications {
	/**
	 * Returns the value of the '<em><b>Global Variable Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyGlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Variable Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variable Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECSeedModifications_GlobalVariableModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECModifyGlobalVariable> getGlobalVariableModifications();

	/**
	 * Returns the value of the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECSeedModifications_InterfaceModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECModifyInterface> getInterfaceModifications();

	/**
	 * Returns the value of the '<em><b>Abstract Method Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyAbstractMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Method Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Method Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECSeedModifications_AbstractMethodModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECModifyAbstractMethod> getAbstractMethodModifications();

	/**
	 * Returns the value of the '<em><b>Abstract Property Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyAbstractProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Property Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Property Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECSeedModifications_AbstractPropertyModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECModifyAbstractProperty> getAbstractPropertyModifications();

	/**
	 * Returns the value of the '<em><b>Function Block Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyFunctionBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Block Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Block Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECSeedModifications_FunctionBlockModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECModifyFunctionBlock> getFunctionBlockModifications();

	/**
	 * Returns the value of the '<em><b>Method Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECSeedModifications_MethodModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECModifyMethod> getMethodModifications();

	/**
	 * Returns the value of the '<em><b>Property Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECSeedModifications_PropertyModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECModifyProperty> getPropertyModifications();

	/**
	 * Returns the value of the '<em><b>Function Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECSeedModifications_FunctionModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECModifyFunction> getFunctionModifications();

	/**
	 * Returns the value of the '<em><b>Program Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyProgram}.x
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECSeedModifications_ProgramModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECModifyProgram> getProgramModifications();

} // IECSeedModifications
