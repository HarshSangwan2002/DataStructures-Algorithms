import java.io.*;
import java.util.*;

public class josephus_problem {

    public static int hp2(int n) {

        int p = 2;
        while (p <= n) {

            p = p * 2;
        }

        p /= 2;
        return n % p;
    }

    public static int solution(int n) {

        int l = hp2(n);
        return 2 * l + 1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(solution(n));
    }

}