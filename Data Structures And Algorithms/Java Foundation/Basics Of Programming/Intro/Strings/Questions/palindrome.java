import java.util.*;

public class palindrome{

	public static void solution(String str){
		
		for(int i=0; i<str.length(); i++)
		{
		    for(int j=i+1; j<=str.length(); j++)
		    {
		        palindrome(str.substring(i,j));
		    }

		}
		
	}

    public static void palindrome(String str)
    {
        boolean flag = true;
        
        for(int i=0; i<str.length(); i++)
        {
            char sc = str.charAt(i);
            char lc = str.charAt(str.length()-i-1);
            
            if(sc!=lc)
            flag = false;
        }
        
        if(flag==true)
        System.out.println(str);
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
        snc.close();
	}

}