import java.util.Scanner; 

/**
 * count_sort
 */
public class count_sort {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }

        int[] sol = countsort(arr);

        for(int val:sol)
        {
            System.out.println(val);
        }
        scn.close();
    }

    public static int[] countsort(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        
        int range = max-min+1;
        int[] freq = new int[range];
        
        for(int i=0; i<arr.length; i++)
        {
            freq[arr[i]-min]++;
        }

        for(int i=1; i<freq.length; i++)
        {
            freq[i]+=freq[i-1];
        }
        
        int[] ans = new int[arr.length];
        
        for(int i=arr.length-1; i>=0; i--)
        {
            int val = arr[i];
            int pos = freq[val-min];
            int idx = pos-1;

            ans[idx] = val;
            freq[val-min]--;
        }

        return ans;
    }
}