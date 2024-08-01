package LinkedList1;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        LinkedListUse3 ob=new LinkedListUse3();
        Node<Integer> head=ob.takeinput();

        System.out.println(isPalindrome(head));
    }


    public static boolean isPalindrome(Node<Integer> head)
    {
        //Your code goes here
        Node<Integer> rev=reverse(head);
        Node<Integer> temp1=head;
        int n=0;
        while(temp1!=null)
        {n++;
            temp1=temp1.next;
        }
        temp1=head;
        Node<Integer> temp2 = rev;
        for(int i=0;i<n;i++)
        {  if(temp1.data!=temp2.data)
            return false;
            System.out.println(temp1.data+" "+temp2.data);
            temp1=temp1.next;
            temp2=temp2.next;


        }
        return true;

    }
    public static Node<Integer> reverse(Node<Integer> head )
    {
        if (head == null || head.next == null)
        {

            return head;
        }
        Node<Integer> finalNode = reverse(head.next);
        Node<Integer> temp=head.next;
        temp.next = head;
        head.next = null;
        return finalNode;
    }



}