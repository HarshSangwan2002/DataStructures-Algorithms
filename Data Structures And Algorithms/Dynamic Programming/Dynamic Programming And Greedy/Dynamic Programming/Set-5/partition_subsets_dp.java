import java.util.Scanner;

public class partition_subsets_dp {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        if(n==0 || k==0 || n<k)
        {
            System.out.println(0);
            System.exit(0);
        }

        int[][] dp = new int[k+1][n+1];
        
        for(int i=1; i<dp.length; i++)
        {
            for(int j=1; j<dp[0].length; j++)
            {
                if(j<i)
                {
                    dp[i][j] = 0;
                }

                else if(j==i)
                {
                    dp[i][j] = 1;
                }

                else 
                {
                    dp[i][j] = dp[i-1][j-1] + (j*dp[i][j-1]);
                }
            }
        }

        System.out.println(dp[k][n]);
        scn.close();
    }
}
