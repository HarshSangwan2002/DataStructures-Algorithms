import java.util.Stack;

class histogram {
    public int largestRectangleArea(int[] arr) {
        
        if(arr.length==1)
            return arr[0];
        
        int[] nsel = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        nsel[0] = -1;
        
        for(int i=1; i<arr.length; i++)
        {
            while(st.size()>0 && arr[i]<=arr[st.peek()])
                st.pop();
            
            if(st.size()==0)
                nsel[i]=-1;
            
            else 
                nsel[i] = st.peek();
            
            st.push(i);
        }
        
        int[] nser = new int[arr.length];
        st = new Stack<>();
        nser[arr.length-1] = arr.length;
        st.push(arr.length-1);
        
        for(int i=arr.length-2; i>=0; i--)
        {
            while(st.size()>0 && arr[i]<=arr[st.peek()])
                st.pop();
            
            if(st.size()==0)
                nser[i] = arr.length;
            
            else 
                nser[i] = st.peek();
            
            st.push(i);
        }
        
        int maxarea = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++)
        {
            int length = nser[i] - nsel[i] - 1;
            int breadth = arr[i];
            
            int area = length*breadth;
            
            maxarea = Math.max(maxarea,area);
        }
        
        return maxarea;
    }
}