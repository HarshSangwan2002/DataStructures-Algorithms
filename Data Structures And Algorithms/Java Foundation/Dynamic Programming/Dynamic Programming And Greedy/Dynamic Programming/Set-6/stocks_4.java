import java.util.Scanner; 

public class stocks_4 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }
 
        int obsp = -arr[0];
        int ossp = 0;
        int ocsp = 0;

        for(int i=1; i<arr.length; i++)
        {
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;

            if(ocsp-arr[i]>obsp)
            {
                nbsp = ocsp-arr[i];
            }

            else 
            {
                nbsp = obsp;
            }

            if(obsp+arr[i]>ossp)
            {
                nssp = obsp+arr[i];
            }

            else 
            {
                nssp = ossp;
            }

            if(ossp>ocsp)
            {
                ncsp = ossp;
            }

            else 
            {
                ncsp = ocsp;
            }

            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }
      
        System.out.println(ossp);
        scn.close();
    }
}
