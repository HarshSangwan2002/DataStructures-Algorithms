class Solution {
    public int[] nextGreaterElement(int[] a, int[] b) {

        Stack<Integer> st = new Stack<>();
        st.push(b[b.length - 1]);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(b[b.length - 1], -1);

        for (int i = b.length - 2; i >= 0; i--) {
            while (st.size() != 0 && b[i] >= st.peek())
                st.pop();

            if (st.size() == 0)
                map.put(b[i], -1);

            else
                map.put(b[i], st.peek());

            st.push(b[i]);
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = map.get(a[i]);
        }

        return a;
    }
}