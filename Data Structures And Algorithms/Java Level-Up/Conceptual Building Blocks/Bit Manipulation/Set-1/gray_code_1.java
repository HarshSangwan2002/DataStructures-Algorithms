import java.util.*;

public class gray_code_1 {

    public static List<Integer> grayCode(int n) {
        // Write your code here

        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < (int) Math.pow(2, n); i++) {
            l.add(i);
        }

        return l;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Integer> ans = grayCode(scn.nextInt());
        Collections.sort(ans);
        System.out.println(ans);
        scn.close();
    }
}