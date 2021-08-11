class Solution {
    public int maxProfit(int[] arr) {
        
        int maxp = 0;
        int curp = 0;
        int min = arr[0];
        
        for(int i=1; i<arr.length; i++)
        {
            min = Math.min(min,arr[i]);
            
            curp = arr[i] - min;
            
            maxp = Math.max(maxp,curp);
        }
        
        return maxp;
    }
}