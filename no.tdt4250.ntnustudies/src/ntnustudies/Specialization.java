/**
 */
package ntnustudies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ntnustudies.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link ntnustudies.Specialization#getProgramme <em>Programme</em>}</li>
 *   <li>{@link ntnustudies.Specialization#getCourses <em>Courses</em>}</li>
 *   <li>{@link ntnustudies.Specialization#getRequiredSpecialization <em>Required Specialization</em>}</li>
 *   <li>{@link ntnustudies.Specialization#getSpecializationChoicePointSemester <em>Specialization Choice Point Semester</em>}</li>
 *   <li>{@link ntnustudies.Specialization#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see ntnustudies.NtnustudiesPackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ntnustudies.NtnustudiesPackage#getSpecialization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ntnustudies.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ntnustudies.Programme#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' container reference.
	 * @see #setProgramme(Programme)
	 * @see ntnustudies.NtnustudiesPackage#getSpecialization_Programme()
	 * @see ntnustudies.Programme#getSpecializations
	 * @model opposite="specializations" transient="false" ordered="false"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link ntnustudies.Specialization#getProgramme <em>Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' container reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link ntnustudies.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see ntnustudies.NtnustudiesPackage#getSpecialization_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Required Specialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Specialization</em>' reference.
	 * @see #setRequiredSpecialization(Specialization)
	 * @see ntnustudies.NtnustudiesPackage#getSpecialization_RequiredSpecialization()
	 * @model
	 * @generated
	 */
	Specialization getRequiredSpecialization();

	/**
	 * Sets the value of the '{@link ntnustudies.Specialization#getRequiredSpecialization <em>Required Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Specialization</em>' reference.
	 * @see #getRequiredSpecialization()
	 * @generated
	 */
	void setRequiredSpecialization(Specialization value);

	/**
	 * Returns the value of the '<em><b>Specialization Choice Point Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization Choice Point Semester</em>' attribute.
	 * @see #setSpecializationChoicePointSemester(int)
	 * @see ntnustudies.NtnustudiesPackage#getSpecialization_SpecializationChoicePointSemester()
	 * @model
	 * @generated
	 */
	int getSpecializationChoicePointSemester();

	/**
	 * Sets the value of the '{@link ntnustudies.Specialization#getSpecializationChoicePointSemester <em>Specialization Choice Point Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization Choice Point Semester</em>' attribute.
	 * @see #getSpecializationChoicePointSemester()
	 * @generated
	 */
	void setSpecializationChoicePointSemester(int value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link ntnustudies.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see ntnustudies.NtnustudiesPackage#getSpecialization_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

} // Specialization
