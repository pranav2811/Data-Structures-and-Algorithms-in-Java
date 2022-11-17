package BinaryTreeArray;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex; // to keep track

    public BinaryTree(int size) {// creation is of O(1) time complexity and O(n) space complexity since we are
                                 // allocting the array size of n
        arr = new String[size + 1];// +1 as we are not using the first cell;
        this.lastUsedIndex = 0;
        System.out.println("Blank tree of size " + size + " has been created");
    }

    boolean isFull() {// O(1) time complexit
        if (arr.length - 1 == lastUsedIndex) {
            return true;
        } else {
            return false;
        }
    }

    // insert method

    void insert(String value) {// O(1) time complexity space complexity also O(1) as we are justupdating the
                               // value and not llocating new memory
        if (!isFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("Inserted " + value + " at index " + lastUsedIndex);
        } else {
            System.out.println("The BT is full");
        }

    }
    // preOrder traversal

    public void preOrder(int index) {// O(n) time complexity and O(n) space complexity
        if (index > lastUsedIndex) {
            return;
        }
        System.out.println(arr[index] + " ");// printing the root node
        preOrder(index * 2); // printing the left child - O(N/2) time complexity
        preOrder(index * 2 + 1);// printing the right child - O(N/2) time complexity
    }

    // InOrder traversal
    public void inOrder(int index) {// O(n) time complexity and O(n) space complexity
        if (index > lastUsedIndex) {
            return;
        }
        preOrder(index * 2); // printing the left child - O(N/2) time complexity
        System.out.println(arr[index] + " ");
        preOrder(index * 2 + 1);// printing the right child - O(N/2) time complexity
    }

    // postOrder traversal
    public void postOrder(int index) {// O(n) time complexity and O(n) space complexity
        if (index > lastUsedIndex) {
            return;
        }
        preOrder(index * 2); // printing the left child - O(N/2) time complexity
        preOrder(index * 2 + 1);// printing the right child - O(N/2) time complexity
        System.out.println(arr[index] + " ");// printing the root node O(1) time complexity
    }

    // level order traversal - just traversing the array
    public void levelOrder() {// O(n) time complexity and O(1) space complexity as no extra space is required
        for (int i = 1; i < lastUsedIndex; i++) { // O(n) time complexity
            System.out.println(arr[i] + " ");
        }

    }

    // Search method
    public int search(String value) {// O(n) time complexity and O(1) space complexity
        for (int i = 1; i < lastUsedIndex; i++) {// - O(n) time complexity
            if (arr[i] == value) {
                System.out.println("Found " + value + " at index " + i);
                return i;
            }
        }
        System.out.println("The value does not exsit in the tree");
        return -1;
    }

    // Delete
    public void delete(String value) {// o(n) time complexity and O(1) space complexity
        int location = search(value);
        if (location == -1) {
            return;// this means that the node does not exit
        } else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("The node has been deleted");
        }
    }

    // Delete BT
    public void deleteBT() {
        try {
            arr = null;
            System.out.println("The BT has been deleted");
        } catch (Exception e) {
            System.out.println("The BT could not be deleted");
        }

    }
}
