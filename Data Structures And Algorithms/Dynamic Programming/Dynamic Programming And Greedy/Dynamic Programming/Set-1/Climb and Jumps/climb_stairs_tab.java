import java.util.Scanner; 

public class climb_stairs_tab {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int cp = climb(n);
        System.out.println(cp);
        scn.close();
    }

    public static int climb(int n)
    {
        int[] dp = new int[n+1];
        dp[0] = 1;

        for(int i=1; i<dp.length; i++)
        {
            if(i==1)
            {
                dp[i] = dp[i-1];
            }

            else if(i==2)
            {
                dp[i] = dp[i-1] + dp[i-2];
            }

            else 
            {
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }

        return dp[n];
    }
}
