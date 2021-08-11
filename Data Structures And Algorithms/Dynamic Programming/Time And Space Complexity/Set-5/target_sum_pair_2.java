import java.util.Scanner; 

/**
 * target_sum_pair_2
 */
public class target_sum_pair_2 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();
        
        target_sum(arr,tar);
        scn.close();
    }

    public static void target_sum(int[] arr, int tar)
    {
        arr = merge_sort(arr,0,arr.length-1);

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

    public static int[] merge_sort(int[] arr, int lo, int hi)
    {
        if(lo==hi)
        {
            int[] res = new int[1];
            res[0] = arr[lo];
            return res;
        }

        int mid = (lo+hi)/2;

        int[] fsh = merge_sort(arr,lo,mid);
        int[] ssh = merge_sort(arr,mid+1,hi);
        int[] sol = merge(fsh,ssh);

        return sol;
    }

    public static int[] merge(int[] a ,int[] b)
    {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] ans = new int[a.length+b.length];

        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
                ans[k] = a[i];
                i++;
            }

            else 
            {
                ans[k] = b[j];
                j++;
            }

            k++;
        }

        while(i<a.length)
        {
            ans[k] = a[i];
            i++;
            k++;
        }

        while(j<b.length)
        {
            ans[k] = b[j];
            j++;
            k++;
        }

        return ans;
    }
}