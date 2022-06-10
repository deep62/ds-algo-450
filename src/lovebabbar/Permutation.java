package lovebabbar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/* Problem statement
*
* https://leetcode.com/problems/permutations/submissions/
* */
public class Permutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = permute(nums);
        result.forEach(System.out::println);
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        permute(nums,ans,index);
        return ans;
    }
    private static void permute(int[] nums,List<List<Integer>> ans, int index){
        // base case
        if(index >= nums.length){
            //ans.add(new ArrayList(Arrays.asList(nums)));
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i : nums){
                temp.add(i);
            }
            ans.add(temp);
            //System.out.print(Arrays.toString(nums));
            return;
        }
        for(int i=index; i < nums.length; i++){
            swap(nums,index,i);
            permute(nums,ans,index+1);
            swap(nums,index,i);
        }
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
