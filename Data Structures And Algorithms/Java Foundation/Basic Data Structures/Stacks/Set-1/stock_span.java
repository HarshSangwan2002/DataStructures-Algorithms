import java.util.Scanner; 
import java.util.Stack;

/**
 * stock_span
 */
public class stock_span {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }

        int[] span = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;

        for(int i=1; i<arr.length; i++)
        {
            while(st.size()!=0 && arr[i]>arr[st.peek()])
            {
                st.pop();
            }

            if(st.size()==0)
            {
                span[i] = i+1;
            }

            else 
            {
                span[i] = i-st.peek();
            }

            st.push(i);
        } 

        // System.out.println(Arrays.toString(lgr));

        for(int val:span)
        {
            System.out.println(val);
        }
        scn.close();
    }
}