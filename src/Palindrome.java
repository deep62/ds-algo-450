import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Palindrome {

    public static void main(String[] args) {
        //armstrong
       /* String temp = String.valueOf(55555);
        StringBuffer stringBuffer = new StringBuffer(temp);
        String reversedStr = stringBuffer.reverse().toString();
        if(reversedStr.equals(temp)){
            System.out.print("Yes");
        }*/

     /* String temp = "abc";
      if(Character.isUpperCase(temp.charAt(0))){

      }*/
        Pattern p = Pattern.compile("geek");
        Matcher m = p.matcher("geeksforgeeks");
        boolean b = m.matches();
        System.out.print(b);
    }
}
