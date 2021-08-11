import java.util.Scanner; 

public class pattern5sec {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int st=1,spc=n/2;
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=spc; j++)
            {
                System.out.print("\t");
            }
            
            for(int j=1; j<=st; j++)
            {
                System.out.print("*\t");
            }
            
            if(i<=n/2)
            {
                spc--;
                st+=2;
            }
            
            else
            {
                spc++;
                st-=2;
            }
            
            System.out.println();
        }
        scn.close();
    }
}
