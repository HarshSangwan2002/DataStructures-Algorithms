import java.util.Scanner; 

public class paint_house_many_color_gr_1 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c = scn.nextInt();

        int[][] arr = new int[n][c];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<c; j++)
            {
               arr[i][j] = scn.nextInt();
            }
        }

        int[][] dp = new int[n][c];

        for(int j=0; j<c; j++)
        {
            dp[0][j] = arr[0][j];
        }

        for(int i=1; i<n; i++)
        {
            for(int j=0; j<c; j++)
            {
                int min = Integer.MAX_VALUE;
                for(int k=0; k<c; k++)
                {
                    if(k!=j)
                    {
                        min = Math.min(min,dp[i-1][k]);
                    }
                }

                dp[i][j] = arr[i][j] + min;
            }
        }

        int ans = Integer.MAX_VALUE;
        for(int j=0; j<c; j++)
        {
            ans = Math.min(ans,dp[n-1][j]);
        }

        System.out.println(ans);
        scn.close();
    }
}
