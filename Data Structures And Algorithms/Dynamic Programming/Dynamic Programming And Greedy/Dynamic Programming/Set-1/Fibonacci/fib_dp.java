import java.util.Scanner; 

public class fib_dp {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(fibmemo(n,new int[n+1]));
        scn.close();
    }

    public static int fibmemo(int n, int[] qb)
    {
        if(n==0 || n==1)  //base case
        return n;

        if(qb[n]!=0)
        return qb[n];

        int fib1 = fibmemo(n-1,qb);
        int fib2 = fibmemo(n-2,qb);
        qb[n] = fib1+fib2;
        return qb[n];
    }
}
