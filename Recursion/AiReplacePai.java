package Recursion;
/**
 * Replace pi (recursive)
 * Send Feedback
 * Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
 * Constraints :
 * 1 <= |S| <= 50
 * where |S| represents the length of string S.
 * Sample Input 1 :
 * xpix
 * Sample Output :
 * x3.14x
 * Sample Input 2 :
 * pipi
 * Sample Output :
 * 3.143.14
 * Sample Input 3 :
 * pip
 * Sample Output :
 * 3.14p
 * Constraints:-
 * 1<=|S|<=50
 */

import java.util.*;

public class AiReplacePai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0)
        {String st="pip";
            System.out.println(ReplacePai(st,0,""));
        }

    }

    public static String ReplacePai(String st, int i , String out)
    {   if(i==st.length())
            return out;
        if(st.charAt(i)=='p'&&(i<st.length()-1)&&st.charAt(i+1)=='i') {
            out = out + "3.14";
            i++;
        }
        else
            out=out+st.charAt(i);
        return ReplacePai(st,i+1,out);
    }
}
