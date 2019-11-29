/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC Change Propagation Due To Data Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECChangePropagationDueToDataDependency#getFunctionBlockModifications <em>Function Block Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECChangePropagationDueToDataDependency#getGlobalVariableModifications <em>Global Variable Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECChangePropagationDueToDataDependency#getFunctionModifications <em>Function Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECChangePropagationDueToDataDependency#getInterfaceModifications <em>Interface Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECChangePropagationDueToDataDependency#getAbstractMethodModifications <em>Abstract Method Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECChangePropagationDueToDataDependency#getAbstractPropertyModifications <em>Abstract Property Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECChangePropagationDueToDataDependency#getProgramModifications <em>Program Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECChangePropagationDueToDataDependency#getConfigurationModifications <em>Configuration Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECChangePropagationDueToDataDependency#getMethodModifications <em>Method Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECChangePropagationDueToDataDependency#getPropertyModifications <em>Property Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECChangePropagationDueToDataDependency#isChanged <em>Changed</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECChangePropagationDueToDataDependency()
 * @model
 * @generated
 */
public interface IECChangePropagationDueToDataDependency extends ChangePropagationStep {
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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECChangePropagationDueToDataDependency_FunctionBlockModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECModifyFunctionBlock> getFunctionBlockModifications();

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECChangePropagationDueToDataDependency_GlobalVariableModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECModifyGlobalVariable> getGlobalVariableModifications();

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECChangePropagationDueToDataDependency_FunctionModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECModifyFunction> getFunctionModifications();

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECChangePropagationDueToDataDependency_InterfaceModifications()
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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECChangePropagationDueToDataDependency_AbstractMethodModifications()
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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECChangePropagationDueToDataDependency_AbstractPropertyModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECModifyAbstractProperty> getAbstractPropertyModifications();

	/**
	 * Returns the value of the '<em><b>Program Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyProgram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECChangePropagationDueToDataDependency_ProgramModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECModifyProgram> getProgramModifications();

	/**
	 * Returns the value of the '<em><b>Configuration Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECChangePropagationDueToDataDependency_ConfigurationModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECModifyConfiguration> getConfigurationModifications();

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECChangePropagationDueToDataDependency_MethodModifications()
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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECChangePropagationDueToDataDependency_PropertyModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECModifyProperty> getPropertyModifications();

	/**
	 * Returns the value of the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed</em>' attribute.
	 * @see #setChanged(boolean)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECChangePropagationDueToDataDependency_Changed()
	 * @model
	 * @generated
	 */
	boolean isChanged();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECChangePropagationDueToDataDependency#isChanged <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed</em>' attribute.
	 * @see #isChanged()
	 * @generated
	 */
	void setChanged(boolean value);

} // IECChangePropagationDueToDataDependency
