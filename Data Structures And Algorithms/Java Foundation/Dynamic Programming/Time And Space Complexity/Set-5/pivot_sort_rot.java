import java.util.Scanner; 

/**
 * pivot_sort_rot
 */
public class pivot_sort_rot {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = scn.nextInt();
        }

        int lo = 0;
        int hi = arr.length-1;

        while(lo<hi)
        {
            int mid = lo + (hi-lo)/2;

            if(arr[mid]>arr[hi])
            {
                lo = mid+1;
            }

            else 
            {
                hi = mid;
            }
        }

        System.out.println(arr[hi]);
        scn.close();
    }
}