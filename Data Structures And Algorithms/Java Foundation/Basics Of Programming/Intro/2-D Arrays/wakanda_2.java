import java.util.Scanner; 

public class wakanda_2 {
    
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

        for(int g=0; g<a.length; g++)
        {
            for(int i=0,j=g; j<a.length; i++,j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
}
