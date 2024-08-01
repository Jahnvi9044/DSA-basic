package Queue;

import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty())
            s.push(q.poll());
        while(!s.isEmpty())
            q.add(s.pop());


    }
}
/*Peek() - It will give the head element of the queue. If queue is empty then it will return null.

Poll() - It will give the head element of the queue and will remove the head element from queue. If queue is empty then it will return null.

Remove() - It will give the head element of the queue and will remove the head element from queue. If queue is empty then it will throw an Exception.*/