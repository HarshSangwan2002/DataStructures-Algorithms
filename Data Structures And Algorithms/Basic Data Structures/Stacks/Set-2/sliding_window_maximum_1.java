import java.util.Scanner; 

public class sliding_window_maximum_1 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }
         
        int k = scn.nextInt();

        int[] window = new int[arr.length-k+1];
        
        for(int i=0; i<=arr.length-k; i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j=i; j<i+4; j++)
            {
                max = Math.max(max,arr[j]);
            }
            window[i] = max;
        }

        for(int i=0; i<window.length; i++)
        {
            System.out.println(window[i]);
        }
        
        scn.close();
    }
}
