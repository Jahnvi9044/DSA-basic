package Stack;

public class StackUsingArray {

    private int data[];
    private int top;
     public StackUsingArray()
     {data=new int[10];
         top=-1;


     }
     public StackUsingArray(int capacity)
     {
         data=new int[capacity];
         top=-1;

     }
     public boolean isEmpty()
     {
         if(top==-1)
       return true;
         else return false;

     }
     public int top() //throws StackEmptyException
     {
        /* if(size()==0)
         {
             StackEmptyException e=new StackEmptyException();
             throw e;
         }*/
         return data[top];
     }
     public int size()
     {
         return (top+1);
     }
     public void push(int element) //throws StackFullException
     {  if(size()==data.length)
       {
        // StackFullException es=new StackFullException();
        // throw es;

           //double the array size
           int[] temp=data;
           data=new int[temp.length*2];
           for(int i=0;i<temp.length;i++)
           {  data[i]=temp[i];

           }


       }
        top++;
         data[top]=element;


     }
     public int pop()// throws StackEmptyException
     {

         /*if(top==-1)
         {
             StackEmptyException e=new StackEmptyException();
             throw e;

         }

          */
         int temp=data[top];
         top--;
         return temp;
     }

}
