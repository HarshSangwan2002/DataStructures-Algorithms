import java.util.Scanner; 

public class spiral{
    
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

        int row_start=0;
        int row_end=n-1;
        int col_start=0;
        int col_end=m-1;
        int tne=(n*m);
        int count=0;

        while(count<tne)
        {
            //lw
            for(int row=row_start; row<=row_end && count<tne; row++)
            {
                System.out.println(a[row][col_start]);
                count++;
            }
            col_start++;

            //bw
            for(int col=col_start; col<=col_end && count<tne; col++)
            {
                System.out.println(a[row_end][col]);
                count++;
            }
            row_end--;

            //rw
            for(int row=row_end; row>=row_start && count<tne; row--)
            {
                System.out.println(a[row][col_end]);
                count++;
            }
            col_end--;

            //tw
            for(int col=col_end; col>=col_start && count<tne; col--)
            {
                System.out.println(a[row_start][col]);
                count++;
            }
            row_start++;

        }

        scn.close();
    }
}
