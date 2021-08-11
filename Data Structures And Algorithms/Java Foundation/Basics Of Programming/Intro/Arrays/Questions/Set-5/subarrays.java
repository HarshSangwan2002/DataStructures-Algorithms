import java.util.Scanner; 

/**
 * subarrays
 */
public class subarrays {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = scn.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                for(int k=i; k<=j; k++)
                {
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
        }

        scn.close();
    }
}