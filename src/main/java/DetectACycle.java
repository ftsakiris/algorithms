import java.util.ArrayList;
import java.util.List;

/**
 * A linked list is said to contain a cycle if any node is visited more than once while traversing the list.
 * Complete the function provided in the editor below. It has one parameter:
 * a pointer to a Node object named that points to the head of a linked list. Your function must return a boolean denoting whether or not there is a cycle in the list. If there is a cycle, return true; otherwise, return false.
 * Note: If the list is empty, head will be null.
 * Input Format
 * Our hidden code checker passes the appropriate argument to your function.
 * You are not responsible for reading any input from stdin.
 */

public class DetectACycle {

    class Node {
        int data;
        Node next;
    }

    public boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }
        List<Node> nodes = new ArrayList();
        nodes.add(head);
        Node nodeToGo = head.next;
        while (nodeToGo != null) {
            if (nodes.contains(nodeToGo)) {
                return true;
            }
            nodes.add(nodeToGo);
            nodeToGo = nodeToGo.next;
        }
        return false;
    }

}