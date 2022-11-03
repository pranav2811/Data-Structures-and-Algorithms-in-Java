package BinaryTree;

public class TreeNode{

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data){
        this.data = data;
    }

    public void insert(int value){

        
        //well check whether the value equals the data in the node

        if(value == data){
            return;
        }
        if(value < data){
            if(leftChild == null){
                leftChild = new TreeNode(value);
            }
            else{
                leftChild.insert(value);
            }
        }
        else{
            if(rightChild == null){
                rightChild = new TreeNode(value);
            }
            else{
                rightChild.insert(value);
            }
        }
    }

    public void traverseInOrder(){
        if (leftChild != null){
            leftChild.traverseInOrder();
        }
        System.out.println(data);
        if(rightChild != null){
            rightChild.traverseInOrder();
        }

    }

    public int min() {
        if(leftChild == null){
            return data;//if there is no left child then the current node is the smallest
        }
        else {
            return leftChild.min();//we keep travelling down the left child until we reach the smallest
        }

    }

    public int max() {
        if (rightChild == null){
            return data;
        }
        else {
            return rightChild.max();
        }
    }

    public TreeNode get(int value){
        //we are going to check the value against the value of the node if euqal we found the node if not equal we are going to search the left or right subtree
        //depending whether the node is more or less than the value we are searching for
        if(value == data){
            return this;
        }

        if(value < data){
            if(leftChild != null){
                return leftChild.get(value);
            }
        }

        else {
            if(rightChild != null){
                return rightChild.get(value);
            }
        }

        return null;
    }
    
    

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return this.leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return this.rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

}
