import java.util.Scanner; 

public class reverse {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];

        for(int i=0; i<n; i++)
        a[i] = scn.nextInt();

        int s = 0;
        int e = a.length-1;

        while(s<=e)
        {
            int temp = a[e];
            a[e] = a[s];
            a[s] = temp;

            s++;
            e--;
        }

        for(int i=0; i<n; i++)
        System.out.println(a[i]);
        scn.close();
    }
}
