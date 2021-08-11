import java.util.*; 

public class power_log {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();

        System.out.println(power(x,n));

        scn.close();
    }

    public static int power(int x, int n)
    {
        if(n==0)
        return 1;

        int xn2 = power(x,n/2);
        int xn = xn2*xn2;

        if(n%2==1)
        xn*=x;

        return xn;
    }
}
