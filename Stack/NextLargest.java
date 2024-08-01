package Stack;

import java.util.*;
//Striver NextLargest
public class NextLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {


//             [1,2,1]
//            Output: [2,-1,2]


//            [1,2,3,4,3]
//            Output: [2,3,4,-1,4]
            nextLargestArray();

        }

    }

    //This is a general next Largest Array
    public static void nextLargestArray() {
        int[] ans = new int[5];
        int[] arr = {1, 2, 3, 4, 3};
        Stack<Integer> stk = new Stack<>();
        ans[4] = -1;
        stk.push(arr[4]);
        for (int i = 3; i >= 0; i--) {
//            if (stk.peek() > arr[i])
//                ans[i] = stk.peek();
            while (!stk.isEmpty() && stk.peek() < arr[i])
                stk.pop();
            if (stk.isEmpty()) {
                ans[i] = -1;
            }
            else ans[i] = stk.peek();
            stk.push(arr[i]);
        }
        for (int i : ans)
            System.out.print(i + " ");
    }


    //    NextLargest Array Circular
    public static void nextLargest2() {
//           [1,2,1]
//            Output: [2,-1,2]

//            [1,2,3,4,3]
//            Output: [2,3,4,-1,4]

        int[] arr = {2, 10, 12, 1, 11};
        int n = arr.length;
        int[] ans = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        ans[4] = -1;
        stk.push(arr[4]);
        for (int i =  2*n-1 ;i>= 0; i--) {
            if (stk.peek() > arr[i%n])
                ans[i%2] = stk.peek();
            while (!stk.isEmpty() && stk.peek() <= arr[i%n])
                stk.pop();
            if (stk.isEmpty()) {
                ans[i%n] = -1;
            } else ans[i%n] = stk.peek();
            stk.push(arr[i%n]);
        }
        for (int i : ans)
            System.out.print(i + " ");
    }
}












