import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static int minSum(List<Integer> num, int k) {
        int sum =0;
        for(int i=0; i< 4  ;i++){
            Collections.sort(num);
            double max = num.get(num.size()-1)/2;
            int maxItem = (int)Math.ceil(max);
            num.set(num.size()-1,maxItem);
        }
        for (int i : num){
            sum = sum+i;
        }
        return sum;
    }
/*
    static String findMax(Integer[] arr){
        Integer max = arr[0];
        for(int i=1 ; i < arr.length; i++)
        {
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        return String.valueOf(max)+String.valueOf(i);
    }
*/

   /* public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(10);
        input.add(20);
        input.add(7);
        int output = minSum(input,4);
        System.out.println("output "+output);
       //System.out.println((Math.round(7/2)));

    }*/

    public static int weightCapacity(List<Integer> weights, int maxCapacity) {
        //Collections.sort(weights,Collections.reverseOrder());
        int currentSum = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=1 ; i < weights.size()-1; i++){
            for(int j=i+1; j < weights.size()-1; j++){
                if(weights.get(i)+weights.get(j) > currentSum && weights.get(i)+weights.get(j)<= maxCapacity){
                    currentSum =  weights.get(i)+weights.get(j);
                    result.add(weights.get(i)+weights.get(j));
                }
            }
        }
        Collections.sort(result,Collections.reverseOrder());
        return result.get(0);

    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(7);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(6);
        weightCapacity(arrayList,7);
    }

}
