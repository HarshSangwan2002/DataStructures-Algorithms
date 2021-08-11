import java.util.Scanner; 

public class coin_change_combinations_dp {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();
        int[] dp = new int[tar+1];

        dp[0] = 1;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=1; j<dp.length; j++)
            {
                if(j>=arr[i])
                {
                    dp[j]+=dp[j-arr[i]];
                }
            }
        }

        System.out.println(dp[tar]);
        scn.close();
    }
}
