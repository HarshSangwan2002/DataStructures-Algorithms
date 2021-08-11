import java.util.Scanner;

public class triplet {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
     int a = scn.nextInt();
     int b = scn.nextInt();
     int c = scn.nextInt();
     
     int x = Math.max(a,Math.max(b,c));
     int y,z;
     
     if(x==a)
     {
         y=b;
         z=c;
     }
     
     else if(x==b)
     {
         y=a;
         z=c;
     }
     
     else
     {
         y=a;
         z=b;
     }
     
     if(x*x==y*y+z*z)
     System.out.print("true");
     
     else
     System.out.print("false");

     scn.close();
    }
}
