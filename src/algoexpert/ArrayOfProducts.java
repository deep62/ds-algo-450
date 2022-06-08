package algoexpert;


import java.util.Arrays;

class ArrayOfProducts {
   static public int[] arrayOfProducts(int[] array) {
        int[] output = new int[array.length];
        int product = 1;
        int i=0;
        while(i < array.length){
            for(int j=0; j < array.length ; j++){
                if(i==j){
                    continue;
                }
                product = product * array[j];
            }
            output[i] = product;
            product = 1;
            i++;
        }
        return output;
    }

    public static void main(String[] args) {
       int[] array =new int[] {5,1,4,2};
       System.out.println(Arrays.toString(arrayOfProducts(array)));
    }
}
