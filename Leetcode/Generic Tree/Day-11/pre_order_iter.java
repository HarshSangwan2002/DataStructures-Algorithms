/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        
        Stack<Node> st = new Stack<>();
        LinkedList<Integer> list = new LinkedList<>();
        
        if(root==null)
            return list;
        
        st.push(root);
        
        while(st.size()!=0)
        {
            Node node = st.pop();
            list.add(node.val);
            
            for(int i=node.children.size()-1; i>=0; i--)
                st.push(node.children.get(i));
        }
        
        return list;
    }
}