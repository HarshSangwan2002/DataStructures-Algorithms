import java.util.*;

public class josephus_2 {

    public static int power(int n) {

        int i = 1;

        while (i * 2 <= n) {
            i *= 2;
        }

        return i;
    }

    public static int solution(int n) {
        // write your code here

        int hp2 = power(n);
        int l = n - hp2;

        return 2 * l + 1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(solution(n));
        scn.close();
    }

}