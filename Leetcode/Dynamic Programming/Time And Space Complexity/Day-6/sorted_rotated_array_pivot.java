class Solution {
    public int search(int[] arr, int target) {
        
        if(arr.length==1)
        {
            if(arr[0]==target)
                return 0;
            
            else 
                return -1;
        }
        
        int lo = 0;
        int hi = arr.length-1;
        
        
        while(lo<=hi)
        {
            int mid = lo + (hi-lo)/2;
            
            if(arr[mid]==target)
                return mid;
            
            else if(arr[mid]>=arr[lo])
            {
                if(target>=arr[lo] && target<=arr[mid])
                    hi = mid-1;
                
                else 
                    lo = mid+1;
            }
            
            else 
            {
                if(target>=arr[mid] && target<=arr[hi])
                    lo = mid+1;
                
                else 
                    hi = mid-1;
            }
        }
        
        return -1;
    }
}