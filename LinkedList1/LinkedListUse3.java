package LinkedList1;
import java.util.*;
public class LinkedListUse3 {
    public static Node<Integer> takeinput()
    {   Node<Integer> head=null;
       Node<Integer> tail=null;
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        while(data!=-1)
        {Node<Integer> newNode=new Node<>(data);
             if(head==null)
             {   head=newNode;
                 tail=newNode;}
             else
             {
                 tail.next=newNode;
                 tail=tail.next;
             }
            data=sc.nextInt();

        }
        return head;
    }
    public static Node<Integer> insertion(Node<Integer> head,int data, int pos)
    {Node<Integer> newNode=new Node<>(data);
        Node<Integer> temp=head;
        if(pos==0)
        {
            newNode.next=head;
            head=newNode;
        }
        else
        { int i=0;
            while(i<pos-1)
            { temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        return head;
    }
    public static Node<Integer> delete(Node<Integer> head,int pos)
    {  Node<Integer> temp=head;

        if(pos==0)
        head=head.next;
        else
        {  int i=0;
            while(i<pos-1)
            {
                temp=temp.next;
                i++;
            }
            temp.next=(temp.next).next;

        }
        return head;
    }
    public static void print(Node<Integer> head)
    {  Node<Integer> temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    public static Node<Integer> append(Node<Integer> head, int n)
    {
        //Your code goes here
        Node<Integer> temp=head;
        if(head==null)
        {}
        else
        {   int i=0;
            while(temp.next!=null)
            {
                temp=temp.next;
                i++;
            }
            i++;
            System.out.println("\n"+i);
            int k=i-n;
            Node<Integer> temp2=head;
            temp.next=head;
            int j=0;
            while(j!=k-1)
            {
                temp2=temp2.next;
                j++;
            }
            head=temp2.next;
            temp2.next=null;
        }
        return head;
    }
   /* public static int length(Node<Integer> head)
    {  int count=0;
        Node<Integer> temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        //Your code goes here
        return count;
    }*/
    public static int findNode(Node<Integer> head, int n)
    {
        // Write your code here.

        int i=0;

        Node<Integer> temp=head;
        while(temp!=null)
        {
            if(n==temp.data)
                return i;
            i++;
            temp=temp.next;
        }

        return -1;
    }
    public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1,Node<Integer> head2)
    {
        if(head1==null&&head2==null)
            return null;
        Node<Integer> t3,t1=head1,t2=head2;
        if(t1!=null && t2==null)
            return t1;
        if(t2!=null && t1==null)
            return t2;
        if(head1.data<head2.data)
        {
            t3=head1;
            t1=head1.next;
        }
        else
        {
            t3=head2;
            t2=head2.next;
        }
        while(t1!=null  &&  t2!=null)
        {
            if(t1.data<t2.data)
            {   t3.next=t1;
                t1=t1.next;
                t3=t3.next;
            }
            else
            {   t3.next=t2;
                t2=t2.next;
                t3=t3.next;
            }
        }
        if(t1!=null )
        { t3.next=t1;
           }
        if(t2!=null )
        { t3.next=t2;

        }
        Node<Integer> head=(head1.data<head2.data)?head1:head2;
        return head;
   }
    public static Node<Integer> alternate(Node<Integer> head)
    {
        Node<Integer> temp=head;
        while(true)
        {if(temp==null)
            break;
            temp.next=(temp.next).next;
            temp=temp.next;
            if(temp==null)
                break;
            if(temp.next==null)
                break;
        }
        return head;
    }
    public static Node<Integer> insertanode(int pos,Integer data,Node<Integer> head)
    {    if(pos==0)
        {
        Node<Integer> newNode=new Node<>(data);
        newNode.next=head;
        return newNode;

       }
       head.next=insertanode(pos-1,data,head.next);
        return head;

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

    public static boolean isPalindrome(LinkedList<Integer> head)
    {
       // System.out.println(head.data);

       /* LinkedList<Integer> head1=new LinkedList<>();
        Iterator<Integer> it=head.iterator();
        while(it.hasNext())
        {  head1.add(it.next());

        }*/
        //Your code goes h


//        while(!head.isEmpty())
//        {
//            int a=head.getFirst();
//            int b=head.getLast();
//            if(a==b)
//            {
//                head.removeFirst();
//                if(!head.isEmpty())
//                head.removeLast();
//            }
//            else return false;
//
//        }
       /* System.out.println();
        print(head);
        Node<Integer> temp1=head;
        int n=0;
        while(temp1!=null)
        {   n=n+1;
            temp1=temp1.next;

        }

        System.out.println("No "+n);
        temp1=head;
        Node<Integer> temp2 = rev;
        while(temp1!=null)
        {  if(temp1.data!=temp2.data)
            return false;
            System.out.println(temp1.data+" "+temp2.data);
            temp1=temp1.next;
            temp2=temp2.next;


        }
        return true;*/
        return true;

    }



    public static boolean isPAlin(Node<Integer> head)
    {
        Stack<Integer> stack=new Stack<>();
        Node<Integer> temp=head;

        while(temp!=null)
        {   stack.add(temp.data);
            temp=temp.next;
        }

        temp=head;
        while(temp!=null)
        {
            if(!temp.data.equals(stack.pop()))
                return false;
            temp=temp.next;

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






    public static void main(String[] args) {
        Node<Integer> head1=takeinput();
      //  System.out.println(isPAlin(head1));
//        LinkedList<Integer> l=new LinkedList<>();
//        l.add(10);
//        l.add(10);
//        l.add(10);
//        l.add(10);
//        System.out.println(l);
//        LinkedList<Integer> head=new LinkedList<>();
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the length of Linkedlist");
//        int n=sc.nextInt();
//        for(int i=0;i<n;i++)
//        {int a=sc.nextInt();
//
//        head.add(a);}



        //print(head);
//
        Node<Integer> head2=takeinput();
//        print(head2);
        System.out.println();
        Node<Integer> head=merge(head1,head2);
        print(head);
//
//         head=insertion(head,80,0);// Node<Integer> temp=head;
//         System.out.println("After Intertion of 80 at position 0");
//          print(head);
//         head=delete(head,0);
//         System.out.println("\nAfter Deletion at position 0");
//        print(head);
//        head=append(head,3);
//        print(head);
//        System.out.println();
//        System.out.println("Length of LinkedList"+length(head));
//        System.out.println(findNode(head,80));
//        Node<Integer> h=mergeTwoSortedLinkedLists(head1,head2);
//        //System.out.println(head);
//        alternate(head1);
//        head1=insertanode(3,99,head1);
//        print(head1);
        //System.out.println(isPalindrome(head));


    }
}