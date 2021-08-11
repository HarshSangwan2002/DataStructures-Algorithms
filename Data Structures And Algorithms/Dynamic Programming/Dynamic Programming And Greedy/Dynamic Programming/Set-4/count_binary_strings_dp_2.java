import java.util.Scanner; 

/**
 * count_binary_strings_dp_2
 */
public class count_binary_strings_dp_2 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int old0 = 1;
        int old1 = 1;

        for(int i=2; i<=n; i++)
        {
            int new1 = old0 + old1;
            int new0 = old1;

            old0 = new0;
            old1 = new1;
        }
        
        System.out.println(old0+old1);
        scn.close();
    }
}