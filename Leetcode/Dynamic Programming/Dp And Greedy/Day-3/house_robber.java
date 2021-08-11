class Solution {
    public int rob(int[] nums) {
        
        int oinc = nums[0];
        int oexc = 0;
        
        for(int i=1; i<nums.length; i++)
        {
            int newinc = oexc+nums[i];
            int newexc = Math.max(oinc,oexc);
            
            oinc = newinc;
            oexc = newexc;
        }
        
        return (Math.max(oexc,oinc));
    }
}