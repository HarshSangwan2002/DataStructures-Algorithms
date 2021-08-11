import java.util.*;

public class permutations{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        sol(str);
        scn.close();
    }

    public static void sol(String str)
    {
        int n = str.length();
        int f = fact(str.length());

        for(int i=0; i<f; i++)
        {
            StringBuilder ans = new StringBuilder(str);
            int temp = i;

            for(int div=n; div>=1; div--)
            {
               int r = temp%div;
               int q = temp/div;
               
               System.out.print(ans.charAt(r));
               ans.deleteCharAt(r);

               temp = q;
            }

            System.out.println();
        }
    }

    public static int fact(int n)
    {
        int res = 1;

        for(int i=1; i<=n; i++)
        res*=i;

        return res;
    }
}