/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] arr) {

        if (arr.length == 1) {
            TreeNode root = new TreeNode(arr[0], null, null);
            return root;
        }

        return helper(arr, 0, arr.length - 1);
    }

    public static TreeNode helper(int[] arr, int lo, int hi) {

        if (lo > hi)
            return null;

        int mid = lo + (hi - lo) / 2;

        TreeNode ln = helper(arr, lo, mid - 1);
        TreeNode rn = helper(arr, mid + 1, hi);

        TreeNode root = new TreeNode(arr[mid], ln, rn);
        return root;
    }
}