package gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class GFGSolution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        ArrayList<Integer> list = new ArrayList();
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        ArrayList<Integer> repeatedIndexes = new ArrayList();
        boolean found = false;
        for(int i=0 ; i < arr.length; i++){
            if(!hmap.containsKey(arr[i])){
                //list.add(arr[i]);
                hmap.put(arr[i],i);
            }else{
                found = true;
                repeatedIndexes.add(hmap.get(arr[i]));
            }
        }

        Collections.sort(repeatedIndexes);

        if(found == true){
            return repeatedIndexes.get(0);
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4};
        System.out.print(firstRepeated(arr,5));
    }
}