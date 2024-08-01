package Stack;

import java.util.*;

public class StackUsingLinkedListUse {
    public static void main(String[] args) {
       StackUsingLinkedList stack=new StackUsingLinkedList();
       stack.push(8);
       stack.push(0);

        try{
            System.out.println(stack.pop() );
            System.out.println(stack.pop());
        }
        catch(StackEmptyException o)
        {
            System.out.println("stack is empty");
        }


    }
}
