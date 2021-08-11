import java.util.*;

public class zig_zag {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        pzz(n);

        scn.close();
    }

    public static void pzz(int n)
    {
        if(n==0)  //base
        return; 

        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
    }
}
