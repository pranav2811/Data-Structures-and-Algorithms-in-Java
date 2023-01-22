package SingleSourceShortestPathProblem.BellmanFord;

import java.util.*;

public class WeightedGraph {
    ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();

    public WeightedGraph(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    // implementing the dijkstras algo
    

    public static void pathPrint(WeightedNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.println(node.name + " ");

    }

    public void addWeightedEdge(int i, int j, int d){
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbors.add(second);
        first.weightMap.put(second, d);
    }

    //Bellman Ford  Algorithm
    void bellmanFord(WeightedNode sourceNode){
        //set source node distance to 0 and all othe rto infinity
        sourceNode.distance = 0;
        //loop through the source list
        for(int i = 0; i < nodeList.size(); i++){
            //loop through the node list and for each node we visit the neighbors and update cost if new cost is lesser than the preious one
            for(WeightedNode currentNode : nodeList){
                for(WeightedNode neighbor : currentNode.neighbors){
                    if(neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)){
                        neighbor.distance = currentNode.distance + currentNode.weightMap.get(neighbor);
                        neighbor.parent = currentNode;
                    }

                    }
                }
            }
            //check for the negative
            System.out.println("Checking for negative cycle");
            for(WeightedNode currentNode : nodeList){
                for(WeightedNode neighbor : currentNode.neighbors){
                    if(neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)){
                        System.out.println("Negative cycle found");
                        System.out.println("Vertex name: " + neighbor.name);
                        System.out.println( "Old Cost : " + neighbor.distance);
                        int newDistance = currentNode.distance + currentNode.weightMap.get(neighbor);
                        System.out.println("New Cost : " + newDistance);
                        return;
                    }
                }
            }
            System.out.println("Negative Cycle not found");
            for(WeightedNode nodeToCheck : nodeList){
                if(nodeToCheck.distance != Integer.MAX_VALUE){
                    System.out.println("Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
                    pathPrint(nodeToCheck);
                    System.out.println();
                }
            }
        }
    
    }

