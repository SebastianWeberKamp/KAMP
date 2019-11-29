/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage
 * @generated
 */
public interface IECRepositoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IECRepositoryFactory eINSTANCE = edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	Repository createRepository();

	/**
	 * Returns a new object of class '<em>Function Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Block</em>'.
	 * @generated
	 */
	FunctionBlock createFunctionBlock();

	/**
	 * Returns a new object of class '<em>Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Variable</em>'.
	 * @generated
	 */
	GlobalVariable createGlobalVariable();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>IEC Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IEC Method</em>'.
	 * @generated
	 */
	IECMethod createIECMethod();

	/**
	 * Returns a new object of class '<em>IEC Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IEC Interface</em>'.
	 * @generated
	 */
	IECInterface createIECInterface();

	/**
	 * Returns a new object of class '<em>IEC Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IEC Property</em>'.
	 * @generated
	 */
	IECProperty createIECProperty();

	/**
	 * Returns a new object of class '<em>IEC Abstract Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IEC Abstract Property</em>'.
	 * @generated
	 */
	IECAbstractProperty createIECAbstractProperty();

	/**
	 * Returns a new object of class '<em>IEC Abstract Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IEC Abstract Method</em>'.
	 * @generated
	 */
	IECAbstractMethod createIECAbstractMethod();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IECRepositoryPackage getIECRepositoryPackage();

} //IECRepositoryFactory
