import java.util.*; 

public class prinincreasing {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();


        increasing(n);
        scn.close();
    }

    public static void increasing(int n)
    {
        if(n==0)  //base case
        return; 

        increasing(n-1);
        System.out.println(n);
    }
}
