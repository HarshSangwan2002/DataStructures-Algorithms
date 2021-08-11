import java.util.*;

public class string_builder {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'd');
        System.out.println(sb);

        sb.insert(1, 'p');
        System.out.println(sb);

        System.out.println(sb.deleteCharAt(0));

        sb.append('g');
        System.out.println(sb);

        System.out.println(sb.length());
    }
}
