import java.util.Scanner; 

public class all_substrings_1 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        for(int i=0; i<str.length(); i++)
        {
            for(int j=i; j<str.length(); j++)
            {
                for(int k=i; k<=j; k++)
                {
                    System.out.print(str.charAt(k)+" ");
                }

                System.out.println();
            }
        }

        scn.close();
    }
}
