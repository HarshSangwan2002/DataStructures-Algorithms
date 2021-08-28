import java.util.*;

public class two_uniq {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        solution(arr);

        scn.close();
    }

    public static void solution(int[] arr) {
        // write your code here

        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }

        int x = 0;
        int y = 0;
        int rsbm = (xor & -xor);

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & rsbm) == 0) {
                x = x ^ arr[i];
            }

            else {
                y = y ^ arr[i];
            }
        }

        if (x < y) {
            System.out.println(x);
            System.out.println(y);
        }

        else {
            System.out.println(y);
            System.out.println(x);
        }
    }

}