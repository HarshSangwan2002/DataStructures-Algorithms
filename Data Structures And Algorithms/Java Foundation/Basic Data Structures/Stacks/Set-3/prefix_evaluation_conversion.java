import java.util.Scanner; 
import java.util.Stack;

public class prefix_evaluation_conversion {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Integer> val = new Stack<>();
        Stack<String> in = new Stack<>();
        Stack<String> post = new Stack<>();
        
        for(int i=str.length()-1; i>=0; i--)
        {
            char ch = str.charAt(i);

            if(Character.isDigit(ch))
            {
                val.push(ch-'0');
                in.push(ch+"");
                post.push(ch+"");
            }

            else 
            {
                int v1 = val.pop();
                int v2 = val.pop();
                val.push(operation(v1,v2,ch));

                String inv1 = in.pop();
                String inv2 = in.pop();
                in.push("("+inv1+ch+inv2+")");

                String postv1 = post.pop();
                String postv2 = post.pop();
                post.push(postv1+postv2+ch);
            }
        }

        System.out.println(val.pop());
        System.out.println(in.pop());
        System.out.println(post.pop());
        scn.close();
    }

    public static int operation(int v1, int v2, char op)
    {
        if(op=='+')
        {
            return v1+v2;
        }

        else if(op=='-')
        {
            return v1-v2;
        }

        else if(op=='*')
        {
            return v1*v2;
        }

        else 
        {
            return v1/v2;
        }
    }
}
