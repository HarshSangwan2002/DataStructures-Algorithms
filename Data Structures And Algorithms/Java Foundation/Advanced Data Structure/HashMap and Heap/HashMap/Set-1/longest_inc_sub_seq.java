import java.util.*;

public class longest_inc_sub_seq {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        Set<Integer> set = new HashSet<>();

        for (int val : arr)
            set.add(val);

        int digit = -1;
        int maxf = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (!set.contains(arr[i] - 1)) {
                int tl = 1;
                while (set.contains(arr[i] + tl)) {
                    tl++;
                }

                if (tl > maxf) {
                    digit = arr[i];
                    maxf = tl;
                }
            }
        }

        for (int i = 0; i < maxf; i++)
            System.out.println(digit + i);

        scn.close();
    }

}