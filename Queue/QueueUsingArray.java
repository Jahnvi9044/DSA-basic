package Queue;

import java.util.*;

public class QueueUsingArray {

   private int front ;
   private int rear;
   private int[] data;
   private int size;
   public QueueUsingArray()
   {
       front=-1;
       rear=-1;
       size=-1;
       data=new int[10];

   }
    public QueueUsingArray(int capacity)
    {
        front=-1;
        rear=-1;
        size=0;
        data=new int[capacity];

    }
    int size()//O(1)
    {
        return size;

    }
    boolean isEmpty()//O(1)
    {
        if(size()==0)
            return true;
        else return false;
    }
    int front()throws QueueEmptyException//O(1)
    {
        if(size==0)
        throw new QueueEmptyException();
        return data[front];
    }

    public void enqueue(int element) //QueueIsFull//O(1)
    {  // if(size==data.length)
       //   throw new QueueIsFull();
        if(size==data.length)
            doubleq();


        else  if(size==0)
           front=0;


            size++;
            //rear++;
           //if(rear==data.length)
          //rear=0;
          rear=(rear+1)%data.length;
          data[rear]=element;
    }


    public int dequeue()//throws QueueEmptyException//O(1)
    {   /*if(size==0)
        {
        throw new  QueueEmptyException();
        }*/
        int temp=data[rear];
            size--;
            front=(front+1)%data.length;
        if(size==0)
        {   front=-1;
            rear=-1;
        }
            return temp;

    }

    public void doubleq()
    {
        int temp[]=data;
        data=new int[temp.length*2];
        int index=0;
        for(int i=front;i<temp.length;i++,index++)
          data[index]=temp[i];
        for(int i=0;i<=rear;i++,index++)
            data[index]=temp[i];

        front=0;
        rear=temp.length-1;
        //System.out.println();
    }

    public void print()
    {    if(front<rear)
        for(int i=front;i<=rear;i++)
            System.out.print(data[i]+" ");
         else  {
              int i=0;
             for(i=front;i<data.length;i++)
                 System.out.print(data[i]+" ");
             for(i=0;i<=rear;i++)
                 System.out.print(data[i]+" ");
    }
    }
    public static void main(String[] args) {

        QueueUsingArray queue = new QueueUsingArray(3);

            queue.enqueue(10);
            queue.enqueue(10);
            queue.enqueue(10);
            queue.enqueue(10);
            queue.enqueue(10);
            queue.enqueue(10);
            queue.dequeue();
            queue.dequeue();
        queue.print();
        System.out.println();
        System.out.println(queue.front+" "+queue.rear);

            queue.enqueue(88);
            queue.enqueue(88);
        queue.print();
        System.out.println();
        System.out.println(queue.front+" "+queue.rear);
            queue.enqueue(88);
            queue.enqueue(99);
        queue.print();
        System.out.println();
        System.out.println(queue.front+" "+queue.rear);
            queue.enqueue(99);
            queue.print();
        System.out.println();
        System.out.println(queue.front+" "+queue.rear);
    }
}
