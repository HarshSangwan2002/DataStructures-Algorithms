/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null)
            return new TreeNode(val, null, null);

        TreeNode curr_node = root;

        while (true) {

            if (curr_node.val <= val) {

                if (curr_node.right != null) {

                    curr_node = curr_node.right;
                }

                else {
                    curr_node.right = new TreeNode(val, null, null);
                    break;
                }
            }

            else {
                if (curr_node.left != null) {
                    curr_node = curr_node.left;
                }

                else {
                    curr_node.left = new TreeNode(val, null, null);
                    break;
                }
            }
        }

        return root;
    }
}