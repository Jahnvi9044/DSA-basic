package Stack;

import java.util.*;

public class RedundentP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String expression = sc.next();
        System.out.println(checkRedundantBrackets(expression));
    }
    public static boolean checkRedundantBrackets(String expression) {
        //Your code goes here
        int count=0;
        int opFlag=0;
        char[] arr=expression.toCharArray();
        Stack <Character> stk=new Stack<>();
        for(char ch:arr)
        {

            if(!stk.isEmpty() && ch==')') {
                while(stk.peek()!='(')
                { char st=stk.peek();
                    if(st=='+'||st=='-'||st=='*'||st=='!'||st=='/'||st=='%'||st=='=')
                    { opFlag=1;
//                        System.out.println(st);
                    }

                    stk.pop();

                }
                if( opFlag==1)
                {  opFlag=0;
                    stk.pop();

                }
                else  {
                    return true;
                }
            }


           else if(stk.isEmpty() && ch==')')
               return true;

           else stk.push(ch);

        }


        if(!stk.isEmpty())
        {
            return true;
        }


        return false;

    }
}


