package Recursion;

import java.util.*;

/**
 * Return all codes - String
 * Send Feedback
 * Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to return the list of all possible codes that can be generated from the given string.
 * Note : The order of codes are not important. And input string does not contain 0s.
 * Input format :
 * A numeric string
 * Constraints :
 * 1 <= Length of String S <= 10
 * Sample Input:
 * 1123
 * Sample Output:
 * aabc
 * kbc
 * alc
 * aaw
 * kw
 */
public class BvReturnAllCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=1;
        while (t-- > 0) {//Write your code here
              int n=1123;
//            System.out.println(helper(2));
              Combinations(n,"");
        }

    }

    public static void Combinations(int n,String out)
    {  if(n<=0) {
        System.out.println(out);
        return ;
    }


        char ch=helper(n%10);
//        System.out.println(out);
        Combinations(n/10,ch+out);

        if(n>=10)
        {
            char ch1=helper(n%100);
            Combinations(n/100,ch1+out);
        }


    }

    public static char helper(int n)
    {  return (char)(n+96);

    }
}
