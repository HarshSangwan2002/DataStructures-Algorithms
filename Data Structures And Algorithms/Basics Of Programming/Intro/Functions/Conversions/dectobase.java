import java.util.Scanner;

public class dectobase {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);

      scn.close();
   }
  
   public static int getValueInBase(int n, int b){
       
       int x=1,ans=0;
       
       while(x<=n)
       x*=b;
       
       while(x!=0)
       {
           int first = n/x;
           ans=ans*10+first;
           n=n%x;
           x/=b;
       }
       
       return ans;
    }
}
