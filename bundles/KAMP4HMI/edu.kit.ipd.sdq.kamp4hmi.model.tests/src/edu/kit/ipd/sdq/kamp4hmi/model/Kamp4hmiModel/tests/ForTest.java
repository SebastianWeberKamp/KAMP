/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.tests;

import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.For;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForTest extends HMIElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ForTest.class);
	}

	/**
	 * Constructs a new For test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this For test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected For getFixture() {
		return (For)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Kamp4hmiModelFactory.eINSTANCE.createFor());
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

} //ForTest
