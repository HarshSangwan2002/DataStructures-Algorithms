import java.util.Scanner; 

public class pattern13{
    
    public int fact(int n)
    {
        int res=1;
        
        for(int i=n; i>=1; i--)
        {
            res*=i;
        }
        
        return res;
    }
    
    public static void main(String[] args){
        
        pattern13 o  = new pattern13();
        
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(o.fact(i)/(o.fact(j)*o.fact(i-j))+"\t");
            }
            
            System.out.println();
        }

        scn.close();
    }
}
