import java.util.Scanner; 

public class inverse{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];

        for(int i=0; i<n; i++)
        a[i] = scn.nextInt();


        int [] inv = new int[n];

        for(int i=0; i<inv.length; i++)
        {
            inv[a[i]] = i;
        }
        
        for(int i=0; i<n; i++)
        System.out.println(inv[i]);
        
        scn.close();
    }
}