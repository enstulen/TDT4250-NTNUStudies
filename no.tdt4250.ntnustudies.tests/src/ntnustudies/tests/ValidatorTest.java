package ntnustudies.tests;

import org.eclipse.acceleo.query.delegates.AQLValidationDelegate;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator.ValidationDelegate;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ntnustudies.ChosenSemester;
import ntnustudies.Course;
import ntnustudies.NtnustudiesFactory;
import ntnustudies.Programme;
import ntnustudies.Specialization;
import ntnustudies.StudyPlan;

public class ValidatorTest {

	@Before
	public void setUp() {
		// register AQL (an OCL implementation) constraint support
		ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/acceleo/query/1.0", new AQLValidationDelegate());
	}
	
	@Test
	public void test_validateChosenSemester_normalSemesterHas30Credits() {
		ChosenSemester chosenSemester = NtnustudiesFactory.eINSTANCE.createChosenSemester();
		Course course = NtnustudiesFactory.eINSTANCE.createCourse();
		course.setCredtis(20);
		Course course2 = NtnustudiesFactory.eINSTANCE.createCourse();
		course2.setCredtis(21);
		chosenSemester.getCourses().add(course);
		chosenSemester.getCourses().add(course2);
		checkDiagnostic(chosenSemester, Diagnostic.WARNING);
	}
	
	//TODO, doesn't work
	@Test
	public void test_validateProgramme_maxProgramYearsIs5Years() {
		Programme programme = NtnustudiesFactory.eINSTANCE.createProgramme();
		programme.setYears(6);
		checkDiagnostic(programme, Diagnostic.ERROR);
	}
	
	//TODO, doesn't work
	@Test
	public void test_validateProgramme_programCantHaveNegativeYears() {
		Programme programme = NtnustudiesFactory.eINSTANCE.createProgramme();
		programme.setYears(-1);
		checkDiagnostic(programme, Diagnostic.ERROR);
	}
	
	@Test
	public void test_validateStudyPlan_legalSpecializations() {
		StudyPlan studyPlan = NtnustudiesFactory.eINSTANCE.createStudyPlan();

		EList<Specialization> specializations = studyPlan.getSpecializations();
		
		Specialization specialization1 = NtnustudiesFactory.eINSTANCE.createSpecialization();
		specialization1.setRequiredSpecialization(null);
		specialization1.setName("1");
		Specialization specialization2 = NtnustudiesFactory.eINSTANCE.createSpecialization();
		specialization2.setRequiredSpecialization(specialization1);
		specialization2.setName("2");

		
		Specialization specialization3 = NtnustudiesFactory.eINSTANCE.createSpecialization();
		specialization3.setRequiredSpecialization(null);
		specialization3.setName("3");
		Specialization specialization4 = NtnustudiesFactory.eINSTANCE.createSpecialization();
		specialization4.setRequiredSpecialization(specialization3);
		specialization4.setName("4");
		
		specializations.add(specialization1);
		specializations.add(specialization2);
		
		checkDiagnostic(studyPlan, Diagnostic.OK);
		
		specializations.add(specialization4);
		
		checkDiagnostic(studyPlan, Diagnostic.ERROR);


	}
	

	
	private void checkDiagnostic(EObject root, int severity) {
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(root);
		Assert.assertTrue(diagnostics.getSeverity() == severity);
	}
	

}
