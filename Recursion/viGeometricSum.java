package Recursion;

import java.util.*;

/**
 * Geometric Sum
 * Send Feedback
 * Given k, find the geometric sum i.e.
 * 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
 * using recursion.
 * Input format :
 * Integer k
 * Output format :
 * Geometric sum (unto 5 decimal places)
 * Constraints :
 * 0 <= k <= 1000
 * Sample Input 1 :
 * 3
 * Sample Output 1 :
 * 1.87500
 * Sample Input 2 :
 * 4
 * Sample Output 2 :
 * 1.93750
 * Explanation for Sample Input 1:
 * 1+ 1/(2^1) + 1/(2^2) + 1/(2^3) = 1.87500
 */
public class viGeometricSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =1;
        while (t-- > 0)
        {//Write your code here
            int n=3;
            System.out.printf("%.5f",compute(n));
            System.out.println();
            System.out.printf("%.5f",compute(n,1,0));
        }

    }

    public static double compute(int n)
    {   if(n==0)
           return 1;
        return 1/Math.pow(2,n)+compute(n-1);

    }

    public static double compute(int n,int x,int i)
    {
        if(n==i)
        {
          return 1;}
        x*=2;
        return (double)1/x+compute(n,x,i+1);

        }
    }

