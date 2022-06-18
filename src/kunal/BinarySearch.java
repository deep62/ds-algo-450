package kunal;

public class BinarySearch {
    // don not over think - over think after solving the problem to understand it better

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,55,66,78};
        int key = 4;
        System.out.println(binarySearch(arr,key,0,arr.length-1));

    }
    static int binarySearch(int[] arr, int key, int s, int e){

        if(s > e){
            return -1;
        }
        int mid = s + (e-s)/2;

        if(arr[mid] == key){
            return mid;
        }
        if(key < arr[mid]) {
            return binarySearch(arr, key, s, mid - 1);
        }
        return binarySearch(arr,key,mid+1,e);

    }
}
