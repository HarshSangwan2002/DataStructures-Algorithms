import java.util.Scanner; 

public class span {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];

        for(int i=0; i<n; i++)
        a[i] = scn.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++)
        {
            max = Math.max(a[i],max);
            min = Math.min(a[i],min);
        }

        int span = max-min;

        System.out.print(span);
        scn.close();
    }
}
