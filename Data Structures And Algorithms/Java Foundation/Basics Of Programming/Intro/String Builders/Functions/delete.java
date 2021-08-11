import java.util.*; 

public class delete {
    
    public static void main(String[] args) {
        
        StringBuilder s = new StringBuilder("Hello");

        s.deleteCharAt(0);
        
        s.delete(0,3);

        System.out.println(s);
    }
}
