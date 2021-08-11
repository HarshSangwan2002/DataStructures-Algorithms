import java.util.Scanner;
    
    public class gcdlcm{
    
    public static void main(String[] args) {
      
       Scanner scn = new Scanner(System.in);
       int num1 = scn.nextInt();
       int num2 = scn.nextInt();
       int a=num1,b=num2,ans;
       
       while(num1%num2!=0)
       {
           int rem = num1%num2;
           
           num1=num2;
           num2=rem;
       }
       
       System.out.println(num2);
       ans=(a*b)/num2;
       System.out.println(ans);
       scn.close();
     }
    }