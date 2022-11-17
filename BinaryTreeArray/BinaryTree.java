package BinaryTreeArray;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex; // to keep track

    public BinaryTree(int size){
        arr = new String[size + 1];// +1 as we are not using the first cell;
        this.lastUsedIndex = 0;
        System.out.println("Blank tree of size " + size + " has been created");
    }
}
