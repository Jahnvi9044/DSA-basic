package LinkedList1;

import java.util.*;

public class LinkedListUse2 {
    public static void main(String[] args) {
        Node<Integer> node1=new Node<>(10);
        Node<Integer> node2=new Node<>(20);
        Node<Integer> node3=new Node<>(30);
        Node<Integer> node4=new Node<>(40);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        System.out.println(node1.data+"-->"+node2.data+"-->"+node3.data+"-->"+node4.data+"-->"+node4.next);




        }

    }

