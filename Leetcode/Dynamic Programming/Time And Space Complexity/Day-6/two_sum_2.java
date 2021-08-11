class Solution {
    public int[] twoSum(int[] arr, int target) {
        
        int[] ans = new int[2];
        
        int[] rn = new int[arr.length];
        
        for(int i=0; i<arr.length; i++)
        {
            rn[i] = arr[i];
        }
        
        Arrays.sort(rn);
        
        int lo = 0;
        int hi = rn.length-1;
        int v1 = -1;
        int v2 = -1;
        
        while(lo<hi)
        {
            if(rn[lo]+rn[hi]==target)
            {
                v1 = rn[lo];
                v2 = rn[hi];
                break;
            }
            
            else if(rn[lo]+rn[hi]>target)
                hi--;
            
            else 
                lo++;
        }
        
        // System.out.println(v1 + " " + v2);

        if(v1==v2)
        {
            for(int i=0; i<arr.length; i++)
            {
                if(arr[i]==v1)
                {
                    ans[0] = i;
                    break;
                }
            }

            for(int i=arr.length-1; i>=0; i--)
            {
                if(arr[i]==v2)
                {
                    ans[1] = i;
                    break;
                }
            }
        }

        else 
        {
            for(int i=0; i<arr.length; i++)
            {
                if(arr[i]==v1)
                {
                    ans[0] = i;
                    break;
                }
            }
            
            for(int i=0; i<arr.length; i++)
            {
                if(arr[i]==v2)
                {
                    ans[1] = i;
                    break;
                }
            }
        }
        
        return ans;
    }
}