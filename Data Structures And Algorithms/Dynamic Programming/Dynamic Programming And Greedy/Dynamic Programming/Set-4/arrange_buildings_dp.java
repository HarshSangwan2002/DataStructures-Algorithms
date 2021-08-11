import java.util.Scanner; 

/**
 * arrange_buildings_dp
 */
public class arrange_buildings_dp {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int oldb = 1;
        int olds = 1;

        for(int i=2; i<=n; i++)
        {
            int newb = olds;
            int news = olds + oldb;

            oldb = newb;
            olds = news;
        }

        long total = olds + oldb;
        total = (long) Math.pow(total,2);

        System.out.println(total);
        scn.close();
    }
}