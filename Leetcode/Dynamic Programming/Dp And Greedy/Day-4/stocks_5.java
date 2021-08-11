class Solution {
    public int maxProfit(int[] arr) {
        
        if(arr.length==1)
            return 0;
        
        int min = arr[0];
        int[] mpist = new int[arr.length];
        int curp = 0;
        int maxp = 0;
        
        for(int i=1; i<arr.length; i++)
        {
            min = Math.min(min,arr[i]);
            
            curp = arr[i] - min;
            
            maxp = Math.max(maxp,curp);
            
            mpist[i] = maxp; 
        }
        
        int max = arr[arr.length-1];
        int[] mpibt = new int[arr.length];
        curp = 0;
        maxp = 0;
        
        for(int i=arr.length-2; i>=0; i--)
        {
            max = Math.max(max,arr[i]);
            
            curp = max - arr[i];
            
            maxp = Math.max(maxp,curp);
            
            mpibt[i] = maxp;
        }
        
        int ans = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++)
        {
            ans = Math.max(ans,mpist[i]+mpibt[i]);
        }
        
        return ans;
    }
}