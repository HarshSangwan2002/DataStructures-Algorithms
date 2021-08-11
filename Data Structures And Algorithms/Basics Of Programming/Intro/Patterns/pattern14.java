import java.util.Scanner; 

public class pattern14{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        
        for(int i=1; i<=10; i++)
        {
            System.out.print(x+" * "+i+" = "+x*i);
            System.out.println();
        }
        scn.close();
    }
}