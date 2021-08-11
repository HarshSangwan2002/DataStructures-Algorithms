import java.util.*; 

public class last_index {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];

        for(int i=0; i<n; i++)
        a[i] = scn.nextInt();

        int d = scn.nextInt();

        System.out.println(index(a,0,d));
        scn.close();
    }

    public static int index(int[] a, int idx, int d)
    {
        if(idx==a.length)
        return -1;

        int lsai = index(a,idx+1,d);

        if(lsai==-1 && a[idx]==d)
        return idx;

        else
        return lsai;
    }
}
