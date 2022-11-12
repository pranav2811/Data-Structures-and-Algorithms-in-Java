package Graphs_AdjacenyMatrix;

import java.util.ArrayList;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    int[][] adjacencyMatrix;

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    //to add the edge of the node to the matrix

    public void addUndirectedEdge(int i, int j){
        adjacencyMatrix[i][j] = 1;//1 if there is a link between the nodes
        adjacencyMatrix[j][i] = 1;
    }

    //to print the adjacenyMatrix

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("  ");
        for(int i = 0; i < nodeList.size(); i++){
            s.append(nodeList.get(i).name + " ");
        }
        s.append("\n");
        for(int i = 0; i < adjacencyMatrix.length; i++){
            s.append(nodeList.get(i).name + " ");
            for(int j = 0; j < adjacencyMatrix.length; j++){
                s.append(adjacencyMatrix[i][j] + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
