import java.util.Scanner; 

public class diff {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int [] a1 = new int[n1];

        for(int i=0; i<n1; i++)
        a1[i] = scn.nextInt();

        int n2 = scn.nextInt();
        int [] a2 = new int[n2];

        for(int i=0; i<n2; i++)
        a2[i] = scn.nextInt();

        int [] dif = new int[n2];

        int i = a1.length-1;
        int j = a2.length-1;
        int k = dif.length-1;
        int c = 0;
        int d;

        while(k>=0)
        {
            int avl = i>=0 ? a1[i]:0;

            if(a2[j]+c>=avl)
            {
                d = a2[j] - avl + c;
                c = 0;
            }

            else
            {
                d = a2[j] - avl + c + 10;
                c = -1;
            }

            dif[k] = d;

            i--;
            j--;
            k--;
        }
        
        int idx = 0;

        while(idx<dif.length)
        {
            if(dif[idx]==0)
            idx++;

            else
            break;
        }

        while(idx<dif.length)
        {
            System.out.println(dif[idx]);
            idx++;
        }

        scn.close();
    }
}
