package MinimumSpanningTree;
import java.util.*;

public class Main{
    public static void main(String[] args){
        ArrayList<WeightedNode> nodeList = new ArrayList<>();
         nodeList.add(new WeightedNode("A",0));
            nodeList.add(new WeightedNode("B",1));
            nodeList.add(new WeightedNode("C",2));
            nodeList.add(new WeightedNode("D",3));

            DisjointSet.makeSet(nodeList);
            WeightedNode fistNode = nodeList.get(0);
            WeightedNode secondNode = nodeList.get(1);

            DisjointSet output = DisjointSet.findSet(secondNode);
            output.printAllNodesofThisSet();

            DisjointSet.union(fistNode, secondNode);
            output = DisjointSet.findSet(secondNode);
            output.printAllNodesofThisSet();
    }
}