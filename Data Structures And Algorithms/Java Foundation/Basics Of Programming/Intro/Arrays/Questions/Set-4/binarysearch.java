import java.util.Scanner; 

public class binarysearch {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];

        for(int i=0; i<n; i++)
        a[i] = scn.nextInt();

        int data = scn.nextInt();

        System.out.println(bsearch(a,data));

        scn.close();
    }

    public static int bsearch(int[] a ,int data)
    {
        int low = 0;
        int high = a.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(a[mid]==data)
            {
                return mid;
            }

            else if(a[mid]>data)
            {
                high = mid-1;
            }

            else 
            {
                low = mid+1;
            }
        }

        return -1;
    }
}
