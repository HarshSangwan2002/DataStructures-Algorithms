import java.util.*;

public class intro{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = scn.nextInt();

        for(int i=0; i<n; i++)
        {
            list.add(scn.nextInt());
        }

        list.remove(0);
        System.out.println(list);

        list.add(2,3);
        System.out.println(list);

        list.set(0,300);
        System.out.println(list);

        scn.close();
    }
}