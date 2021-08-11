import java.util.Scanner; 

/**
 * sort_dates
 */
public class sort_dates {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];

        for(int i=0; i<arr.length; i++)
        {
            String str = scn.next();
            arr[i] = str;
        }

        sortdates(arr);

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        
        scn.close();
    }

    public static void sortdates(String[] arr)
    {
        count_sort(arr,1000000,100,32);
        count_sort(arr,10000,100,13);
        count_sort(arr,1,10000,2501);
    }

    public static void count_sort(String[] arr, int div, int mod, int range)
    {
        String[] ans = new String[arr.length];
        int freq[] = new int[range];

        for(int i=0; i<arr.length; i++)
        {
            freq[Integer.parseInt(arr[i],10)/div %mod]++;
        }

        for(int i=1; i<freq.length; i++)
        {
            freq[i]+=freq[i-1];
        }

        for(int i=arr.length-1; i>=0; i--)
        {
            int pos = freq[Integer.parseInt(arr[i],10)/div %mod]-1;
            ans[pos] = arr[i];
            freq[Integer.parseInt(arr[i],10)/div %mod]--;
        }

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = ans[i];
        }
    }
}