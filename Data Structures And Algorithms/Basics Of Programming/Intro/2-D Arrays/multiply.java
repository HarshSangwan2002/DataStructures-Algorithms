import java.util.Scanner; 

public class multiply{
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int [][] a1 = new int[n1][m1];

        for(int i=0; i<n1; i++)
        {
            for(int j=0; j<m1; j++)
            {
                a1[i][j] = scn.nextInt();
            }
        }

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int [][] a2 = new int[n2][m2];

        int [][] ans = new int[n1][m2];

        for(int i=0; i<n2; i++)
        {
            for(int j=0; j<m2; j++)
            {
                a2[i][j] = scn.nextInt();
            }
        }

        if(m1==n2)
        {
            for(int i=0; i<n1; i++)
            {
                for(int j=0; j<m2; j++)
                {
                    for(int k=0; k<m1; k++)
                    {
                        ans[i][j]+=a1[i][k]*a2[k][j];
                    }
                }
            }

            for(int i=0; i<n1; i++)
            {
                for(int j=0; j<m2; j++)
                {
                    System.out.print(ans[i][j]+" ");
                }

                System.out.println();
            }
        }

        else 
        {
            System.out.println("Invalid input");
        }

        scn.close();
    }
}
