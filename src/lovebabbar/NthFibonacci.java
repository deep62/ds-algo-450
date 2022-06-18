package lovebabbar;

import java.util.Arrays;

public class NthFibonacci {
    // using dp
    public static void main(String[] args) {
        int n=6;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        //System.out.print(Arrays.toString(dp));
        int ans = fib(n,dp);
        System.out.print(ans);
    }

    private static int fib(int n, int[] dp) {
        // base case
        if(n < 2){
            return n;
        }
        if(dp[n]!=-1)
            return dp[n];

        dp[n] = fib(n-1,dp) + fib(n-2,dp);
        return dp[n];
    }
}
