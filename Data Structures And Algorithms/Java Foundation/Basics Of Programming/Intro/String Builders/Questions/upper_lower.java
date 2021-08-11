import java.util.*;

public class upper_lower {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(sol(str));
        scn.close();
    }

    public static String sol(String str)
    {
        StringBuilder ans = new StringBuilder("");

        for(int i=0; i<str.length(); i++)
        {
            char curr = str.charAt(i);

            if(curr>='a' && curr<='z')
            {
                char upc = (char)(curr-32);
                ans.append(upc);
            }

            else
            {
                char lwc = (char)(curr+32);
                ans.append(lwc);
            }
        }

        return ans.toString();
    }
}
