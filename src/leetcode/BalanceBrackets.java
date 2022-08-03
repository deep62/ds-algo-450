package leetcode;

import java.util.HashMap;
import java.util.Stack;

public class BalanceBrackets {
    public static void main(String[] args) {
        System.out.println(isValid("(])"));
    }
        public static boolean isValid(String s) {
            String openBrackets = "{([";
            String closeBrackets = "})]";
            HashMap<Character,Character> map = new HashMap<Character, Character>();
            map.put('}','{');
            map.put(')','(');
            map.put(']','[');

            Stack stack = new Stack();

            for(int i=0; i < s.length(); i++){
                char input = s.charAt(i);
                if(openBrackets.indexOf(input)!=-1){
                    stack.push(input);
                }
                else if(closeBrackets.indexOf(input)!=-1){
                    if(stack.isEmpty()){
                        return false;
                    }
                    if(stack.get(stack.size()-1)==map.get(input)){
                        stack.pop();
                    }else {
                        return false;
                    }
                }

            }
            return stack.isEmpty();



        }
}
