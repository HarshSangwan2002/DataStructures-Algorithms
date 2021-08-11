import java.util.Stack;

class sliding {
    public int[] maxSlidingWindow(int[] arr, int k) {
        
        if(arr.length==1)
        {
            int[] ans = new int[1];
            ans[0] = arr[0];
            return ans;
        }
        
        int[] ans = new int[arr.length-k+1];
        
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);
        nge[arr.length-1] = arr.length;
        
        for(int i=arr.length-2; i>=0; i--)
        {
            while(st.size()!=0 && arr[i]>=arr[st.peek()])
                st.pop();
            
            if(st.size()==0)
                nge[i] = arr.length;
            
            else 
                nge[i] = st.peek();
            
            st.push(i);
        }
        
        int j = 0;
        
        for(int i=0; i<=arr.length-k; i++)
        {
            if(j<i)
                j = i;
            
            while(nge[j]<i+k)
                j = nge[j];
            
            ans[i] = arr[j];
        }
        
        return ans;
    }
}