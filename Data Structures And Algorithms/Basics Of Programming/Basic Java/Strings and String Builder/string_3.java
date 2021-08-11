import java.util.*;

public class string_3 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = "abc def ghi jkl";

        String[] parts = str.split(" ");

        for (String st : parts) {

            System.out.println(st);
        }

        scn.close();
    }
}
