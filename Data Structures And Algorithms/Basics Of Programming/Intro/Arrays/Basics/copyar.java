import java.util.*; 

public class copyar {
    
    public static void main(String[] args) {
        
        int [] one = new int [4];

        one[0] = 10;
        one[1] = 20;
        one[2] = 30;

        int [] two = one;

        two[1] = 2000;

        for(int i=0; i<=2; i++)
        System.out.println(one[i]);

        for(int i=0; i<=2; i++)
        System.out.println(two[i]);
    }
}
