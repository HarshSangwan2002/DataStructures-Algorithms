import java.util.*;

public class art {

    public static class Node {

        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static Node construct(int[] arr) {

        Node root = new Node();
        root.data = arr[0];

        Stack<Node> st = new Stack<>();
        st.push(root);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            }

            else {

                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                }

                else if (st.size() == 0) {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    public static class GenericTree implements Iterable<Integer> {

        Node root;

        GenericTree(Node root) {

            this.root = root;
        }

        public Iterator<Integer> iterator() {

            Iterator<Integer> obj = new GTPreorder(root);
            return obj;
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

    public static class GTPreorder implements Iterator<Integer> {

        Integer next_val;
        Stack<Pair> st;

        GTPreorder(Node root) {

            st = new Stack<>();
            st.push(new Pair(root, -1));
            next();
        }

        public boolean hasNext() {

            if (next_val == null)
                return false;

            else
                return true;
        }

        public Integer next() {

            Integer fr = next_val;

            next_val = null;

            // moves next_val forward, if not possible sets it to null

            while (!st.isEmpty()) {
                Pair top = st.peek();

                if (top.state == -1) {
                    next_val = top.node.data;
                    top.state++;
                    break;
                }

                else if (top.state == top.node.children.size()) {

                    st.pop();
                }

                else {

                    Pair cp = new Pair(top.node.children.get(top.state), -1);
                    st.push(cp);
                    top.state++;
                }
            }

            return fr;
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        Node root = construct(arr);
        GenericTree gt = new GenericTree(root);

        for (int val : gt) {

            System.out.println(val);
        }

        Iterator<Integer> gti = gt.iterator();

        while (gti.hasNext()) {
            System.out.println(gti.next());
        }

        scn.close();
    }
}