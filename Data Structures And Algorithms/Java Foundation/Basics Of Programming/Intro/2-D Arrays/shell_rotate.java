import java.io.*;
import java.util.*;
import java.util.Scanner; 

public class shell_rotate{

    public static void main(String[] args) throws Exception {
        
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
        
        int s = scn.nextInt();
        int r = scn.nextInt();
        
        shellrotate(a,s,r);
        display(a);
        scn.close();
    }
    
    public static void shellrotate(int[][] a, int s, int r)
    {
        int [] oned = fill_oned(a,s);
        rotate(oned,r);
        fill_shell(a,s,oned);
    }

    public static int[] fill_oned(int[][] a, int s)
    {
        int minr = s-1;
        int minc = s-1;
        int maxr = a.length-s;
        int maxc = a[0].length-s;
        int sz = 2*(maxr-minr + maxc-minc);
        
        int [] arr = new int[sz];
        
        int idx=0;
        //lw
        for(int i=minr,j=minc; i<=maxr; i++)
        {
            arr[idx] = a[i][j];
            idx++;
        }
        
        //bw
        for(int i=maxr,j=minc+1; j<=maxc; j++)
        {
            arr[idx] = a[i][j];
            idx++;
        }
        
        //rw
        for(int i=maxr-1,j=maxc; i>=minr; i--)
        {
            arr[idx] = a[i][j];
            idx++;
        }
        
        //tw
        for(int i=minr,j=maxc-1; j>minc; j--)
        {
            arr[idx] = a[i][j];
            idx++;
        }
        
        return arr;
    }
    
    public static void rotate(int[] ap, int r)
    {
        r=r%ap.length;
        if(r<0)
        r+=ap.length;
        
        reverse(ap,0,ap.length-r-1);
        
        reverse(ap,ap.length-r,ap.length-1);
        
        reverse(ap,0,ap.length-1);
    }
    
    public static void reverse(int[] ap, int i, int j)
    {
        while(i<=j)
        {
            int temp = ap[i];
            ap[i] = ap[j];
            ap[j] = temp;
            i++;
            j--;
        }
    }
    
    public static void fill_shell(int[][] a, int s, int[] oned)
    {
        int minr = s-1;
        int minc = s-1;
        int maxr = a.length-s;
        int maxc = a[0].length-s;
        
        
        int idx=0;
        //lw
        for(int i=minr,j=minc; i<=maxr; i++)
        {
            a[i][j] = oned[idx];
            idx++;
        }
        
        //bw
        for(int i=maxr,j=minc+1; j<=maxc; j++)
        {
            a[i][j] = oned[idx];
            idx++;
        }
        
        //rw
        for(int i=maxr-1,j=maxc; i>=minr; i--)
        {
            a[i][j] = oned[idx];
            idx++;
        }
        
        //tw
        for(int i=minr,j=maxc-1; j>minc; j--)
        {
            a[i][j] = oned[idx];
            idx++;
        }
        
    }
    
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
