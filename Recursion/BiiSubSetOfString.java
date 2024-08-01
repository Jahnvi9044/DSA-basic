package Recursion;

import java.util.*;

public class BiiSubSetOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =1;
        while (t-- > 0) {//Write your code here
            String st="abc";
            ArrayList<String> ans=new ArrayList<>();
            Subsequence(st,"",ans);
            System.out.println(ans);
        }


    }
    public static void Subsequence(String st, String out, ArrayList<String> ans)
    {   if(st=="")
        {
            ans.add(out);
            return;
        }

        out=st.charAt(0)+out;
        Subsequence(st.substring(1),out,ans);
        out=out.substring(1);
        Subsequence(st.substring(1),out,ans);


    }
    //Space Complexity of this Function =O(n)//for recursion + ArrayList=O((2^n)*n) therefore the space complexity =O((2^n)*n)
    //Time complexity =No of operations
    //Time C=O(2^n)=>on each level 2^n-1 function calls to total calls =2^0+2^1+2^2+2^3+2^4+...+2^(n-1)
    //                                                                 =(2^n)-1==O(2^n)


    /**SPACE COMPLEXITY
     * Function Call Stack: At any point, there can be at most n recursive calls on the call stack, where n is the length of the input string st.
     *
     * Auxiliary Space: The out string takes O(n) space, as it can contain up to n characters. The ArrayList ans stores all the generated subsequences, which could be up to 2^n in number, each with an average length of n/2. So, the space required for ans is O(2^n * n).
     *
     * Considering both the function call stack space and auxiliary space, the overall space complexity of the code is O(2^n * n).
     *
     * Keep in mind that this code has an issue with string manipulation using the out variable, as Java strings are immutable. It's recommended to use a StringBuilder or similar mutable data structure for efficient string manipulation.
     */

}
