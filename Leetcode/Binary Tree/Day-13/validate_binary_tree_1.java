/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {

    private static class Pair {

        TreeNode node;
        int state;

        Pair(TreeNode node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public boolean isValidBST(TreeNode node) {

        if (node.left == null && node.right == null)
            return true;

        ArrayList<Integer> list = new ArrayList<>();

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(node, 1));

        while (!st.isEmpty()) {
            Pair top = st.peek();

            if (top.state == 1) {
                if (top.node.left != null)
                    st.push(new Pair(top.node.left, 1));

                top.state++;
            }

            else if (top.state == 2) {
                list.add(top.node.val);

                if (top.node.right != null)
                    st.push(new Pair(top.node.right, 1));

                top.state++;
            }

            else {
                st.pop();
            }
        }

        boolean flag = true;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1))
                flag = false;
        }

        return flag;
    }
}