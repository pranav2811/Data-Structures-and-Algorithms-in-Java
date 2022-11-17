package BinaryHeap;

public class HeapMain {
    public static void main(String[] args) {
        BinaryHeap newBP = new BinaryHeap(5);
        newBP.insert(10, "Max");
        newBP.insert(5, "Max");
        newBP.insert(15, "Max");
        newBP.insert(1, "Max"); 
        newBP.levelOrder();     
    }
}
