package lovebabbar;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {

    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        printPowerSet("abc",0,3,"",ans);
        System.out.print(ans);
    }

    public static void printPowerSet(String s, int index, int n, String current,List<String> ans){
        if(index==n){
            //ans.add(current);
            System.out.println(current);
            return;
        }
        // exclude
        printPowerSet(s,index+1,n,current,ans);
        // include
        char element = s.charAt(index);
        current = current+element; // yaha pe current string variable hai to backtracking logic likhne ki zaroorat nahi hai
        printPowerSet(s,index+1,n,current,ans);
    }

/*
    public static void main(String[] args) {
        int a = '0';
        System.out.print(a);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
    }
*/
}
