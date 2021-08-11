import java.util.Scanner; 
import java.util.Stack;
import java.io.*;

/**
 * celebrity_problem
 */
public class celebrity_problem {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++)
        {
            st.push(i);
        }

        while(st.size()>=2)
        {
            int i = st.pop();
            int j = st.pop();

            if(arr[i][j]==1)
            {
                st.push(j);
            }

            else 
            {
                st.push(i);
            }
        }

        int pot = st.pop();

        for(int i=0; i<n; i++)
        {
            if(i!=pot)
            {
                if(arr[i][pot]==0 || arr[pot][i]==1)
                {
                    System.out.println("none");
                    System.exit(0); 
                }
            }
        }

        System.out.println(pot);
        scn.close();
    }
}