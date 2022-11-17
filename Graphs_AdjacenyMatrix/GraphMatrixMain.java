//what are graphs?
/*
 * Graph is a non linear data structure consisting of nodes and edges. It consists of a finite set of vertices and a set of edges which
 *  connect a pair of node.
 * Graph Terminology:
 *       Vertices: They are the nodes of the graph
 *       Edge: The lines that cnnects pairs of vertices
 *       Unweighted Graph: A graph which does not have a weight associated with any edge
 *       Weighted Graph: A graph which has a weight associated with any edge
 *       Undirected Graph: In case the edge of the grah does not have a direction associated with them
 *       Directed Graph: If the edge in a graph has a direction associated with them
 *       Cyclic Graph: A graph which has atleast one loop
 *       Acyclic Graph: A graph which does not have any loop
 *       Tree: It is a special case of directed acyclic graphs
 *
 * Graph Types:
 *  */




package Graphs_AdjacenyMatrix;
import java.util.ArrayList;

public class GraphMatrixMain {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));

        Graph g = new Graph(nodeList);
        g.addUndirectedEdge(0, 1);
        g.addUndirectedEdge(0, 2);
        g.addUndirectedEdge(0, 3);
        g.addUndirectedEdge(1, 4);
        g.addUndirectedEdge(2, 3);
        g.addUndirectedEdge(3, 4);

        System.out.println(g.toString());
    }
    
}
