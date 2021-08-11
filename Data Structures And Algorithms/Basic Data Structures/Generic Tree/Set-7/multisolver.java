import java.util.*;

public class multisolver{

    public static class Node{

        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    static int size;
    static int height;
    static int max;
    static int min;
    public static void solver(Node node, int depth){

        size++;
        min = Math.min(min,node.data);
        max = Math.max(max,node.data);
        height = Math.max(height,depth);

        for(Node child: node.children)
        {
            solver(child,depth+1);
        }
    }
    public static void main(String[] args) {
        
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};

        Node root = null;
        Stack<Node> st = new Stack<>();

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==-1)
            st.pop();

            else 
            {
                Node t = new Node();
                t.data = arr[i];

                if(st.size()==0)
                root = t;

                else 
                {
                    st.peek().children.add(t);
                }

                st.push(t);
            }
        }

        System.out.println(root.data);
        size = 0;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        height = 0;
        solver(root,0);

        System.out.println("Size: " + size);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Height: " + height);
    }
}