/**
 */
package digraph;

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
 * @see digraph.DigraphFactory
 * @model kind="package"
 * @generated
 */
public interface DigraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "digraph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://training.course.example.digraph";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dig";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DigraphPackage eINSTANCE = digraph.impl.DigraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link digraph.impl.DiGraphImpl <em>Di Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digraph.impl.DiGraphImpl
	 * @see digraph.impl.DigraphPackageImpl#getDiGraph()
	 * @generated
	 */
	int DI_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_GRAPH__NODES = 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_GRAPH__EDGES = 1;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_GRAPH__PATHS = 2;

	/**
	 * The number of structural features of the '<em>Di Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_GRAPH_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Is Cyclic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_GRAPH___IS_CYCLIC = 0;

	/**
	 * The operation id for the '<em>Remove Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_GRAPH___REMOVE_NODE__NODE = 1;

	/**
	 * The operation id for the '<em>Remove Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_GRAPH___REMOVE_EDGE__EDGE = 2;

	/**
	 * The operation id for the '<em>Visualize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_GRAPH___VISUALIZE = 3;

	/**
	 * The number of operations of the '<em>Di Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_GRAPH_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link digraph.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digraph.impl.NodeImpl
	 * @see digraph.impl.DigraphPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING_EDGES = 1;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMING_EDGES = 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Has Incoming Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_INCOMING_EDGE = 0;

	/**
	 * The operation id for the '<em>Has Outgoing Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_OUTGOING_EDGE = 1;

	/**
	 * The operation id for the '<em>Add Incoming Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_INCOMING_EDGE__EDGE = 2;

	/**
	 * The operation id for the '<em>Add Outgoing Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_OUTGOING_EDGE__EDGE = 3;

	/**
	 * The operation id for the '<em>Get All Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_ALL_EDGES = 4;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link digraph.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digraph.impl.EdgeImpl
	 * @see digraph.impl.DigraphPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__WEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Disconnect Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___DISCONNECT_SOURCE = 0;

	/**
	 * The operation id for the '<em>Disconnect Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___DISCONNECT_TARGET = 1;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 2;


	/**
	 * The meta object id for the '{@link digraph.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digraph.impl.PathImpl
	 * @see digraph.impl.DigraphPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__EDGES = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__DESTINATION = 3;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link digraph.DiGraph <em>Di Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Di Graph</em>'.
	 * @see digraph.DiGraph
	 * @generated
	 */
	EClass getDiGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link digraph.DiGraph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see digraph.DiGraph#getNodes()
	 * @see #getDiGraph()
	 * @generated
	 */
	EReference getDiGraph_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link digraph.DiGraph#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see digraph.DiGraph#getEdges()
	 * @see #getDiGraph()
	 * @generated
	 */
	EReference getDiGraph_Edges();

	/**
	 * Returns the meta object for the containment reference list '{@link digraph.DiGraph#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see digraph.DiGraph#getPaths()
	 * @see #getDiGraph()
	 * @generated
	 */
	EReference getDiGraph_Paths();

	/**
	 * Returns the meta object for the '{@link digraph.DiGraph#isCyclic() <em>Is Cyclic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Cyclic</em>' operation.
	 * @see digraph.DiGraph#isCyclic()
	 * @generated
	 */
	EOperation getDiGraph__IsCyclic();

	/**
	 * Returns the meta object for the '{@link digraph.DiGraph#removeNode(digraph.Node) <em>Remove Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Node</em>' operation.
	 * @see digraph.DiGraph#removeNode(digraph.Node)
	 * @generated
	 */
	EOperation getDiGraph__RemoveNode__Node();

	/**
	 * Returns the meta object for the '{@link digraph.DiGraph#removeEdge(digraph.Edge) <em>Remove Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Edge</em>' operation.
	 * @see digraph.DiGraph#removeEdge(digraph.Edge)
	 * @generated
	 */
	EOperation getDiGraph__RemoveEdge__Edge();

	/**
	 * Returns the meta object for the '{@link digraph.DiGraph#visualize() <em>Visualize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visualize</em>' operation.
	 * @see digraph.DiGraph#visualize()
	 * @generated
	 */
	EOperation getDiGraph__Visualize();

	/**
	 * Returns the meta object for class '{@link digraph.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see digraph.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link digraph.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see digraph.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the reference list '{@link digraph.Node#getIncomingEdges <em>Incoming Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Edges</em>'.
	 * @see digraph.Node#getIncomingEdges()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_IncomingEdges();

	/**
	 * Returns the meta object for the reference list '{@link digraph.Node#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Edges</em>'.
	 * @see digraph.Node#getOutgoingEdges()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_OutgoingEdges();

	/**
	 * Returns the meta object for the '{@link digraph.Node#hasIncomingEdge() <em>Has Incoming Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Incoming Edge</em>' operation.
	 * @see digraph.Node#hasIncomingEdge()
	 * @generated
	 */
	EOperation getNode__HasIncomingEdge();

	/**
	 * Returns the meta object for the '{@link digraph.Node#hasOutgoingEdge() <em>Has Outgoing Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Outgoing Edge</em>' operation.
	 * @see digraph.Node#hasOutgoingEdge()
	 * @generated
	 */
	EOperation getNode__HasOutgoingEdge();

	/**
	 * Returns the meta object for the '{@link digraph.Node#addIncomingEdge(digraph.Edge) <em>Add Incoming Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Incoming Edge</em>' operation.
	 * @see digraph.Node#addIncomingEdge(digraph.Edge)
	 * @generated
	 */
	EOperation getNode__AddIncomingEdge__Edge();

	/**
	 * Returns the meta object for the '{@link digraph.Node#addOutgoingEdge(digraph.Edge) <em>Add Outgoing Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Outgoing Edge</em>' operation.
	 * @see digraph.Node#addOutgoingEdge(digraph.Edge)
	 * @generated
	 */
	EOperation getNode__AddOutgoingEdge__Edge();

	/**
	 * Returns the meta object for the '{@link digraph.Node#getAllEdges() <em>Get All Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Edges</em>' operation.
	 * @see digraph.Node#getAllEdges()
	 * @generated
	 */
	EOperation getNode__GetAllEdges();

	/**
	 * Returns the meta object for class '{@link digraph.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see digraph.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link digraph.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see digraph.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link digraph.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see digraph.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for the attribute '{@link digraph.Edge#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see digraph.Edge#getName()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Name();

	/**
	 * Returns the meta object for the attribute '{@link digraph.Edge#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see digraph.Edge#getWeight()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Weight();

	/**
	 * Returns the meta object for the '{@link digraph.Edge#disconnectSource() <em>Disconnect Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disconnect Source</em>' operation.
	 * @see digraph.Edge#disconnectSource()
	 * @generated
	 */
	EOperation getEdge__DisconnectSource();

	/**
	 * Returns the meta object for the '{@link digraph.Edge#disconnectTarget() <em>Disconnect Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disconnect Target</em>' operation.
	 * @see digraph.Edge#disconnectTarget()
	 * @generated
	 */
	EOperation getEdge__DisconnectTarget();

	/**
	 * Returns the meta object for class '{@link digraph.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see digraph.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the attribute '{@link digraph.Path#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see digraph.Path#getName()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Name();

	/**
	 * Returns the meta object for the reference list '{@link digraph.Path#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edges</em>'.
	 * @see digraph.Path#getEdges()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Edges();

	/**
	 * Returns the meta object for the reference '{@link digraph.Path#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see digraph.Path#getSource()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Source();

	/**
	 * Returns the meta object for the reference '{@link digraph.Path#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see digraph.Path#getDestination()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Destination();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DigraphFactory getDigraphFactory();

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
		 * The meta object literal for the '{@link digraph.impl.DiGraphImpl <em>Di Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digraph.impl.DiGraphImpl
		 * @see digraph.impl.DigraphPackageImpl#getDiGraph()
		 * @generated
		 */
		EClass DI_GRAPH = eINSTANCE.getDiGraph();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DI_GRAPH__NODES = eINSTANCE.getDiGraph_Nodes();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DI_GRAPH__EDGES = eINSTANCE.getDiGraph_Edges();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DI_GRAPH__PATHS = eINSTANCE.getDiGraph_Paths();

		/**
		 * The meta object literal for the '<em><b>Is Cyclic</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DI_GRAPH___IS_CYCLIC = eINSTANCE.getDiGraph__IsCyclic();

		/**
		 * The meta object literal for the '<em><b>Remove Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DI_GRAPH___REMOVE_NODE__NODE = eINSTANCE.getDiGraph__RemoveNode__Node();

		/**
		 * The meta object literal for the '<em><b>Remove Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DI_GRAPH___REMOVE_EDGE__EDGE = eINSTANCE.getDiGraph__RemoveEdge__Edge();

		/**
		 * The meta object literal for the '<em><b>Visualize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DI_GRAPH___VISUALIZE = eINSTANCE.getDiGraph__Visualize();

		/**
		 * The meta object literal for the '{@link digraph.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digraph.impl.NodeImpl
		 * @see digraph.impl.DigraphPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Incoming Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INCOMING_EDGES = eINSTANCE.getNode_IncomingEdges();

		/**
		 * The meta object literal for the '<em><b>Outgoing Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTGOING_EDGES = eINSTANCE.getNode_OutgoingEdges();

		/**
		 * The meta object literal for the '<em><b>Has Incoming Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___HAS_INCOMING_EDGE = eINSTANCE.getNode__HasIncomingEdge();

		/**
		 * The meta object literal for the '<em><b>Has Outgoing Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___HAS_OUTGOING_EDGE = eINSTANCE.getNode__HasOutgoingEdge();

		/**
		 * The meta object literal for the '<em><b>Add Incoming Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_INCOMING_EDGE__EDGE = eINSTANCE.getNode__AddIncomingEdge__Edge();

		/**
		 * The meta object literal for the '<em><b>Add Outgoing Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ADD_OUTGOING_EDGE__EDGE = eINSTANCE.getNode__AddOutgoingEdge__Edge();

		/**
		 * The meta object literal for the '<em><b>Get All Edges</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_ALL_EDGES = eINSTANCE.getNode__GetAllEdges();

		/**
		 * The meta object literal for the '{@link digraph.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digraph.impl.EdgeImpl
		 * @see digraph.impl.DigraphPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__NAME = eINSTANCE.getEdge_Name();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__WEIGHT = eINSTANCE.getEdge_Weight();

		/**
		 * The meta object literal for the '<em><b>Disconnect Source</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDGE___DISCONNECT_SOURCE = eINSTANCE.getEdge__DisconnectSource();

		/**
		 * The meta object literal for the '<em><b>Disconnect Target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDGE___DISCONNECT_TARGET = eINSTANCE.getEdge__DisconnectTarget();

		/**
		 * The meta object literal for the '{@link digraph.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digraph.impl.PathImpl
		 * @see digraph.impl.DigraphPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__NAME = eINSTANCE.getPath_Name();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__EDGES = eINSTANCE.getPath_Edges();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__SOURCE = eINSTANCE.getPath_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__DESTINATION = eINSTANCE.getPath_Destination();

	}

} //DigraphPackage
