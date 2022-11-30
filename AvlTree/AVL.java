package AvlTree;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {

    BinaryNode root;

    AVL() {
        root = null;
    }

    // Pre Order Traversal
    public void preOrder(BinaryNode node) {
        if (root == null) {
            return;
        }
        System.out.println(root.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // In Order Traversal
    public void inOrder(BinaryNode node) {
        if (root == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(root.value + " ");
        inOrder(node.right);
    }

    // Post Order Traversal
    public void postOrder(BinaryNode node) {
        if (root == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(root.value + " ");
    }

    // Level Order Traversal

    void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.println(presentNode.value + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    //Search Method
    BinaryNode search(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Value" + value + "not found in avl tree");
            return null;
        }
        else if (node.value == value) {
            System.out.println("Value" + value + "found in avl tree");
            return node;
        }
        else if (value < node.value) {
            return search(node.left, value);
        }
        return search(node.right, value);
    }

}
