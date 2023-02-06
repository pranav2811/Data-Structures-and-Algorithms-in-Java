package MinimumSpanningTree;

import java.util.ArrayList;



public class DisjointSet{

    public ArrayList<WeightedNode> nodeList = new ArrayList<>();

    //we are going to make sets based on the ndoe lsit

    public static void makeSet(ArrayList<WeightedNode> nodeList){//well loop through thte node list and make the disjoint set for each node
        for(WeightedNode node : nodeList){
            DisjointSet set = new DisjointSet();
            //access the nodelist of the set and the node
            set.nodeList.add(node);//storing the reference of this dijoint set in the node class
            node.set = set;
            
        }

    }
    //finding the set - well just access the given nodes set property
    public static DisjointSet findSet(WeightedNode node){
        return node.set;
    }

    //union of two sets
    public static DisjointSet union(WeightedNode node1, WeightedNode node2){
        //if they are in the same set we dont need to union
        if(node1.set.equals(node2.set)){
            return null;//since they are already in the same
        }
        else{
            //if first set bigger than we udpate each node of second set to merge to first set
            DisjointSet set1 = node1.set;
            DisjointSet set2 = node2.set;

            if(set1.nodeList.size()>set2.nodeList.size()){
                ArrayList<WeightedNode> nodeSet2 = set2.nodeList;
                for(WeightedNode node : nodeSet2){
                    node.set = set1;
                    set1.nodeList.add(node);
                }
                return set1;

            }
            else{
                ArrayList<WeightedNode> nodeSet1 = set1.nodeList;
                for(WeightedNode node : nodeSet1){
                    node.set = set2;
                    set2.nodeList.add(node);
                }
                return set2;
            }
            
        }
        //helper function to prinout out all nodes of any given set

        
    }
    public void printAllNodesofThisSet(){
        System.out.println("Printing all nodes of this set");
        for(WeightedNode node : nodeList){
            System.out.println(node + " ");
        }
        System.out.println();
    }
    
}