class coin_change {
    public int change(int amount, int[] arr) {
        
        int[] dp = new int[amount+1];
        dp[0] = 1;
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=1; j<dp.length; j++)
            {
                if(j>=arr[i])
                {
                    dp[j]+=dp[j-arr[i]];
                }
            }
        }
        
        return dp[amount];
    }
}