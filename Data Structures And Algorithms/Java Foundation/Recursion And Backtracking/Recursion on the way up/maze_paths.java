import java.util.Scanner; 

public class maze_paths {
    
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

        print(sr,sc+1,dr,dc,ans+"h");
        print(sr+1,sc,dr,dc,ans+"v");
    }
}
