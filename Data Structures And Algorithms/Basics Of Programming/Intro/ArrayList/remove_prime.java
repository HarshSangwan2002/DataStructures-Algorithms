import java.util.*; 

public class remove_prime {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = scn.nextInt();
        for(int i=0; i<n; i++)
        {
            list.add(scn.nextInt());
        }

        for(int i=0; i<list.size(); i++)
        {
            int count = 0;
            int x = list.get(i);
            for(int div=2; div*div<=x; div++)
            {
                if(x%div==0)
                {
                    count++;
                    break;
                }

            }
            
            if(count==0)
                {
                    list.remove(i);
                    i-=1;
                }
        }

        System.out.println(list);
        scn.close();
    }
}
