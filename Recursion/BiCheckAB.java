package Recursion;
/**
 * Check AB
 * Send Feedback
 * Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:
 * a. The string begins with an 'a'
 * b. Each 'a' is followed by nothing or an 'a' or "bb"
 * c. Each "bb" is followed by nothing or an 'a'
 * If all the rules are followed by the given string, return true otherwise return false.
 * Input format :
 * String S
 * Output format :
 * 'true' or 'false'
 * Constraints :
 * 1 <= |S| <= 1000
 * where |S| represents length of string S.
 * Sample Input 1 :
 * abb
 * Sample Output 1 :
 * true
 * Sample Input 2 :
 * abababa
 * Sample Output 2 :
 * false
 * Explanation for Sample Input 2
 * In the above example, a is not followed by either "a" or "bb", instead it's followed by "b" which results in false to be returned.
 */

import java.util.*;

public class BiCheckAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {//Write your code here
            String st = "";
            System.out.println(chkFor(st));
        }

    }

    public static boolean chkFor(String st) {
        if (st.length()>=1 && st.charAt(0) == 'a')
        {
            if (st.substring(1).equals(""))
                return true;
            else if (st.length() >= 3 && st.substring(1, 3).equals("bb"))
            {
                if (st.substring(3).equals(""))
                    return true;
                return chkFor(st.substring(3));
            }
            else
                return chkFor(st.substring(1));
        }
            return false;
    }


    //May be better :--
    //I guess this has an error , this code will give false for empty String (Which ) is wrong.
    public static boolean checkAB(String input) {

        // Write your code here
        if (input.length() == 0)
            return true;

        if (input.charAt(0) == 'a') {
            if (input.substring(1).length() > 1 && input.substring(1, 3).equals("bb"))
                return checkAB(input.substring(3));
            else
                return checkAB(input.substring(1));
        }
        return false;

    }

//For underStanding purpose
    public static boolean chkFor2(String st)
    {

        if (st.charAt(0) == 'a') {
            if (st.substring(1).equals(""))
                return true;
            else if (st.charAt(1) == 'a')
                return chkFor2(st.substring(1));

            else if (st.length() >= 3 && st.substring(1, 3).equals("bb")) {
                if (st.substring(3).equals(""))
                    return true;
                else if (st.charAt(3) == 'a')
                    return chkFor2(st.substring(3));
                else
                    return false;
            } else
                return false;
        }//closing if
        else
            return false;

       }
}