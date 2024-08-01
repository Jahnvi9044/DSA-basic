package Recursion;

import java.util.*;

/**
 * All Indices of Number
 * Send Feedback
 * Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in the output array (in increasing order).
 * Do this recursively. Indexing in the array starts from 0.
 * Hint:
 * Try making a helper function with the required arguments and call the helper function from the allIndexes function.
 * Input Format :
 * Line 1 : An Integer N i.e. size of array
 * Line 2 : N integers which are elements of the array, separated by spaces
 * Line 3 : Integer x
 * Output Format :
 * Return the size of the output array
 * Constraints :
 * 1 <= N <= 10^3
 * Sample Input :
 * 5
 * 9 8 10 8 8
 * 8
 * Sample Output :
 * 1 3 4
 */
public class ivAllIndexOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {//Write your code here
            int [] arr={9, 8 ,10, 8};
            int x=8;
            System.out.println("All Index Of x:"+find(arr,  x, arr.length,0,new ArrayList<Integer>()));
        }
    }
    public static ArrayList<Integer> find(int [] arr,int x, int n,int i,ArrayList<Integer> ans)
    {
        if(n==i)
            return ans;
        if(arr[i]==x)
            ans.add(i);
        return find(arr, x,n, i+1,ans);
    }
}

