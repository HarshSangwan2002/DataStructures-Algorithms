import java.util.Scanner; 

public class rotate_90 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] a = new int[n][n];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j] = scn.nextInt();
            }
        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        for(int i=0; i<n; i++)
        {
            reverse(a[i],0,a[0].length-1);
        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        scn.close();
    }

    public static void reverse(int[] a, int i, int j)
    {
        while(i<=j)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] =temp;
            i++;
            j--;
        }
    }
}

