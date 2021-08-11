import java.util.Scanner; 
import java.io.*;
import java.util.*;

public class exitpoint {
    
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


        int dir = 0;
        int i=0,j=0;

        while(true)
        {
            dir = (dir+a[i][j])%4;

            if(dir==0)
            j+=1;

            if(dir==1)
            i+=1;

            if(dir==2)
            j-=1;

            if(dir==3)
            i-=1;

            if(i<0)
            {
                i+=1;
                break;
            }

            if(j<0)
            {
                j+=1;
                break;
            }

            if(i>=n)
            {
                i-=1;
                break;
            }

            if(j>=m) 
            {
                j-=1;
                break;
            }
        }

        System.out.print(i+" "+j);
        
        scn.close();
    }
}
