import java.util.Scanner; 

public class goldmine_dp {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }

        int[][] dp = new int[n][m];

        for(int j=m-1; j>=0; j--)
        {
            for(int i=n-1; i>=0; i--)
            {
                if(j==m-1)
                {
                    dp[i][j] = arr[i][j];
                }

                else if(i==0)
                {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1],dp[i+1][j+1]);
                }

                else if(i==n-1)
                {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1],dp[i-1][j+1]);
                }

                else 
                {
                    dp[i][j] = arr[i][j] + Math.max(dp[i-1][j+1],Math.max(dp[i][j+1],dp[i+1][j+1]));
                }
            }
        }

        int max = Integer.MIN_VALUE;

        for(int r=0; r<n; r++)
        {
            max = Math.max(dp[r][0],max);
        }

        System.out.println(max);
        scn.close();
    }
}
