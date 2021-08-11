import java.util.Scanner; 

public class permutations {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        print(str,"");
        scn.close();
    }

    public static void print(String str, String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String ros = left+right;
            print(ros,ans+ch);
        }
    }
}
