import java.util.*;

/**
 * custom_lambda
 */
public class custom_lambda {

    public static Scanner scn = new Scanner(System.in);

    public static void test1() {

        Integer[] arr = { 2, 5, -1, 0, 5, 3, 2, 5, -4, 3 };

        Arrays.sort(arr);

        System.out.print(Arrays.toString(arr));
    }

    public static void test2() {

        Integer[] arr = { 2, 5, -1, 0, 5, 3, 2, 5, -4, 3 };

        Arrays.sort(arr, (a, b) -> {

            return b - a;
        });

        System.out.print(Arrays.toString(arr));
    }

    public static void test3() {

        String[] arr = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        Arrays.sort(arr, (a, b) -> {

            return a.length() - b.length();
        });

        System.out.print(Arrays.toString(arr));
    }

    public static class Pair {

        int v1 = 0, v2 = 0;

        Pair(int v1, int v2) {

            this.v1 = v1;
            this.v2 = v2;
        }
    }

    public static void test4() {

        ArrayList<Pair> list = new ArrayList<>();
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scn.nextInt();
            int b = scn.nextInt();

            list.add(new Pair(a, b));
        }

        Collections.sort(list, (a, b) -> {

            // this - other --> Default behaviour
            // other - this --> Rverse of default behaviour

            if (a.v1 != b.v1)
                return a.v1 - b.v1;

            return b.v2 - a.v2;
        });

        for (int i = 0; i < n; i++) {
            Pair p = list.get(i);

            System.out.println(p.v1 + " " + p.v2);
        }
    }

    public static void main(String[] args) {

        test1(); // To sort in increasing order
        System.out.println();
        test2(); // To sort in decreasing order
        System.out.println();
        test3();
        System.out.println();
        test4();
    }
}