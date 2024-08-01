import java.util.*;

public class testModulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {//Write your code here
            int a = sc.nextInt();
            int b = sc.nextInt();
            Integer [] arr = {12,11,1,3,4,5,6,7,23,43,56,76};
            int k =5;
            Arrays.sort(arr,0,5);
            Arrays.sort(arr,5,arr.length,Collections.reverseOrder());

            System.out.println(Arrays.toString(arr));
        }

    }
}
