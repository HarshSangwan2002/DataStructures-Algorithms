import java.util.Scanner; 

public class linearsearch {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];

        for(int i=0; i<n; i++)
        a[i] = scn.nextInt();

        int data = scn.nextInt();

        System.out.println(lsearch(a,data));
        scn.close();
    }

    public static int lsearch(int[] a ,int data)
    {
        for(int i=0; i<a.length; i++)
        {
            if(a[i]==data)
            {
                return i;
            }
        }

        return -1;
    }
}
