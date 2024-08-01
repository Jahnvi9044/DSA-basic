package Queue;

import java.util.*;

public class QueueUsing2Stacks<T> {

    Stack<T> s1;
    Stack<T> s2;

    public QueueUsing2Stacks()
    {s1=new Stack<>();
     s2=new Stack<>();
    }
    int size(){
        return s1.size();

    }
    boolean isEmpty()
    {
        if(s1.isEmpty())
            return true;
        else return false;

    }
    T top()
    {
        if(s1.size()==0)
            return null;
        else
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());

            }
            T temp= s2.peek();
            while(!s2.isEmpty())
            { s1.push(s2.pop());}
                return temp;

        }

    }

    public void enqueue(T data)
    {
        s1.push(data);

    }
    public T dequeue()
    {
        while(!s1.isEmpty())
            s2.push(s1.pop());


        T temp=s2.pop();
        while(s2.isEmpty())
            s1.push(s2.pop());
        return temp;
    }
    public void print()
    {
        System.out.print(s1);

    }
    public static void main(String[] args) {
        QueueUsing2Stacks<Integer> ob =new QueueUsing2Stacks<Integer>();
        ob.enqueue(100);
        ob.enqueue(100);
        ob.enqueue(100);
        ob.enqueue(100);
        //System.out.println(ob.print());
        ob.enqueue(100);

        ob.dequeue();
        ob.dequeue();
        ob.dequeue();
        ob.dequeue();
    }
}










