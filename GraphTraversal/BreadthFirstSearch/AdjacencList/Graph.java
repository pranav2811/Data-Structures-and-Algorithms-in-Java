package GraphTraversal.BreadthFirstSearch.AdjacencList;

import java.util.*;

public class Graph {

    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    
    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i, int j){
        GraphNode first =  nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbors.add(second);//add second ndoe as the nieghbour of the first node
        second.neighbors.add(first);//add first node as the neighbour of the second node 
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + " : ");
            for (int j = 0; j < nodeList.get(i).neighbors.size(); j++) {
                if (j == nodeList.get(i).neighbors.size() - 1) {
                    s.append(nodeList.get(i).neighbors.get(j).name);
                } else {
                    s.append(nodeList.get(i).neighbors.get(j).name + " -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();

    }

    //BFS internal
    void bfsVisit(GraphNode node){
        //well create a queue add the first node to the queue and then while queue is not empty we dequeue it, mark visited and add all adjacent nodes to the queue
        LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
        queue.add(node);
        while(!queue.isEmpty()){
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            for(GraphNode neighbor : currentNode.neighbors){
                if(!neighbor.isVisited){
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }
    void bfs(){
        for(GraphNode node : nodeList){
            if(!node.isVisited){
                bfsVisit(node);
            }
        }
    }
}
