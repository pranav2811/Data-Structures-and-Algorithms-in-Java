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

    public void traverseInOrder(){
        if (root != null){
            root.traverseInOrder();
        }
    }
}
