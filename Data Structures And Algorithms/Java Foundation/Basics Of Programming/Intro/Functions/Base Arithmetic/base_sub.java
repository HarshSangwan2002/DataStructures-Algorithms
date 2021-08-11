import java.util.Scanner; 

public class base_sub{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int d = sub(b,n1,n2);
        System.out.println(d);
        scn.close();
    }

    public static int sub(int b, int n1, int n2)
    {
        int ans = 0;
        int x = 1;
        int c = 0;
        int d;

        while(n2>0)
        {
            int d1 = n1%10;
            int d2 = n2%10;
            n1/=10;
            n2/=10;

            d2+=c;
            if(d2>=d1)
            {
                c = 0;
                d = d2 - d1;
            }

            else
            {
                c = -1;
                d = d2 - d1 + b;
            }
            
            ans+=(d*x);
            x*=10;
        }

        return ans;
    }
}
