import java.util.Scanner; 

public class pattern6sec {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int spc=1,st=n/2 + 1;
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=st; j++)
            {
                System.out.print("*\t");
            }
            
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
                spc+=2;
                st--;
            }
            
            else
            {
                spc-=2;
                st++;
            }
            
            System.out.println();
        }
        scn.close();
    }
}
