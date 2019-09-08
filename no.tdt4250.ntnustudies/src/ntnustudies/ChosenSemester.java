/**
 */
package ntnustudies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chosen Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ntnustudies.ChosenSemester#getSemester <em>Semester</em>}</li>
 *   <li>{@link ntnustudies.ChosenSemester#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see ntnustudies.NtnustudiesPackage#getChosenSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='normalSemesterHas30Credits chosenCoursesArePartOfPossibleCourses'"
 * @generated
 */
public interface ChosenSemester extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' reference.
	 * @see #setSemester(Semester)
	 * @see ntnustudies.NtnustudiesPackage#getChosenSemester_Semester()
	 * @model
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link ntnustudies.ChosenSemester#getSemester <em>Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link ntnustudies.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see ntnustudies.NtnustudiesPackage#getChosenSemester_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // ChosenSemester
