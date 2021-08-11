import java.util.Scanner; 

public class climb_stairs_dp {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] qb = new int[n+1];
        int cp = climbmemo(n,qb);
        System.out.println(cp);
        scn.close();
    }

    public static int climbmemo(int n, int[] qb)
    {
        if(n==0)  //base case
        {
            return 1;
        }

        if(n<0)  //base case
        {
            return 0;
        }

        if(qb[n]!=0)
        return qb[n];
        
        int n1 = climbmemo(n-1,qb);
        int n2 = climbmemo(n-2,qb);
        int n3 = climbmemo(n-3,qb);
        qb[n] = n1+n2+n3;
        return n1+n2+n3;
    }
}
