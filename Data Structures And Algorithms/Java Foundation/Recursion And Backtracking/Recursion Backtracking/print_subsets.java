import java.util.Scanner; 

public class print_subsets {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();

        subsets(arr,0,"",0,tar);
        scn.close();
    }

    public static void subsets(int[] arr, int idx, String set, int sos, int tar)
    {
        if(sos>tar)
        {
            return;
        }

        if(idx==arr.length)
        {
            if(sos==tar)
            System.out.println(set+".");

            return;
        }

        subsets(arr,idx+1,set+arr[idx]+", ",sos+arr[idx],tar);
        subsets(arr, idx+1, set, sos, tar);
    }
}
