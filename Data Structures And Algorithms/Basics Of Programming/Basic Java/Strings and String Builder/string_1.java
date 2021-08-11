import java.util.*;

public class strings {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        System.out.println(str.length()); // Function in string and data member in array
        System.out.println(str.charAt(0));

        System.out.println(str.substring(1, 0));

        scn.close();
    }
}
