import java.util.Scanner; 

public class subsequence {
    
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

        char ch = str.charAt(0);
        String ros = str.substring(1);
        print(ros,ans+ch);
        print(ros,ans+"");
    }
}
