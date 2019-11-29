/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks;

import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Step;
import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationmarksPackage
 * @generated
 */
public interface HMIModificationmarksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HMIModificationmarksFactory eINSTANCE = edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl.HMIModificationmarksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HMI Modification Marks Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMI Modification Marks Repository</em>'.
	 * @generated
	 */
	HMIModificationMarksRepository createHMIModificationMarksRepository();

	/**
	 * Returns a new object of class '<em>HMI Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMI Seed Modifications</em>'.
	 * @generated
	 */
	HMISeedModifications createHMISeedModifications();

	/**
	 * Returns a new object of class '<em>HMI Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMI Modification Repository</em>'.
	 * @generated
	 */
	HMIModificationRepository createHMIModificationRepository();

	/**
	 * Returns a new object of class '<em>HMI Change Propagation Due To Software Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMI Change Propagation Due To Software Dependency</em>'.
	 * @generated
	 */
	HMIChangePropagationDueToSoftwareDependency createHMIChangePropagationDueToSoftwareDependency();

	/**
	 * Returns a new object of class '<em>HMI Modify Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMI Modify Step</em>'.
	 * @generated
	 */
	<T extends Step> HMIModifyStep<T> createHMIModifyStep();

	/**
	 * Returns a new object of class '<em>HMI Modify Actor Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMI Modify Actor Step</em>'.
	 * @generated
	 */
	HMIModifyActorStep createHMIModifyActorStep();

	/**
	 * Returns a new object of class '<em>HMI Modify System Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMI Modify System Step</em>'.
	 * @generated
	 */
	HMIModifySystemStep createHMIModifySystemStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HMIModificationmarksPackage getHMIModificationmarksPackage();

} //HMIModificationmarksFactory
