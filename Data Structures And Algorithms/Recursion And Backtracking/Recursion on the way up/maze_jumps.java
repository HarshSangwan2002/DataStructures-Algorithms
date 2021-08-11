import java.util.Scanner; 

public class maze_jumps {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        print(1,1,n,m,"");
        scn.close();
    }

    public static void print(int sr, int sc, int dr, int dc, String ans)
    {
        if(sr==dr && sc==dc)
        {
            System.out.println(ans);
            return;
        }

        if(sr>dr || sc>dc)
        return;

        for(int ms=1; ms<=dc-sc; ms++)
        {
            print(sr,sc+ms,dr,dc,ans+"h"+ms);
        }

        for(int ms=1; ms<=dr-sr; ms++)
        {
            print(sr+ms,sc,dr,dc,ans+"v"+ms);
        }

        for(int ms=1; ms<=dc-sc && ms<=dr-sr; ms++)
        {
            print(sr+ms,sc+ms,dr,dc,ans+"d"+ms);
        }
    }

}
