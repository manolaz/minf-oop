package javaoop;

import java.util.Collections;
import java.util.List;

/**
 * TrungLinkedList
 */
public class TrungLinkedList {
    public static class Node {
        String info;
        Node next;

        public Node() {
            info = "i";
            next = null;
        }

        public Node(String letter, Node node) {
            info = letter;
            next = node;
        }
        // n1 = n4.next; n1.next = null; // Assignment
        // n3.next.next = new Node('B',null); //Node instantiation
        // n1.info = n4.next.info; n1.next.info = 'C'; // Assignment
        // if (n1==null) {...} else {...} // 4.If statement
        // while ( (n1!=null) && (n1.info=='A') ) {...} // While loop

    }
    
    public static class Utils{
        public static void printElements(Node head) {
            Node pointer = head;
            while (pointer != null) {
                System.out.print(pointer.info + " => ");
                pointer = pointer.next;
            }
            System.out.println("null");
        }

        public static Node push(Node head, String info) {
            Node child = new Node();
            child.info = info;

            // Set the next field of the new Node to point to the current
            // first node of the list.
            child.next = head;
            // return the new Node, so it becomes the first node in the list
            return child;
        }
        
        // Function for Linked List Implementation from given set of keys
        public static Node constructList(String[] keys) {
            Node head = null;

            // start from end of the array
            for (int i = keys.length - 1; i >= 0; i--) {
                head = push(head, keys[i]); // update head here
            }

            return head;
        }

        // main method to implement linked list
        public static void main(String[] args) {
            // input keys
            int[] keys = { 1, 2, 3, 4 };

            // points to the head node of the linked list
            Node head = constructList(keys);

            // print linked list
            printList(head);
        }
    }
    
}