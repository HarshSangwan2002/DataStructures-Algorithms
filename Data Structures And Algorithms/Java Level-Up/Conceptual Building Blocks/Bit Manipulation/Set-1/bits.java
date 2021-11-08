import java.io.*;
import java.util.*;

public class bits {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int i = scn.nextInt();
    int j = scn.nextInt();
    int k = scn.nextInt();
    int m = scn.nextInt();

    // write your code here
    int m1 = (1 << i);
    int m2 = ~(1 << j);
    int m3 = (1 << k);
    int m4 = (1 << m);

    System.out.println(n | m1);
    System.out.println(n & m2);
    System.out.println(n ^ m3);

    if ((n & m4) == 0) {

      System.out.println("false");
    }

    else {

      System.out.println("true");
    }
  }

}