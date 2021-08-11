public class intro {

    public static class phone {

        String company;
        String color;
        String model;
        int ram;
        int storage;
        int batterypower;

        public void display() {

            StringBuilder sb = new StringBuilder();
            sb.append("Company name : " + this.company + "\n");
            sb.append("Color : " + this.color + "\n");
            sb.append("Model : " + this.model + "\n");
            sb.append("Ram : " + this.ram + "\n");
            sb.append("Storage : " + this.storage + "\n");
            sb.append("Battery Power : " + this.batterypower);
            System.out.println(sb);
        }
    }

    public static void test1() {

        phone p1 = new phone();
        p1.company = "One plus";
        p1.model = "9R 5G";
        p1.color = "Lake blue";
        p1.ram = 8;
        p1.storage = 128;
        p1.batterypower = 4500;

        p1.display();

        phone p2 = new phone();
        p2.company = "One plus";
        p2.model = "9R 5G";
        p2.color = "Lake blue";
        p2.ram = 16;
        p2.storage = 256;
        p2.batterypower = 4500;

        p2.display();
    }

    public static void main(String[] args) {

        test1();
    }
}