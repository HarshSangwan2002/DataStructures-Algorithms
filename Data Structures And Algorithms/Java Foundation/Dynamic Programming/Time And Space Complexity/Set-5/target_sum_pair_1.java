import java.util.Arrays;
import java.util.Scanner; 

/**
 * target_sum_pair
 */
public class target_sum_pair_1 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();

        sum_pair(arr,tar);
        scn.close();
    }

    public static void sum_pair(int[] arr, int tar)
    {
        Arrays.sort(arr);

        int lo = 0;
        int hi = arr.length-1;

        while(lo<hi)
        {
            if(arr[lo]+arr[hi]==tar)
            {
                System.out.println(arr[lo]+", "+arr[hi]);
                lo++;
                hi--;
            }

            else if(arr[lo]+arr[hi]>tar)
            {
                hi--;
            }

            else 
            {
                lo++;
            }
        }
    }
}