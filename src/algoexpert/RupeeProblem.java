package algoexpert;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class RupeeProblem {

    // All denominations of Indian Currency
    static int deno[] = {1, 2, 5};
    static int n = deno.length;

    // Driver code
    public static void main(String[] args)
    {
        int n = 15;
        System.out.print(
                "Following is minimal number "
                        +"of change for " + n + ": ");
        findMin(n);
    }

    static void findMin(int V)
    {
        // Initialize result
        Vector<Integer> ans = new Vector<>();
        int countOne =0;
        int countTwo =0;
        int countFive =0;
        Map<Integer,Integer> rules = new HashMap<Integer, Integer>();
        rules.put(1,0);
        rules.put(2,0);
        rules.put(5,0);


        int j=1;
        int k=2;
        int l=5;
        // Traverse through all denomination
        for (int i = n - 1; i >= 0; i--)
        {
            // Find denominations
            while (V >= deno[i])
            {
                if(deno[i]==2){

                    if(rules.get(2) <1 || rules.get(1) >= rules.get(2)){
                        V -= deno[i];
                        ans.add(deno[i]);
                        ++countTwo;
                        rules.put(2,countTwo);
                        i=2;
                        if(V==0)
                            break;
                    }

                }
                else if(deno[i]==5){

                        if(rules.get(5) <=1 || rules.get(2) >= rules.get(5)){
                            V -= deno[i];
                            ans.add(deno[i]);
                            ++countFive;
                            rules.put(5,countFive);
                            i=0;
                            if(V==0)
                                break;
                        }
                }
                else{
                        V -= deno[i];
                        ans.add(deno[i]);
                        ++countOne;
                        rules.put(1,countOne);
                        i=1;
                    if(V==0)
                        break;


                }

            }
        }
        // Print result
        for (int i = 0; i < ans.size(); i++)
        {
            System.out.print(
                    " " + ans.elementAt(i));
        }
    }

}


