import java.util.*;

public class rep_thrice {

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

        String ans = "";
        int count = 0;

        for (int i = 0; i < 32; i++) {
            int mask = (1 << i);

            for (int j = 0; j < arr.length; j++) {
                if ((arr[j] & mask) == 0) {

                }

                else {
                    count++;
                }
            }

            if (count % 3 == 0) {
                ans = "0" + ans;
            }

            else {
                ans = "1" + ans;
            }

            count = 0;
        }

        // System.out.println(ans);
        System.out.println(Integer.parseInt(ans, 2));
    }

}