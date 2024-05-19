/**
 */
package voronoi.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import voronoi.Descartes;
import voronoi.Point;
import voronoi.VoronoiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Descartes</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DescartesImpl extends MinimalEObjectImpl.Container implements Descartes {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescartesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VoronoiPackage.Literals.DESCARTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double computeDistance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2) + Math.pow(p1.getZ() - p2.getZ(), 2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VoronoiPackage.DESCARTES___COMPUTE_DISTANCE__POINT_POINT:
				return computeDistance((Point)arguments.get(0), (Point)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DescartesImpl
