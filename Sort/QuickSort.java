package Sort;

import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1 ;
        while(t-- > 0)
        {

            //Driver Code
            int[] arr={18,2,4,0,1,6,7,18,67,5};
            int n=arr.length;
            quickSort(0,arr.length-1,arr,arr.length);
            System.out.println("Sorted Array"+Arrays.toString(arr));
//            System.out.println(findPivotPos(0,n-1,arr,n));
//            System.out.println(Arrays.toString(arr));
        }

    }

    public static void quickSort( int l, int r ,int[]arr, int n)
    {    if(l>r)
           return ;
        int pivot=findPivotPos(l,r,arr,n);
        quickSort(l,pivot-1,arr,n);
        quickSort(pivot+1,r,arr,n);

    }
    public static int findPivotPos(int l,int r,int[]arr,int n)
    {   int pos=l;
        int pivot=arr[l];
        for(int i=l+1;i<=r;i++)
        {
            if(arr[i]<pivot)
                pos++;
        }
        int temp=arr[l];
        arr[l]=arr[pos];
        arr[pos]=temp;
      //  System.out.println(Arrays.toString(arr)+"hjh");
        int i=l,j=r;
        while(i<pos && j>pos)
        {
            if(arr[i]<pivot)
                i++;
            else if(arr[i]>=pivot)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
//        System.out.println(Arrays.toString(arr));
        return pos;
    }


}
