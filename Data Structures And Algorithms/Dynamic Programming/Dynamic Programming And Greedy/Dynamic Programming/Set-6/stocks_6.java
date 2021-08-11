import java.util.Scanner; 

public class stocks_6 {
    
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

        for(int t=1; t<dp.length; t++)
        {
            for(int d=1; d<dp[0].length; d++)
            {
                dp[t][d] = dp[t][d-1];

                for(int pd=0; pd<d; pd++)
                {
                    if(dp[t-1][pd]+arr[d]-arr[pd]>dp[t][d])
                    {
                        dp[t][d] = dp[t-1][pd]+arr[d]-arr[pd];
                    }
                }
            }
        }

        System.out.println(dp[k][n-1]);
        scn.close();
    }
}
