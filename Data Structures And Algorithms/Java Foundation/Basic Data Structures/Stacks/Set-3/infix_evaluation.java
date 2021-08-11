import java.util.Scanner; 
import java.util.Stack; 

/**
 * infix_evaluation
 */
public class infix_evaluation {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operations = new Stack<>();

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch=='(')
            {
                operations.push(ch);
            }

            else if(Character.isDigit(ch))
            {
                operands.push(ch-'0');
            }

            else if(ch==')')
            {
                while(operations.size()>0 && operations.peek()!='(')
                {
                    char op = operations.pop();

                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    int val = operation(v1,v2,op);

                    operands.push(val);
                }
                
                if(operations.size()>0)
                operations.pop();
            }

            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
            {
                while(operations.size()>0 && precedence(ch)<=precedence(operations.peek()) && operations.peek()!='(')
                {
                    char op = operations.pop();

                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    int val = operation(v1,v2,op);

                    operands.push(val);
                }

                operations.push(ch);
            }
        }

        while(operations.size()>0)
        {
            char op = operations.pop();

            int v2 = operands.pop();
            int v1 = operands.pop();
            int val = operation(v1,v2,op);

            operands.push(val);
        }

        System.out.println(operands.pop());
        scn.close();
    }

    public static int precedence(char op)
    {
        if(op=='+' || op=='-')
        {
            return 1;
        }

        else 
        {
            return 2;
        }
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