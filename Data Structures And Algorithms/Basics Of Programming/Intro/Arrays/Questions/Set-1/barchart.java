import java.util.Scanner; 

public class barchart {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];
 
        for(int i=0; i<n; i++)
        a[i] = scn.nextInt();

        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++)
        {
            max = Math.max(a[i],max);
        }

        for(int i = max; i>=1; i--)
        {
            for(int j=0; j<n; j++)
            {
                if(a[j]>=i)
                System.out.print("*"+" ");

                else
                System.out.print("  ");
            }

            System.out.println();
        }

        scn.close();

        scn.close();
    }
}
