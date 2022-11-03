package BinaryTree;
//Every node has 0, 1 , or 2 children
//Children are referred to as left and right children
//In the last level of the tree, the nodes are as left as possible
//The left child always has a smaller value than its parent i.e everything to the left is less than root
//The right child always has a larger value than its parent i.e everythng to the right is larger than root
//It can perform isnertions, deletions and retrievals in o(logn)
//The minimum value can be obtained by travelling all the wayy down the left

/*
 * Traversal is of 4 types
 * 1. Level -> visit nodes on each level
 * 2. Pre - Order -> visit the root of every subtree first
 * 3. Post - order -> visit the root of every subtree last
 * 4  In - order -> vist left child, then root then right child
 */

public class BinaryTrees {

    
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
        intTree.insert(17);

        intTree.traverseInOrder();
        System.out.println(intTree.get(27));
        System.out.println(intTree.get(17));
        System.out.println(intTree.get(8888));

        System.out.println(intTree.min());
        System.out.println(intTree.max());

        intTree.delete(15);
        intTree.traverseInOrder();
        System.out.println();
    }
}
