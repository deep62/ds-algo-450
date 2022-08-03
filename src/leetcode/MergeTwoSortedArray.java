package leetcode;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int idx = 0;
        int[] output = new int[m+n];

        System.out.println("before"+Arrays.toString(nums1));

        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                output[idx++] = nums1[i++];
                System.out.println(Arrays.toString(nums1));
            }else{
                output[idx++] = nums2[j++];
                System.out.println(Arrays.toString(nums1));
            }

        }
        while(i < m){
            System.out.println("i wale while loop me aaaya");
            output[idx++] = nums1[i++];
        }

        while(j < n){
            System.out.println("j wale while loop me aaya");
            System.out.println(Arrays.toString(nums2));
            output[idx++] = nums2[j++];
        }
        //System.out.println(Arrays.toString(output));
        for(int k=0; k < nums1.length ; k++){
            nums1[k] = output[k];
        }
        System.out.println(Arrays.toString(output));
    }
}
