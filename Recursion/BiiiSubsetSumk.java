package Recursion;

import java.util.*;

/**
 * Return subsets sum to K
 * Send Feedback
 * Given an array A of size n and an integer K, return all subsets of A which sum to K.
 * Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
 *
 *
 * Note :
 * The order of subsets are not important.
 *
 *
 * Input format :
 * Line 1 : Integer n, Size of input array
 * Line 2 : Array elements separated by space
 * Line 3 : K
 * Constraints :
 * 1 <= n <= 20
 * Sample Input :
 * 9
 * 5 12 3 17 1 18 15 3 17
 * 6
 * Sample Output :
 * 3 3
 * 5 1
 */
public class BiiiSubsetSumk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {//Write your code here
            int[] arr={5, 12, 3 ,17 ,1 ,18, 15 ,3 ,17};
            int n=9;
            int x=6;

            Subset(arr,0,x,0,new ArrayList<Integer>());
        }

    }
    public static void Subset(int[] arr, int i,int x, int sum,ArrayList<Integer> ans)
    {  if(arr.length==i)
       {  if(sum==x)
            System.out.println(ans);
           return;
       }
       sum+=arr[i];
       ans.add(arr[i]);
       Subset(arr,i+1,x,sum,ans);
       ans.remove(ans.size()-1);
       sum-=arr[i];
       Subset(arr,i+1,x,sum,ans);


    }
}
