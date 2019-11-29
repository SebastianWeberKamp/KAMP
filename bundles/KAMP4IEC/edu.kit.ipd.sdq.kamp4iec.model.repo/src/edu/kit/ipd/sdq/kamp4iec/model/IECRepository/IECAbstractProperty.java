/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC Abstract Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractProperty#getHasDerivedType <em>Has Derived Type</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getIECAbstractProperty()
 * @model
 * @generated
 */
public interface IECAbstractProperty extends IECComponent, IsProperty {
	/**
	 * Returns the value of the '<em><b>Has Derived Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Derived Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Derived Type</em>' reference.
	 * @see #setHasDerivedType(DerivedType)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getIECAbstractProperty_HasDerivedType()
	 * @model
	 * @generated
	 */
	DerivedType getHasDerivedType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractProperty#getHasDerivedType <em>Has Derived Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Derived Type</em>' reference.
	 * @see #getHasDerivedType()
	 * @generated
	 */
	void setHasDerivedType(DerivedType value);

} // IECAbstractProperty
