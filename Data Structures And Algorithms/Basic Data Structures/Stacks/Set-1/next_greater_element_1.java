import java.util.Scanner;

/**
 * next_greater_element_1
 */
public class next_greater_element_1 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }

        int[] nextgr = new int[arr.length];

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j]>arr[i])
                {
                    nextgr[i] = arr[j];
                }

                if(nextgr[i]!=0)
                break;
            }

            if(nextgr[i]==0)
            {
                nextgr[i]=-1;
            }
        }

        for(int val:nextgr)
        {
            System.out.println(val);
        }

        scn.close();
    }
}