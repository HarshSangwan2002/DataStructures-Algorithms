import java.util.Scanner; 

public class subsets_1 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a =new int[n];

        for(int i=0; i<n; i++)
        a[i] = scn.nextInt();

        int p = (int)Math.pow(2,n);

        for(int i=0; i<p; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(get_b(i,j)==1)
                System.out.print(a[j]+" ");

                else 
                System.out.print("-"+" ");
            }
            System.out.println();
        }

        scn.close();
    }

    public static int get_b(int n, int pos)
    {
        int p = (n & (1<<pos));

        if(p==0)
        return 0;

        else 
        return 1;
    }
}
