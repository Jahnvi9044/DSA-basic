package Stack;
/*
Minimum bracket Reversal
Send Feedback
For a given expression in the form of a string, find the minimum number of brackets that can be reversed in order to make the expression balanced. The expression will only contain curly brackets.
If the expression can't be balanced, return -1.
Example:
Expression: {{{{
If we reverse the second and the fourth opening brackets, the whole expression will get balanced. Since we have to reverse two brackets to make the expression balanced, the expected output will be 2.

Expression: {{{
In this example, even if we reverse the last opening bracket, we would be left with the first opening bracket and hence will not be able to make the expression balanced and the output will be -1.
Input Format :
The first and the only line of input contains a string expression, without any spaces in between.
Output Format :
The only line of output will print the number of reversals required to balance the whole expression. Prints -1, otherwise.
Note:
You don't have to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the expression.

Time Limit: 1sec
Sample Input 1:
{{{
Sample Output 1:
-1
Sample Input 2:
{{{{}}
Sample Output 2:
1
 */
import java.util.*;

public class ReverseParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* Stack<Character> stack = new Stack<>();
        String st =sc.next();
        char[] ch1 = st.toCharArray();
        int reversal=0;
        for (char ch : ch1)
        {
            if(stack.isEmpty()&&ch=='}')
                stack.push(ch);
            else if(ch=='{' && stack.isEmpty())
                stack.push(ch);
            else if(ch=='{'&& stack.peek()!='}')
                stack.push(ch);
            else if(ch=='}' && stack.peek()=='}')
            {reversal++;
                stack.pop();
            }
            else if(ch=='}'&& stack.peek()=='{')
                stack.pop();
            else if(ch=='{' && stack.peek()=='}')
            {  reversal=reversal+2;
               System.out.println("i am here");
                stack.pop();
            }
               System.out.print(reversal+" ");


    }

        if((stack.size()&1)==1)
            System.out.println(-1);
        else
        {
            int k=stack.size()/2;
            reversal+=k;
            System.out.println(reversal);
        }*/
        Stack<Character> stack = new Stack<>();
        String st = sc.next();
        if(st.length()==0)
            System.out.println(0);
        char[] ch1 = st.toCharArray();
        int reversal=0;
        System.out.println(st.length()+" "+ch1.length);
        if((ch1.length&1)==1)
            System.out.println(-1);
        else{
            for (char ch : ch1)
            {
                if(stack.isEmpty()&&ch=='}')
                    stack.push(ch);
                else if(ch=='{')
                    stack.push(ch);
                else if(ch=='}' && stack.peek()=='{')
                    stack.pop();
                else if(ch=='}'&& stack.peek()=='}')
                    stack.push(ch);


                // System.out.print(reversal+" ");

            }
            System.out.println(stack);
            while(!stack.isEmpty())
            {char c1=stack.pop();
            char c2=stack.pop();
            if(c1==c2)
                reversal++;
            else
                reversal=reversal+2;}
            System.out.println(reversal);
        }
}}


//