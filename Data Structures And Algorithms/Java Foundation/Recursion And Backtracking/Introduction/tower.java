import java.util.*;

public class tower {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();
        toh(n,n1,n2,n3);

        scn.close();
    }

    public static void toh(int n, int n1, int n2, int n3)
    {
        if(n==0)  //base case
        return;

        toh(n-1,n1,n3,n2);

        System.out.println(n + "[" + n1 + " -> " + n2 + "]");

        toh(n-1,n3,n2,n1);
    }
}
