class sol1 {
    public void sortColors(int[] arr) {
        
        int i = 0;
        int j = 0;
        int k = arr.length-1;
        
        while(i<=k)
        {
            if(arr[i]==1)
            {
                i++;
            }
            
            else if(arr[i]==0)
            {
                swap(arr,i,j);
                i++;
                j++;
            }
            
            else 
            {
                swap(arr,i,k);
                k--;
            }
        }
    }
    
    private void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}