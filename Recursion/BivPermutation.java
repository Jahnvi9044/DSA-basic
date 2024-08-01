package Recursion;

import java.util.*;

/**
 * Return Permutations - String
 * Send Feedback
 * Given a string S, find and return all the possible permutations of the input string.
 * Note 1 : The order of permutations is not important.
 * Note 2 : If original string contains duplicate characters, permutations will also be duplicates.
 * Input Format :
 * String S
 * Output Format :
 * All permutations (in different lines)
 * Sample Input :
 * abc
 * Sample Output :
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 */
public class BivPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {//Write your code here
            StringBuffer st = new StringBuffer("abc");
            Combination(st,0,st.length());
        }

    }

    public static void Combination(StringBuffer st ,int i,int n )
    {
        if(i==n)
            System.out.println(st);

        for( int j=i;j<st.length();j++)
        {
            swap(i, j, st);
            Combination(st, i + 1, n);
            swap(i, j, st);
        }
    }

    public static void swap(int i,int j, StringBuffer st)
    {   char chi=st.charAt(i);
        char chj=st.charAt(j);
        st.setCharAt(j,chi);
        st.setCharAt(i,chj);

    }
}
//      abc 3!/2!==3*2/3