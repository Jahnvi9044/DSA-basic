package Queue;

import java.util.*;

public class IterateOverQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {//Write your code here
           Queue<Integer> q=new LinkedList<>();
           q.add(10);
           q.add(20);
           q.add(30);
           q.add(40);
           queueTraversal(q);
        }

    }
    //User function Template for Java

    public static void queueTraversal(Queue<Integer>q)
    {
//        q.forEach(x->System.out.print(x+" "));

        Iterator it=q.iterator();
        while(it.hasNext())
        {

            System.out.print(it.next()+" ");
        }


    }
}
