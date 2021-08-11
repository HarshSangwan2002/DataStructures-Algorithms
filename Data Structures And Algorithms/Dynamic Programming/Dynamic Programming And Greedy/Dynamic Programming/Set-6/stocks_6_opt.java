import java.util.Scanner; 

public class stocks_6_opt {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }
 
        int k = scn.nextInt();

        int[][] dp = new int[k+1][n];

        for(int t=1; t<=k; t++)
        {
            int max = Integer.MIN_VALUE;

            for(int d=1; d<arr.length; d++)
            {
                if(dp[t-1][d-1]-arr[d-1]>max)
                {
                    max = dp[t-1][d-1]-arr[d-1];
                }

                if(max+arr[d]>dp[t][d-1])
                {
                    dp[t][d] = max + arr[d];
                }

                else 
                {
                    dp[t][d] = dp[t][d-1];
                }
            }
        }

        System.out.println(dp[k][n-1]);
        scn.close();
    }
}
