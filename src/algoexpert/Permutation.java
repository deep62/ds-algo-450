package algoexpert;/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class Permutation {
    static ArrayList<String> finalList = new ArrayList<>();
    public static void main(String args[] ) throws Exception {
        //Write code here
        int count =0 ;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        generatePermutation(str,0,str.length());

        Map<String,String> validMap = new HashMap<>();
        for(String str1 : finalList){
            if(str1.startsWith("A") || str1.startsWith("E") || str1.startsWith("I") || str1.startsWith("O") | str1.startsWith("U")){
               validMap.put(str1,"ignore");
            }
            else{
                validMap.put(str1,"PROCESSED");
            }
           // validMap.put(str1,"PROCESSED");
           /* System.out.println(str1);*/
        }

        for(Map.Entry<String,String> entry : validMap.entrySet()){
            if(entry.getValue()!="ignore"){
                count++;
                System.out.println(entry.getKey());
            }
        }
        System.out.println(count);
    }

    public static String swapString(String a, int i, int j) {
        char[] b =a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    public static void generatePermutation(String str, int start, int end)
    {

        int count =0;
            //Prints the permutations
            if (start == end-1){
                finalList.add(str);
                //System.out.println(str);
                //System.out.println(finalList.size());
            }
            else
            {
                for (int i = start; i < end; i++)
                {
                    //Swapping the string by fixing a character
                    str = swapString(str,start,i);
                    //Recursively calling function generatePermutation() for rest of the characters
                    generatePermutation(str,start+1,end);
                    //Backtracking and swapping the characters again.
                    str = swapString(str,start,i);

                }
            }


    }
       /* for(String s : finalList){

        }*/

}




