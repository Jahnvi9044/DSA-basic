package Recursion;

import java.util.*;

public class iCheckSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {//Write your code here
       int [] arr={2,5,1,3,4};
            System.out.println("The Array "+Arrays.toString(arr)+" is Sorted :"+chk2(arr,arr.length,0));
        }

    }

    public static boolean chk(int [] arr,int  n,int  i) {
        if(n-1==i)
            return true;
        boolean smallAns=chk(arr,n,i+1);
        if(!smallAns || arr[i]>arr[i+1])
            return false;
        else return true;

    }


    //BETTER
    public static boolean chk2(int [] arr,int  n,int  i) {
        if(n-1==i)
            return true;
        if(arr[i]>arr[i+1])
            return false;
        boolean smallAns=chk2(arr,n,i+1);
        if(!smallAns)
            return false;
        else return true;

    }
}
