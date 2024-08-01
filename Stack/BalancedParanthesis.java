package Stack;

import java.util.*;

public class BalancedParanthesis {
    public static void main11(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        char[] ch=st.toCharArray();
        for(char ch1:ch)
        {
            if(ch1!=')')
                stack.push(ch1);
            else if(ch1==')' && !stack.isEmpty())
            {
                if(stack.top()=='(')
                    stack.pop();
            }
            else if(ch1==')' && stack.isEmpty())
            {stack.push(ch1);
                break;}
        }
        if(stack.isEmpty())
            System.out.println(true);
        else System.out.println(false);

    }
    public static void main2(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        char[] ch = st.toCharArray();
        for (char ch1 : ch)
        {   if(ch1=='('||ch1=='{'||ch1=='[')
               stack.push(ch1);
            else if(ch1==')'||ch1==']'||ch1=='}')
             {     if(stack.isEmpty())
                   {
                     stack.push(ch1);
                     break;
                   }
                   else if(ch1==')' && stack.top()=='(')
                      stack.pop();
                   else if(ch1=='}' && stack.top()=='{')
                      stack.pop();
                   else if(ch1==']' && stack.top()=='[')
                      stack.pop();
                   else break;


             }}
            if(stack.isEmpty())
                System.out.println(true);
            else System.out.println(false);
    }}