package algoexpert;

/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class PandemicProblem {
    public static void main(String args[] ) throws Exception {
        //Write code here
        Scanner sc = new Scanner(System.in);
        String virus = sc.nextLine();
        String[] inputs = new String [sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < inputs.length; i++)
        {
            inputs[i] = sc.nextLine();
        }
        for(int i=0 ; i < inputs.length ; i++){
            findIfInfected(virus,inputs[i]);
        }
    }

    private static void findIfInfected(String virus, String input) {
        int j=0;
        int i=0;
        //String subsequence = null;
        if(virus!=null){
            for(;i< virus.length()  && j < input.length() ;i++){
                if(input.charAt(j) == virus.charAt(i)){
                   j++;
                }
            }
            if(j==input.length()){
                System.out.println("POSITIVE");
            }else {
                System.out.println("NEGATIVE");
            }

        }


    }
}
