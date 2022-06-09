package lovebabbar;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,1,6,9,-1,0};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void quickSort(int[] arr ,int l, int r ){
        // base case
        // if array length is zero or 1 then return
        //System.out.print(Arrays.toString(arr));
        if(l>=r){
            return;
        }
        int p = partition(arr,l,r);
        quickSort(arr,l,p-1);
        quickSort(arr,p+1,r);
    }
    private static int partition(int[] arr, int l, int r) {
        int pivot = arr[l];
        int cnt = 0;
        for(int i=l+1; i <= r ;i++){
            if(arr[i]<= pivot){
                cnt++;
            }
        }
        int pivotPos = l+cnt;
        swap(arr,l,pivotPos);
        int i = l;
        int j = r;
        while(i < pivotPos && j > pivotPos){
            while(arr[i] < pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }
            if(i < pivotPos && j > pivotPos){
                swap(arr, i++,j--);
            }
        }
        return pivotPos;
    }
    private static void swap(int[] arr, int l, int pivotPos) {
       int temp = arr[l];
       arr[l] = arr[pivotPos];
       arr[pivotPos] = temp;
    }
}
