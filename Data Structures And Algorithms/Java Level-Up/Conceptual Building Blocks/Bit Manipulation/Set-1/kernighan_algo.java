import java.util.*;

public class kernighan_algo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // write your code here
        int ct = 0;
        int mask = (n & -n);

        while (n != 0) {
            n = n - mask;
            mask = (n & -n);
            ct++;
        }

        System.out.println(ct);
        scn.close();
    }

}