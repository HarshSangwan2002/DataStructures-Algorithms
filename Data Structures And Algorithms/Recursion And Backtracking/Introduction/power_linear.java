import java.util.*; 

public class power_linear {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
      
        System.out.println(power(x,n));
        scn.close();
    }

    public static int power(int x, int n)
    {
        if(n==0)  //base case
        return 1;

        return x*power(x,n-1);
    }
}
