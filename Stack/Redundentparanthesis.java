package Stack;

import java.util.*;

public class Redundentparanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String st = sc.next();
        char[] ch = st.toCharArray();
        for (char ch1 : ch)
        {
            if(((int)ch1>=97 && (int)ch1<=122)||(int)ch1>=65 &&(int)ch1<=90 )
                continue;
            else if(ch1=='(')
                stack.push(ch1);
            else if(ch1==')')
            { if(stack.peek()=='(')
              { // return true;
                  break;
               }
               else
            {
                while(stack.peek()!='(')
                    stack.pop();
                stack.pop();
            }


            }
            else stack.push(ch1);

        }
        if(stack.isEmpty())
            System.out.println(false);
        else System.out.println(true);

    }
}
