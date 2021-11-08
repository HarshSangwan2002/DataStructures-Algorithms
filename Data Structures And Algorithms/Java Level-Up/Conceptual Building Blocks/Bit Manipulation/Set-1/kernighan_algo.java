import java.io.*;
import java.util.*;

public class kernighan_algo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // write your code here
        int rsbm = (n & -n);
        int count = 0;
        while (n > 0) {

            n = n - rsbm;
            rsbm = (n & -n);
            count++;
        }

        System.out.println(count);
    }

}