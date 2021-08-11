import java.util.Scanner;

/**
 * saddleprice
 */
public class saddleprice {

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
            int svj = 0;
            for(int j=1; j<n; j++)
            {
                if(a[i][svj]>a[i][j])
                {
                    svj=j;
                }
            }

            boolean flag = true;
            for(int k=0; k<n; k++)
            {
                if(a[i][svj]<a[k][svj])
                {
                    flag = false;
                    break;
                }
            }

            if(flag==true)
            {
               System.out.println(a[i][svj]);
               return;
            }
        }

        System.out.println("Invalid input");
        scn.close();
    }
}
