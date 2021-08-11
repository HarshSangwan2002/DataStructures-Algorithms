import java.util.Scanner; 

public class wakanda_1 {
    
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
   
        int row = 0;

        for(int col=0; col<m; col++)
        {
            if(col%2==0)
            {
                row = 0;
                while(row<n)
                {
                    System.out.println(a[row][col]);
                    row++;
                }
            }

            else 
            {
                row = n-1;
                while(row>=0)
                {
                    System.out.println(a[row][col]);
                    row--;
                }
            }
        }

        scn.close();      
    }
}
