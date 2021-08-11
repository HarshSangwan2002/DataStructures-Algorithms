public class link {

    public static class Pair {

        int x;
        int y;
    }

    public static class rect {

        Pair tl;
        Pair tr;
    }

    public static void main(String[] args) {

        rect r = new rect();

        r.tl = new Pair();
        r.tr = new Pair();

        r.tl.x = 10;
        r.tl.y = 20;

        r.tr.x = 100;
        r.tr.y = 200;
    }
}
