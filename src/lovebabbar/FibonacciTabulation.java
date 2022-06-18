package lovebabbar;

public class FibonacciTabulation {
    // O(n) time || O(n) space
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        int ans=Fib2(n);
        System.out.print(ans);
    }

    private static int Fib(int n, int[] dp) {
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i <= dp.length-1;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    // optimized space
    // O(n) time O(1) space
    private static int Fib2(int n){
        int prev1 = 1;
        int prev2 = 0;
        int current = 0;
        for(int i=2; i <= n ; i++){
            current =  prev2 + prev1;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}
