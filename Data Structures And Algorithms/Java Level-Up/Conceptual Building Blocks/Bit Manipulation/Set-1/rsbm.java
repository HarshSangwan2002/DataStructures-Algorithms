import java.util.*;

public class rsbm {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // write your code here
        int mask = (n & -n);
        System.out.println(Integer.toBinaryString(mask));
        scn.close();
    }

}