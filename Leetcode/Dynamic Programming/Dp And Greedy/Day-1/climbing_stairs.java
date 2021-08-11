class climbint_stairs {
    public int climbStairs(int n) {
       
        if(n==1 || n==2 || n==3)
        {
            return n;
        }
        
        int[] dp = new int[n+1];
        dp[0] = 1;
        
        for(int i=1; i<=n; i++)
        {
            if(i==1)
            {
                dp[i] = dp[i-1];
            }
            
            else 
            {
                dp[i] = dp[i-1] + dp[i-2];   
            }
        }
        
        return dp[n];
    }
}