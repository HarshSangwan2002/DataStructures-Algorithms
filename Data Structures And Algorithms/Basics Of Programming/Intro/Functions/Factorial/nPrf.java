import java.util.Scanner; 

public class nPrf{

    public static display(int n, int r)
    [
        System.out.print(n/r);
    ]

    public static int fact(int n)
    {
        int res=1;
           
        for(int i=1; i<=n; i++)
        {
            res*=i;
        }

        return res;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int r = scn.nextInt();
        
        n = fact(n);
        r = fact(n-r);

        display(n,r);
        
        scn.close();
    }
}
