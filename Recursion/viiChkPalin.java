package Recursion;

import java.util.*;

/**
 * Check Palindrome (recursive)
 * Send Feedback
 * Check whether a given String 'S' is a palindrome using recursion.
 *
 *
 * Return true or false.
 *
 *
 * Note:
 * You don’t need to print anything. Just implement the given function.
 * Example:
 * Input: s = "racecar"
 * Output: true
 * Explanation: "racecar" is a palindrome.
 * Input Format:
 * The first and only line of the input contains string S.
 * Output format:
 * Return a boolean value True or False.
 * Sample Input 1:
 * abbba
 * Sample Output 1:
 * true
 * Explanation Of Sample Input 1 :
 * “abbba” is a palindrome
 * Sample Input 2:
 * abcd
 * Sample Output 2:
 * false
 * Explanation Of Sample Input 2 :
 * “abcd” is not a palindrome.
 * Constraints:
 * 0 <= |S| <= 10^6
 * where |S| represents the length of string S.
 */
public class viiChkPalin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0)
        {
           String st="abbbba";
           String st2="abab";
            System.out.println(isPalin(st,0,st.length()));
            System.out.println(isPalin(st2,0,st2.length()));
        }

    }
  //Time Complexity=O(n/2)==O(n)
    //Space Complexity=O(n/2)
    public static boolean isPalin(String st, int i, int n)
    {
        if(i>=n/2)
            return true;
        if(st.charAt(i)!=st.charAt(n-i-1))
            return false;
        else return isPalin(st,i+1,n);
    }
}
