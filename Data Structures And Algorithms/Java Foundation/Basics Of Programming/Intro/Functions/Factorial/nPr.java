import java.util.Scanner; 

public class nPr {

    public static void main(String[] args) {
        
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int r = scn.nextInt();

    int nfact = 1;
    for(int i=1; i<=n; i++)
    {
        nfact*=i;
    }

    int rfact = 1;
    for(int i=1; i<=(n-r); i++)
    {
        rfact*=i;
    }   

    System.out.print(nfact/rfact);
    scn.close();
    }
}