import java.util.*; 

public class reverse_Array {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];
        
        for(int i=0; i<n; i++)
        {
            a[i] = scn.nextInt();
        }

        reverse(a,0);
        scn.close();
    }

    public static void reverse(int[] a, int idx)
    {
        if(idx==a.length)
        return; 

        reverse(a,idx+1);
        System.out.println(a[idx]);
    }
}
