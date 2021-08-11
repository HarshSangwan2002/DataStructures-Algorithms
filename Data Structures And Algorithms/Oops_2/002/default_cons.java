public class default_cons {

    public static class phone {

        String company;
        String color;
        String model;
        int ram;
        int storage;
        int batterypower;

        phone(String company, String color, String model, int ram, int storage, int batterypower) {

            this.company = company;
            this.model = model;
            this.color = color;
            this.ram = ram;
            this.storage = storage;
            this.batterypower = batterypower;
        }

        phone() {

        }

        public void display() {

            System.out.println(this.company);
            System.out.println(this.model);
            System.out.println(this.color);
            System.out.println(this.ram);
            System.out.println(this.storage);
            System.out.println(this.batterypower);
        }
    }

    public static void test1() {

        phone p1 = new phone("One Plus", "Lake blue", "9R 5G", 8, 128, 4500);
        p1.display();
    }

    public static void main(String[] args) {

        test1();
    }
}