/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC Abstract Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod#getHasDerivedReturnType <em>Has Derived Return Type</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getIECAbstractMethod()
 * @model
 * @generated
 */
public interface IECAbstractMethod extends IECComponent, IsMethod {
	/**
	 * Returns the value of the '<em><b>Has Derived Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Derived Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Derived Return Type</em>' reference.
	 * @see #setHasDerivedReturnType(DerivedType)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getIECAbstractMethod_HasDerivedReturnType()
	 * @model
	 * @generated
	 */
	DerivedType getHasDerivedReturnType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod#getHasDerivedReturnType <em>Has Derived Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Derived Return Type</em>' reference.
	 * @see #getHasDerivedReturnType()
	 * @generated
	 */
	void setHasDerivedReturnType(DerivedType value);

} // IECAbstractMethod
