import java.util.Scanner; 
import java.util.*; 

/**
 * get_maze_path
 */
public class get_maze_path {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> ans = getpaths(1,1,n,m);
        System.out.println(ans);
        scn.close();
    }

    public static ArrayList<String> getpaths(int sr, int sc, int dr, int dc)
    {
        if(sr==dr && sc==dc)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        if(sr>dr || sc>dc)
        {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> hpaths = getpaths(sr,sc+1,dr,dc);
        ArrayList<String> vpaths = getpaths(sr+1,sc,dr,dc);
        ArrayList<String> mres = new ArrayList<>();

        for(String res:hpaths)
        {
            mres.add("h"+res);
        }

        for(String res:vpaths)
        {
            mres.add("v"+res);
        }

        return mres;
    }
}