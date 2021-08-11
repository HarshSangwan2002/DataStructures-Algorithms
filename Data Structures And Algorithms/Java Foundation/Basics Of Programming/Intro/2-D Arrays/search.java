import java.util.Scanner;  

/**
 * search
 */
public class search {

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

        int d = scn.nextInt();

        int r=0,c=n-1;

        while(r>=0 && c>=0 && r<n && c<n)
        {
            if(a[r][c]==d)
            {
                System.out.print(r+" "+c);
                return;
            }

            else if(a[r][c]>d)
            {
                c--;
            }

            else 
            {
                r++;
            }
        }

        System.out.println("Not found");
        scn.close();
    }
}
