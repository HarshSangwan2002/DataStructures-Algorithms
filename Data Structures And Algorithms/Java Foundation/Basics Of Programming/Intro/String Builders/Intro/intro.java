import java.util.Scanner; 

public class intro {
  
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        StringBuilder s = new StringBuilder(scn.nextLine());
        System.out.println(s);

        scn.close();
    }
}
