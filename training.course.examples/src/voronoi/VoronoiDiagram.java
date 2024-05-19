/**
 */
package voronoi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link voronoi.VoronoiDiagram#getIslands <em>Islands</em>}</li>
 *   <li>{@link voronoi.VoronoiDiagram#getStandard <em>Standard</em>}</li>
 *   <li>{@link voronoi.VoronoiDiagram#getCells <em>Cells</em>}</li>
 *   <li>{@link voronoi.VoronoiDiagram#getGrid <em>Grid</em>}</li>
 *   <li>{@link voronoi.VoronoiDiagram#getWidth <em>Width</em>}</li>
 *   <li>{@link voronoi.VoronoiDiagram#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see voronoi.VoronoiPackage#getVoronoiDiagram()
 * @model
 * @generated
 */
public interface VoronoiDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Islands</b></em>' containment reference list.
	 * The list contents are of type {@link voronoi.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Islands</em>' containment reference list.
	 * @see voronoi.VoronoiPackage#getVoronoiDiagram_Islands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getIslands();

	/**
	 * Returns the value of the '<em><b>Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard</em>' containment reference.
	 * @see #setStandard(DistanceStandard)
	 * @see voronoi.VoronoiPackage#getVoronoiDiagram_Standard()
	 * @model containment="true"
	 * @generated
	 */
	DistanceStandard getStandard();

	/**
	 * Sets the value of the '{@link voronoi.VoronoiDiagram#getStandard <em>Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard</em>' containment reference.
	 * @see #getStandard()
	 * @generated
	 */
	void setStandard(DistanceStandard value);

	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link voronoi.Cell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see voronoi.VoronoiPackage#getVoronoiDiagram_Cells()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cell> getCells();

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' containment reference.
	 * @see #setGrid(Grid)
	 * @see voronoi.VoronoiPackage#getVoronoiDiagram_Grid()
	 * @model containment="true"
	 * @generated
	 */
	Grid getGrid();

	/**
	 * Sets the value of the '{@link voronoi.VoronoiDiagram#getGrid <em>Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' containment reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(Grid value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see voronoi.VoronoiPackage#getVoronoiDiagram_Width()
	 * @model
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link voronoi.VoronoiDiagram#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(float)
	 * @see voronoi.VoronoiPackage#getVoronoiDiagram_Length()
	 * @model
	 * @generated
	 */
	float getLength();

	/**
	 * Sets the value of the '{@link voronoi.VoronoiDiagram#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void computeCells();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void visualize();

} // VoronoiDiagram
