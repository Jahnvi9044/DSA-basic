package Recursion;

import java.util.*;

/**
 * Return subset of an array
 * Send Feedback
 * Given an integer array (of length n), find and return all the subsets of input array.
 * Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
 *
 *
 * Note :
 * The order of subsets are not important.
 *
 *
 * Input format :
 *
 * Line 1 : Size of array
 *
 * Line 2 : Array elements (separated by space)
 *
 * Sample Input:
 * 3
 * 15 20 12
 * Sample Output:
 * [] (this just represents an empty array, don't worry about the square brackets)
 * 12
 * 20
 * 20 12
 * 15
 * 15 12
 * 15 20
 * 15 20 12
 */


public class BiiSubsetOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {
            Integer[] arr = {15, 20, 12};
            int[] arr2 = {15, 20, 12};
            ArrayList<Integer> ans = new ArrayList<>();
//            Subsets(arr,ans,0);
//            Subsets2(arr2, ans, 0);
            ArrayList<ArrayList<Integer>> ans2=new ArrayList<ArrayList<Integer>>();
            Subset(arr2,ans2,0,ans);
            System.out.println(ans2);
        }
    }

    public static void Subsets(Integer[] arr, ArrayList<Integer> ans, int i) {
        if (i == arr.length) {
            System.out.println(ans);
            return;
        }

        ans.add(arr[i]);
        Subsets(arr, ans, i + 1);
        /*boolean b=*/
        ans.remove(arr[i]);//Object is being removed here // function also return s boolean
        Subsets(arr, ans, i + 1);
    }

    public static void Subsets2(int[] arr, ArrayList<Integer> ans, int i) {
        if (i == arr.length) {
            System.out.println(ans);
            return;
        }

        ans.add(arr[i]);
        Subsets2(arr, ans, i + 1);
        ans.remove(ans.size() - 1);
        Subsets2(arr, ans, i + 1);

    }

//Return a List of all subsequences


    public static void Subset(int[] arr, ArrayList<ArrayList<Integer>> ans, int i,ArrayList<Integer> smallAns)
    {
        if (i == arr.length)
        {  ans.add(new ArrayList<>(smallAns));
//            System.out.println(ans);
            return;
        }

        smallAns.add(arr[i]);
        Subset(arr, ans, i + 1,smallAns);
        smallAns.remove(smallAns.size() - 1);
        Subset(arr, ans, i + 1,smallAns);

    }
}