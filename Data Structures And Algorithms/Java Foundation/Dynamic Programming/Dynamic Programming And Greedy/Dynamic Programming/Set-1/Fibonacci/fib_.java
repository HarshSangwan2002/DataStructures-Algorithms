import java.util.Scanner; 

/**
 * fib_
 */
public class fib_ {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(fib(n));
        scn.close();
    }

    public static int fib(int n)
    {
        if(n==0 || n==1)  //base case
        return n;

        return fib(n-1) + fib(n-2);
    }
}