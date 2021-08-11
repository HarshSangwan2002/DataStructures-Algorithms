import java.util.*;

public class intro {

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

    public static Node construct(int[] arr, int lo, int hi) {

        if (lo > hi)
            return null;

        int mid = lo + (hi - lo) / 2;

        Node l = construct(arr, lo, mid - 1);
        Node r = construct(arr, mid + 1, hi);

        Node root = new Node(arr[mid], l, r);
        return root;
    }

    public static void display(Node node) {

        if (node == null)
            return;

        String str = "";
        str += node.left == null ? "." : node.left.data + " ";
        str += "->" + node.data + " <-";
        str += node.right == null ? "." : node.right.data + " ";

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        Node root = construct(arr, 0, arr.length - 1);
        display(root);

        scn.close();
    }
}
