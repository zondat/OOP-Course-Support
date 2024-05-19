/**
 */
package voronoi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link voronoi.Grid#getNumCols <em>Num Cols</em>}</li>
 *   <li>{@link voronoi.Grid#getNumRows <em>Num Rows</em>}</li>
 *   <li>{@link voronoi.Grid#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @see voronoi.VoronoiPackage#getGrid()
 * @model
 * @generated
 */
public interface Grid extends EObject {
	/**
	 * Returns the value of the '<em><b>Num Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Cols</em>' attribute.
	 * @see #setNumCols(int)
	 * @see voronoi.VoronoiPackage#getGrid_NumCols()
	 * @model
	 * @generated
	 */
	int getNumCols();

	/**
	 * Sets the value of the '{@link voronoi.Grid#getNumCols <em>Num Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Cols</em>' attribute.
	 * @see #getNumCols()
	 * @generated
	 */
	void setNumCols(int value);

	/**
	 * Returns the value of the '<em><b>Num Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Rows</em>' attribute.
	 * @see #setNumRows(int)
	 * @see voronoi.VoronoiPackage#getGrid_NumRows()
	 * @model
	 * @generated
	 */
	int getNumRows();

	/**
	 * Sets the value of the '{@link voronoi.Grid#getNumRows <em>Num Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Rows</em>' attribute.
	 * @see #getNumRows()
	 * @generated
	 */
	void setNumRows(int value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * The list contents are of type {@link voronoi.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see voronoi.VoronoiPackage#getGrid_Points()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getPoints();

} // Grid
