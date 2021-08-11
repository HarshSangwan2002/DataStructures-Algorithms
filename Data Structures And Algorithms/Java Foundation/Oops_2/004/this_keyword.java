public class this_keyword {

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

        public void area(rectangle obj) {

            int res = obj.h * obj.w;
            System.out.println("Area of the rectangle is: " + res);
        }

        public void perimeter(rectangle obj) {

            int res = 2 * (obj.h + obj.w);
            System.out.println("Perimeter of the rectangle is: " + res);
        }

        public void printrectangle(rectangle obj) {

            area(obj);
            perimeter(obj);
            obj.print();
        }
    }

    public static class rectangle {

        int x;
        int y;
        int h;
        int w;

        rectangle() {

            this(0, 0);
        }

        rectangle(int h, int w) {

            this(0, 0, h, w);
        }

        rectangle(int x, int y, int h, int w) {

            this.x = x;
            this.y = y;
            this.h = h;
            this.w = w;

            sum s = new sum();
            s.printrectangle(this);
        }

        public void print() {

            System.out.println(this.x + "," + this.y);
            System.out.println(this.h + "X" + this.w);
        }
    }

    public static void main(String[] args) {

        // sum s0 = new sum();

    }
}