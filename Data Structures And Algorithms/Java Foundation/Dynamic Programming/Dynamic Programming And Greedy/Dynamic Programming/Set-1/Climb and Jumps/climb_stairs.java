import java.util.Scanner; 

public class climb_stairs {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int cp = climb(n);
        System.out.println(cp);
        scn.close();
    }

    public static int climb(int n)
    {
        if(n==0)  //base case
        {
            return 1;
        }

        if(n<0)  //base case
        {
            return 0;
        }

        int n1 = climb(n-1);
        int n2 = climb(n-2);
        int n3 = climb(n-3);

        return n1+n2+n3;
    }
}
