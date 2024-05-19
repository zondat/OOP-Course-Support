/**
 */
package voronoi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import voronoi.Cell;
import voronoi.Point;
import voronoi.VoronoiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link voronoi.impl.CellImpl#getCore <em>Core</em>}</li>
 *   <li>{@link voronoi.impl.CellImpl#getInnerPoints <em>Inner Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellImpl extends MinimalEObjectImpl.Container implements Cell {
	/**
	 * The cached value of the '{@link #getCore() <em>Core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCore()
	 * @generated
	 * @ordered
	 */
	protected Point core;

	/**
	 * The cached value of the '{@link #getInnerPoints() <em>Inner Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> innerPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VoronoiPackage.Literals.CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point getCore() {
		if (core != null && core.eIsProxy()) {
			InternalEObject oldCore = (InternalEObject)core;
			core = (Point)eResolveProxy(oldCore);
			if (core != oldCore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VoronoiPackage.CELL__CORE, oldCore, core));
			}
		}
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point basicGetCore() {
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCore(Point newCore, NotificationChain msgs) {
		Point oldCore = core;
		core = newCore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VoronoiPackage.CELL__CORE, oldCore, newCore);
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
	public void setCore(Point newCore) {
		if (newCore != core) {
			NotificationChain msgs = null;
			if (core != null)
				msgs = ((InternalEObject)core).eInverseRemove(this, VoronoiPackage.POINT__ASSOCIATED_CELL, Point.class, msgs);
			if (newCore != null)
				msgs = ((InternalEObject)newCore).eInverseAdd(this, VoronoiPackage.POINT__ASSOCIATED_CELL, Point.class, msgs);
			msgs = basicSetCore(newCore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VoronoiPackage.CELL__CORE, newCore, newCore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Point> getInnerPoints() {
		if (innerPoints == null) {
			innerPoints = new EObjectWithInverseResolvingEList<Point>(Point.class, this, VoronoiPackage.CELL__INNER_POINTS, VoronoiPackage.POINT__BOUNDING_CELL);
		}
		return innerPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VoronoiPackage.CELL__CORE:
				if (core != null)
					msgs = ((InternalEObject)core).eInverseRemove(this, VoronoiPackage.POINT__ASSOCIATED_CELL, Point.class, msgs);
				return basicSetCore((Point)otherEnd, msgs);
			case VoronoiPackage.CELL__INNER_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInnerPoints()).basicAdd(otherEnd, msgs);
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
			case VoronoiPackage.CELL__CORE:
				return basicSetCore(null, msgs);
			case VoronoiPackage.CELL__INNER_POINTS:
				return ((InternalEList<?>)getInnerPoints()).basicRemove(otherEnd, msgs);
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
			case VoronoiPackage.CELL__CORE:
				if (resolve) return getCore();
				return basicGetCore();
			case VoronoiPackage.CELL__INNER_POINTS:
				return getInnerPoints();
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
			case VoronoiPackage.CELL__CORE:
				setCore((Point)newValue);
				return;
			case VoronoiPackage.CELL__INNER_POINTS:
				getInnerPoints().clear();
				getInnerPoints().addAll((Collection<? extends Point>)newValue);
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
			case VoronoiPackage.CELL__CORE:
				setCore((Point)null);
				return;
			case VoronoiPackage.CELL__INNER_POINTS:
				getInnerPoints().clear();
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
			case VoronoiPackage.CELL__CORE:
				return core != null;
			case VoronoiPackage.CELL__INNER_POINTS:
				return innerPoints != null && !innerPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CellImpl
