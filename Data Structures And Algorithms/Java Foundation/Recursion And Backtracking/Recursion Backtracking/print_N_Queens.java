import java.util.Scanner; 

public class print_N_Queens {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] chess = new int[n][n];

        queens(chess,"",0);
        scn.close();
    }

    public static void queens(int[][] chess, String ans, int r)
    {
        if(r==chess.length)
        {
            System.out.println(ans+".");
            return;
        }

        for(int col=0; col<chess.length; col++)
        {
            if(check(chess,r,col)==1)
            {
                chess[r][col]=1;
                queens(chess,ans+r+"-"+col+", ",r+1);
                chess[r][col]=0;
            }
        }
    }

    public static int check(int[][] chess, int r, int c)
    {
        for(int i=r-1,j=c; i>=0; i--)
        {
            if(chess[i][j]==1)
            return -1;
        }

        for(int i=r-1,j=c-1; i>=0 && j>=0; i--,j--)
        {
            if(chess[i][j]==1)
            return -1;
        }

        for(int i=r-1,j=c+1; i>=0 && j<chess.length; i--,j++)
        {
            if(chess[i][j]==1)
            return -1;
        }

        return 1;
    }
}
