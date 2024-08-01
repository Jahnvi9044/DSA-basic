package Recursion;

import java.util.*;
import java.util.function.DoubleToIntFunction;

/**
 * Remove X
 * Send Feedback
 * Given a string, compute recursively a new string where all 'x' chars have been removed.
 * Input format :
 * String S
 * Output format :
 * Modified String
 * Constraints :
 * 1 <= |S| <= 10^3
 * where |S| represents the length of string S.
 * Sample Input 1 :
 * xaxb
 * Sample Output 1:
 * ab
 * Sample Input 2 :
 * abc
 * Sample Output 2:
 * abc
 * Sample Input 3 :
 * xx
 * Sample Output 3:
 */
public class AiiRemoveX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =1;
        while (t-- > 0)
        {   StringBuffer st= new StringBuffer("xaxb");
            System.out.println(remove(st,0,st.length(),new StringBuffer("")));

        }

    }

    public static StringBuffer remove(StringBuffer st,int i, int n,StringBuffer out) {

        if(i==n)
            return out;
        if(st.charAt(i)!='x')
             out=out.append(st.charAt(i));
        return remove(st,i+1,n,out);

    }
}
