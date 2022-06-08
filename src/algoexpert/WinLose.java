package algoexpert;/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
 */
//O(nlog) time | o(n) space
import java.util.*;
public class WinLose {
    public static void main(String args[] ) throws Exception {
        //Write code here
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < testCases; i++)
        {
            int size = sc.nextInt();
            sc.nextLine();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] villain = new String[size];
            String[] players =  new String[size];
            villain = s1.split(" ");
            players = s2.split(" ");
            System.out.println(Arrays.toString(villain));
            System.out.println(Arrays.toString(players));
            windOrLoos(villain,players);
        }


    }

    private static void windOrLoos(String[] villain,String[] players) {

        Arrays.sort(villain);
        Arrays.sort(players);
        for(int j=0 ; j < villain.length ; j++){
            if(Integer.parseInt(players[j]) > Integer.parseInt(villain[j])){
                continue;
            }else{
                System.out.println("LOSE");
                return;
            }
        }
        System.out.println("WIN");
    }
    }



