import java.util.Scanner;
   
   public class reverse{
   
   public static void main(String[] args) {
     
     
     Scanner scn = new Scanner(System.in);
     
     int n = scn.nextInt();
     
     while(n!=0)
     {
         int last = n%10;
         n/=10;
         System.out.println(last);
     }
     scn.close();
    }
   }