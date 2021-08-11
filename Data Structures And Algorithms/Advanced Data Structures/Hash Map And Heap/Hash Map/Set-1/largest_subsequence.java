import java.io.*;
import java.util.*;

public class largest_subsequence {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        HashMap<Integer, Boolean> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hm.put(a[i], true);
        }

        for (int i = 0; i < n; i++) {
            if (hm.containsKey(a[i] - 1)) {
                hm.put(a[i], false);
            }
        }

        int maxsp = 0;
        int maxl = 0;

        for (int i = 0; i < n; i++) {
            if (hm.get(a[i])) {
                int tl = 1;
                int tsp = a[i];

                while (hm.containsKey(tsp + tl)) {
                    tl++;
                }

                if (tl > maxl) {
                    maxl = tl;
                    maxsp = tsp;
                }
            }
        }

        for (int i = 0; i < maxl; i++) {
            System.out.println(maxsp + i);
        }

        scn.close();
    }

}