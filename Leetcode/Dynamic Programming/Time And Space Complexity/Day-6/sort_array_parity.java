class Solution {
    public int[] sortArrayByParity(int[] arr) {
        
        if(arr.length==1)
            return arr;
        
        int i = 0;
        int j = 0;
        
        while(i<arr.length)
        {
            if(arr[i]%2!=0)
            {
                i++;
            }
            
            else 
            {
                swap(arr,i,j);
                i++;
                j++;
            }
        }
        
        return arr;
    }
    
    private void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}