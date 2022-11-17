package BinaryTreeLinkedList;

public class BinaryTree {
    BinaryNode root;

    public BinaryTree() {
        this.root = null;//creation is of O(1) space and time complexity here
    }

    //PreOrder Traversal
    public void preOrder(BinaryNode node){ //O(n) space time complexity
        if(node == null){//O(1)
            return;
        }
        
        System.out.println(node.value + " ") ;//first we visit the root node  O(1)
        preOrder(node.left);//recursively visit all nodes in the left subtree O(N/2)
        preOrder(node.right);//afterwards recursively visit all nodes in the right subtree O(N/2)
    }
    
    //InOrder Traversal
    public void inOrder(BinaryNode node){ //O(n) space time complexity
        if (node == null){
            return;
        }

        inOrder(node.left);//visiting th eleft subtree first
        System.out.println(node.value + " ");//visiting the root node
        inOrder(node.right);//visiting the right subtree
    }

    //PostOrder Traversal
    public void postOrder(BinaryNode node){//O(n) space time complexity
        if(node == null){
            return;
        }

        postOrder(node.left);//visiting the left subtree
        postOrder(node.right);//visiting the right subtree
        System.out.println(node.value + " ");//visiting the node after the left and right subtrees
    }
}
