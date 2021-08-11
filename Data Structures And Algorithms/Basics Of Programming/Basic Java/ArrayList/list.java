import java.util.ArrayList;

import java.util.*;

public class list {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.add(3, 1000);
        list.get(0);
        list.set(1, -1);
        list.remove(1);
        System.out.println(list);

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Hello");
        l2.add("Bellow");
        l2.add("Cello");

        for (String val : l2) {

            System.out.println(val);
        }

        System.out.println(l2);
    }
}
