package BinaryTree;


public  class Tree{
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

    public TreeNode get(int value){
        if(root != null){
            return root.get(value);
        }
        
        return null;
    }

    public void delete(int value){
        root = delete(root, value);//frst para is the root of the subtree we want to search for
    }

    private TreeNode delete(TreeNode subTreeRoot, int value){//this method returns the replacement node
        if(subTreeRoot == null){
            return subTreeRoot;
        }

        if(value < subTreeRoot.getData()){
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));//if the value is less than the value we are searching then we are going to move to the end of the subtree and replace the node with the replacement node
        }
        else if(value > subTreeRoot.getData()){
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        }
        else {
            //we found the node we want to delete
            //we have 3 cases
            //1. the node is a leaf node
            //2. the node has one child
            //3. the node has 2 children

            //case 1 and 2 are easy
            //case 3 is the most difficult

            if(subTreeRoot.getLeftChild() == null){
                return subTreeRoot.getRightChild();//if the node has no left child then we can just return the right child
            }
            else if(subTreeRoot.getRightChild() == null){
                return subTreeRoot.getLeftChild();//if there is not left or right child we just cut if off, if it does have a left child we want it  to replace the node we are deleting
            }

            //case 3

            //if taking it from the left subtree we have to take the largest value in the left subtre
            //if taking it from thr right subtree we have to take the smallest value in the right subtree

            //choose one and stick to it - we are going to take the smallest value from the right subtree 

            //we need to replace the value in the subtree root with the smallest value from the right subtree
            subTreeRoot.setData(subTreeRoot.getRightChild().min());//subtreeroot is the root we want to delete and we are going to replace it with the smallest value in the right subtree

            //we have to delete the node that we just copied the value from
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
        }

        return subTreeRoot;//if we reach here then it mean that this is not the node we want to delete
    }
    

    public int min(){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        else{
            return root.min();
        }
    }

    public int max(){
        if (root == null){
            return Integer.MAX_VALUE;
        }
        else{
            return root.max();
        }
    }

    public void traverseInOrder(){
        if (root != null){
            root.traverseInOrder();
        }
    }
}
