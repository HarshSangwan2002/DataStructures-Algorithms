import java.util.*;

public class time {

    public static void main(String[] args) {

        int n = 10000;

        StringBuilder s = new StringBuilder("");

        long st = System.currentTimeMillis();

        for (int i = 0; i < n; i++) // O(n^2)
            s.append(i);

        long en = System.currentTimeMillis();

        System.out.println(en - st);
    }
}
