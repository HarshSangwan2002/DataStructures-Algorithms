import java.util.Scanner; 

/**
 * printdecreasing
 */
public class printdecreasing {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        decreasing(n);
        scn.close();
    }

    public static void decreasing(int n)
    {
        if(n==0)  //base case
        return; 

        System.out.println(n);
        decreasing(n-1);
    }
}