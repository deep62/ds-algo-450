package lovebabbar;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {

        int[] nums = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        powerSet(nums,0,3,new ArrayList<>(),ans);
        System.out.println(ans);
    }
    public static void  powerSet(int[] nums, int index, int n, ArrayList<Integer> current, List<List<Integer>> ans){
        // base case
        if(index == n){
            ans.add(new ArrayList<>(current));
            return;
        }
        // exclude
        powerSet(nums,index+1, n, current,ans);
        // Include
        int ele = nums[index];
        current.add(ele);
        powerSet(nums,index+1,n,current,ans);
        // backtracking karna current variable list hai, jab current variable string hai to backtracking login nhi karna padega
        // wo automatic handle ho jayega
        current.remove(current.size()-1); // yaha pe current list hai isliye backtracking karna logic likhna padega
    }
}
