package lovebabbar;

import java.util.ArrayList;
import java.util.List;


// Phone keypad problem
public class LetterCombinations {

    /* Problem statement
    *
    * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
    */

    // Expected output
    // ["ad","ae","af","bd","be","bf","cd","ce","cf"]


    public static void main(String[] args) {

        List<String> result = letterCombinations("23");
        System.out.println(result);
    }
    public static List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<String>();
        }
        StringBuilder current = new StringBuilder();
        List<String> ans = new ArrayList<>();
        int index = 0;

        solve(digits,current,ans, index);
        return ans;
    }

    private static void solve(String digits, StringBuilder current, List<String> ans, int index){
        if(index == digits.length()){
            ans.add(current.toString());
            return;
        }

        String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        int idx = digits.charAt(index) - '0';
        String val = mapping[idx];

        for(int i=0; i < val.length(); i++){
            current.append(val.charAt(i));
            solve(digits,current,ans,index+1);
            // this is for backtracking
            current.deleteCharAt(current.length()-1);
        }

    }
}
