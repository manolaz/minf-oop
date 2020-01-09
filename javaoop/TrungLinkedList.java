package javaoop;

/**
 * TrungLinkedList
 */
public class TrungLinkedList {
    final class Node
    {
        char info;
        Node next;
        public Node(char letter, Node node)
        {
            info = letter;
            next = node;
        }
    }
    
    n1 = n4.next; n1.next = null; // Assignment
    n3.next.next = new Node('B',null); //Node instantiation
    n1.info = n4.next.info; n1.next.info = 'C'; // Assignment
    if (n1==null) {...} else {...} // 4.If statement
    while ( (n1!=null) && (n1.info=='A') ) {...} // While loop

}