/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {

    public static class Pair {

        int dia;
        int height;
    }

    public static Pair helper(TreeNode node) {

        if (node == null) {
            Pair bp = new Pair();
            bp.dia = 0;
            bp.height = -1;
            return bp;
        }

        Pair lp = helper(node.left);
        Pair rp = helper(node.right);

        Pair mp = new Pair();
        mp.dia = Math.max(lp.height + rp.height + 2, Math.max(lp.dia, rp.dia));
        mp.height = Math.max(lp.height, rp.height) + 1;

        return mp;
    }

    public int diameterOfBinaryTree(TreeNode root) {

        Pair ans = helper(root);
        return ans.dia;
    }
}