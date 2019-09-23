/**
 */
package ntnustudies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ntnustudies.Programme#getName <em>Name</em>}</li>
 *   <li>{@link ntnustudies.Programme#getYears <em>Years</em>}</li>
 *   <li>{@link ntnustudies.Programme#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link ntnustudies.Programme#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see ntnustudies.NtnustudiesPackage#getProgramme()
 * @model annotation="http://www.eclipse.org/acceleo/query/1.0 maxProgramYearsIs5Years='self.years &lt; 6' programCantHaveNegativeYears='self.years &gt; 0'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxProgramYearsIs5Years programCantHaveNegativeYears'"
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ntnustudies.NtnustudiesPackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ntnustudies.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Years</em>' attribute.
	 * @see #setYears(int)
	 * @see ntnustudies.NtnustudiesPackage#getProgramme_Years()
	 * @model
	 * @generated
	 */
	int getYears();

	/**
	 * Sets the value of the '{@link ntnustudies.Programme#getYears <em>Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Years</em>' attribute.
	 * @see #getYears()
	 * @generated
	 */
	void setYears(int value);

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link ntnustudies.Specialization}.
	 * It is bidirectional and its opposite is '{@link ntnustudies.Specialization#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see ntnustudies.NtnustudiesPackage#getProgramme_Specializations()
	 * @see ntnustudies.Specialization#getProgramme
	 * @model opposite="programme" containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link ntnustudies.Semester}.
	 * It is bidirectional and its opposite is '{@link ntnustudies.Semester#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see ntnustudies.NtnustudiesPackage#getProgramme_Semesters()
	 * @see ntnustudies.Semester#getProgramme
	 * @model opposite="programme" containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

} // Programme
