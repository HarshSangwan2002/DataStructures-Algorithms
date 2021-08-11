/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {

    private boolean path(TreeNode node, int data, ArrayList<TreeNode> list) {

        if (node == null)
            return false;

        if (node.val == data) {
            list.add(node);
            return true;
        }

        boolean ln = path(node.left, data, list);
        if (ln == true) {
            list.add(node);
            return true;
        }

        boolean rn = path(node.right, data, list);
        if (rn == true) {
            list.add(node);
            return true;
        }

        return false;
    }

    private void k_level(TreeNode node, int r, TreeNode block, ArrayList<Integer> res) {

        if (node == null || r < 0 || node == block)
            return;

        if (r == 0)
            res.add(node.val);

        k_level(node.left, r - 1, block, res);
        k_level(node.right, r - 1, block, res);
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        ArrayList<TreeNode> list = new ArrayList<>();
        path(root, target.val, list);

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            k_level(list.get(i), k - i, i == 0 ? null : list.get(i - 1), res);
        }

        return res;
    }
}