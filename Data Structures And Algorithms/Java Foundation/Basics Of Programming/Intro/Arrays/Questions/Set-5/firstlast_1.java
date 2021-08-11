import java.util.Scanner; 

public class firstlast_1 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];

        for(int i=0; i<n; i++)
        a[i] = scn.nextInt();

        int d = scn.nextInt();

        int l = 0;
        int h = n-1;
        int fi = 0;
        int li = 0;

        while(l<=h)
        {
            int mid = (l+h)/2;
            if(a[mid]>d)
            {
                h = mid-1;
            }

            else if(a[mid]<d)
            {
                l = mid+1;
            }

            else 
            {
                fi = mid;
                h = mid-1;
            }
        }

        l = 0;
        h = n-1;

        while(l<=h)
        {
            int mid = (l+h)/2;

            if(a[mid]>d)
            {
                h = mid-1;
            }

            else if(a[mid]<d)
            {
                l = mid+1;
            }

            else 
            {
                li = mid;
                l = mid+1;
            }
        }

        System.out.println(fi);
        System.out.println(li);

        scn.close();
    }
}
