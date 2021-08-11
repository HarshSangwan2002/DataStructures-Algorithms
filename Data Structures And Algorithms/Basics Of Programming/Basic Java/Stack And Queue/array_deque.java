import java.util.*;

public class array_deque {

    public static void main(String[] args) {

        ArrayDeque<Integer> q = new ArrayDeque<>();

        q.addLast(10);
        q.addFirst(20);
        q.remove();

        System.out.println(q);
    }
}
