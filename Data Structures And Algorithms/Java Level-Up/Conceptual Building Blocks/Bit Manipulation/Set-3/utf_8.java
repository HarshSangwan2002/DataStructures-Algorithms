import java.util.*;

public class utf_8 {

    public static boolean solution(int[] arr) {

        int rb = 0;

        for (int val : arr) {
            if (rb == 0) {
                if ((val >> 7) == 0b0)
                    rb = 0;

                else if ((val >> 5) == 0b110)
                    rb = 1;

                else if ((val >> 4) == 0b1110)
                    rb = 2;

                else if ((val >> 3) == 0b11110)
                    rb = 3;
            }

            else {
                if ((val >> 6) == 0b10)
                    rb--;

                else
                    return false;
            }
        }

        if (rb == 0)
            return true;

        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));

        scn.close();
    }

}