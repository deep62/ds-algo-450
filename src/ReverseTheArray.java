import java.util.Arrays;

public class ReverseTheArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println("array "+ Arrays.toString(arr));
        reverseArray(0,arr.length-1,arr);
        System.out.println("Reversed array "+ Arrays.toString(arr));


    }
   static void reverseArray(int start, int end,int[] arr){
        while (start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }


    }
}
