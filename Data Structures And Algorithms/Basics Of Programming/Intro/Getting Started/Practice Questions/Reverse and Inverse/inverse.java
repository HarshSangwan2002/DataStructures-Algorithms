import java.util.Scanner;

public class inverse{

public static void main(String[] args) {
 
   Scanner scn = new Scanner(System.in);
   
   int n =scn.nextInt(),ans=0,idx=1;
   
   while(n!=0)
   {
       int last=n%10;
       ans+=idx*((int)Math.pow(10,last-1));
       idx++;
       n/=10;
   }
   
   System.out.println(ans);
   scn.close();
 }
}