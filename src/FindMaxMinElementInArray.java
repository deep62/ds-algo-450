import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class FindMaxMinElementInArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        System.out.println("Max element "+maxElement(arr));
        System.out.println("Min element "+minElement(arr));
        Set set = new TreeSet();
        set.add(1);
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);


    }
    static int maxElement(int[] arr){
        int max = arr[0];
        for(int i=0 ;i < arr.length ;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }

    static int minElement(int[] arr){
        int min = arr[0];
        for(int i=0 ; i< arr.length ;i++){
            if(arr[i]< min){
                min = arr[i];

            }
        }
        return min;

    }

}
