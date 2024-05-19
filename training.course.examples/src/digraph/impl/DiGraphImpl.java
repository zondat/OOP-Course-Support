/**
 */
package digraph.impl;

import digraph.DiGraph;
import digraph.DigraphPackage;
import digraph.Edge;
import digraph.Node;

import digraph.Path;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.graphstream.graph.implementations.SingleGraph;

import java.util.ArrayList; 
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Di Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link digraph.impl.DiGraphImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link digraph.impl.DiGraphImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link digraph.impl.DiGraphImpl#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiGraphImpl extends MinimalEObjectImpl.Container implements DiGraph {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<Path> paths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DigraphPackage.Literals.DI_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, DigraphPackage.DI_GRAPH__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<Edge>(Edge.class, this, DigraphPackage.DI_GRAPH__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Path> getPaths() {
		if (paths == null) {
			paths = new EObjectContainmentEList<Path>(Path.class, this, DigraphPackage.DI_GRAPH__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isCyclic() {
		boolean toUpdate = true;
		
		while (toUpdate) {	
			toUpdate = false;
			List<Node> removableNodes = new ArrayList<Node>();
			for (Node node : nodes) {
				if (!node.hasIncomingEdge() || !node.hasOutgoingEdge()) {
					removableNodes.add(node);
					toUpdate = true;				
				}
			}
			
			if (toUpdate) {
				for (Node node : removableNodes) {		
					for (Edge edge : node.getAllEdges()) {
						edge.disconnectSource();
						edge.disconnectTarget();
						removeEdge(edge);
					}
					removeNode(node);	
				}
			}
			if (nodes.size() == 0) return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean removeNode(Node node) {		
		return nodes.remove(node);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean removeEdge(Edge edge) {
		
		return edges.remove(edge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void visualize() {
		System.setProperty("org.graphstream.ui", "swing");
		org.graphstream.graph.Graph graphViz = new SingleGraph("example");
		
		// Add nodes
		for (Node node : nodes) {
			graphViz.addNode(node.getName());
		}
		
		// Add edges
		for (Edge edge : edges) {
			graphViz.addEdge(edge.getName(), edge.getSource().getName(), edge.getTarget().getName()).setAttribute("length", edge.getWeight());
		}
		graphViz.nodes().forEach(n -> n.setAttribute("label", n.getId()));
		graphViz.edges().forEach(e -> e.setAttribute("label", "" + (int) e.getNumber("length")));
		graphViz.display();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DigraphPackage.DI_GRAPH__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case DigraphPackage.DI_GRAPH__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
			case DigraphPackage.DI_GRAPH__PATHS:
				return ((InternalEList<?>)getPaths()).basicRemove(otherEnd, msgs);
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
			case DigraphPackage.DI_GRAPH__NODES:
				return getNodes();
			case DigraphPackage.DI_GRAPH__EDGES:
				return getEdges();
			case DigraphPackage.DI_GRAPH__PATHS:
				return getPaths();
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
			case DigraphPackage.DI_GRAPH__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case DigraphPackage.DI_GRAPH__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends Edge>)newValue);
				return;
			case DigraphPackage.DI_GRAPH__PATHS:
				getPaths().clear();
				getPaths().addAll((Collection<? extends Path>)newValue);
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
			case DigraphPackage.DI_GRAPH__NODES:
				getNodes().clear();
				return;
			case DigraphPackage.DI_GRAPH__EDGES:
				getEdges().clear();
				return;
			case DigraphPackage.DI_GRAPH__PATHS:
				getPaths().clear();
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
			case DigraphPackage.DI_GRAPH__NODES:
				return nodes != null && !nodes.isEmpty();
			case DigraphPackage.DI_GRAPH__EDGES:
				return edges != null && !edges.isEmpty();
			case DigraphPackage.DI_GRAPH__PATHS:
				return paths != null && !paths.isEmpty();
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
			case DigraphPackage.DI_GRAPH___IS_CYCLIC:
				return isCyclic();
			case DigraphPackage.DI_GRAPH___REMOVE_NODE__NODE:
				return removeNode((Node)arguments.get(0));
			case DigraphPackage.DI_GRAPH___REMOVE_EDGE__EDGE:
				return removeEdge((Edge)arguments.get(0));
			case DigraphPackage.DI_GRAPH___VISUALIZE:
				visualize();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DiGraphImpl
