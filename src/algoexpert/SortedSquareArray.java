package algoexpert;

public class SortedSquareArray {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 5, 6, 8, 9};
        sortedSquaredArray(array);
    }

    static public int[] sortedSquaredArray(int[] array) {
        int smallestIndex = 0;
        int largestIndex = array.length-1;
        int[] outputArray = new int[array.length];
        for(int i=array.length-1 ; i>= 0; i--){
            int smallerstVal = array[smallestIndex];
            int largestVal= array[largestIndex];
            if(Math.abs(smallerstVal) > Math.abs(largestVal)){
                outputArray[i] = smallerstVal * smallerstVal;
                smallestIndex++;
            }
            else{
                outputArray[i] = largestVal * largestVal;
                largestIndex--;
            }

        }
        return outputArray;

    }



}
