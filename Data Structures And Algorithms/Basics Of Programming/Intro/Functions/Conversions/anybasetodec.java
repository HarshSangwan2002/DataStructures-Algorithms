import java.util.Scanner;

public class anybasetodec {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);

        scn.close();
     }
    
     public static int getValueIndecimal(int n, int b){
        
        int x=1,ans=0;
        
        while(n!=0)
        {
            int last = n%10;
            ans+=(last)*x;
            x*=b;
            n/=10;
        }
        
        return ans;
     }
}
