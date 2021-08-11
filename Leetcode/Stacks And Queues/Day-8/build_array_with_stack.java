import java.util.ArrayList;

class Solution {
    public ArrayList<String> buildArray(int[] target, int n) {
        
        ArrayList<String> al = new ArrayList<>();
        
        int j = 0;
        
        for(int i=1; i<=n; i++)
        {
            if(j==target.length)
                break;
            
            al.add("Push");
            
            if(target[j]==i)
            {
                j++;
            }
            
            else 
            {
                al.add("Pop");
            }
        }
        
        return al;
    }
}