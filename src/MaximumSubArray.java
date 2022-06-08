import java.util.Arrays;
import java.util.Collections;

class MaximumSubArray {

        Integer[] nums = {-1,2,3,-5,4};
        public int maxSubArray(int[] nums) {
            int maxCurrent = nums[0];
            int maxGlobal = nums[0];
            for(int i=1 ; i < nums.length ;i++){
                maxCurrent = Math.max(nums[i],maxCurrent+nums[i]);
                if(maxCurrent > maxGlobal){
                    maxGlobal = maxCurrent;
                }
            }

          return maxGlobal;
        }

}
