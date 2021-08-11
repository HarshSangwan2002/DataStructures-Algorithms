/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;

        int lvl = 1;
        Stack<TreeNode> ms = new Stack<>();
        Stack<TreeNode> cs = new Stack<>();
        ms.push(root);

        List<Integer> res = new ArrayList<>();
        while (!ms.isEmpty()) {

            TreeNode node = ms.pop();
            res.add(node.val);

            if (lvl % 2 == 1) {
                if (node.left != null)
                    cs.push(node.left);

                if (node.right != null)
                    cs.push(node.right);
            }

            else {
                if (node.right != null)
                    cs.push(node.right);

                if (node.left != null)
                    cs.push(node.left);
            }

            if (ms.size() == 0) {
                result.add(res);
                res = new ArrayList<>();
                ms = cs;
                cs = new Stack<>();
                lvl++;
            }
        }

        return result;
    }
}