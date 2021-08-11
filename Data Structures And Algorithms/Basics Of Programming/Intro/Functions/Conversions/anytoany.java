import java.util.Scanner;

public class anytoany {

    public static void main(String[] args){

    
    Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     
     int ans = to_dec(n,sourceBase);
     int fans = to_base(ans,destBase);
     
     System.out.print(fans);
     scn.close();
   }   
   
    public static int to_dec(int n, int b)
    {
        int x=1,ans=0;
        
        while(n>0)
        {
            int last = n%10;
            ans+=(last)*x;
            n/=10;
            x*=b;
        }
        
        return ans;
    }
    
    public static int to_base(int n, int b)
    {
        int x=1,ans=0;
        
        while(x<=n)
        {
            x*=b;
        }
        
        x/=b;
        
        while(x>0)
        {
            int first = n/x;
            ans=ans*10+first;
            n=n%x;
            x/=b;
        }
        
        return ans;
    }
}

