/**
 */
package ntnustudies.impl;

import java.util.Collection;

import ntnustudies.Course;
import ntnustudies.NtnustudiesPackage;
import ntnustudies.Programme;
import ntnustudies.Semester;

import ntnustudies.semesterType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ntnustudies.impl.SemesterImpl#getPossibleCourses <em>Possible Courses</em>}</li>
 *   <li>{@link ntnustudies.impl.SemesterImpl#getType <em>Type</em>}</li>
 *   <li>{@link ntnustudies.impl.SemesterImpl#getYear <em>Year</em>}</li>
 *   <li>{@link ntnustudies.impl.SemesterImpl#getProgramme <em>Programme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The cached value of the '{@link #getPossibleCourses() <em>Possible Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> possibleCourses;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final semesterType TYPE_EDEFAULT = semesterType.FALL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected semesterType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NtnustudiesPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getPossibleCourses() {
		if (possibleCourses == null) {
			possibleCourses = new EObjectResolvingEList<Course>(Course.class, this, NtnustudiesPackage.SEMESTER__POSSIBLE_COURSES);
		}
		return possibleCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public semesterType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(semesterType newType) {
		semesterType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NtnustudiesPackage.SEMESTER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NtnustudiesPackage.SEMESTER__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme getProgramme() {
		if (eContainerFeatureID() != NtnustudiesPackage.SEMESTER__PROGRAMME) return null;
		return (Programme)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramme(Programme newProgramme, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgramme, NtnustudiesPackage.SEMESTER__PROGRAMME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramme(Programme newProgramme) {
		if (newProgramme != eInternalContainer() || (eContainerFeatureID() != NtnustudiesPackage.SEMESTER__PROGRAMME && newProgramme != null)) {
			if (EcoreUtil.isAncestor(this, newProgramme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgramme != null)
				msgs = ((InternalEObject)newProgramme).eInverseAdd(this, NtnustudiesPackage.PROGRAMME__SEMESTERS, Programme.class, msgs);
			msgs = basicSetProgramme(newProgramme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NtnustudiesPackage.SEMESTER__PROGRAMME, newProgramme, newProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NtnustudiesPackage.SEMESTER__PROGRAMME:
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
			case NtnustudiesPackage.SEMESTER__PROGRAMME:
				return basicSetProgramme(null, msgs);
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
			case NtnustudiesPackage.SEMESTER__PROGRAMME:
				return eInternalContainer().eInverseRemove(this, NtnustudiesPackage.PROGRAMME__SEMESTERS, Programme.class, msgs);
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
			case NtnustudiesPackage.SEMESTER__POSSIBLE_COURSES:
				return getPossibleCourses();
			case NtnustudiesPackage.SEMESTER__TYPE:
				return getType();
			case NtnustudiesPackage.SEMESTER__YEAR:
				return getYear();
			case NtnustudiesPackage.SEMESTER__PROGRAMME:
				return getProgramme();
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
			case NtnustudiesPackage.SEMESTER__POSSIBLE_COURSES:
				getPossibleCourses().clear();
				getPossibleCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case NtnustudiesPackage.SEMESTER__TYPE:
				setType((semesterType)newValue);
				return;
			case NtnustudiesPackage.SEMESTER__YEAR:
				setYear((Integer)newValue);
				return;
			case NtnustudiesPackage.SEMESTER__PROGRAMME:
				setProgramme((Programme)newValue);
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
			case NtnustudiesPackage.SEMESTER__POSSIBLE_COURSES:
				getPossibleCourses().clear();
				return;
			case NtnustudiesPackage.SEMESTER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case NtnustudiesPackage.SEMESTER__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case NtnustudiesPackage.SEMESTER__PROGRAMME:
				setProgramme((Programme)null);
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
			case NtnustudiesPackage.SEMESTER__POSSIBLE_COURSES:
				return possibleCourses != null && !possibleCourses.isEmpty();
			case NtnustudiesPackage.SEMESTER__TYPE:
				return type != TYPE_EDEFAULT;
			case NtnustudiesPackage.SEMESTER__YEAR:
				return year != YEAR_EDEFAULT;
			case NtnustudiesPackage.SEMESTER__PROGRAMME:
				return getProgramme() != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
