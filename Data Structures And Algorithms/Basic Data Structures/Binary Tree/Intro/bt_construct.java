import java.util.*;

public class bt_construct {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node() {

        }

        Node(int data, Node left, Node right) {

            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {

        Node node;
        int state;

        Pair(Node node, int state) {

            this.node = node;
            this.state = state;
        }
    }

    public static void main(String[] args) {

        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };

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
    }
}