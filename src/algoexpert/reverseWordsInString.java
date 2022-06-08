package algoexpert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverseWordsInString {
   static public String reverseWordsInString(String string) {
        List<String> words = new ArrayList<String>();
        int startOfWord = 0;

        for(int i=0 ; i < string.length(); i++){
            char character = string.charAt(i);

            if(character == ' '){
                words.add(string.substring(startOfWord,i));
                startOfWord = i;
            }else if(string.charAt(startOfWord) == ' '){
                words.add(" ");
                startOfWord = i;
            }
        }

        words.add(string.substring(startOfWord));
        Collections.reverse(words);
        System.out.println(String.join("",words));
        return String.join("",words).replaceAll("  ","");
    }

    public static void main(String[] args) {
        String string = "the sky  is blue";
        reverseWordsInString(string);
    }
}
