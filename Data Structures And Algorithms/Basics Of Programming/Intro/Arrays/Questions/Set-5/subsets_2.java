import java.util.Scanner; 

public class subsets_2 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];

        for(int i=0; i<n; i++)
        a[i] = scn.nextInt();

        int p = (int) Math.pow(2,n);

        for(int i=0; i<p; i++)
        {
            int temp = i;
            String s = "";
            for(int j=a.length-1; j>=0; j--)
            {
                int rem = temp%2;
                temp/=2;

                if(rem==0)
                s = "-"+" "+s;

                else 
                s = a[j]+" "+s;
            }
            System.out.println(s);
        }

        scn.close();
    }
}
