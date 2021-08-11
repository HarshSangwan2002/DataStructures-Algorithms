import java.util.*;

public class time {
    
    private static StringBuilder append;

    public static void main(String[] args) {
        
        /* String s = "";
        Time = 108 ms;
        */

        StringBuilder s = new StringBuilder(" ");

        int n = 10000;
        long start = System.currentTimeMillis();
        for(int i=0; i<n; i++)
        {
            s = s.append(i);
        }

        long end = System.currentTimeMillis();

        long duration = end-start;

        System.out.println(duration);
    }
}
