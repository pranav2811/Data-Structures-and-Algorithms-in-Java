package SingleSourceShortestPathProblem.Dijkstras;

import java.util.*;

public class WeightedNode  implements Comparable<WeightedNode> {
    public String name;
    public ArrayList<WeightedNode> neighbors = new ArrayList<WeightedNode>();
    //HASH MAP TO STOP THE WEIGHT OF THE EDGE BETWEEN TWO NODES\
    public HashMap<WeightedNode, Integer> weightMap = new HashMap<WeightedNode, Integer>();
    public boolean isVisited = false;
    public WeightedNode parent;
    public int distance;
    public int index;

    public WeightedNode(String name, int index){
        this.name = name;
        distance = Integer.MAX_VALUE;
        this.index = index;

    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(WeightedNode otherNode){
        return Integer.compare(this.distance, otherNode.distance);
    }
    
}
