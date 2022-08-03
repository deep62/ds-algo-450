package leetcode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        rotate(arr,3);
        System.out.println(Arrays.toString(arr));
    }
        public static void rotate(int[] nums, int k) {
            int count = 0;
            while(count < k){
                int last = nums[nums.length-1];
                for(int i=nums.length-1; i >0  ;i--){
                    nums[i] = nums[i-1];
                }
                nums[0] = last;
                count++;
            }
        }
}
