import java.util.Scanner; 

public class ceilandfloor {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];

        for(int i=0; i<n; i++)
        a[i] = scn.nextInt();

        int d = scn.nextInt();

        int floor = 0;
        int ceil = 0;

        int high = a.length-1;
        int low = 0;

        while(low<=high)
        {
            int mid = (high+low)/2;

            if(a[mid]==d)
            {
                floor = a[mid];
                ceil = a[mid];
                break;
            }

            else if(a[mid]>d)
            {
                high = mid-1;
                ceil = a[mid];
            }

            else 
            {
                low = mid+1;
                floor = a[mid];
            }
        }

        System.out.print(ceil+"\n"+floor);
        scn.close();
    }
}
