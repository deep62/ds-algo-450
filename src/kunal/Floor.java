package kunal;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int key = 1;
        System.out.println(floor(arr,key,0,arr.length-1));

    }
    // greatest number smaller or equal to target
    static int floor(int[] arr, int key, int s, int e){

        if(s > e){
            return e;
        }
        int mid = s + (e-s)/2;

        if(arr[mid] == key){
            return mid;
        }
        if(key < arr[mid]) {
            return floor(arr, key, s, mid - 1);
        }
        return floor(arr,key,mid+1,e);

    }
}
