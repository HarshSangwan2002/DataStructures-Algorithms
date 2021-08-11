import java.util.Scanner;
  
  public class noofdigits{
  
  public static void main(String[] args) {
    
     Scanner scn = new Scanner(System.in);
     
     int n = scn.nextInt();
     int nod=0;
     
     while(n!=0)
     {
         n/=10;
         nod++;
     }
     
     System.out.println(nod);
     scn.close();
   }
  }