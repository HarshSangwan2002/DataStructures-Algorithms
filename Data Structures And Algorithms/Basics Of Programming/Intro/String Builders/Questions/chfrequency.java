import java.util.*; 

public class chfrequency {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int[] arr = new int[26];

        for(int i=0; i<str.length(); i++)
        {
            arr[(int)(str.charAt(i)-'a')]++;
        }

        int freq = Integer.MIN_VALUE;
        char ans = ' ';

        for(int i=0; i<26; i++)
        {
            if(arr[i]>freq)
            {
                freq = arr[i];
                ans = (char)('a'+i);
            }
        }

        System.out.println(ans+" "+freq);
        scn.close();
    }
}
