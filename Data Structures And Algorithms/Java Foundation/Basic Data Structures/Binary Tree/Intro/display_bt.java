import java.util.Stack;

/**
 * display_bt
 */
public class display_bt {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {

            this.data = data;
            this.left = left;
            this.right = right;
        }

        Node() {

        }
    }

    public static class Pair {

        int state;
        Node node;

        Pair(Node node, int state) {

            this.state = state;
            this.node = node;
        }
    }

    public static Node construct(Integer[] arr) {

        Node root = new Node(arr[0], null, null);
        Stack<Pair> st = new Stack<>();
        Pair rtp = new Pair(root, 1);
        st.push(rtp);

        int idx = 0;

        while (st.size() > 0) {
            Pair top = st.peek();

            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {

                    Node ln = new Node(arr[idx], null, null);
                    st.push(new Pair(ln, 1));
                    top.node.left = ln;
                }

                else {
                    top.node.left = null;
                }

                top.state++;
            }

            else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {

                    Node rn = new Node(arr[idx], null, null);
                    st.push(new Pair(rn, 1));
                    top.node.right = rn;
                }

                else {
                    top.node.right = null;
                }

                top.state++;
            }

            else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node root) {

        if (root == null)
            return;

        String str = "";

        str += root.left == null ? "." : root.left.data + "";
        str += "->" + root.data + "->";
        str += root.right == null ? "." : root.right.data + "";

        System.out.println(str);

        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {

        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };

        Node root = construct(arr);
        display(root);
    }
}