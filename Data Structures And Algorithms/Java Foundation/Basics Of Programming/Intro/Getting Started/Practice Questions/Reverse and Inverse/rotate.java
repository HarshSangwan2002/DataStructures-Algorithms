import java.util.Scanner;
   
   public class rotate{
   
   public static void main(String[] args) {
      
      Scanner scn = new Scanner(System.in);
      
      int n = scn.nextInt(),nod=0,ans,div,mul,a=n;
      int k = scn.nextInt();
      
      while(n!=0)
      {
          n/=10;
          nod++;
      }
      
      k=k%nod;
      
      if(k<0)
      {
          k=k+nod;
      }
      
      div=(int)Math.pow(10,k);
      mul=(int)Math.pow(10,nod-k);
      
      ans=(a%div)*mul+(a/div);
      
      System.out.println(ans);
      scn.close();
    }
   }