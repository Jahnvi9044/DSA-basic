package HashMap;

import java.util.*;

public class arrange2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {//Write your code here
          int[] arr={1,3,4,2,1,2,3,2,3,5,3};
            System.out.println(findMatrix(arr));
        }

    }


    public static  List<List<Integer>> findMatrix(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans =new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {

            if (map.containsKey(nums[i])) {
                int k = map.get(nums[i]);
                k++;
                map.put(nums[i], k);
            } else
                map.put(nums[i], 1);

        }

        while (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            ArrayList<Integer> arr = new ArrayList<>();
            while (it.hasNext()) {
                Map.Entry<Integer,Integer> me = (Map.Entry)it.next();
                if (me.getValue() > 0) {
                    arr.add(me.getKey());
                    int k = me.getValue();
                    k--;
                    if (k > 0)
                        map.put(me.getKey(), k);
                }

            }
             ans.add(new ArrayList<>(arr));
        }

       return ans;
    }
}