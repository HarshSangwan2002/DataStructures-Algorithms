import java.util.Scanner; 
import java.util.Stack;

public class postfix_evaluation_conversion {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Integer> val = new Stack<>();
        Stack<String> in = new Stack<>();
        Stack<String> pre = new Stack<>();

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);

            if(Character.isDigit(ch))
            {
                val.push(ch-'0');
                in.push(ch+"");
                pre.push(ch+"");
            }

            else 
            {
                int v2 = val.pop();
                int v1 = val.pop();
                val.push(operation(v1,v2,ch));

                String prev2 = pre.pop();
                String prev1 = pre.pop();
                pre.push(ch+prev1+prev2);

                String inv2 = in.pop();
                String inv1 = in.pop();
                in.push("("+inv1+ch+inv2+")");
            }
        }

        System.out.println(val.pop());
        System.out.println(in.pop());
        System.out.println(pre.pop());
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
