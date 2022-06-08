package algoexpert;

import java.util.*;

class TwoNumberSum {
/*
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int indexOne=0;
        int indexTwo=0;
        boolean foundPair=false;
        for(int i =0 ; i < array.length; i++){
            for(int j=i+1 ; j < array.length; j++){
                if((array[i] + array[j])==targetSum){
                    indexOne=i;
                    indexTwo=j;
                    foundPair = true;
                    break;
                }
            }

        }
        if(foundPair){
            return new int[]{array[indexOne],array[indexTwo]};
        }else{
            return new int[]{};
        }


    }
*/

/*
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            int potentialsum = targetSum - array[i];
            if (set.contains(potentialsum)) {
                return new int[]{array[i], potentialsum};
            } else {
                set.add(array[i]);
            }

        }
        return new int[]{};
    }
*/
// 3rd approach

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int left = array[0];
        int right = array[array.length-1];
        int sum=0;
        Arrays.sort(array);
        while(left < right){
            sum = left + right;
            if(sum < targetSum){
                left +=left;
            }else if(sum > targetSum){
                right -= right;
            }else{
                return new int[] {left,right};
            }
        }

        return new int[]{};
    }

}
