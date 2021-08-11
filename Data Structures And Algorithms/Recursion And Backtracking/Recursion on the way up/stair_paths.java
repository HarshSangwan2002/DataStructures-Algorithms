import java.util.Scanner; 

public class stair_paths {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print(n,"");
        scn.close();
    }

    public static void print(int n, String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }

        if(n<0)
        return;

        print(n-1,ans+"1");
        print(n-2,ans+"2");
        print(n-3,ans+"3");
    }
}
