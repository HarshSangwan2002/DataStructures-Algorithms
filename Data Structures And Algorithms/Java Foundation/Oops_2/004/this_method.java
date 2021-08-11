public class this_method {

    public static class phone {

        String model = "";
        String brand = "";
        int ram = 0;

        phone(String brand, String model, int ram) {

            this.brand = brand;
            this.model = model;
            this.ram = ram;
            System.out.println(this);
            this.display();
        }

        public void display() {

            String str = "Brand : " + this.brand + "\nModel : " + this.model + "\nRam : " + this.ram;

            System.out.println(str);
        }
    }

    public static void main(String[] args) {

        phone p1 = new phone("One Plus", "9R 5G", 8);
        System.out.println(p1);

    }
}
