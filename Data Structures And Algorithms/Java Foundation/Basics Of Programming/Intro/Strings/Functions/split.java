import java.util.Scanner; 

public class split {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        String[] arr = str.split(" ");

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        scn.close();
    }
}
