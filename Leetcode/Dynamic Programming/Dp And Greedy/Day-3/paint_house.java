public class Solution {
    /**
     * @param costs: n x 3 cost matrix
     * @return: An integer, the minimum cost to paint all houses
     */
    public int minCost(int[][] arr) {
        // write your code here

        

        int n = arr.length;
        // int m = arr[0].length;

        if(n==0)
        {
            return 0;
        }

        int m = arr[0].length;
        int[][] dp = new int[n][m];

        for(int col=0; col<m; col++)
        {
            dp[0][col] = arr[0][col];
        }

        for(int i=1; i<n; i++)
        {
            dp[i][0] = arr[i][0] + Math.min(dp[i-1][1],dp[i-1][2]);
            dp[i][1] = arr[i][1] + Math.min(dp[i-1][0],dp[i-1][2]);
            dp[i][2] = arr[i][2] + Math.min(dp[i-1][0],dp[i-1][1]);
        }

        int ans = Integer.MAX_VALUE;

        for(int col=0; col<m; col++)
        {
            ans = Math.min(ans,dp[n-1][col]);
        }

        return ans;
    }
}