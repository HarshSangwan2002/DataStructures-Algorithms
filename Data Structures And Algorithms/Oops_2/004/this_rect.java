
public class this_rect {

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

            display();
        }

        public void display() {

            System.out.println("Origin at :" + this.x + "," + this.y);
            System.out.println("Dimension :" + this.h + "X" + this.w);
        }
    }

    public static void main(String[] args) {

        rectangle r = new rectangle(1, 1, 4, 3);
        r.display();
    }
}
