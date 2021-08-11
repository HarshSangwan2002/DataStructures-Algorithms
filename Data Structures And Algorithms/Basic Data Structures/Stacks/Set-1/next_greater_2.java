import java.util.Scanner; 
import java.util.Stack;

public class next_greater_2 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = scn.nextInt();
        }

        int[] nge = new int[arr.length];
        
        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length-1]);  
        nge[arr.length-1] = -1;

        for(int i=n-2; i>=0; i--)
        {
            while(st.size()!=0 && arr[i]>=st.peek())
            {
                st.pop();
            }

            if(st.size()==0)
            {
                nge[i] = -1;
            }

            else 
            {
                nge[i] = st.peek();
            }

            st.push(arr[i]);
        }

        for(int val:nge)
        {
            System.out.println(val);
        }

        scn.close();
    }
}
