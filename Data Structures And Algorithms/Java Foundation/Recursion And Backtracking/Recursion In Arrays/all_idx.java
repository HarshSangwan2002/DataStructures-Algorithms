import java.util.Scanner; 

public class all_idx {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];

        for(int i=0; i<n; i++)
        a[i] = scn.nextInt();


        int d = scn.nextInt();

        int [] arr = index(a,d,0,0);

        if(arr.length==0)
        {
            System.out.println(" ");
            System.exit(0);
        }

        for(int i=0; i<arr.length; i++)
        System.out.println(arr[i]);

        scn.close();
    }

    public static int[] index(int[] a, int d, int idx, int fsf)
    {
        if(a.length==idx) 
        return new int[fsf];

        if(a[idx]==d)
        {
            int [] iarr = index(a,d,idx+1,fsf+1);
            iarr[fsf] = idx;
            return iarr; 
        }

        else 
        {
           int [] iarr = index(a,d,idx+1,fsf);
           return iarr;  
        }
    }
}
