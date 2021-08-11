import java.util.Scanner; 
import java.util.Stack; 

/**
 * infix_conversions
 */
public class infix_conversions {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> operators = new Stack<>();
        
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch=='(')
            {
                operators.push(ch);
            }

            else if((ch>='0' && ch<='9') || (ch>='a' && ch<='z') ||(ch>='A' && ch<='Z'))
            {
                post.push(ch+"");
                pre.push(ch+"");
            }

            else if(ch==')')
            {
                while(operators.size()>0 && operators.peek()!='(')
                {
                    char op = operators.pop();

                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    post.push(postv1+postv2+op);

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    pre.push(op+prev1+prev2);
                }

                operators.pop();
            }

            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
            {
                while(operators.size()>0 && precedence(ch)<=precedence(operators.peek()) && operators.peek()!='(')
                {
                    char op = operators.pop();

                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    post.push(postv1+postv2+op);

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    pre.push(op+prev1+prev2);
                }

                operators.push(ch);
            }
        }

        while(operators.size()>0)
        {
            char op = operators.pop();

            String postv2 = post.pop();
            String postv1 = post.pop();
            post.push(postv1+postv2+op);

            String prev2 = pre.pop();
            String prev1 = pre.pop();
            pre.push(op+prev1+prev2);
        }

        System.out.println(post.pop());
        System.out.println(pre.pop());
        scn.close();
    }

    public static int precedence(char op)
    {
        if(op=='+')
        {
            return 1;
        }

        else if(op=='-')
        {
            return 1;
        }

        else if(op=='*')
        {
            return 2;
        }

        else 
        {
            return 2;
        }
    }
}