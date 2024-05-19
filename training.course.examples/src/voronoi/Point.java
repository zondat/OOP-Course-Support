/**
 */
package voronoi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link voronoi.Point#getX <em>X</em>}</li>
 *   <li>{@link voronoi.Point#getY <em>Y</em>}</li>
 *   <li>{@link voronoi.Point#getZ <em>Z</em>}</li>
 *   <li>{@link voronoi.Point#getAssociatedCell <em>Associated Cell</em>}</li>
 *   <li>{@link voronoi.Point#getBoundingCell <em>Bounding Cell</em>}</li>
 * </ul>
 *
 * @see voronoi.VoronoiPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see voronoi.VoronoiPackage#getPoint_X()
	 * @model
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link voronoi.Point#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see voronoi.VoronoiPackage#getPoint_Y()
	 * @model
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link voronoi.Point#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(double)
	 * @see voronoi.VoronoiPackage#getPoint_Z()
	 * @model
	 * @generated
	 */
	double getZ();

	/**
	 * Sets the value of the '{@link voronoi.Point#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(double value);

	/**
	 * Returns the value of the '<em><b>Associated Cell</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link voronoi.Cell#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Cell</em>' reference.
	 * @see #setAssociatedCell(Cell)
	 * @see voronoi.VoronoiPackage#getPoint_AssociatedCell()
	 * @see voronoi.Cell#getCore
	 * @model opposite="core"
	 * @generated
	 */
	Cell getAssociatedCell();

	/**
	 * Sets the value of the '{@link voronoi.Point#getAssociatedCell <em>Associated Cell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Cell</em>' reference.
	 * @see #getAssociatedCell()
	 * @generated
	 */
	void setAssociatedCell(Cell value);

	/**
	 * Returns the value of the '<em><b>Bounding Cell</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link voronoi.Cell#getInnerPoints <em>Inner Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounding Cell</em>' reference.
	 * @see #setBoundingCell(Cell)
	 * @see voronoi.VoronoiPackage#getPoint_BoundingCell()
	 * @see voronoi.Cell#getInnerPoints
	 * @model opposite="innerPoints"
	 * @generated
	 */
	Cell getBoundingCell();

	/**
	 * Sets the value of the '{@link voronoi.Point#getBoundingCell <em>Bounding Cell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounding Cell</em>' reference.
	 * @see #getBoundingCell()
	 * @generated
	 */
	void setBoundingCell(Cell value);

} // Point
