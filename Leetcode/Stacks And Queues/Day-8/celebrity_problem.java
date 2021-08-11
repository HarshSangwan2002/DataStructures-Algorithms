import java.util.*;

class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int arr[][], int n)
    {
    	// code here 
    	Stack<Integer> st = new Stack<>();
    	
    	for(int i=0; i<n; i++)
    	{
    	    st.push(i);
    	}
    	
    	while(st.size()>=2)
    	{
    	    int i = st.pop();
    	    int j = st.pop();
    	    
    	    if(arr[i][j]==1)
    	    {
    	        st.push(j);
    	    }
    	    
    	    else 
    	    {
    	        st.push(i);
    	    }
    	}
    	
    	int pans = st.pop();
    	
    	for(int i=0; i<arr.length; i++)
    	{
    	    if(i!=pans)
    	    {
    	        if(arr[i][pans]==0 || arr[pans][i]==1)
    	        {
    	            return -1;
    	        }
    	    }
    	}
    	
    	return pans;
    }
}