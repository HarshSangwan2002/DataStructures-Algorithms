class Solution {
    public int maxProfit(int[] arr) {
        
        if(arr.length==1)
            return 0;
        
        int obsp = -arr[0];
        int ossp = 0;
        int ocsp = 0;
        int nbsp = -1;
        int nssp = -1;
        int ncsp = -1;
        
        for(int i=1; i<arr.length; i++)
        {
            if(ocsp-arr[i]>obsp)
            {
                nbsp = ocsp - arr[i];
            }
            
            else 
            {
                nbsp = obsp;
            }
            
            if(obsp+arr[i]>ossp)
            {
                nssp = obsp + arr[i];
            }
            
            else 
            {
                nssp = ossp;
            }
            
            if(ocsp>ossp)
            {
                ncsp = ocsp;
            }
            
            else 
            {
                ncsp = ossp;
            }
            
            ossp = nssp;
            obsp = nbsp;
            ocsp = ncsp;
        }
        
        return ossp;
    }
}