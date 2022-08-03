package leetcode;

import java.util.Arrays;

public class UniquePath {


        public static void main(String[] args) {
            int ans = numberOfWaysToTraverseGraph(4,3);
            System.out.println(ans);

        }
        // Using memoization
        public static int numberOfWaysToTraverseGraph(int width, int height) {
            int[][] dp = new int[width][height];
            for(int x[] : dp){
                Arrays.fill(x,-1);
            }
            return solve(width,height,0,0,dp);
        }

        public static int solve(int width, int height, int x, int y, int[][] dp){
            // base condition
            if(x==width-1 && y == height-1){
                return 1;
            }

            if(x >= width || y >= height){
                return 0;
            }

            if(dp[x][y]!= -1){
                return dp[x][y];
            }

            dp[x][y] = solve(width,height,x+1,y,dp) + solve(width,height,x,y+1,dp);

            return dp[x][y];
        }
}
