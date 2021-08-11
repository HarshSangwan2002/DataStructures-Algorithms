import java.util.Scanner; 

/**
 * pattern11
 */
public class pattern11 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int count=1,n=scn.nextInt();
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(count+"\t");
                count++;
            }
            
            System.out.println();
        }
        scn.close();
    }
}