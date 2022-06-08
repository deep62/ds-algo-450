package techgig;/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class PrimeNumber {
    public static void main(String args[]) throws Exception {

        //Write code here -- THis works fine

        Scanner sc = new Scanner(System.in);
        String[] inputs = new String [sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < inputs.length; i++)
        {
            inputs[i] = sc.nextLine();
        }
        for(int i=0 ;i < inputs.length ;i++){
            isPrime(Integer.parseInt(inputs[i]));
        }

    }

    static void isPrime(int num){
        boolean flag = true;
        for(int i=2 ; i < num-1; i++){
            if(num % i == 0){
                flag = false;
                System.out.println("NOT PRIME");
                break;
            }
        }
        if(flag){
            System.out.println("PRIME");
        }
        else{

        }
    }
}
