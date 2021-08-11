class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<nums2.length; i++)
        {
            max = Math.max(max,nums2[i]);
        }
        
        int[] idx = new int[max+1];
        
        for(int i=0; i<nums2.length; i++)
        {
            idx[nums2[i]] = i;
        }
        
        int[] nge = new int[nums1.length];
        
        for(int i=0; i<nums1.length; i++)
        {
            for(int j=idx[nums1[i]]+1; j<nums2.length; j++)
            {
                if(nums2[j]>nums1[i])
                {
                    nge[i] = nums2[j];
                    break;
                }
            }
            
            if(nge[i]==0)
                nge[i] = -1;
        }
        
        return nge;
    }
}