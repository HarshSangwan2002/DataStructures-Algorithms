import java.util.Scanner; 

public class stocks_3 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }

        int fee = scn.nextInt();

        int obsp = -arr[0];
        int ossp = 0;
        
        for(int i=1; i<arr.length; i++)
        {
            int nbsp = -1;
            int nssp = -1;

            if(ossp-arr[i]>obsp)
            {
                nbsp = ossp-arr[i];
            }

            else 
            {
                nbsp = obsp;
            }

            if(arr[i]+obsp-fee>ossp)
            {
                nssp = arr[i]+obsp-fee;
            }

            else 
            {
                nssp = ossp;
            }

            ossp = nssp;
            obsp = nbsp;
        }

        System.out.println(ossp);
        scn.close();
    }
}
