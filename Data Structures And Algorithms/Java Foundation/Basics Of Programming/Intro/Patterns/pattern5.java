import java.util.Scanner; 

/**
 * pattern5
 */
public class pattern5 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int spc=n/2;
        
        for(int i=1; i<=n/2+1; i++)
        {
            for(int j=1; j<=spc; j++)
            {
                System.out.print("\t");
            }
            
            spc--;
            for(int j=1; j<=(2*i)-1; j++)
            {
                System.out.print("*\t");
            }
            
            System.out.println();
        }
        
        spc=1;
        
        for(int i=n/2; i>=1; i--)
        {
            for(int j=1; j<=spc; j++)
            {
                System.out.print("\t");
            }
            
            spc++;
            for(int j=1; j<=(2*i)-1; j++)
            {
                System.out.print("*\t");
            }
            
            System.out.println();
        }
        scn.close();
    }
}
