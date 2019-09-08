/**
 */
package ntnustudies.impl;

import java.util.Collection;

import ntnustudies.ChosenSemester;
import ntnustudies.NtnustudiesPackage;
import ntnustudies.Programme;
import ntnustudies.Specialization;
import ntnustudies.StudyPlan;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ntnustudies.impl.StudyPlanImpl#getProgramme <em>Programme</em>}</li>
 *   <li>{@link ntnustudies.impl.StudyPlanImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link ntnustudies.impl.StudyPlanImpl#getChosenSemesters <em>Chosen Semesters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyPlanImpl extends MinimalEObjectImpl.Container implements StudyPlan {
	/**
	 * The cached value of the '{@link #getProgramme() <em>Programme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramme()
	 * @generated
	 * @ordered
	 */
	protected Programme programme;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> specializations;

	/**
	 * The cached value of the '{@link #getChosenSemesters() <em>Chosen Semesters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChosenSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<ChosenSemester> chosenSemesters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NtnustudiesPackage.Literals.STUDY_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme getProgramme() {
		if (programme != null && programme.eIsProxy()) {
			InternalEObject oldProgramme = (InternalEObject)programme;
			programme = (Programme)eResolveProxy(oldProgramme);
			if (programme != oldProgramme) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NtnustudiesPackage.STUDY_PLAN__PROGRAMME, oldProgramme, programme));
			}
		}
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme basicGetProgramme() {
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramme(Programme newProgramme) {
		Programme oldProgramme = programme;
		programme = newProgramme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NtnustudiesPackage.STUDY_PLAN__PROGRAMME, oldProgramme, programme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialization> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectResolvingEList<Specialization>(Specialization.class, this, NtnustudiesPackage.STUDY_PLAN__SPECIALIZATIONS);
		}
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChosenSemester> getChosenSemesters() {
		if (chosenSemesters == null) {
			chosenSemesters = new EObjectResolvingEList<ChosenSemester>(ChosenSemester.class, this, NtnustudiesPackage.STUDY_PLAN__CHOSEN_SEMESTERS);
		}
		return chosenSemesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NtnustudiesPackage.STUDY_PLAN__PROGRAMME:
				if (resolve) return getProgramme();
				return basicGetProgramme();
			case NtnustudiesPackage.STUDY_PLAN__SPECIALIZATIONS:
				return getSpecializations();
			case NtnustudiesPackage.STUDY_PLAN__CHOSEN_SEMESTERS:
				return getChosenSemesters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NtnustudiesPackage.STUDY_PLAN__PROGRAMME:
				setProgramme((Programme)newValue);
				return;
			case NtnustudiesPackage.STUDY_PLAN__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case NtnustudiesPackage.STUDY_PLAN__CHOSEN_SEMESTERS:
				getChosenSemesters().clear();
				getChosenSemesters().addAll((Collection<? extends ChosenSemester>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NtnustudiesPackage.STUDY_PLAN__PROGRAMME:
				setProgramme((Programme)null);
				return;
			case NtnustudiesPackage.STUDY_PLAN__SPECIALIZATIONS:
				getSpecializations().clear();
				return;
			case NtnustudiesPackage.STUDY_PLAN__CHOSEN_SEMESTERS:
				getChosenSemesters().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NtnustudiesPackage.STUDY_PLAN__PROGRAMME:
				return programme != null;
			case NtnustudiesPackage.STUDY_PLAN__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
			case NtnustudiesPackage.STUDY_PLAN__CHOSEN_SEMESTERS:
				return chosenSemesters != null && !chosenSemesters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StudyPlanImpl
