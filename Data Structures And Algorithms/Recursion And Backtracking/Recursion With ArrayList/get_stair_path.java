import java.util.Scanner;
import java.util.*;

/**
 * get_stair_path
 */
public class get_stair_path {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ans = getpaths(n);
        System.out.println(ans);
        scn.close();
    }

    public static ArrayList<String> getpaths(int n)
    {
        if(n==0)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        if(n<0)
        {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> p1 = getpaths(n-1);
        ArrayList<String> p2 = getpaths(n-2);
        ArrayList<String> p3 = getpaths(n-3);
        ArrayList<String> mres = new ArrayList<>();

        for(String res:p1)
        {
            mres.add(1+res);
        }

        for(String res:p2)
        {
            mres.add(2+res);
        }

        for(String res:p3)
        {
            mres.add(3+res);
        }

        return mres;
    }
}