class Solution {
    public int maxProfit(int[] arr, int fee) {
        
        int obsp = -arr[0];
        int ossp = 0;
        int nbsp = -1;
        int nssp = -1;
        
        
        for(int i=1; i<arr.length; i++)
        {
            if(ossp-arr[i]>obsp)
            {
                nbsp = ossp - arr[i];
            }
            
            else 
            {
                nbsp = obsp;
            }
            
            if(obsp+arr[i]-fee>ossp)
            {
                nssp = obsp + arr[i] - fee;
            }
            
            else 
            {
                nssp = ossp;
            }
            
            ossp = nssp;
            obsp = nbsp;
        }
        
        return ossp;
    }
}