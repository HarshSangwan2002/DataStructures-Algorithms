import java.util.Scanner; 

public class substring {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();


        System.out.println(str.substring(0,4));
        System.out.println(str.substring(0));
        System.out.println(str.substring(1,1));
        scn.close();
    }
}
