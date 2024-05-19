/**
 */
package voronoi.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import voronoi.Cell;
import voronoi.Point;
import voronoi.VoronoiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link voronoi.impl.PointImpl#getX <em>X</em>}</li>
 *   <li>{@link voronoi.impl.PointImpl#getY <em>Y</em>}</li>
 *   <li>{@link voronoi.impl.PointImpl#getZ <em>Z</em>}</li>
 *   <li>{@link voronoi.impl.PointImpl#getAssociatedCell <em>Associated Cell</em>}</li>
 *   <li>{@link voronoi.impl.PointImpl#getBoundingCell <em>Bounding Cell</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointImpl extends MinimalEObjectImpl.Container implements Point {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final double X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected double x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final double Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected double y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected static final double Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected double z = Z_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssociatedCell() <em>Associated Cell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedCell()
	 * @generated
	 * @ordered
	 */
	protected Cell associatedCell;

	/**
	 * The cached value of the '{@link #getBoundingCell() <em>Bounding Cell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundingCell()
	 * @generated
	 * @ordered
	 */
	protected Cell boundingCell;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VoronoiPackage.Literals.POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(double newX) {
		double oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VoronoiPackage.POINT__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(double newY) {
		double oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VoronoiPackage.POINT__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZ(double newZ) {
		double oldZ = z;
		z = newZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VoronoiPackage.POINT__Z, oldZ, z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cell getAssociatedCell() {
		if (associatedCell != null && associatedCell.eIsProxy()) {
			InternalEObject oldAssociatedCell = (InternalEObject)associatedCell;
			associatedCell = (Cell)eResolveProxy(oldAssociatedCell);
			if (associatedCell != oldAssociatedCell) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VoronoiPackage.POINT__ASSOCIATED_CELL, oldAssociatedCell, associatedCell));
			}
		}
		return associatedCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell basicGetAssociatedCell() {
		return associatedCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociatedCell(Cell newAssociatedCell, NotificationChain msgs) {
		Cell oldAssociatedCell = associatedCell;
		associatedCell = newAssociatedCell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VoronoiPackage.POINT__ASSOCIATED_CELL, oldAssociatedCell, newAssociatedCell);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociatedCell(Cell newAssociatedCell) {
		if (newAssociatedCell != associatedCell) {
			NotificationChain msgs = null;
			if (associatedCell != null)
				msgs = ((InternalEObject)associatedCell).eInverseRemove(this, VoronoiPackage.CELL__CORE, Cell.class, msgs);
			if (newAssociatedCell != null)
				msgs = ((InternalEObject)newAssociatedCell).eInverseAdd(this, VoronoiPackage.CELL__CORE, Cell.class, msgs);
			msgs = basicSetAssociatedCell(newAssociatedCell, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VoronoiPackage.POINT__ASSOCIATED_CELL, newAssociatedCell, newAssociatedCell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cell getBoundingCell() {
		if (boundingCell != null && boundingCell.eIsProxy()) {
			InternalEObject oldBoundingCell = (InternalEObject)boundingCell;
			boundingCell = (Cell)eResolveProxy(oldBoundingCell);
			if (boundingCell != oldBoundingCell) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VoronoiPackage.POINT__BOUNDING_CELL, oldBoundingCell, boundingCell));
			}
		}
		return boundingCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell basicGetBoundingCell() {
		return boundingCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundingCell(Cell newBoundingCell, NotificationChain msgs) {
		Cell oldBoundingCell = boundingCell;
		boundingCell = newBoundingCell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VoronoiPackage.POINT__BOUNDING_CELL, oldBoundingCell, newBoundingCell);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoundingCell(Cell newBoundingCell) {
		if (newBoundingCell != boundingCell) {
			NotificationChain msgs = null;
			if (boundingCell != null)
				msgs = ((InternalEObject)boundingCell).eInverseRemove(this, VoronoiPackage.CELL__INNER_POINTS, Cell.class, msgs);
			if (newBoundingCell != null)
				msgs = ((InternalEObject)newBoundingCell).eInverseAdd(this, VoronoiPackage.CELL__INNER_POINTS, Cell.class, msgs);
			msgs = basicSetBoundingCell(newBoundingCell, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VoronoiPackage.POINT__BOUNDING_CELL, newBoundingCell, newBoundingCell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VoronoiPackage.POINT__ASSOCIATED_CELL:
				if (associatedCell != null)
					msgs = ((InternalEObject)associatedCell).eInverseRemove(this, VoronoiPackage.CELL__CORE, Cell.class, msgs);
				return basicSetAssociatedCell((Cell)otherEnd, msgs);
			case VoronoiPackage.POINT__BOUNDING_CELL:
				if (boundingCell != null)
					msgs = ((InternalEObject)boundingCell).eInverseRemove(this, VoronoiPackage.CELL__INNER_POINTS, Cell.class, msgs);
				return basicSetBoundingCell((Cell)otherEnd, msgs);
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
			case VoronoiPackage.POINT__ASSOCIATED_CELL:
				return basicSetAssociatedCell(null, msgs);
			case VoronoiPackage.POINT__BOUNDING_CELL:
				return basicSetBoundingCell(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VoronoiPackage.POINT__X:
				return getX();
			case VoronoiPackage.POINT__Y:
				return getY();
			case VoronoiPackage.POINT__Z:
				return getZ();
			case VoronoiPackage.POINT__ASSOCIATED_CELL:
				if (resolve) return getAssociatedCell();
				return basicGetAssociatedCell();
			case VoronoiPackage.POINT__BOUNDING_CELL:
				if (resolve) return getBoundingCell();
				return basicGetBoundingCell();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VoronoiPackage.POINT__X:
				setX((Double)newValue);
				return;
			case VoronoiPackage.POINT__Y:
				setY((Double)newValue);
				return;
			case VoronoiPackage.POINT__Z:
				setZ((Double)newValue);
				return;
			case VoronoiPackage.POINT__ASSOCIATED_CELL:
				setAssociatedCell((Cell)newValue);
				return;
			case VoronoiPackage.POINT__BOUNDING_CELL:
				setBoundingCell((Cell)newValue);
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
			case VoronoiPackage.POINT__X:
				setX(X_EDEFAULT);
				return;
			case VoronoiPackage.POINT__Y:
				setY(Y_EDEFAULT);
				return;
			case VoronoiPackage.POINT__Z:
				setZ(Z_EDEFAULT);
				return;
			case VoronoiPackage.POINT__ASSOCIATED_CELL:
				setAssociatedCell((Cell)null);
				return;
			case VoronoiPackage.POINT__BOUNDING_CELL:
				setBoundingCell((Cell)null);
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
			case VoronoiPackage.POINT__X:
				return x != X_EDEFAULT;
			case VoronoiPackage.POINT__Y:
				return y != Y_EDEFAULT;
			case VoronoiPackage.POINT__Z:
				return z != Z_EDEFAULT;
			case VoronoiPackage.POINT__ASSOCIATED_CELL:
				return associatedCell != null;
			case VoronoiPackage.POINT__BOUNDING_CELL:
				return boundingCell != null;
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", z: ");
		result.append(z);
		result.append(')');
		return result.toString();
	}

} //PointImpl
