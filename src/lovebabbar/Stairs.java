package lovebabbar;

import java.util.Arrays;

public class Stairs {
    // O(n) || O(n) space
    public static void main(String[] args) {
        int[] dp = new int[6];
        Arrays.fill(dp,-1);
        int numOfWays = numOfWaysToClimbStairs(5,dp);
        System.out.print("number of ways "+numOfWays);
    }

    public static int numOfWaysToClimbStairs(int numOfStairs, int[] dp){
        if(numOfStairs < 0){
            return 0;
        }
        if(numOfStairs <=1){
            return 1;
        }
        if(dp[numOfStairs]!=-1){
            return dp[numOfStairs];
        }
        dp[numOfStairs] = numOfWaysToClimbStairs(numOfStairs-1,dp) + numOfWaysToClimbStairs(numOfStairs-2,dp);
        return dp[numOfStairs];
    }
}
