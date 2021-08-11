import java.util.*; 

public class incr_decr {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();


        incrdecr(n);
        scn.close();
    }

    public static void incrdecr(int n)
    {
        if(n==0)  //base case
        return; 

        System.out.println(n);
        incrdecr(n-1);
        System.out.println(n);
    }
}
