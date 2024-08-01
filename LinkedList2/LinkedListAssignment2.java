package LinkedList2;

import LinkedList1.LinkedListUse3;
import LinkedList1.Node;

public class LinkedListAssignment2 {
    public static void main(String[] args) {
        LinkedListUse3 ob=new LinkedListUse3();
        Node<Integer> head=ob.takeinput();
       // System.out.println(findNodeRec(head,99));
        head=evenAfterOdd(head);
        ob.print(head);

    }
    public static int findNodeRec(Node<Integer> head, int n)
    {
        //Your code goes here

        return findNodeRec1(head,0, n);

    }
    public static int findNodeRec1(Node<Integer> head,int i,int n)
    {
        if(head==null)
            return -1;
        if(head.data.equals(n))
            return i;
        i++;
        return findNodeRec1(head.next,i,n);
    }

    public static Node<Integer> evenAfterOdd(Node<Integer> head)
    {  Node<Integer> head1=null,head2=null;
        Node<Integer> temp=head;
        if((temp.data & 1)==1)
            head1=temp;
        else
            head2=temp;
            temp=temp.next;
            Node<Integer> even=head2,odd=head1;

            while(temp!=null)
            {   if((temp.data & 1)==1)
                {
                    odd.next = temp;
                    odd=odd.next;
                }
                else
                {  even.next=temp;
                   even=even.next;
                }
                temp=temp.next;
            }
            odd.next=head2;
            even.next=null;
        return head1;

    }

    public static Node<Integer> everynnode()
    {

        return new Node<Integer>(0);
    }


}
