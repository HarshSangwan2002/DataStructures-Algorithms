import java.util.Stack;

class valid_parentheses {
    public boolean isValid(String str) {
        
        if(str.length()==1)
            return false;
        
        Stack<Character> st = new Stack<>();
        boolean ans = true;
        
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            
            if(ch=='(' || ch=='{' || ch=='[')
            {
                st.push(ch);
            }
            
            else if(ch==')')
            {
                ans = handle(st,'(');
                
                if(ans==false)
                    return false;
            }
            
            else if(ch=='}')
            {
                ans = handle(st,'{');
                
                if(ans==false)
                    return false;
            }
            
            else if(ch==']')
            {
                ans = handle(st,'[');
                
                if(ans==false)
                    return false;
            }
        }
        
        if(st.size()!=0)
            ans = false;
        
        else 
            ans = true;
        
        return ans;
    }
    
    private boolean handle(Stack<Character> st, char op)
    {
        if(st.size()==0)
            return false;
        
        else if(st.peek()!=op)
            return false;
        
        else 
        {
            st.pop();
            return true;
        }
    }
}