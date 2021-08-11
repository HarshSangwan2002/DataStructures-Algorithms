public class constructor_overload {

    public static class Pair {

        int h;
        int l;
        int b;

        public Pair(int l, int b, int h) {

            this.h = h;
            this.l = l;
            this.b = b;
        }

        public Pair(int l) {

            this.l = l;
            this.b = l;
            this.h = l;
        }

        public int vol() {

            return l * b * h;
        }

        public int surface_area() {

            return 2 * (l * b + b * h + l * h);
        }
    }

    public static void test1() {

        Pair p1 = new Pair(10, 5, 12);
        Pair p2 = new Pair(10);

        System.out.println(p1.vol());
        System.out.println(p1.surface_area());

        System.out.println(p2.vol());
        System.out.println(p2.surface_area());
    }

    public static void main(String[] args) {

        test1();
    }
}