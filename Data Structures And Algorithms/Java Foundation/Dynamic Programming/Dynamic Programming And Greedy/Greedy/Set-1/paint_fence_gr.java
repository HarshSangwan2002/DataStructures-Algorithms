import java.util.Scanner; 

public class paint_fence_gr {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        long same = k;
        long diff = k*(k-1);
        long total = same + diff;

        for(int i=3; i<=n; i++)
        {
            same = diff;
            diff = (k-1)*total;
            total = same + diff;
        }

        System.out.println(total);
        scn.close();
    }
}
