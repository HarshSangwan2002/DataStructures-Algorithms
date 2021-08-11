import java.util.Scanner;
    
    public class digofnumber{
    
    public static void main(String[] args) {
      
      Scanner scn = new Scanner(System.in);
      
      int n = scn.nextInt();
      int nod=0,div,a=n;
      
      while(n!=0)
      {
          n/=10;
          nod++;
      }
      
      div=(int)Math.pow(10,nod-1);
      
      while(div!=0)
      {
          int x=a/div;
          a=a%div;
          div/=10;
          System.out.println(x);
      }
      scn.close();
     }
    }