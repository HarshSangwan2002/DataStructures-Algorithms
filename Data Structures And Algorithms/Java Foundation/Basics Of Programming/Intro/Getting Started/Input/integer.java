import java.util.Scanner;

/**
 * input
 */
public class integer {

    public static void main(String[] args) {

        //scn is a varaible of type scanner and we an take the input from scanner type variables.
        //System.in is used for console input.
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        
        for(int i=0; i<=n; i++)
        {
            System.out.println(i);
        }
    }
}