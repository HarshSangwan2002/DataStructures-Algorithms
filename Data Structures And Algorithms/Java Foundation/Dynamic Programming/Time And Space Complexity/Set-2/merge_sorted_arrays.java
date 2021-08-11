import java.util.Scanner; 

public class merge_sorted_arrays {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[] b = new int[m];

        for(int i=0; i<m; i++)
        {
            b[i] = scn.nextInt();
        }

        merge(a,b);
        scn.close();
    }

    public static void merge(int[] a, int[] b)
    {
        int i = 0;
        int j = 0;
        int k = 0;

        int sz = a.length + b.length;
        int[] ans = new int[sz];

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

        for(int val:ans)
        {
            System.out.println(val);
        }
    }
}
