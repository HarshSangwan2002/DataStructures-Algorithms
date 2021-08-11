import java.util.Scanner; 

public class evaluation{
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(str+10+20);
        System.out.println(10+20+str);

        scn.close();
    }
}
