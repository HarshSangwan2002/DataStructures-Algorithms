import java.util.Scanner; 

public class display_Array {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];
        
        for(int i=0; i<n; i++)
        a[i] = scn.nextInt();

        display(a,0);
        scn.close();
    }

    public static void display(int[] a, int idx)
    {
        if(idx==a.length)
        return;

        System.out.println(a[idx]);
        display(a,idx+1);
    }

}
