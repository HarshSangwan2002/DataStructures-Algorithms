import java.util.Scanner; 

public class coin_change_permutations_dp {
    
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

        for(int i=1; i<dp.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                if(i>=arr[j])
                {
                    dp[i]+=dp[i-arr[j]];
                }
            }
        }

        System.out.println(dp[tar]);
        scn.close();
    }
}
