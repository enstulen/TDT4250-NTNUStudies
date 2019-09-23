/**
 */
package ntnustudies.impl;

import java.util.Collection;
import ntnustudies.Course;
import ntnustudies.NtnustudiesPackage;
import ntnustudies.courseLevel;
import ntnustudies.courseType;
import ntnustudies.semesterType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ntnustudies.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link ntnustudies.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link ntnustudies.impl.CourseImpl#getCredtis <em>Credtis</em>}</li>
 *   <li>{@link ntnustudies.impl.CourseImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link ntnustudies.impl.CourseImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link ntnustudies.impl.CourseImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

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
	 * The default value of the '{@link #getCredtis() <em>Credtis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredtis()
	 * @generated
	 * @ordered
	 */
	protected static final float CREDTIS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCredtis() <em>Credtis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredtis()
	 * @generated
	 * @ordered
	 */
	protected float credtis = CREDTIS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<semesterType> semesters;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final courseLevel LEVEL_EDEFAULT = courseLevel.BASIC;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected courseLevel level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final courseType TYPE_EDEFAULT = courseType.MANDATORY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected courseType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NtnustudiesPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NtnustudiesPackage.COURSE__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NtnustudiesPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCredtis() {
		return credtis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredtis(float newCredtis) {
		float oldCredtis = credtis;
		credtis = newCredtis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NtnustudiesPackage.COURSE__CREDTIS, oldCredtis, credtis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public courseLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(courseLevel newLevel) {
		courseLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NtnustudiesPackage.COURSE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public courseType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(courseType newType) {
		courseType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NtnustudiesPackage.COURSE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<semesterType> getSemesters() {
		if (semesters == null) {
			semesters = new EDataTypeUniqueEList<semesterType>(semesterType.class, this, NtnustudiesPackage.COURSE__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NtnustudiesPackage.COURSE__CODE:
				return getCode();
			case NtnustudiesPackage.COURSE__NAME:
				return getName();
			case NtnustudiesPackage.COURSE__CREDTIS:
				return getCredtis();
			case NtnustudiesPackage.COURSE__SEMESTERS:
				return getSemesters();
			case NtnustudiesPackage.COURSE__LEVEL:
				return getLevel();
			case NtnustudiesPackage.COURSE__TYPE:
				return getType();
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
			case NtnustudiesPackage.COURSE__CODE:
				setCode((String)newValue);
				return;
			case NtnustudiesPackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case NtnustudiesPackage.COURSE__CREDTIS:
				setCredtis((Float)newValue);
				return;
			case NtnustudiesPackage.COURSE__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends semesterType>)newValue);
				return;
			case NtnustudiesPackage.COURSE__LEVEL:
				setLevel((courseLevel)newValue);
				return;
			case NtnustudiesPackage.COURSE__TYPE:
				setType((courseType)newValue);
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
			case NtnustudiesPackage.COURSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case NtnustudiesPackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NtnustudiesPackage.COURSE__CREDTIS:
				setCredtis(CREDTIS_EDEFAULT);
				return;
			case NtnustudiesPackage.COURSE__SEMESTERS:
				getSemesters().clear();
				return;
			case NtnustudiesPackage.COURSE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case NtnustudiesPackage.COURSE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case NtnustudiesPackage.COURSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case NtnustudiesPackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NtnustudiesPackage.COURSE__CREDTIS:
				return credtis != CREDTIS_EDEFAULT;
			case NtnustudiesPackage.COURSE__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case NtnustudiesPackage.COURSE__LEVEL:
				return level != LEVEL_EDEFAULT;
			case NtnustudiesPackage.COURSE__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", credtis: ");
		result.append(credtis);
		result.append(", semesters: ");
		result.append(semesters);
		result.append(", level: ");
		result.append(level);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
