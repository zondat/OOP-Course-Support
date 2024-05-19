/**
 */
package voronoi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link voronoi.Cell#getCore <em>Core</em>}</li>
 *   <li>{@link voronoi.Cell#getInnerPoints <em>Inner Points</em>}</li>
 * </ul>
 *
 * @see voronoi.VoronoiPackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * Returns the value of the '<em><b>Core</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link voronoi.Point#getAssociatedCell <em>Associated Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core</em>' reference.
	 * @see #setCore(Point)
	 * @see voronoi.VoronoiPackage#getCell_Core()
	 * @see voronoi.Point#getAssociatedCell
	 * @model opposite="associatedCell"
	 * @generated
	 */
	Point getCore();

	/**
	 * Sets the value of the '{@link voronoi.Cell#getCore <em>Core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core</em>' reference.
	 * @see #getCore()
	 * @generated
	 */
	void setCore(Point value);

	/**
	 * Returns the value of the '<em><b>Inner Points</b></em>' reference list.
	 * The list contents are of type {@link voronoi.Point}.
	 * It is bidirectional and its opposite is '{@link voronoi.Point#getBoundingCell <em>Bounding Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Points</em>' reference list.
	 * @see voronoi.VoronoiPackage#getCell_InnerPoints()
	 * @see voronoi.Point#getBoundingCell
	 * @model opposite="boundingCell"
	 * @generated
	 */
	EList<Point> getInnerPoints();

} // Cell
