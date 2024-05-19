package digraph.test;

import digraph.DigraphPackage;
import digraph.DigraphFactory;
import digraph.Node;
import digraph.Edge;
import digraph.DiGraph;

public class AcyclicGraph {
    public static void main(String[] args) {
        DigraphPackage pkg = DigraphPackage.eINSTANCE;
        
        // Retrieve the default factory singleton
        DigraphFactory factory = DigraphFactory.eINSTANCE;
        
        // create nodes
        Node node1 = factory.createNode();
        node1.setName("1");
        
        Node node2 = factory.createNode();
        node2.setName("2");
        
        Node node3 = factory.createNode();
        node3.setName("3");
        
        Node node4 = factory.createNode();
        node4.setName("4");
        
        Node node5 = factory.createNode();
        node5.setName("5");
        
        // create edges
        Edge edge12 = factory.createEdge();
        edge12.setSource(node1);
        edge12.setTarget(node2);
        
        Edge edge14 = factory.createEdge();
        edge14.setSource(node1);
        edge14.setTarget(node4);
        
        Edge edge23 = factory.createEdge();
        edge23.setSource(node2);
        edge23.setTarget(node3);
        
        Edge edge34 = factory.createEdge();
        edge34.setSource(node3);
        edge34.setTarget(node4);
        
        Edge edge45 = factory.createEdge();
        edge45.setSource(node4);
        edge45.setTarget(node5);
     
        Edge edge35 = factory.createEdge();
        edge35.setSource(node3);
        edge35.setTarget(node5);
        
        // create a graph
        DiGraph graph = factory.createDiGraph();
        
        graph.getNodes().add(node1);
        graph.getNodes().add(node2);
        graph.getNodes().add(node3);
        graph.getNodes().add(node4);
        graph.getNodes().add(node5);
        
        graph.getEdges().add(edge12);
        graph.getEdges().add(edge14);
        graph.getEdges().add(edge23);
        graph.getEdges().add(edge34);
        graph.getEdges().add(edge35);
        graph.getEdges().add(edge45);
        
        if (graph.isCyclic()) System.out.println("Graph has cycle");
        else System.out.println("Graph does not contain cycle");
    }
}
