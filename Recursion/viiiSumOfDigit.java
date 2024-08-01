package Recursion;

import java.util.*;

/**
 * Sum of digits (recursive)
 * Send Feedback
 * Write a recursive function that returns the sum of the digits of a given integer.
 * Input format :
 * Integer N
 * Output format :
 * Sum of digits of N
 * Constraints :
 * 0 <= N <= 10^9
 * Sample Input 1 :
 * 12345
 * Sample Output 1 :
 * 15
 * Sample Input 2 :
 * 9
 * Sample Output 2 :
 * 9
 */

public class viiiSumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {//Write your code here
            int n= 12345;
            System.out.println("Sum Of Digits : "+SumOfDigit(n));
        }

    }

    public static int SumOfDigit(int n)
    { if(n<=0)
        return 0;
       return n%10+SumOfDigit(n/10);
    }
}
