import java.util.*;

public class abbreviation_1 {

    public static void solve(String str) {
        // write your code here

        StringBuilder sb;
        int count = 0;

        for (int i = 0; i < (1 << str.length()); i++) {
            sb = new StringBuilder();
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                int bit = str.length() - 1 - j;
                char ch = str.charAt(j);

                if ((i & (1 << bit)) != 0) {
                    count++;
                }

                else {
                    if (count == 0) {
                        sb.append(ch);
                    }

                    else {
                        sb.append(count);
                        sb.append(ch);
                        count = 0;
                    }
                }
            }

            if (count > 0)
                sb.append(count);

            System.out.println(sb);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solve(str);

        scn.close();
    }
}