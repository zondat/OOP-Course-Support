/**
 */
package voronoi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import voronoi.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VoronoiFactoryImpl extends EFactoryImpl implements VoronoiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VoronoiFactory init() {
		try {
			VoronoiFactory theVoronoiFactory = (VoronoiFactory)EPackage.Registry.INSTANCE.getEFactory(VoronoiPackage.eNS_URI);
			if (theVoronoiFactory != null) {
				return theVoronoiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VoronoiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoronoiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VoronoiPackage.VORONOI_DIAGRAM: return createVoronoiDiagram();
			case VoronoiPackage.CELL: return createCell();
			case VoronoiPackage.DESCARTES: return createDescartes();
			case VoronoiPackage.MANHATTAN: return createManhattan();
			case VoronoiPackage.POINT: return createPoint();
			case VoronoiPackage.GRID: return createGrid();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VoronoiDiagram createVoronoiDiagram() {
		VoronoiDiagramImpl voronoiDiagram = new VoronoiDiagramImpl();
		return voronoiDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cell createCell() {
		CellImpl cell = new CellImpl();
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Descartes createDescartes() {
		DescartesImpl descartes = new DescartesImpl();
		return descartes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Manhattan createManhattan() {
		ManhattanImpl manhattan = new ManhattanImpl();
		return manhattan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Grid createGrid() {
		GridImpl grid = new GridImpl();
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VoronoiPackage getVoronoiPackage() {
		return (VoronoiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VoronoiPackage getPackage() {
		return VoronoiPackage.eINSTANCE;
	}

} //VoronoiFactoryImpl
