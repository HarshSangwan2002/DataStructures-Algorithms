import java.util.*;

public class swap {
    
    public static void main(String[] args) {
        
        int [] ar = new int[3];
        ar[0] = 10;
        ar[1] = 20;
        ar[2] = 30;

        swa(ar,1,2);

        for(int i=0; i<=2; i++)
        System.out.println(ar[i]);
    }

    public static void swa(int [] a, int i ,int j)
    {
            
       int temp = a[j];
       a[j] = a[i];
       a[i] = temp;
    }
}
