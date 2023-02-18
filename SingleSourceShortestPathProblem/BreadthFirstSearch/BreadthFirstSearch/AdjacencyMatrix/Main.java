//time complexity of bfs is o(V + E) where V is the number of vertices and E is the number of edges
//Space complexity is O(V + E) where V is the number of vertices and E is the number of edges
package SingleSourceShortestPathProblem.BreadthFirstSearch.BreadthFirstSearch.AdjacencyMatrix;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));
        nodeList.add(new GraphNode("F",5));
        nodeList.add(new GraphNode("G", 6));

        Graph g = new Graph(nodeList);
        g.addUndirectedEdge(0, 1);//A-B
        g.addUndirectedEdge(0, 2);//A-C
        g.addUndirectedEdge(1, 3);//B-D
        g.addUndirectedEdge(1, 6);//B-G
        g.addUndirectedEdge(2, 3);//C-D
        g.addUndirectedEdge(2, 4);//C-E
        g.addUndirectedEdge(3, 5);//D-F
        g.addUndirectedEdge(4, 5);//E-F
        g.addUndirectedEdge(5, 6);//F-G

        System.out.println(g.toString());
        g.BFSForSSSP(nodeList.get(0));
    }
    
}
