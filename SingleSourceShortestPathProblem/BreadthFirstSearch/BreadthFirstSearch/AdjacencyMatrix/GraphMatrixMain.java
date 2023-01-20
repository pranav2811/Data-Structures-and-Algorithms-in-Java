//time complexity of bfs is o(V + E) where V is the number of vertices and E is the number of edges
//Space complexity is O(V + E) where V is the number of vertices and E is the number of edges
package SingleSourceShortestPathProblem.BreadthFirstSearch.BreadthFirstSearch.AdjacencyMatrix;
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
        g.bfs();
    }
    
}
