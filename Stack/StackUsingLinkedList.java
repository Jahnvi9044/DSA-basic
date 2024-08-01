package Stack;


import LinkedList1.Node;
//import LinkedList1.*;

public class StackUsingLinkedList<T> {
    private int size;
    private Node<T> head;
   public  StackUsingLinkedList()
    {
        size=0;
        head=null;
    }
    T top()
    {
        return head.data ;
    }
    int size()
    {  return size;
    }
    T pop()throws StackEmptyException
    {    if(head==null)
        {StackEmptyException e= new StackEmptyException();
          throw e;
        }
        Node<T> temp=head;
        head=head.next;
        size--;
        return temp.data;

    }
    void push(T element)
    { Node<T> newNode=new Node<>(element);

       if(head==null)
       {   head=newNode;
           }

       else
       {
           newNode.next=head;
           head=newNode;

       }
       size++;

    }
    boolean isEmpty()
    {   if(size==0)
        return true;
        else return false;
    }
  /*  public static void main(String[] args) {
       LinkedListUse3 ob=new LinkedListUse3();
       Node<Integer> head = ob.takeinput();

    }*/
}
