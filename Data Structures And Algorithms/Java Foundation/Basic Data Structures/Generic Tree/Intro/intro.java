import java.util.*;

public class intro{

    public static class Node{

        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void main(String[] args){

        Node root = new Node();
        root.data = 10;

        Node t1 = new Node();
        t1.data = 20;

        Node t2 = new Node();
        t2.data = 30;

        root.children.add(t1);
        root.children.add(t2);

        System.out.println(root.data + "\n" + t1.data + "\n" + t2.data);
    }
}