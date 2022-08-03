package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Subsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("b","c"));
    }
         public static boolean isSubsequence(String s, String t) {
            HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();

            if(s.length() ==1 && t.length() ==1){
                return s.equals(t);
            }
            for(int i=0 ; i< t.length(); i++){
                hmap.put(t.charAt(i),i);
            }
            for(int i=1; i < s.length(); i++){

                if(!hmap.containsKey(s.charAt(i))){
                    return false;
                }

                if(hmap.get(s.charAt(i)) < hmap.get(s.charAt(i-1))){
                    return false;
                }
            }
            return true;

        }

       /* const isSubsequence = (s, t) => {
        //! Edge case
        if (s.length > t.length) return false; //! if len of s is greater than len of t, return false because s cant be a subsequence of t
  `
        Example:
        s='Leetcode'
        t='Code'
        here we are trying to find if 'Leetcode' is a subsequence of 'Code' which is not possible because 'Leetcode' is longer than 'Code'

  `;
  const t_length = t.length;
        let subsequence = 0;
        for (let i = 0; i < t_length; i++) {
            if (s[subsequence] === t[i]) {
                // ! if it is matching, increment subsequence
                subsequence++;
            }
        }
        return subsequence === s.length
    };

        */
}
