class Solution {
    public int pivotIndex(int[] arr) {
        
        if(arr.length==1)
            return 0;
        
        int cursum = 0;
        int prvsum = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(i==0)
            {
                cursum = 0;
                for(int j=i+1; j<arr.length; j++)
                {
                   cursum += arr[j];
                }
                
                if(cursum==0)
                    return 0;
            }
            
            else if(i==arr.length-1)
            {
                cursum = 0;
                for(int j=0; j<arr.length-1; j++)
                {
                    cursum+=arr[j];
                }
                
                if(cursum==0)
                    return arr.length-1;
            }
            
            else 
            {
                prvsum = 0;
                for(int j=0; j<i; j++)
                {
                    prvsum+=arr[j];
                }
                
                cursum = 0;
                for(int j=i+1; j<arr.length; j++)
                {
                    cursum+=arr[j];
                }
                
                if(prvsum==cursum)
                    return i;
            }
        }
        
        return -1;
    }
}