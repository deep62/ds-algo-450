package algoexpert;

import java.util.Arrays;

public class TandemBicycle {
    public static void main(String[] args) {
        int[]redShirtSpeeds = {5,5,3,9,2};
        int[] blueShirtSpeeds = {3,6,7,2,1};
        boolean fastest = true;
        int output = tandemBicycle(redShirtSpeeds,blueShirtSpeeds,true);
        System.out.println(output);

    }
    public static void reverseInPlace(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);
        // fastest - pair max with max
        // slowest - pair max with min
        if(!fastest){
            reverseInPlace(redShirtSpeeds);
        }
        int speedSum = 0;
        int size = redShirtSpeeds.length;
        for(int i = 0; i < size; i++){
            int speed1 = redShirtSpeeds[i];
            int speed2 = blueShirtSpeeds[size-1-i];
            speedSum = speedSum + Math.max(speed1,speed2);
        }
        return speedSum;
        //return -1;
    }
}
