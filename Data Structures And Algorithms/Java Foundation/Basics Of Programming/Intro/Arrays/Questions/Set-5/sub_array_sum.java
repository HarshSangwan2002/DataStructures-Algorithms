import java.util.Scanner; 

/**
 * sub_array_sum
 */
public class sub_array_sum {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int n = scn.nextInt();

        System.out.println("Enter the array elements: ");

        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }

        int cursum = 0, maxsum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++)
            {
                cursum+=arr[j];

                if(cursum>maxsum)
                {
                    maxsum = cursum;
                }
            }
            cursum = 0;
        }

        System.out.println(maxsum);
        scn.close();
    }
}