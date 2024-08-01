package Queue;

import java.util.*;
//INTERTION AND DELETION FROM BOTH SIDES
public class Dequeue {
    private int front ;
    private int rear;
    private int[] data;
    private int size;

    Dequeue()
    {
        front=-1;
        rear=-1;
        size=0;
        data=new int[10];
    }

    void  insert(int element) {
        if (size == data.length) {
            System.out.println(-1);
            return;
        }

        else  if(size==0)
            front=0;

        size++;

        front=(front+1)%data.length;
        data[rear]=element;
    }


    public static void main(String[] args) {

    }
}
