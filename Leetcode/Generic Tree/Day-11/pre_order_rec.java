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
        
        LinkedList<Integer> list = new LinkedList<>();
        return helper(root,list);
    }
    
    public static List<Integer> helper(Node root, LinkedList<Integer> list){
        
        if(root==null)
            return list;
        
        list.add(root.val);
        
        for(Node child: root.children)
            helper(child,list);
        
        return list;
    }
}