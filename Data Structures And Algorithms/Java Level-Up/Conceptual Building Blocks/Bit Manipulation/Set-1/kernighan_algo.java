import java.util.*;

public class kernighan_algo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // write your code here
        int mask = (n & -n);
        int count = 0;

        while (n != 0) {
            n = n - mask;
            mask = (n & -n);
            count++;
        }

        System.out.print(count);
        scn.close();
    }

}