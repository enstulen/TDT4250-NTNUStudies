/**
 */
package ntnustudies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ntnustudies.StudyPlan#getProgramme <em>Programme</em>}</li>
 *   <li>{@link ntnustudies.StudyPlan#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link ntnustudies.StudyPlan#getChosenSemesters <em>Chosen Semesters</em>}</li>
 * </ul>
 *
 * @see ntnustudies.NtnustudiesPackage#getStudyPlan()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='legalSpecializations'"
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' reference.
	 * @see #setProgramme(Programme)
	 * @see ntnustudies.NtnustudiesPackage#getStudyPlan_Programme()
	 * @model
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link ntnustudies.StudyPlan#getProgramme <em>Programme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' reference list.
	 * The list contents are of type {@link ntnustudies.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' reference list.
	 * @see ntnustudies.NtnustudiesPackage#getStudyPlan_Specializations()
	 * @model
	 * @generated
	 */
	EList<Specialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Chosen Semesters</b></em>' reference list.
	 * The list contents are of type {@link ntnustudies.ChosenSemester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chosen Semesters</em>' reference list.
	 * @see ntnustudies.NtnustudiesPackage#getStudyPlan_ChosenSemesters()
	 * @model
	 * @generated
	 */
	EList<ChosenSemester> getChosenSemesters();

} // StudyPlan
