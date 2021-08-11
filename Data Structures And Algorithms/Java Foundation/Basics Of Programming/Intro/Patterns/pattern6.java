import java.util.Scanner; 

public class pattern6 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int x=1;
        
        for(int i=n/2+1; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*\t");
            }
            
            for(int j=1; j<=(2*x)-1; j++)
            {
                System.out.print("\t");
            }
            x++;
            
            for(int j=1; j<=i; j++)
            {
                System.out.print("*\t");
            }
            
            System.out.println();
        }
        
        int spc=n-2;
        for(int i=2; i<=n/2+1; i++)
        {
             for(int j=1; j<=i; j++)
             {
                 System.out.print("*\t");
             }
             
             for(int j=1; j<=spc; j++)
             {
                 System.out.print("\t");
             }
             spc=spc-2;
             
             for(int j=1; j<=i; j++)
             {
                 System.out.print("*\t");
             }
             
             System.out.println();
        }
        scn.close();
    }
}
