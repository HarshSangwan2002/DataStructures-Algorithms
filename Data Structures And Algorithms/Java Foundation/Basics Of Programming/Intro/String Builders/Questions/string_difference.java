import java.util.*; 

public class string_difference {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();


        System.out.println(sol(str));
        scn.close();
    }

    public static String sol(String str)
    {
        StringBuilder ans = new StringBuilder("");

        for(int i=1; i<str.length(); i++)
        {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int diff = (int)(curr-prev);

            ans.append(prev);
            ans.append(diff);
        }

        ans.append(str.charAt(str.length()-1));
        return ans.toString();
    }
}
