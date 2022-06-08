package algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {
        int [] nums1 = {1,2};
        int [] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int start;
        double median;
        int end;
        ArrayList<Integer> mergedList = new ArrayList<>();
        for(int num1 : nums1){
            mergedList.add(num1);
        }
        for(int num2 : nums2){
            mergedList.add(num2);
        }
        end = mergedList.size()-1;
        median = findMedian(mergedList,mergedList.size());
        return median;
    }
    private static double findMedian(ArrayList<Integer> mergedList, int size) {
        Collections.sort(mergedList);
        // check even
        if(size % 2 == 0){
            int idx1 = size/2;
            int idx2 = idx1-1;
            return (double) (mergedList.get(idx1)+mergedList.get(idx2))/2;
        }
        //check odd
        else{
            int idx = size/2;
            return mergedList.get(idx);
        }
    }
}
