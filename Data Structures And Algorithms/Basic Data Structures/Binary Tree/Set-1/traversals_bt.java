import java.util.Stack;
import java.io.*;

public class traversals_bt {

    public static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {

            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    public static class Pair {

        int state;
        Node node;

        Pair(Node node, int state) {

            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {

        Stack<Pair> st = new Stack<>();
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);
        st.push(rtp);

        int idx = 0;
        while (!st.isEmpty()) {
            Pair top = st.peek();

            if (top.state == 1) {
                idx++;

                if (arr[idx] != null) {
                    Node ln = new Node(arr[idx], null, null);
                    top.node.left = ln;
                    st.push(new Pair(ln, 1));
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
                    top.node.right = rn;
                    st.push(new Pair(rn, 1));
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

    public static void traversals(Node node) {

        if (node == null)
            return;

        System.out.println(node.data + "in pre-order");

        traversals(node.left);

        System.out.println(node.data + "in in-order");

        traversals(node.right);

        System.out.println(node.data + "in post-order");

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        Node root = construct(arr);
        traversals(root);
    }
}