/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {

    static boolean flag;

    public boolean isBalanced(TreeNode root) {

        flag = true;
        helper(root);
        return flag;
    }

    private int helper(TreeNode node) {

        if (node == null)
            return 0;

        int lh = helper(node.left);
        int rh = helper(node.right);

        if (Math.abs(lh - rh) > 1)
            flag = false;

        return Math.max(lh, rh) + 1;
    }
}