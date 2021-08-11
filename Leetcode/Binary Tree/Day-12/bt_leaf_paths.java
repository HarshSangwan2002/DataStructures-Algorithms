/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {

        ArrayList<String> list = new ArrayList<>();

        if (root == null)
            return list;

        String current_path = Integer.toString(root.val);

        if (root.left == null && root.right == null)
            list.add(current_path);

        if (root.left != null)
            dfs(root.left, current_path, list);

        if (root.right != null)
            dfs(root.right, current_path, list);

        return list;
    }

    private void dfs(TreeNode root, String current_path, ArrayList<String> list) {

        current_path += "->" + root.val;

        if (root.left == null && root.right == null) {
            list.add(current_path);
            return;
        }

        if (root.left != null)
            dfs(root.left, current_path, list);

        if (root.right != null)
            dfs(root.right, current_path, list);
    }
}