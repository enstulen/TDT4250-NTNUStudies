/**
 */
package ntnustudies.impl;

import java.util.Collection;

import ntnustudies.Course;
import ntnustudies.NtnustudiesPackage;
import ntnustudies.Programme;
import ntnustudies.Semester;
import ntnustudies.Specialization;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ntnustudies.impl.SpecializationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ntnustudies.impl.SpecializationImpl#getProgramme <em>Programme</em>}</li>
 *   <li>{@link ntnustudies.impl.SpecializationImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link ntnustudies.impl.SpecializationImpl#getRequiredSpecialization <em>Required Specialization</em>}</li>
 *   <li>{@link ntnustudies.impl.SpecializationImpl#getSpecializationChoicePointSemester <em>Specialization Choice Point Semester</em>}</li>
 *   <li>{@link ntnustudies.impl.SpecializationImpl#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getRequiredSpecialization() <em>Required Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredSpecialization()
	 * @generated
	 * @ordered
	 */
	protected Specialization requiredSpecialization;

	/**
	 * The default value of the '{@link #getSpecializationChoicePointSemester() <em>Specialization Choice Point Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializationChoicePointSemester()
	 * @generated
	 * @ordered
	 */
	protected static final int SPECIALIZATION_CHOICE_POINT_SEMESTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpecializationChoicePointSemester() <em>Specialization Choice Point Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializationChoicePointSemester()
	 * @generated
	 * @ordered
	 */
	protected int specializationChoicePointSemester = SPECIALIZATION_CHOICE_POINT_SEMESTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NtnustudiesPackage.Literals.SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NtnustudiesPackage.SPECIALIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme getProgramme() {
		if (eContainerFeatureID() != NtnustudiesPackage.SPECIALIZATION__PROGRAMME) return null;
		return (Programme)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramme(Programme newProgramme, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgramme, NtnustudiesPackage.SPECIALIZATION__PROGRAMME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramme(Programme newProgramme) {
		if (newProgramme != eInternalContainer() || (eContainerFeatureID() != NtnustudiesPackage.SPECIALIZATION__PROGRAMME && newProgramme != null)) {
			if (EcoreUtil.isAncestor(this, newProgramme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgramme != null)
				msgs = ((InternalEObject)newProgramme).eInverseAdd(this, NtnustudiesPackage.PROGRAMME__SPECIALIZATIONS, Programme.class, msgs);
			msgs = basicSetProgramme(newProgramme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NtnustudiesPackage.SPECIALIZATION__PROGRAMME, newProgramme, newProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectResolvingEList<Course>(Course.class, this, NtnustudiesPackage.SPECIALIZATION__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization getRequiredSpecialization() {
		if (requiredSpecialization != null && requiredSpecialization.eIsProxy()) {
			InternalEObject oldRequiredSpecialization = (InternalEObject)requiredSpecialization;
			requiredSpecialization = (Specialization)eResolveProxy(oldRequiredSpecialization);
			if (requiredSpecialization != oldRequiredSpecialization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NtnustudiesPackage.SPECIALIZATION__REQUIRED_SPECIALIZATION, oldRequiredSpecialization, requiredSpecialization));
			}
		}
		return requiredSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization basicGetRequiredSpecialization() {
		return requiredSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredSpecialization(Specialization newRequiredSpecialization) {
		Specialization oldRequiredSpecialization = requiredSpecialization;
		requiredSpecialization = newRequiredSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NtnustudiesPackage.SPECIALIZATION__REQUIRED_SPECIALIZATION, oldRequiredSpecialization, requiredSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpecializationChoicePointSemester() {
		return specializationChoicePointSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecializationChoicePointSemester(int newSpecializationChoicePointSemester) {
		int oldSpecializationChoicePointSemester = specializationChoicePointSemester;
		specializationChoicePointSemester = newSpecializationChoicePointSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NtnustudiesPackage.SPECIALIZATION__SPECIALIZATION_CHOICE_POINT_SEMESTER, oldSpecializationChoicePointSemester, specializationChoicePointSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<Semester>(Semester.class, this, NtnustudiesPackage.SPECIALIZATION__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NtnustudiesPackage.SPECIALIZATION__PROGRAMME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgramme((Programme)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NtnustudiesPackage.SPECIALIZATION__PROGRAMME:
				return basicSetProgramme(null, msgs);
			case NtnustudiesPackage.SPECIALIZATION__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case NtnustudiesPackage.SPECIALIZATION__PROGRAMME:
				return eInternalContainer().eInverseRemove(this, NtnustudiesPackage.PROGRAMME__SPECIALIZATIONS, Programme.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NtnustudiesPackage.SPECIALIZATION__NAME:
				return getName();
			case NtnustudiesPackage.SPECIALIZATION__PROGRAMME:
				return getProgramme();
			case NtnustudiesPackage.SPECIALIZATION__COURSES:
				return getCourses();
			case NtnustudiesPackage.SPECIALIZATION__REQUIRED_SPECIALIZATION:
				if (resolve) return getRequiredSpecialization();
				return basicGetRequiredSpecialization();
			case NtnustudiesPackage.SPECIALIZATION__SPECIALIZATION_CHOICE_POINT_SEMESTER:
				return getSpecializationChoicePointSemester();
			case NtnustudiesPackage.SPECIALIZATION__SEMESTERS:
				return getSemesters();
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
			case NtnustudiesPackage.SPECIALIZATION__NAME:
				setName((String)newValue);
				return;
			case NtnustudiesPackage.SPECIALIZATION__PROGRAMME:
				setProgramme((Programme)newValue);
				return;
			case NtnustudiesPackage.SPECIALIZATION__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case NtnustudiesPackage.SPECIALIZATION__REQUIRED_SPECIALIZATION:
				setRequiredSpecialization((Specialization)newValue);
				return;
			case NtnustudiesPackage.SPECIALIZATION__SPECIALIZATION_CHOICE_POINT_SEMESTER:
				setSpecializationChoicePointSemester((Integer)newValue);
				return;
			case NtnustudiesPackage.SPECIALIZATION__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
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
			case NtnustudiesPackage.SPECIALIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NtnustudiesPackage.SPECIALIZATION__PROGRAMME:
				setProgramme((Programme)null);
				return;
			case NtnustudiesPackage.SPECIALIZATION__COURSES:
				getCourses().clear();
				return;
			case NtnustudiesPackage.SPECIALIZATION__REQUIRED_SPECIALIZATION:
				setRequiredSpecialization((Specialization)null);
				return;
			case NtnustudiesPackage.SPECIALIZATION__SPECIALIZATION_CHOICE_POINT_SEMESTER:
				setSpecializationChoicePointSemester(SPECIALIZATION_CHOICE_POINT_SEMESTER_EDEFAULT);
				return;
			case NtnustudiesPackage.SPECIALIZATION__SEMESTERS:
				getSemesters().clear();
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
			case NtnustudiesPackage.SPECIALIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NtnustudiesPackage.SPECIALIZATION__PROGRAMME:
				return getProgramme() != null;
			case NtnustudiesPackage.SPECIALIZATION__COURSES:
				return courses != null && !courses.isEmpty();
			case NtnustudiesPackage.SPECIALIZATION__REQUIRED_SPECIALIZATION:
				return requiredSpecialization != null;
			case NtnustudiesPackage.SPECIALIZATION__SPECIALIZATION_CHOICE_POINT_SEMESTER:
				return specializationChoicePointSemester != SPECIALIZATION_CHOICE_POINT_SEMESTER_EDEFAULT;
			case NtnustudiesPackage.SPECIALIZATION__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", specializationChoicePointSemester: ");
		result.append(specializationChoicePointSemester);
		result.append(')');
		return result.toString();
	}

} //SpecializationImpl
