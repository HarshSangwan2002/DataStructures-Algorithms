import java.util.Scanner; 

/**
 * pattern10
 */
public class pattern10 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

     int n =scn.nextInt();
     
     int os=n/2,in=-1;
     
     for(int i=1; i<=n; i++)
     {
          
          for(int j=1; j<=os; j++)
          {
              System.out.print("\t");
          }
          
          System.out.print("*\t");
          
          for(int j=1; j<=in; j++)
          {
              System.out.print("\t");
          }
          
          if(i>1 && i<n)
          {
              System.out.print("*\t");
          }
          
          if(i<=n/2)
          {
              os--;
              in+=2;
          }
          
          else
          {
              os++;
              in-=2;
          }
          System.out.println();
     }


        scn.close();
    }
}