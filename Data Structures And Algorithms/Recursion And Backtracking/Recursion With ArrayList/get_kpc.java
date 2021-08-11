import java.util.Scanner; 
import java.util.ArrayList;

/**
 * get_kpc
 */
public class get_kpc {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> ans = kpc(str);
        System.out.println(ans);
        scn.close();
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs" ,"tu" ,"vwx", "yz"};

    public static ArrayList<String> kpc(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = kpc(ros);
        ArrayList<String> mres = new ArrayList<>();

        for(int i=0; i<codes[ch-'0'].length(); i++)
        {
            for(String res:rres)
            {
                mres.add(codes[ch-'0'].charAt(i)+res);
            }
        }

        return mres;
    }
}

