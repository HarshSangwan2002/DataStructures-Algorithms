import java.util.*; 

public class factorial {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();


        System.out.println(fact(n));
        scn.close();
    }

    public static int fact(int n)
    {
        if(n==1)  //base case
        return 1;

        return n*fact(n-1);
    }
}
