/**
 */
package ntnustudies.util;

import java.util.Map;

import ntnustudies.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ntnustudies.NtnustudiesPackage
 * @generated
 */
public class NtnustudiesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final NtnustudiesValidator INSTANCE = new NtnustudiesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ntnustudies";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NtnustudiesValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return NtnustudiesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case NtnustudiesPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case NtnustudiesPackage.PROGRAMME:
				return validateProgramme((Programme)value, diagnostics, context);
			case NtnustudiesPackage.SPECIALIZATION:
				return validateSpecialization((Specialization)value, diagnostics, context);
			case NtnustudiesPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case NtnustudiesPackage.CHOSEN_SEMESTER:
				return validateChosenSemester((ChosenSemester)value, diagnostics, context);
			case NtnustudiesPackage.STUDY_PLAN:
				return validateStudyPlan((StudyPlan)value, diagnostics, context);
			case NtnustudiesPackage.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			case NtnustudiesPackage.SEMESTER_TYPE:
				return validatesemesterType((semesterType)value, diagnostics, context);
			case NtnustudiesPackage.COURSE_LEVEL:
				return validatecourseLevel((courseLevel)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programme, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChosenSemester(ChosenSemester chosenSemester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(chosenSemester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(chosenSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(chosenSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(chosenSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(chosenSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(chosenSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(chosenSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(chosenSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(chosenSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validateChosenSemester_normalSemesterHas30Credits(chosenSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validateChosenSemester_chosenCoursesArePartOfPossibleCourses(chosenSemester, diagnostics, context);
		return result;
	}

	/**
	 * Validates the normalSemesterHas30Credits constraint of '<em>Chosen Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public boolean validateChosenSemester_normalSemesterHas30Credits(ChosenSemester chosenSemester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		float totalCredits = 0;
		for (Course course : chosenSemester.getCourses()) {
			totalCredits += course.getCredtis();
		}
		if (totalCredits > 30) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "normalSemesterHas30Credits", getObjectLabel(chosenSemester, context) },
						 new Object[] { chosenSemester },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the chosenCoursesArePartOfPossibleCourses constraint of '<em>Chosen Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChosenSemester_chosenCoursesArePartOfPossibleCourses(ChosenSemester chosenSemester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "chosenCoursesArePartOfPossibleCourses", getObjectLabel(chosenSemester, context) },
						 new Object[] { chosenSemester },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyPlan(StudyPlan studyPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(studyPlan, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudyPlan_legalSpecializations(studyPlan, diagnostics, context);
		return result;
	}
	

	/**
	 * Validates the legalSpecializations constraint of '<em>Study Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public boolean validateStudyPlan_legalSpecializations(StudyPlan studyPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		EList<Specialization> specializations = studyPlan.getSpecializations();
		boolean legalSpecialization = false;
		for (Specialization specialization : specializations) {
			Specialization requiredSpecialization = specialization.getRequiredSpecialization();
			if (requiredSpecialization != null) {
				if (specializations.stream().anyMatch(s -> s.getName() == requiredSpecialization.getName())) {
					legalSpecialization = true;
				} else {
					legalSpecialization = false;
				}
			}
		}
		
		if (!legalSpecialization) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "legalSpecializations", getObjectLabel(studyPlan, context) },
						 new Object[] { studyPlan },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesemesterType(semesterType semesterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecourseLevel(courseLevel courseLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //NtnustudiesValidator
