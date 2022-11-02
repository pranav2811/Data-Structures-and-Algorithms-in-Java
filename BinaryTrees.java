//Every node has 0, 1 , or 2 children
//Children are referred to as left and right children
//In the last level of the tree, the nodes are as left as possible
//The left child always has a smaller value than its parent i.e everything to the left is less than root
//The right child always has a larger value than its parent i.e everythng to the right is larger than root
//It can perform isnertions, deletions and retrievals in o(logn)
//The minimum value can be obtained by travelling all the wayy down the left

public class BinaryTrees {

    public static class TreeNode{

        private int data;
        private TreeNode leftChild;
        private TreeNode rightChild;

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
        
        public TreeNode(int data){
            this.data = data;
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
    public static class Tree{
        private TreeNode root;

        //to build a binary tree we need to insert nodes;
        //well compare values against the root node to check whether to insert values to the left or right

        public void insert(int value){
            if (root == null){
                root = new TreeNode(value);

            }
            else {
                root.insert(value);
            }
        }
    }


    
    public static void main(String[] args){
        
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(32);
    }
}
