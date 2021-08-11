import java.util.Scanner;
import java.util.Stack; 

/**
 * sliding_window_maximum_2
 */
public class sliding_window_maximum_2 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        int[] nge = new int[n];
        nge[n-1] = n;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        
        for(int i=n-2; i>=0; i--)
        {
            while(st.size()>0 && arr[i]>=arr[st.peek()])
            {
                st.pop();
            }

            if(st.size()==0)
            {
                nge[i] = n;
            }

            else 
            {
                nge[i] = st.peek();
            }

            st.push(i);
        }

        int j = 0;

        for(int i=0; i<=arr.length-k; i++)
        {
            if(j<i)
            {
                j = i;
            }

            while(nge[j]<i+k)
            {
                j = nge[j];
            }

            System.out.println(arr[j]);
        }

        scn.close();
    }
}