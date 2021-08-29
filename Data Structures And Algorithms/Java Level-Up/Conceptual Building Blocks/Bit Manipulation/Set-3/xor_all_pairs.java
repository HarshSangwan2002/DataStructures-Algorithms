import java.util.*;

public class xor_all_pairs {

    public static int solution(int[] arr) {

        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor ^= (2 * arr[i]);
        }

        return xor;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));

        scn.close();
    }

}