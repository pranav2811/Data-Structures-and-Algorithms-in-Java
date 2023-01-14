package GraphTraversal.DepthFirstSearch.AdjacencyList;


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

    //dfs internal
    void dfsVisit(GraphNode node){
        //we will create an emoty stack first
        Stack<GraphNode> stack = new Stack<GraphNode>();
        stack.push(node);
        //if stack nto empty we popo the elements one by one and we will mark them as visited and push adjacent elements to the stack
        while(!stack.isEmpty()){
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            //push all the neighbours of the current node to the stack
             for(GraphNode neighbor : currentNode.neighbors){
                if(!neighbor.isVisited){
                    stack.push(neighbor);
                    neighbor.isVisited = true;
                }
             }
        }

    }
    //dfs main method
    void dfs(){
        //we will call dfsVisit() for each node
        for(GraphNode node : nodeList){
            if(!node.isVisited){
                dfsVisit(node);
            }
        }
    }

}
