package LinkedList1;

import java.util.*;

public class LinkedListUse {
    public static void main(String[] args)
    {    Node<Integer> node1=new Node<>(10);
        Node<Integer> node2=new Node<>(20);
        node1.next=node2;
        System.out.println(node1.data+":"+node1.next+"-->"+node2.data+":"+node2.next);

    }
}
