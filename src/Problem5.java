//This problem was asked by Facebook.
//        Given a binary tree, return the level of the tree with minimum sum.
//
//        A binary tree is a data structure in which each node has at most two children (left and right),
//        and a level is how many parents a node has until it reaches the root.
//
//        To better explain this question, let's see this example:
//
//          1      (Level 0 = 1)
//         / \
//        2   3    (Level 1 = 2 + 3)
//           / \
//          4   5  (Level 2 = 4 + 5)

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Problem5 {
    private static Node root;
    private static class Node{
        int key;
        Node left, right;
        Node(int item){
            key = item;
            left = null;
            right = null;
        }
    }
    Problem5(int key){
        root = new Node(key);
    }
    private Problem5(){
        root = null;
    }
    public static void main(String [] args){
        Problem5 tree = new Problem5();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(5);
        printTreeInOrder(root);

    }
//    private static int smallest_level(){
//        Queue<Node>queue = new LinkedList<>();
//        ((LinkedList<Node>) queue).push(root);
//        Map<Integer, Integer>level_to_sum = new HashMap<>();
//
//        while (!queue.isEmpty()){
//
//        }
//    }
    private static void  printTreeInOrder(Node current){
        if (current != null) {
            printTreeInOrder(current.left);
            System.out.print(current.key + " ");
            printTreeInOrder(current.right);
        }
    }
}
