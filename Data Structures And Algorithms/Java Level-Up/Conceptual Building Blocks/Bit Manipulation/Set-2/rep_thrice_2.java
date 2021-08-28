import java.util.*;

public class rep_thrice_2 {

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
        int tn = Integer.MAX_VALUE;
        int tnp1 = 0;
        int tnp2 = 0;

        for (int i = 0; i < arr.length; i++) {
            int cwtn = arr[i] & tn;
            int cwtnp1 = arr[i] & tnp1;
            int cwtnp2 = arr[i] & tnp2;

            tn = tn & ~(cwtn);
            tnp1 = tnp1 | (cwtn);

            tnp1 = tnp1 & ~(cwtnp1);
            tnp2 = tnp2 | (cwtnp1);

            tnp2 = tnp2 & ~(cwtnp2);
            tn = tn | (cwtnp2);
        }

        System.out.println(tnp1);
    }

}