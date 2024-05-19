/**
 */
package voronoi;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see voronoi.VoronoiFactory
 * @model kind="package"
 * @generated
 */
public interface VoronoiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "voronoi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://training.course.example.voronoi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VoronoiPackage eINSTANCE = voronoi.impl.VoronoiPackageImpl.init();

	/**
	 * The meta object id for the '{@link voronoi.impl.VoronoiDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see voronoi.impl.VoronoiDiagramImpl
	 * @see voronoi.impl.VoronoiPackageImpl#getVoronoiDiagram()
	 * @generated
	 */
	int VORONOI_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Islands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORONOI_DIAGRAM__ISLANDS = 0;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORONOI_DIAGRAM__STANDARD = 1;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORONOI_DIAGRAM__CELLS = 2;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORONOI_DIAGRAM__GRID = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORONOI_DIAGRAM__WIDTH = 4;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORONOI_DIAGRAM__LENGTH = 5;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORONOI_DIAGRAM_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Compute Cells</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORONOI_DIAGRAM___COMPUTE_CELLS = 0;

	/**
	 * The operation id for the '<em>Visualize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORONOI_DIAGRAM___VISUALIZE = 1;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORONOI_DIAGRAM_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link voronoi.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see voronoi.impl.CellImpl
	 * @see voronoi.impl.VoronoiPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 1;

	/**
	 * The feature id for the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__CORE = 0;

	/**
	 * The feature id for the '<em><b>Inner Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__INNER_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link voronoi.DistanceStandard <em>Distance Standard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see voronoi.DistanceStandard
	 * @see voronoi.impl.VoronoiPackageImpl#getDistanceStandard()
	 * @generated
	 */
	int DISTANCE_STANDARD = 2;

	/**
	 * The number of structural features of the '<em>Distance Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_STANDARD_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Compute Distance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_STANDARD___COMPUTE_DISTANCE__POINT_POINT = 0;

	/**
	 * The number of operations of the '<em>Distance Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_STANDARD_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link voronoi.impl.DescartesImpl <em>Descartes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see voronoi.impl.DescartesImpl
	 * @see voronoi.impl.VoronoiPackageImpl#getDescartes()
	 * @generated
	 */
	int DESCARTES = 3;

	/**
	 * The number of structural features of the '<em>Descartes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCARTES_FEATURE_COUNT = DISTANCE_STANDARD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Distance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCARTES___COMPUTE_DISTANCE__POINT_POINT = DISTANCE_STANDARD___COMPUTE_DISTANCE__POINT_POINT;

	/**
	 * The number of operations of the '<em>Descartes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCARTES_OPERATION_COUNT = DISTANCE_STANDARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link voronoi.impl.ManhattanImpl <em>Manhattan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see voronoi.impl.ManhattanImpl
	 * @see voronoi.impl.VoronoiPackageImpl#getManhattan()
	 * @generated
	 */
	int MANHATTAN = 4;

	/**
	 * The number of structural features of the '<em>Manhattan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANHATTAN_FEATURE_COUNT = DISTANCE_STANDARD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Distance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANHATTAN___COMPUTE_DISTANCE__POINT_POINT = DISTANCE_STANDARD___COMPUTE_DISTANCE__POINT_POINT;

	/**
	 * The number of operations of the '<em>Manhattan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANHATTAN_OPERATION_COUNT = DISTANCE_STANDARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link voronoi.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see voronoi.impl.PointImpl
	 * @see voronoi.impl.VoronoiPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Z = 2;

	/**
	 * The feature id for the '<em><b>Associated Cell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__ASSOCIATED_CELL = 3;

	/**
	 * The feature id for the '<em><b>Bounding Cell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__BOUNDING_CELL = 4;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link voronoi.impl.GridImpl <em>Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see voronoi.impl.GridImpl
	 * @see voronoi.impl.VoronoiPackageImpl#getGrid()
	 * @generated
	 */
	int GRID = 6;

	/**
	 * The feature id for the '<em><b>Num Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__NUM_COLS = 0;

	/**
	 * The feature id for the '<em><b>Num Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__NUM_ROWS = 1;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__POINTS = 2;

	/**
	 * The number of structural features of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link voronoi.VoronoiDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see voronoi.VoronoiDiagram
	 * @generated
	 */
	EClass getVoronoiDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link voronoi.VoronoiDiagram#getIslands <em>Islands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Islands</em>'.
	 * @see voronoi.VoronoiDiagram#getIslands()
	 * @see #getVoronoiDiagram()
	 * @generated
	 */
	EReference getVoronoiDiagram_Islands();

	/**
	 * Returns the meta object for the containment reference '{@link voronoi.VoronoiDiagram#getStandard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standard</em>'.
	 * @see voronoi.VoronoiDiagram#getStandard()
	 * @see #getVoronoiDiagram()
	 * @generated
	 */
	EReference getVoronoiDiagram_Standard();

	/**
	 * Returns the meta object for the containment reference list '{@link voronoi.VoronoiDiagram#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see voronoi.VoronoiDiagram#getCells()
	 * @see #getVoronoiDiagram()
	 * @generated
	 */
	EReference getVoronoiDiagram_Cells();

	/**
	 * Returns the meta object for the containment reference '{@link voronoi.VoronoiDiagram#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grid</em>'.
	 * @see voronoi.VoronoiDiagram#getGrid()
	 * @see #getVoronoiDiagram()
	 * @generated
	 */
	EReference getVoronoiDiagram_Grid();

	/**
	 * Returns the meta object for the attribute '{@link voronoi.VoronoiDiagram#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see voronoi.VoronoiDiagram#getWidth()
	 * @see #getVoronoiDiagram()
	 * @generated
	 */
	EAttribute getVoronoiDiagram_Width();

	/**
	 * Returns the meta object for the attribute '{@link voronoi.VoronoiDiagram#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see voronoi.VoronoiDiagram#getLength()
	 * @see #getVoronoiDiagram()
	 * @generated
	 */
	EAttribute getVoronoiDiagram_Length();

	/**
	 * Returns the meta object for the '{@link voronoi.VoronoiDiagram#computeCells() <em>Compute Cells</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Cells</em>' operation.
	 * @see voronoi.VoronoiDiagram#computeCells()
	 * @generated
	 */
	EOperation getVoronoiDiagram__ComputeCells();

	/**
	 * Returns the meta object for the '{@link voronoi.VoronoiDiagram#visualize() <em>Visualize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visualize</em>' operation.
	 * @see voronoi.VoronoiDiagram#visualize()
	 * @generated
	 */
	EOperation getVoronoiDiagram__Visualize();

	/**
	 * Returns the meta object for class '{@link voronoi.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see voronoi.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the reference '{@link voronoi.Cell#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core</em>'.
	 * @see voronoi.Cell#getCore()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Core();

	/**
	 * Returns the meta object for the reference list '{@link voronoi.Cell#getInnerPoints <em>Inner Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inner Points</em>'.
	 * @see voronoi.Cell#getInnerPoints()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_InnerPoints();

	/**
	 * Returns the meta object for class '{@link voronoi.DistanceStandard <em>Distance Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Standard</em>'.
	 * @see voronoi.DistanceStandard
	 * @generated
	 */
	EClass getDistanceStandard();

	/**
	 * Returns the meta object for the '{@link voronoi.DistanceStandard#computeDistance(voronoi.Point, voronoi.Point) <em>Compute Distance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Distance</em>' operation.
	 * @see voronoi.DistanceStandard#computeDistance(voronoi.Point, voronoi.Point)
	 * @generated
	 */
	EOperation getDistanceStandard__ComputeDistance__Point_Point();

	/**
	 * Returns the meta object for class '{@link voronoi.Descartes <em>Descartes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descartes</em>'.
	 * @see voronoi.Descartes
	 * @generated
	 */
	EClass getDescartes();

	/**
	 * Returns the meta object for class '{@link voronoi.Manhattan <em>Manhattan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manhattan</em>'.
	 * @see voronoi.Manhattan
	 * @generated
	 */
	EClass getManhattan();

	/**
	 * Returns the meta object for class '{@link voronoi.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see voronoi.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link voronoi.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see voronoi.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link voronoi.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see voronoi.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for the attribute '{@link voronoi.Point#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see voronoi.Point#getZ()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Z();

	/**
	 * Returns the meta object for the reference '{@link voronoi.Point#getAssociatedCell <em>Associated Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associated Cell</em>'.
	 * @see voronoi.Point#getAssociatedCell()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_AssociatedCell();

	/**
	 * Returns the meta object for the reference '{@link voronoi.Point#getBoundingCell <em>Bounding Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bounding Cell</em>'.
	 * @see voronoi.Point#getBoundingCell()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_BoundingCell();

	/**
	 * Returns the meta object for class '{@link voronoi.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid</em>'.
	 * @see voronoi.Grid
	 * @generated
	 */
	EClass getGrid();

	/**
	 * Returns the meta object for the attribute '{@link voronoi.Grid#getNumCols <em>Num Cols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Cols</em>'.
	 * @see voronoi.Grid#getNumCols()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_NumCols();

	/**
	 * Returns the meta object for the attribute '{@link voronoi.Grid#getNumRows <em>Num Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Rows</em>'.
	 * @see voronoi.Grid#getNumRows()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_NumRows();

	/**
	 * Returns the meta object for the containment reference list '{@link voronoi.Grid#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see voronoi.Grid#getPoints()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Points();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VoronoiFactory getVoronoiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link voronoi.impl.VoronoiDiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see voronoi.impl.VoronoiDiagramImpl
		 * @see voronoi.impl.VoronoiPackageImpl#getVoronoiDiagram()
		 * @generated
		 */
		EClass VORONOI_DIAGRAM = eINSTANCE.getVoronoiDiagram();

		/**
		 * The meta object literal for the '<em><b>Islands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORONOI_DIAGRAM__ISLANDS = eINSTANCE.getVoronoiDiagram_Islands();

		/**
		 * The meta object literal for the '<em><b>Standard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORONOI_DIAGRAM__STANDARD = eINSTANCE.getVoronoiDiagram_Standard();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORONOI_DIAGRAM__CELLS = eINSTANCE.getVoronoiDiagram_Cells();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORONOI_DIAGRAM__GRID = eINSTANCE.getVoronoiDiagram_Grid();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORONOI_DIAGRAM__WIDTH = eINSTANCE.getVoronoiDiagram_Width();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORONOI_DIAGRAM__LENGTH = eINSTANCE.getVoronoiDiagram_Length();

		/**
		 * The meta object literal for the '<em><b>Compute Cells</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VORONOI_DIAGRAM___COMPUTE_CELLS = eINSTANCE.getVoronoiDiagram__ComputeCells();

		/**
		 * The meta object literal for the '<em><b>Visualize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VORONOI_DIAGRAM___VISUALIZE = eINSTANCE.getVoronoiDiagram__Visualize();

		/**
		 * The meta object literal for the '{@link voronoi.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see voronoi.impl.CellImpl
		 * @see voronoi.impl.VoronoiPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Core</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__CORE = eINSTANCE.getCell_Core();

		/**
		 * The meta object literal for the '<em><b>Inner Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__INNER_POINTS = eINSTANCE.getCell_InnerPoints();

		/**
		 * The meta object literal for the '{@link voronoi.DistanceStandard <em>Distance Standard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see voronoi.DistanceStandard
		 * @see voronoi.impl.VoronoiPackageImpl#getDistanceStandard()
		 * @generated
		 */
		EClass DISTANCE_STANDARD = eINSTANCE.getDistanceStandard();

		/**
		 * The meta object literal for the '<em><b>Compute Distance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTANCE_STANDARD___COMPUTE_DISTANCE__POINT_POINT = eINSTANCE.getDistanceStandard__ComputeDistance__Point_Point();

		/**
		 * The meta object literal for the '{@link voronoi.impl.DescartesImpl <em>Descartes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see voronoi.impl.DescartesImpl
		 * @see voronoi.impl.VoronoiPackageImpl#getDescartes()
		 * @generated
		 */
		EClass DESCARTES = eINSTANCE.getDescartes();

		/**
		 * The meta object literal for the '{@link voronoi.impl.ManhattanImpl <em>Manhattan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see voronoi.impl.ManhattanImpl
		 * @see voronoi.impl.VoronoiPackageImpl#getManhattan()
		 * @generated
		 */
		EClass MANHATTAN = eINSTANCE.getManhattan();

		/**
		 * The meta object literal for the '{@link voronoi.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see voronoi.impl.PointImpl
		 * @see voronoi.impl.VoronoiPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Z = eINSTANCE.getPoint_Z();

		/**
		 * The meta object literal for the '<em><b>Associated Cell</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT__ASSOCIATED_CELL = eINSTANCE.getPoint_AssociatedCell();

		/**
		 * The meta object literal for the '<em><b>Bounding Cell</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT__BOUNDING_CELL = eINSTANCE.getPoint_BoundingCell();

		/**
		 * The meta object literal for the '{@link voronoi.impl.GridImpl <em>Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see voronoi.impl.GridImpl
		 * @see voronoi.impl.VoronoiPackageImpl#getGrid()
		 * @generated
		 */
		EClass GRID = eINSTANCE.getGrid();

		/**
		 * The meta object literal for the '<em><b>Num Cols</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__NUM_COLS = eINSTANCE.getGrid_NumCols();

		/**
		 * The meta object literal for the '<em><b>Num Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__NUM_ROWS = eINSTANCE.getGrid_NumRows();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__POINTS = eINSTANCE.getGrid_Points();

	}

} //VoronoiPackage
