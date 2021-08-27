import java.util.*;

public class josephus_1 {

    public static int solution(int n) {
        // write your code here

        int p = 1;
        int q = -1;
        int rem = -1;
        int div = 2;

        while (q != 1) {
            q = n / div;
            rem = n % div;
            p++;
            div = (int) Math.pow(2, p);
        }

        return 2 * rem + 1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(solution(n));

        scn.close();
    }

}