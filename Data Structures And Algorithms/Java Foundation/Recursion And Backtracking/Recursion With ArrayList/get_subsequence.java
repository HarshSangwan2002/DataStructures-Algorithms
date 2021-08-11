import java.util.Scanner; 
import java.util.*;

/**
 * get_subsequence
 */
public class get_subsequence {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        ArrayList<String> ans = gss(str); 
        System.out.println(ans);
        scn.close();
    }

    public static ArrayList<String> gss(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);
        ArrayList<String> mres = new ArrayList<>();

        for(String res:rres)
        {
            mres.add(ch+res);
        }

        for(String res:rres)
        {
            mres.add(""+res);
        }

        return mres;
    }
}