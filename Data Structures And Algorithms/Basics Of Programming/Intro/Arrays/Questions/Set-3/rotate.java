import java.util.Scanner; 

public class rotate{

  public static void reverse(int[] a ,int i, int j)
  {
      while(i<=j)
      {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;

        i++;
        j--;
      }
  }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];

        for(int i=0; i<n; i++)
        a[i] = scn.nextInt();

        int k = scn.nextInt();

        k = k%a.length;
        if(k<0)
        k+=a.length;

        reverse(a,0,a.length-k-1);

        reverse(a,a.length-k,a.length-1);

        reverse(a,0,a.length-1);

        for(int i=0; i<a.length; i++)
        System.out.println(a[i]);

        scn.close();

    }
}
