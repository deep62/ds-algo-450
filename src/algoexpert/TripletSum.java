package algoexpert;

import java.util.*;

class TripletSum {
    public static void main(String[] args) {
        int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
        List<Integer[]> triplets = threeNumberSum(array,0);
        for(Integer[] arr : triplets){
            System.out.println(Arrays.toString(arr));
        }
    }
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        ArrayList<Integer[]> triplets = new ArrayList<Integer[]>();
        Arrays.sort(array);
        for(int i=0; i < array.length-2 ; i++){
            int left = i+1;
            int right = array.length-1;
            while(left < right){
                int currentSum = array[i] + array[left] + array[right];
                if(currentSum == targetSum){
                    Integer[] triplet ={array[i],array[left],array[right]};
                    triplets.add(triplet);
                    left++;
                    right--;
                }else if(currentSum >targetSum){
                    right = right-1;
                }else if(currentSum < targetSum){
                    left = left+1;
                }

            }
        }
        return triplets;
    }
}

