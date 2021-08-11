import java.util.*;

public class lambda_exp {

    static Scanner scn = new Scanner(System.in);

    public static class Pair {

        int v1 = 0;
        int v2 = 0;

        Pair(int v1, int v2) {

            this.v1 = v1;
            this.v2 = v2;
        }
    }

    public static void test1() {

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {

            if (a.v1 != b.v1)
                return a.v1 - b.v1;

            return b.v2 - a.v2;
        });

        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scn.nextInt();
            int b = scn.nextInt();

            pq.add(new Pair(a, b));
        }

        while (pq.size() != 0) {
            Pair p = pq.remove();
            System.out.println(p.v1 + " " + p.v2);
        }
    }

    public static void main(String[] args) {

        test1();
    }
}
