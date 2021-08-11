class min_cost_climbing_stairs {
    public int minCostClimbingStairs(int[] cost) {
        
        int i = 0;
        
        for(i=2; i<cost.length; i++)
        {
            cost[i] += Math.min(cost[i-1],cost[i-2]);
        }
        
        return (Math.min(cost[i-1],cost[i-2]));
    }
}