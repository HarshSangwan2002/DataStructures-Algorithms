import java.util.*; 

public class max_Array {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];

        for(int i=0; i<n; i++)
        a[i] = scn.nextInt();

        System.out.println(max(a,0));
        scn.close();
    }

    public static int max(int[] a, int idx)
    {
        if(idx==a.length-1)
        return a[idx];

        int misa = max(a,idx+1);

        if(misa>a[idx])
        return misa;

        else
        return a[idx];
    }
}
