import java.util.*;

public class max_freq_ch {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                int of = map.get(ch);
                map.put(ch, of + 1);
            }

            else {
                map.put(ch, 1);
            }
        }

        int max = Integer.MIN_VALUE;
        char ans = 'a';

        for (Character p : map.keySet()) {
            int f = map.get(p);

            if (f > max) {
                max = f;
                ans = p;
            }
        }

        System.out.println(ans);
        scn.close();
    }

}