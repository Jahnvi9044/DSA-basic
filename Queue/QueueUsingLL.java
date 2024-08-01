package Queue;

import java.util.*;
import LinkedList1.*;
public class QueueUsingLL<T> {
    private Node<T> front;
    private Node<T> rear;
    int size;


    QueueUsingLL()
    {   front =null;
        rear=null;
        size=0;
    }
    int size()
    {
        return size;

    }
    boolean isEmpty()
    {
        if(size==0)
            return true;
        else return false;

    }
    T front()
    {
        //gives the front element of the queue
        if(front.next!=null)
        return front.data;
        else return null;

        }

    public void enqueue(T data)
    {Node<T> newNode=new Node<T>(data);
        if(size==0) {
            front = newNode;
            rear = newNode;
            size=1;
        }
        else {
        rear.next=newNode;
        rear=rear.next;
        size++;}

    }
    public T dequeue()
    {
        if(size==0)
        { System.out.println("Queue is empty");
            return null;}
        else
        {
            Node<T> temp=front;
            front=front.next;
            return temp.data;
        }

    }
}
