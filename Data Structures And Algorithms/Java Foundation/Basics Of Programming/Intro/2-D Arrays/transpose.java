import java.util.Scanner; 

public class transpose {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] a = new int[n][m];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
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
            for(int j=0; j<m; j++)
            {
                System.out.print(a[i][j]+" ");
            }

            System.out.println();
        }

        scn.close();
    }
}
