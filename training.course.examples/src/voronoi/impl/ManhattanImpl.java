/**
 */
package voronoi.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import voronoi.Manhattan;
import voronoi.Point;
import voronoi.VoronoiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manhattan</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ManhattanImpl extends MinimalEObjectImpl.Container implements Manhattan {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManhattanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VoronoiPackage.Literals.MANHATTAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double computeDistance(Point p1, Point p2) {
		return Math.abs(p1.getX() - p2.getX()) + Math.abs(p1.getY() - p2.getY()) + Math.abs(p1.getZ() - p2.getZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VoronoiPackage.MANHATTAN___COMPUTE_DISTANCE__POINT_POINT:
				return computeDistance((Point)arguments.get(0), (Point)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ManhattanImpl
