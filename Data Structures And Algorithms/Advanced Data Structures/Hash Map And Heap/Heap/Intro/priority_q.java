import java.util.*;

public class priority_q {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Space heap-sort:
        // To give priority to larger elements use Collections.reverseOrder

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int val : arr)
            pq.add(val);

        while (pq.size() != 0) {
            System.out.println(pq.remove());
        }

        scn.close();
    }
}
