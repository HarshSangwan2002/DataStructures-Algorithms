class sol {
    public int pivotIndex(int[] arr) {
        
        if(arr.length==1)
            return 0;
        
        int lsum = 0;
        int sum = 0;
        
        for(int val:arr)
            sum+=val;
        
        for(int i=0; i<arr.length; i++)
        {
            sum-=arr[i];
            
            if(sum==lsum)
                return i;
            
            lsum+=arr[i];
        }
        
        return -1;
    }
}