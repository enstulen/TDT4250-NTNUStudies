/**
 */
package ntnustudies;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ntnustudies.Course#getCode <em>Code</em>}</li>
 *   <li>{@link ntnustudies.Course#getName <em>Name</em>}</li>
 *   <li>{@link ntnustudies.Course#getCredtis <em>Credtis</em>}</li>
 *   <li>{@link ntnustudies.Course#getProgrammes <em>Programmes</em>}</li>
 *   <li>{@link ntnustudies.Course#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link ntnustudies.Course#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see ntnustudies.NtnustudiesPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see ntnustudies.NtnustudiesPackage#getCourse_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link ntnustudies.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ntnustudies.NtnustudiesPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ntnustudies.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Credtis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credtis</em>' attribute.
	 * @see #setCredtis(float)
	 * @see ntnustudies.NtnustudiesPackage#getCourse_Credtis()
	 * @model
	 * @generated
	 */
	float getCredtis();

	/**
	 * Sets the value of the '{@link ntnustudies.Course#getCredtis <em>Credtis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credtis</em>' attribute.
	 * @see #getCredtis()
	 * @generated
	 */
	void setCredtis(float value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ntnustudies.courseLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see ntnustudies.courseLevel
	 * @see #setLevel(courseLevel)
	 * @see ntnustudies.NtnustudiesPackage#getCourse_Level()
	 * @model
	 * @generated
	 */
	courseLevel getLevel();

	/**
	 * Sets the value of the '{@link ntnustudies.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see ntnustudies.courseLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(courseLevel value);

	/**
	 * Returns the value of the '<em><b>Programmes</b></em>' reference list.
	 * The list contents are of type {@link ntnustudies.Programme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmes</em>' reference list.
	 * @see ntnustudies.NtnustudiesPackage#getCourse_Programmes()
	 * @model
	 * @generated
	 */
	EList<Programme> getProgrammes();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' attribute list.
	 * The list contents are of type {@link ntnustudies.semesterType}.
	 * The literals are from the enumeration {@link ntnustudies.semesterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' attribute list.
	 * @see ntnustudies.semesterType
	 * @see ntnustudies.NtnustudiesPackage#getCourse_Semesters()
	 * @model upper="2"
	 * @generated
	 */
	EList<semesterType> getSemesters();

} // Course
