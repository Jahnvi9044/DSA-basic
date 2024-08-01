package Recursion;

import java.util.*;

/**
 * First Index of Number
 * Send Feedback
 * Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
 * First index means, the index of first occurrence of x in the input array.
 * Do this recursively. Indexing in the array starts from 0.
 * Input Format :
 * Line 1 : An Integer N i.e. size of array
 * Line 2 : N integers which are elements of the array, separated by spaces
 * Line 3 : Integer x
 * Output Format :
 * first index or -1
 * Constraints :
 * 1 <= N <= 10^3
 * Sample Input :
 * 4
 * 9 8 10 8
 * 8
 * Sample Output :
 * 1
 */
public class iiFindFirstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {//Write your code here
            int[] arr={9,9,9,9,9,9,9,8,10,8};
            int x=8;
            System.out.println(find(arr,x,0,arr.length));
        }


    }

    public static int find(int[] arr, int x,int i, int n)
    {
        if(n==i)
            return -1;

        if(arr[i]==x)
            return i;
        else return find(arr,x,i+1,n);

    }

}
