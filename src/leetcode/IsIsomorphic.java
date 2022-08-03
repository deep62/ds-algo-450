package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class IsIsomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "bar"));
    }
    // O(n) time and O(n) space
/* Approach :- Use a set to keep track of character in the target string, use map as well to store the mapping of each character mapped from left string to right string*/
    public static boolean isIsomorphic(String s, String t) {

        // Two strings cannot be isomorphic if they have different lengths.
        if(s.length()!=t.length()){
            return false;
        }
        // Use Java's built in map to store mappings of str1 chars to str2 chars.
        HashMap<Character,Character> map = new HashMap<>();
        // Use a set to keep track of already mapped characters.
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i < s.length(); i++){
           char c1 = s.charAt(i), c2 = t.charAt(i);
            // If c1 has been encountered before:
           if(map.containsKey(c1)){
               // Return false if first occurrence of c1 is mapped to
               // a different character.
               if(map.get(c1)!=c2){
                   return false;
               }

            // If c1 is encountered for the first time, it has not been mapped yet:
           }else {
               // Return false if c2 is already mapped to some other char in str1
               if(set.contains(c2)){
                   return false;
               }
               // All checks passed. So insert in the map, and the set.
               map.put(c1,c2);
               set.add(c2);
           }
        }
        return true;
    }
}