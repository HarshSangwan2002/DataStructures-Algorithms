import java.util.Scanner; 
import java.util.Stack;

/**
 * balanced_brackets
 */
public class balanced_brackets {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch=='(' || ch=='{' || ch=='[')
            {
                st.push(ch);
            }

            else if(ch==')')
            {
                if(handle(st,'(')==false)
                {
                    System.out.println("false");
                    System.exit(0);
                }
            }

            else if(ch=='}')
            {
                if(handle(st,'{')==false)
                {
                    System.out.println("false");
                    System.exit(0);
                }
            }

            else if(ch==']')
            {
                if(handle(st,'[')==false)
                {
                    System.out.println("false");
                    System.exit(0);
                }
            }
        }

        if(st.size()!=0)
        {
            System.out.println("false");
        }

        else 
        {
            System.out.println("true");
        }

        scn.close();
    }

    public static boolean handle(Stack<Character> st, char c1)
    {
        if(st.size()==0)
        {
            return false;
        }

        else if(st.peek()!=c1)
        {
            return false;
        }
        
        else 
        {
            st.pop();
            return true;
        }
    }
}