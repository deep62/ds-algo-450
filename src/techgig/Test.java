package techgig;

import java.util.Scanner;

public class Test {

    /* Read input from STDIN. Print your output to STDOUT*/

        public static void main(String args[] ) throws Exception {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            if(n < 0){
                return;
            }
            int count = 0;
            while(count <=n){
                // System.out.println("inside for loop");
                int numberOfPairs = Integer.parseInt(sc.next());
                int budget = Integer.parseInt(sc.next());

                if(numberOfPairs <0 || budget < 0){
                    return;
                }

                int[] topPrices = new int[numberOfPairs];
                int[] skirtPrices = new int[numberOfPairs];

                for(int k=0; k < numberOfPairs ; k++){
                    topPrices[k] = Integer.parseInt(sc.next());
                }

                for(int j=0; j < numberOfPairs; j++){
                    skirtPrices[j] = Integer.parseInt(sc.next());
                }

                int sumOfPairPrice = 0;
                for(int i=0; i < topPrices.length; i++){
                    sumOfPairPrice = sumOfPairPrice + topPrices[i] + skirtPrices[i];
                }

                if(sumOfPairPrice <= budget){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
                count++;

            }

        }

}
