/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.tests;

import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationMarksRepository;
import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationmarksFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>HMI Modification Marks Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HMIModificationMarksRepositoryTest extends AbstractKAMP4HMIModificationRepositoryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HMIModificationMarksRepositoryTest.class);
	}

	/**
	 * Constructs a new HMI Modification Marks Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMIModificationMarksRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this HMI Modification Marks Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HMIModificationMarksRepository getFixture() {
		return (HMIModificationMarksRepository)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HMIModificationmarksFactory.eINSTANCE.createHMIModificationMarksRepository());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //HMIModificationMarksRepositoryTest
