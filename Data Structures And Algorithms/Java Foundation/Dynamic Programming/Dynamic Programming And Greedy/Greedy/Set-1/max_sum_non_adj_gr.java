import java.util.Scanner; 

public class max_sum_non_adj_gr {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }

        int inc = arr[0];
        int exc = 0;

        for(int i=1; i<arr.length; i++)
        {
            int newinc = exc + arr[i];
            int newexc = Math.max(inc,exc);

            inc = newinc;
            exc = newexc;
        }

        System.out.println(Math.max(inc,exc));
        scn.close();
    }
}
