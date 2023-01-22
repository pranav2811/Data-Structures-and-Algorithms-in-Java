package GraphTraversal.BreadthFirstSearch.AdjacencyMatrix;

public class GraphNode {
    public String name;
    public int index;
    public boolean isVisited = false;

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }

}