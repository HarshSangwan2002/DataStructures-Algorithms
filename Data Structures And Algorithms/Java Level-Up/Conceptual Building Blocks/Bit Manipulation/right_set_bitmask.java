import java.util.*;

public class right_set_bitmask {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // write your code here

        int mask = n & -n;

        System.out.println(Integer.toBinaryString(mask));
        scn.close();
    }

}