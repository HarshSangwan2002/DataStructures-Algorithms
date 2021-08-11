/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        return helper(cloned,target);
    }
    
    private static TreeNode helper(TreeNode cloned, TreeNode target)
    {
        if(cloned==null)
            return null;
        
        if(cloned.val==target.val)
            return cloned;
        
        TreeNode ln = helper(cloned.left,target);
        if(ln!=null)
            return ln;
        
        TreeNode rn = helper(cloned.right,target);
        if(rn!=null)
            return rn;
        
        return null;
    }
}