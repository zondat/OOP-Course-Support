/**
 */
package voronoi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance Standard</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see voronoi.VoronoiPackage#getDistanceStandard()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DistanceStandard extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double computeDistance(Point x, Point y);

} // DistanceStandard
