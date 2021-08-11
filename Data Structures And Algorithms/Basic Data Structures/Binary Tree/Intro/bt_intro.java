public class bt_intro {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {

            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(10, null, null);
        Node ln = new Node(20, null, null);
        Node rn = new Node(30, null, null);

        root.left = ln;
        root.right = rn;

        System.out.println(root.data);
        System.out.println(root.left);
        System.out.println(ln);
        System.out.println(root.right);
        System.out.println(rn);
    }
}