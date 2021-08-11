/**
 * intstring
 */

import java.util.Scanner;

public class intstring {

    public static void main(String[] args) {
    
        //We can't take integers and strings input simultaneously using the conventional way.

    Scanner scn = new Scanner(System.in);
    int n =Integer.parseInt(scn.nextLine());
    String name = scn.nextLine();

    System.out.println("You have entered: " + n);
    System.out.println("Your name is: " + name);
    scn.close();
    }
}