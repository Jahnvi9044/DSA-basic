package Recursion;

import java.util.*;

/**
 * Print Keypad Combinations Code
 * Send Feedback
 * Given an integer n, using phone keypad find out and print all the possible strings that can be made using digits of input n.
 * Note :
 * The order of strings are not important. Just print different strings in new lines.
 * Input Format :
 * Integer n
 * Output Format :
 * All possible strings in different lines
 * Constraints :
 * 1 <= n <= 10^6
 * Sample Input:
 * 23
 * Sample Output:
 * ad
 * ae
 * af
 * bd
 * be
 * bf
 * cd
 * ce
 * cf
 */
public class BviKeyPadProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {//Write your code here
            int n=234;
            System.out.println( Combination(n,""));
        }

    }

    public static int Combination(int n, String st)
    {
        if(n<=0)
        {
            System.out.println(st);
            return 1;
        }

        char [] charArray=helper(n%10).toCharArray();
        int c=0;
        for(int i=0;i<charArray.length;i++)
        {
            c+=Combination(n/10,charArray[i]+st);
        }
        return c;
    }

    public static String helper(int n)
    {  if(n==2)
        return "abc";
        else if (n==3)
            return "def";
        else if (n==4)
            return "ghi";
    else if (n==5)
        return "jkl";
    else if (n==6)
        return "mno";
    else if (n==7)
        return "pqr";
    else if (n==8)
        return "stu";
    else if (n==9)
        return "vw";
    else
        return "xyz";
    }
}
