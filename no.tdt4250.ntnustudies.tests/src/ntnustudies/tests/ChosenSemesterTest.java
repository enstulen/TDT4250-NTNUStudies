/**
 */
package ntnustudies.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ntnustudies.ChosenSemester;
import ntnustudies.NtnustudiesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Chosen Semester</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChosenSemesterTest extends TestCase {

	/**
	 * The fixture for this Chosen Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChosenSemester fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChosenSemesterTest.class);
	}

	/**
	 * Constructs a new Chosen Semester test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChosenSemesterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Chosen Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ChosenSemester fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Chosen Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChosenSemester getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NtnustudiesFactory.eINSTANCE.createChosenSemester());
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

} //ChosenSemesterTest
