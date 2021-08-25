import java.util.*;

public class intro {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int[] arr = { 33, 0, -1, 44 };

        for (int i = 0; i < arr.length; i++)
            pq.add(arr[i]);

        while (pq.size() != 0)
            System.out.println(pq.remove());
    }
}
