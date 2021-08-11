import java.util.Scanner; 

public class length {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        System.out.println(str.length());

        scn.close();
    }
}
