package Recursion;
/**
 * Pair Star
 * Send Feedback
 * Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
 * Input format :
 * String S
 * Output format :
 * Modified string
 * Constraints :
 * 0 <= |S| <= 1000
 * where |S| represents length of string S.
 * Sample Input 1 :
 * hello
 * Sample Output 1:
 * hel*lo
 * Sample Input 2 :
 * aaaa
 * Sample Output 2 :
 * a*a*a*a
 */

import java.util.*;

public class AiiiPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0)
        {
            StringBuffer st=new StringBuffer("helloaaaaaaa");
            System.out.println("Pair star: "+StringToInt1(st,0,new StringBuffer("")));
        }


    }

    public  static StringBuffer  StringToInt1(StringBuffer st, int i,StringBuffer out) {
        if (i == st.length())
            return out;

        if ((i<st.length()-1)&&st.charAt(i) == st.charAt(i +1))
        { out=out.append(st.charAt(i));
            out=out.append("x");

        }
        else
        out=out.append(st.charAt(i));
        return StringToInt1(st,i+1,out);

    }


}
