import java.util.Scanner; 
import java.util.*; 

/**
 * get_maze_jumps
 */
public class get_maze_jumps {

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
        
        ArrayList<String> mres = new ArrayList<>();

        for(int ms=1; ms<=dc-sc; ms++)
        {
            ArrayList<String> hpaths = getpaths(sr,sc+ms,dr,dc);
            for(String res:hpaths)
            {
                mres.add("h"+ms+res);
            }
        }

        for(int ms=1; ms<=dr-sr; ms++)
        {
            ArrayList<String> vpaths = getpaths(sr+ms,sc,dr,dc);
            for(String res:vpaths)
            {
                mres.add("v"+ms+res);
            }
        }

        for(int ms=1; ms<=dc-sc && ms<=dr-sr; ms++)
        {
            ArrayList<String> dpaths = getpaths(sr+ms,sc+ms,dr,dc);
            for(String res:dpaths)
            {
                mres.add("d"+ms+res);
            }
        }

        return mres;
    }
}