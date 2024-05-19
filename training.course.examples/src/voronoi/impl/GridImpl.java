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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import voronoi.Grid;
import voronoi.Point;
import voronoi.VoronoiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link voronoi.impl.GridImpl#getNumCols <em>Num Cols</em>}</li>
 *   <li>{@link voronoi.impl.GridImpl#getNumRows <em>Num Rows</em>}</li>
 *   <li>{@link voronoi.impl.GridImpl#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GridImpl extends MinimalEObjectImpl.Container implements Grid {
	/**
	 * The default value of the '{@link #getNumCols() <em>Num Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCols()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_COLS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumCols() <em>Num Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCols()
	 * @generated
	 * @ordered
	 */
	protected int numCols = NUM_COLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumRows() <em>Num Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumRows()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_ROWS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumRows() <em>Num Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumRows()
	 * @generated
	 * @ordered
	 */
	protected int numRows = NUM_ROWS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> points;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VoronoiPackage.Literals.GRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumCols() {
		return numCols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumCols(int newNumCols) {
		int oldNumCols = numCols;
		numCols = newNumCols;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VoronoiPackage.GRID__NUM_COLS, oldNumCols, numCols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumRows() {
		return numRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumRows(int newNumRows) {
		int oldNumRows = numRows;
		numRows = newNumRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VoronoiPackage.GRID__NUM_ROWS, oldNumRows, numRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Point> getPoints() {
		if (points == null) {
			points = new EObjectContainmentEList<Point>(Point.class, this, VoronoiPackage.GRID__POINTS);
		}
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VoronoiPackage.GRID__POINTS:
				return ((InternalEList<?>)getPoints()).basicRemove(otherEnd, msgs);
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
			case VoronoiPackage.GRID__NUM_COLS:
				return getNumCols();
			case VoronoiPackage.GRID__NUM_ROWS:
				return getNumRows();
			case VoronoiPackage.GRID__POINTS:
				return getPoints();
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
			case VoronoiPackage.GRID__NUM_COLS:
				setNumCols((Integer)newValue);
				return;
			case VoronoiPackage.GRID__NUM_ROWS:
				setNumRows((Integer)newValue);
				return;
			case VoronoiPackage.GRID__POINTS:
				getPoints().clear();
				getPoints().addAll((Collection<? extends Point>)newValue);
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
			case VoronoiPackage.GRID__NUM_COLS:
				setNumCols(NUM_COLS_EDEFAULT);
				return;
			case VoronoiPackage.GRID__NUM_ROWS:
				setNumRows(NUM_ROWS_EDEFAULT);
				return;
			case VoronoiPackage.GRID__POINTS:
				getPoints().clear();
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
			case VoronoiPackage.GRID__NUM_COLS:
				return numCols != NUM_COLS_EDEFAULT;
			case VoronoiPackage.GRID__NUM_ROWS:
				return numRows != NUM_ROWS_EDEFAULT;
			case VoronoiPackage.GRID__POINTS:
				return points != null && !points.isEmpty();
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
		result.append(" (numCols: ");
		result.append(numCols);
		result.append(", numRows: ");
		result.append(numRows);
		result.append(')');
		return result.toString();
	}

} //GridImpl
