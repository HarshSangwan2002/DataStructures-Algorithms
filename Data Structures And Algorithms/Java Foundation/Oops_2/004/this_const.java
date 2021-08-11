public class this_const {

    public static class sum {

        sum() {

            this(0, 0);
        }

        sum(int a, int b) {

            this(0, a, b);
        }

        sum(int a, int b, int c) {

            this(0, a, b, c);
        }

        sum(int a, int b, int c, int d) {

            System.out.println("Addition :" + (a + b + c + d));
        }
    }

    public static void main(String[] args) {

    }
}
