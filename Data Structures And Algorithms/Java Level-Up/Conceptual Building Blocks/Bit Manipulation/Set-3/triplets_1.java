import java.util.*;

public class triplets_1 {

    public static void solution(int[] arr) {
        // write your code here

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int xor = arr[i];

            for (int k = i + 1; k < arr.length; k++) {
                xor ^= arr[k];

                if (xor == 0)
                    count += (k - i);
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        solution(arr);

        scn.close();
    }

}