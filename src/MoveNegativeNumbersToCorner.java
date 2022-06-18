import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveNegativeNumbersToCorner {

    public static void main(String[] args) {
        int[] arr= { -1, 2, -3,4,-5};
        rearrange(arr,arr.length);
        printArray(arr,arr.length);
    }
    static void rearrange(int arr[], int n)
    {
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    // A utility function to print an array
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
