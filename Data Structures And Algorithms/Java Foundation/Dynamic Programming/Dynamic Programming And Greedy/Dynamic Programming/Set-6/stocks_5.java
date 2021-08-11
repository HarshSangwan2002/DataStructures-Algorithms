import java.util.Scanner; 

public class stocks_5 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }

        int mpist = 0;
        int lsf = arr[0];
        int[] dp1 = new int[arr.length+1];

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]<lsf)
            {
                lsf = arr[i];
            }

            mpist = arr[i]-lsf;

            if(mpist>dp1[i-1])
            {
                dp1[i] = mpist;
            }

            else 
            {
                dp1[i] = dp1[i-1];
            }
        }

        int mpibt = 0;
        int maf = arr[n-1];
        int[] dp2 = new int[arr.length+1];

        for(int i=n-1; i>=0; i--)
        {
            if(arr[i]>maf)
            {
                maf = arr[i];
            }

            mpibt = maf-arr[i];
 
            if(mpibt>dp2[i+1])
            {
                dp2[i] = mpibt;
            }

            else 
            {
                dp2[i] = dp2[i+1];
            }
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<dp1.length; i++)
        {
            max = Math.max(max,dp1[i]+dp2[i]);
        }

        System.out.println(max);
        scn.close();
    }
}
