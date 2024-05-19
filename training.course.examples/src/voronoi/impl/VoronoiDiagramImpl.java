/**
 */
package voronoi.impl;

import java.awt.Color;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import voronoi.Cell;
import voronoi.DistanceStandard;
import voronoi.Grid;
import voronoi.Point;
import voronoi.VoronoiDiagram;
import voronoi.VoronoiPackage;
import voronoi.visualization.Visualizer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link voronoi.impl.VoronoiDiagramImpl#getIslands <em>Islands</em>}</li>
 *   <li>{@link voronoi.impl.VoronoiDiagramImpl#getStandard <em>Standard</em>}</li>
 *   <li>{@link voronoi.impl.VoronoiDiagramImpl#getCells <em>Cells</em>}</li>
 *   <li>{@link voronoi.impl.VoronoiDiagramImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link voronoi.impl.VoronoiDiagramImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link voronoi.impl.VoronoiDiagramImpl#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VoronoiDiagramImpl extends MinimalEObjectImpl.Container implements VoronoiDiagram {
	/**
	 * The cached value of the '{@link #getIslands() <em>Islands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIslands()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> islands;

	/**
	 * The cached value of the '{@link #getStandard() <em>Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandard()
	 * @generated
	 * @ordered
	 */
	protected DistanceStandard standard;

	/**
	 * The cached value of the '{@link #getCells() <em>Cells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected EList<Cell> cells;

	/**
	 * The cached value of the '{@link #getGrid() <em>Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected Grid grid;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated NOT
	 * @ordered
	 */
	protected static final float WIDTH_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected float width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated NOT
	 * @ordered
	 */
	protected static final float LENGTH_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected float length = LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoronoiDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VoronoiPackage.Literals.VORONOI_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Point> getIslands() {
		if (islands == null) {
			islands = new EObjectContainmentEList<Point>(Point.class, this, VoronoiPackage.VORONOI_DIAGRAM__ISLANDS);
		}
		return islands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistanceStandard getStandard() {
		return standard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandard(DistanceStandard newStandard, NotificationChain msgs) {
		DistanceStandard oldStandard = standard;
		standard = newStandard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VoronoiPackage.VORONOI_DIAGRAM__STANDARD, oldStandard, newStandard);
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
	public void setStandard(DistanceStandard newStandard) {
		if (newStandard != standard) {
			NotificationChain msgs = null;
			if (standard != null)
				msgs = ((InternalEObject)standard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VoronoiPackage.VORONOI_DIAGRAM__STANDARD, null, msgs);
			if (newStandard != null)
				msgs = ((InternalEObject)newStandard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VoronoiPackage.VORONOI_DIAGRAM__STANDARD, null, msgs);
			msgs = basicSetStandard(newStandard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VoronoiPackage.VORONOI_DIAGRAM__STANDARD, newStandard, newStandard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cell> getCells() {
		if (cells == null) {
			cells = new EObjectContainmentEList<Cell>(Cell.class, this, VoronoiPackage.VORONOI_DIAGRAM__CELLS);
		}
		return cells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Grid getGrid() {
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrid(Grid newGrid, NotificationChain msgs) {
		Grid oldGrid = grid;
		grid = newGrid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VoronoiPackage.VORONOI_DIAGRAM__GRID, oldGrid, newGrid);
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
	public void setGrid(Grid newGrid) {
		if (newGrid != grid) {
			NotificationChain msgs = null;
			if (grid != null)
				msgs = ((InternalEObject)grid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VoronoiPackage.VORONOI_DIAGRAM__GRID, null, msgs);
			if (newGrid != null)
				msgs = ((InternalEObject)newGrid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VoronoiPackage.VORONOI_DIAGRAM__GRID, null, msgs);
			msgs = basicSetGrid(newGrid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VoronoiPackage.VORONOI_DIAGRAM__GRID, newGrid, newGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(float newWidth) {
		float oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VoronoiPackage.VORONOI_DIAGRAM__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(float newLength) {
		float oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VoronoiPackage.VORONOI_DIAGRAM__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void computeCells() {
		// Create for each island a cell
		for (Point point : getIslands()) {
			if (point.getAssociatedCell() == null) {
				Cell cell = new CellImpl();
				getCells().add(cell);
				point.setAssociatedCell(cell);
			}
		}
		
		// Assign point of grid map to cell
		if (getGrid()!=null) {
			for (Point currentPoint : getGrid().getPoints()) {
				double minDistance = Double.POSITIVE_INFINITY;
				Point nearestIsland = null;
				for (Point island : getIslands()) {
					double currentDistance = standard.computeDistance(island, currentPoint);
					if (currentDistance < minDistance) {
						minDistance = currentDistance;
						nearestIsland = island;
					}
				}
				currentPoint.setBoundingCell(nearestIsland.getAssociatedCell());
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void visualize() {

		JFrame frame = new JFrame();
	    XYSeriesCollection dataset = new XYSeriesCollection();  
	    
	    // Visualize islands
	    int i=0;
	    for (Point island : getIslands()) {
	    	XYSeries series = new XYSeries("" + (i++));
	    	series.add(island.getX(), island.getY());
	    	dataset.addSeries(series);
	    }
	    
	    // Visualize cell zone
	    
	    for (Cell cell : cells) {
	    	XYSeries series = new XYSeries("" + (i++));
	    	for (Point point : cell.getInnerPoints()) {
	    		series.add(point.getX(), point.getY());
	    	}
	    	dataset.addSeries(series);
	    }
	    
 	  
	    // Create chart  
	    JFreeChart chart = ChartFactory.createScatterPlot(  
	        "Voronoi Diagram",   
	        "X", "Y", dataset);  
	      
	    //Changes background color  
	    XYPlot plot = (XYPlot)chart.getPlot();  
	    plot.setBackgroundPaint(new Color(255,255,255));  
	      
	     
	    // Create Panel  
	    ChartPanel panel = new ChartPanel(chart);  
	    frame.setContentPane(panel);    
	    frame.setSize(800, 800);  
	    frame.setLocationRelativeTo(null);  
	    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
	    frame.setVisible(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VoronoiPackage.VORONOI_DIAGRAM__ISLANDS:
				return ((InternalEList<?>)getIslands()).basicRemove(otherEnd, msgs);
			case VoronoiPackage.VORONOI_DIAGRAM__STANDARD:
				return basicSetStandard(null, msgs);
			case VoronoiPackage.VORONOI_DIAGRAM__CELLS:
				return ((InternalEList<?>)getCells()).basicRemove(otherEnd, msgs);
			case VoronoiPackage.VORONOI_DIAGRAM__GRID:
				return basicSetGrid(null, msgs);
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
			case VoronoiPackage.VORONOI_DIAGRAM__ISLANDS:
				return getIslands();
			case VoronoiPackage.VORONOI_DIAGRAM__STANDARD:
				return getStandard();
			case VoronoiPackage.VORONOI_DIAGRAM__CELLS:
				return getCells();
			case VoronoiPackage.VORONOI_DIAGRAM__GRID:
				return getGrid();
			case VoronoiPackage.VORONOI_DIAGRAM__WIDTH:
				return getWidth();
			case VoronoiPackage.VORONOI_DIAGRAM__LENGTH:
				return getLength();
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
			case VoronoiPackage.VORONOI_DIAGRAM__ISLANDS:
				getIslands().clear();
				getIslands().addAll((Collection<? extends Point>)newValue);
				return;
			case VoronoiPackage.VORONOI_DIAGRAM__STANDARD:
				setStandard((DistanceStandard)newValue);
				return;
			case VoronoiPackage.VORONOI_DIAGRAM__CELLS:
				getCells().clear();
				getCells().addAll((Collection<? extends Cell>)newValue);
				return;
			case VoronoiPackage.VORONOI_DIAGRAM__GRID:
				setGrid((Grid)newValue);
				return;
			case VoronoiPackage.VORONOI_DIAGRAM__WIDTH:
				setWidth((Float)newValue);
				return;
			case VoronoiPackage.VORONOI_DIAGRAM__LENGTH:
				setLength((Float)newValue);
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
			case VoronoiPackage.VORONOI_DIAGRAM__ISLANDS:
				getIslands().clear();
				return;
			case VoronoiPackage.VORONOI_DIAGRAM__STANDARD:
				setStandard((DistanceStandard)null);
				return;
			case VoronoiPackage.VORONOI_DIAGRAM__CELLS:
				getCells().clear();
				return;
			case VoronoiPackage.VORONOI_DIAGRAM__GRID:
				setGrid((Grid)null);
				return;
			case VoronoiPackage.VORONOI_DIAGRAM__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case VoronoiPackage.VORONOI_DIAGRAM__LENGTH:
				setLength(LENGTH_EDEFAULT);
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
			case VoronoiPackage.VORONOI_DIAGRAM__ISLANDS:
				return islands != null && !islands.isEmpty();
			case VoronoiPackage.VORONOI_DIAGRAM__STANDARD:
				return standard != null;
			case VoronoiPackage.VORONOI_DIAGRAM__CELLS:
				return cells != null && !cells.isEmpty();
			case VoronoiPackage.VORONOI_DIAGRAM__GRID:
				return grid != null;
			case VoronoiPackage.VORONOI_DIAGRAM__WIDTH:
				return width != WIDTH_EDEFAULT;
			case VoronoiPackage.VORONOI_DIAGRAM__LENGTH:
				return length != LENGTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VoronoiPackage.VORONOI_DIAGRAM___COMPUTE_CELLS:
				computeCells();
				return null;
			case VoronoiPackage.VORONOI_DIAGRAM___VISUALIZE:
				visualize();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (width: ");
		result.append(width);
		result.append(", length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} //VoronoiDiagramImpl
