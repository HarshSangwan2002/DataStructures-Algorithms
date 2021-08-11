import java.util.Scanner; 

/**
 * encodings
 */
public class encodings {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        print(str,"");
        scn.close();
    }

    public static void print(String str, String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }

        else if(str.length()==1)
        {
            if(str.charAt(0)=='0')
            return;

            else 
            {
               char ch = str.charAt(0);
               int chv = ch-'0';
               char code = (char)('a'+chv-1);
               ans+=code;
               System.out.println(ans);
            }
        }

        else 
        {
           if(str.charAt(0)=='0')
           return;

           else
           {
               char ch = str.charAt(0);
               String ros = str.substring(1);
               if(ch=='0')
               return;

               else 
               {
                   int chv = ch-'0';
                   char code = (char)('a'+chv-1);
                   print(ros,ans+code);
               }

               String ch12 = str.substring(0,2);
               String ros12 = str.substring(2);
               int chv12 = Integer.parseInt(ch12);
               if(chv12<=26)
               {
                  char code = (char)('a'+chv12-1);
                  print(ros12,ans+code);
               }
           }
        }
    }
}