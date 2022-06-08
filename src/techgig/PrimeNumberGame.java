package techgig;

import java.util.*;

public class PrimeNumberGame {
    //Write code here

    public static void main(String[] args) {
      /*  Scanner sc = new Scanner(System.in);
        String[] inputs = new String [sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < inputs.length; i++)
        {
            inputs[i] = sc.nextLine();
        }
        //String numbers[] = new String[]{};
        for(int i=0 ;i < inputs.length ;i++){
            System.out.println(Arrays.toString(inputs));
            String[] numbers =inputs[i].split(" ");
            System.out.println(Arrays.toString(numbers));
            int p1 = Integer.parseInt(numbers[0]);
            int p2 = Integer.parseInt(numbers[1]);
            playGame(p1,p2);
        }*/
        playGame(2,7);
        //isPrime(8);

    }

    private static void playGame(int p1, int p2) {
        HashSet<Integer> hashSet = new HashSet<>();
        int a,b,i,j,count=0;
        for(i=p1 ; i <= p2; i++){
            if(i==0 || i==1){
                continue;
            }
           boolean isPrime =true;
            for (j = 2; j <= i -1; ++j) {
                if (i % j == 0) {
                    isPrime=false;
                    break;
                }

            }
            if(isPrime){
                hashSet.add(i);
            }

        }
        Iterator itr = hashSet.iterator();
        switch (hashSet.size()){
            case 1:
                System.out.println(0);
                break;
            case 2:
            {
                Integer A = (Integer) itr.next();
                Integer B = (Integer) itr.next();
                System.out.println(A-B);
            }
            break;
            case 0:
                System.out.println(-1);

        }
      //  System.out.println(count);
    }

/*
   static boolean isPrime(int num){
        for(int i=2 ; i <=num/2;i++){
            if(num%i==0){
                return false;
            }

        }
    }
*/


}


