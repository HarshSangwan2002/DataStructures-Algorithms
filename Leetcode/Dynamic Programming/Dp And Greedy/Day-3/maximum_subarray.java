class Solution {
    public int maxSubArray(int[] arr) {
        
        if(arr.length==1)
            return arr[0];
        
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++)
        {   
            if(cursum<0)
            {
                cursum = 0;
            }
            
            cursum+=arr[i];
            maxsum = Math.max(maxsum,cursum);
        }
        
        return maxsum;
    }
}