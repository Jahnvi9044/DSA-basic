package Queue;

import java.util.*;

public class QueueCollection {
    public static void main(String[] args) {

   Queue<Integer> q= new LinkedList<>();
   q.add(88);
   q.add(88);
   q.add(88);
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.poll());//dequeue
        System.out.println(q.isEmpty());
    }
}
