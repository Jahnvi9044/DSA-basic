package Recursion;

import java.util.*;

/**
 * String to Integer
 * Send Feedback
 * Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
 * Input format :
 * Numeric string S (string, Eg. "1234")
 * Output format :
 * Corresponding integer N (int, Eg. 1234)
 * Constraints :
 * 0 < |S| <= 9
 * where |S| represents length of string S.
 * Sample Input 1 :
 * 00001231
 * Sample Output 1 :
 * 1231
 * Sample Input 2 :
 * 12567
 * Sample Output 2 :
 * 12567
 */
public class AiStringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {//Write your code here
            StringBuffer st=new StringBuffer("00001231");
            System.out.println("Sum Of Digits : "+StringToInt1(st,0,st.length()-1,1));
        }


    }

    public  static int  StringToInt1(StringBuffer st, int n, int i,int x)
    {  if(i<0) return n;
        char ch=st.charAt(i);
        n+=((int)ch-48)*x;
        x*=10;
        return StringToInt1(st,n,i-1,x);
    }


}
