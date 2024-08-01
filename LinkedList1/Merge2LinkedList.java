package LinkedList1;

import java.util.*;

public class Merge2LinkedList {
    public static void main(String[] args) {
       LinkedListUse3 ob =new LinkedListUse3();
       Node<Integer> head1=ob.takeinput();
       Node<Integer> head2=ob.takeinput();
       ob.print(merge(head1,head2));

    }
    public static Node<Integer>  merge(Node<Integer> head1,Node<Integer> head2)
    {
        Node<Integer> t1=head1;
        Node<Integer> t2=head2;
        Node<Integer> t3=head1;
        if(head1.data<head2.data)
        {
            t3=head1;
            t1=t1.next;
        }
        else
        {
            t3 = head2;
            t2=t2.next;
        }


        while(t1!=null&&t2!=null)
        {
            if(t1.data<t2.data)
            {
                t3.next = t1;
                t1=t1.next;
                t3=t3.next;

            }
            else
            {
                t3.next= t2;
                t2=t2.next;
                t3=t3.next;

            }

        }
        if(t2!=null)
            t3.next=t2;
        else if(t1!=null)
            t3.next=t1;
        return (head1.data<head2.data)?head1:head2;
    }
}
