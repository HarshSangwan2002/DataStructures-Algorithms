import java.util.Scanner;

public class factorization {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
   
        int n = scn.nextInt();
        
        if(n==1)
        {
            System.out.print(1 + " ");
            System.exit(0);
        }
        
        for(int div=2; div*div<=n; div++)
        {
            while(n%div==0)
            {
                n/=div;
                System.out.print(div+" ");
            }
        }
        
        if(n!=1)
        System.out.print(n);
        scn.close();
    }
}
