import java.io.*;
import java.util.*;

public class max_node_sum {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  static int max_n;
  static int max_s;
  
  private static int solve(Node node){
      
      int s = 0;
      
      for(Node child: node.children)
      {
          int cs = solve(child);
          
          s+=cs;
      }
      
      s += node.data;
      
      if(s>max_s)
      {
          max_s = s;
          max_n = node.data;
      }
      
      return s;
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    // write your code here
    
    max_n = -1;
    max_s = Integer.MIN_VALUE;
    
    solve(root);
    System.out.println(max_n + "@" + max_s);
  }

}