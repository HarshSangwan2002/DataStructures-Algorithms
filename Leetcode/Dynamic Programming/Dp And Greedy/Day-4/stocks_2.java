class Solution {
    public int maxProfit(int[] arr) {
        
        int maxp = 0;
        int sd = 0;
        int bd = 0;
        
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]>arr[i-1])
            {
                sd++;
            }
            
            else 
            {
                maxp += arr[sd] - arr[bd];
                sd = bd = i;
            }
        }
        
        maxp+= arr[sd] - arr[bd];
        
        return maxp;
    }
}