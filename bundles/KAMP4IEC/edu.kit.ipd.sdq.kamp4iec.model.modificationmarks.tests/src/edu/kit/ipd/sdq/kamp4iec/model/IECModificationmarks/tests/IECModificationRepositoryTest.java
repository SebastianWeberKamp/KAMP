/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.tests;

import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IEC Modification Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IECModificationRepositoryTest extends AbstractKAMP4IECModificationRepositoryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IECModificationRepositoryTest.class);
	}

	/**
	 * Constructs a new IEC Modification Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModificationRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this IEC Modification Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IECModificationRepository getFixture() {
		return (IECModificationRepository)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IECModificationmarksFactory.eINSTANCE.createIECModificationRepository());
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

} //IECModificationRepositoryTest
