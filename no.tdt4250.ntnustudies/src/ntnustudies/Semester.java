/**
 */
package ntnustudies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ntnustudies.Semester#getPossibleCourses <em>Possible Courses</em>}</li>
 *   <li>{@link ntnustudies.Semester#getType <em>Type</em>}</li>
 *   <li>{@link ntnustudies.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link ntnustudies.Semester#getProgramme <em>Programme</em>}</li>
 * </ul>
 *
 * @see ntnustudies.NtnustudiesPackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Possible Courses</b></em>' reference list.
	 * The list contents are of type {@link ntnustudies.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Courses</em>' reference list.
	 * @see ntnustudies.NtnustudiesPackage#getSemester_PossibleCourses()
	 * @model
	 * @generated
	 */
	EList<Course> getPossibleCourses();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ntnustudies.semesterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ntnustudies.semesterType
	 * @see #setType(semesterType)
	 * @see ntnustudies.NtnustudiesPackage#getSemester_Type()
	 * @model
	 * @generated
	 */
	semesterType getType();

	/**
	 * Sets the value of the '{@link ntnustudies.Semester#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ntnustudies.semesterType
	 * @see #getType()
	 * @generated
	 */
	void setType(semesterType value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see ntnustudies.NtnustudiesPackage#getSemester_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link ntnustudies.Semester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ntnustudies.Programme#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' container reference.
	 * @see #setProgramme(Programme)
	 * @see ntnustudies.NtnustudiesPackage#getSemester_Programme()
	 * @see ntnustudies.Programme#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link ntnustudies.Semester#getProgramme <em>Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' container reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

} // Semester
