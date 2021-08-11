import java.util.Scanner; 

public class charat {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        /*str.charAt(1) = 's'; 
        The above statement is wrong because we can't modify any string due to intern pool!
        */

        for(int i=0; i<str.length(); i++)
        {
            System.out.print(str.charAt(i));
        }

        scn.close();
    }
}
