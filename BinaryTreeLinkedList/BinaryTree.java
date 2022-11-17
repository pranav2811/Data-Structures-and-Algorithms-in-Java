package BinaryTreeLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    BinaryNode root;

    public BinaryTree() {
        this.root = null;// creation is of O(1) space and time complexity here
    }

    // PreOrder Traversal
    void preOrder(BinaryNode node) { // O(n) space time complexity
        if (node == null) {// O(1)
            return;
        }

        System.out.println(node.value + " ");// first we visit the root node O(1)
        preOrder(node.left);// recursively visit all nodes in the left subtree O(N/2)
        preOrder(node.right);// afterwards recursively visit all nodes in the right subtree O(N/2)
    }

    // InOrder Traversal
    void inOrder(BinaryNode node) { // O(n) space time complexity
        if (node == null) {
            return;
        }

        inOrder(node.left);// visiting th eleft subtree first
        System.out.println(node.value + " ");// visiting the root node
        inOrder(node.right);// visiting the right subtree
    }

    // PostOrder Traversal
    void postOrder(BinaryNode node) {// O(n) space time complexity
        if (node == null) {
            return;
        }

        postOrder(node.left);// visiting the left subtree
        postOrder(node.right);// visiting the right subtree
        System.out.println(node.value + " ");// visiting the node after the left and right subtrees
    }

    // LevelOrder Traversal
    // we take all nodes add them to the queue and then dequeue them one by one

    void levelOrder() {//O(n) space time complexity
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();// O(1) space and time complexity
        // first we insert the root
        queue.add(root);//O(1)

        while (!queue.isEmpty()) {//Since we are removing all nodes from the queue, the time complexity is O(n)
            BinaryNode presentNode = queue.remove();// O(1) space and time complexity - storing the value of the first node
            System.out.print(presentNode.value + " ");// O(1) space and time complexity - printing the value of the first node
            if(presentNode.left != null){//O(1)
                queue.add(presentNode.left);//since we start from left in a level we first add the left element to the queue
            }
            if(presentNode.right != null){//O(1)
                queue.add(presentNode.right);//then we add the right element to the queue
            }
                                                       
        }
    }
    //Search Method
    public void search(String value){//O(n) space time complexity
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.value == value){
                System.out.println("The value " + value + " was found");
                return;
            }else{
                if(presentNode.left != null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null){
                    queue.add(presentNode.right);
                }
            }
        } 
        System.out.println("The value " + value + " was not found");
    }
    //Insert Method
    void insert(String value){//O(n) space time complexity
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        //if root node null we assign this node to root
        if(root == null){
            root = newNode;
            System.out.println("Insert new node at root");
            return;
        }
        //else we use level order traversal to look for an empty node
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){//we are looking through all elements so worst case is O(n)
            BinaryNode presentNode = queue.remove();
            if(presentNode.left == null){
                presentNode.left = newNode;
                System.out.println("Inserted new node at left");
                break;
            }
            else if(presentNode.right == null){
                presentNode.right = newNode;
                System.out.println("Inserted new node at right");
                break;
            }
            else{
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }

    }
    //Get deepest Node
    public BinaryNode getDeepestNode(){
        // we use level order traversal to get to the last node of tree
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        BinaryNode presentNode = null;
        queue.add(root);
        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
            
            
        }
        return presentNode;
        
    }
    //Delete Deepest Node
    public void deleteDeepestNode(){
        // we use level order traversal to get to the last node of tree
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        BinaryNode previousNode, presentNode = null;
        queue.add(root);
        while(!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.left == null){//this means that present nodes rigth child is the deepest node
                previousNode.right = null;
                return;
            }
            else if(presentNode.right == null){//this means that present nodes left child is the deepest node
                presentNode.left = null;
                return;
            }
            
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            
        }
    }
    //delete given node

    void deleteNode(String value){//O(n) space time complexity
        Queue <BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){//we are looking through all elements so worst case is O(n)
            BinaryNode presentNode = queue.remove();
            if(presentNode.value == value){
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();//O(n) space time complexity
                System.out.println("The node has been deleted");
                return;
            }
            else{
                if(presentNode.left != null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null){
                    queue.add(presentNode.right);
                }
            }
            System.out.println("The node does not exist in the binary tree");
        }
    }
    //delete binary tree - simply delete root node

    void deleteBinaryTree(){//O(1) space time complexity
        root = null;
        System.out.println("Binary tree has been successfully deleted");
    }
}

    
