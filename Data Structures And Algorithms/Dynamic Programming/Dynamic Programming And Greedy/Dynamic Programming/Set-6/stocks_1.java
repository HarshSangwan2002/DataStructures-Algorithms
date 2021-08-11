import java.util.Scanner; 

/**
 * stocks_1
 */
public class stocks_1 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = scn.nextInt();
        }

        if(arr.length==2)
        {
            System.out.println(arr[1]-arr[0]);
            System.exit(0);
        }

        int min = Math.min(arr[0],arr[1]);
        int profit = arr[1]-arr[0];

        for(int i=2; i<n; i++)
        {
            min = Math.min(min,arr[i-1]);

            if(arr[i]-min>profit)
            {
                profit = arr[i] - min;
            }
        }

        System.out.println(profit);
        scn.close();
    }
}