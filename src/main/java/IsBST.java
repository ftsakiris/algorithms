/**
 * For the purposes of this challenge, we define a binary search tree to be a binary tree with the following ordering properties:
 * The data value of every node in a node's left subtree is less than the data value of that node.
 * The data value of every node in a node's right subtree is greater than the data value of that node.
 * Given the root node of a binary tree, can you determine if it's also a binary search tree?
 *
 * Complete the function in your editor below, which has 1 parameter: a pointer to the root of a binary tree.
 * It must return a boolean denoting whether or not the binary tree is a binary search tree.
 * You may have to write one or more helper functions to complete this challenge.
 *
 * Note: We do not consider a binary tree to be a binary search tree if it contains duplicate values.
 * Input Format
 * You are not responsible for reading any input from stdin.
 * Hidden code stubs will assemble a binary tree and pass its root node to your function as an argument.
 */

public class IsBST {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static boolean checkBST(Node root) {
        // you reach the end of the tree length
        if (root.left == null && root.right == null) {
            return true;
        }
        //in case one of the nodes is null return false
        else if (root.left == null || root.right == null) {
            return false;
        }
        else if (! (root.data > root.left.data && root.data < root.right.data)) {
            return false;
        }
        return checkBST(root.left) && checkBST(root.right);
    }
}
