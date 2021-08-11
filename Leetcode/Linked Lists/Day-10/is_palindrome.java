/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    static ListNode left;
    
    public boolean helper(ListNode right){
      
        if(right==null)
            return true;
        
        boolean rres = helper(right.next);
        
        if(rres==false)
            return false;
        
        else if(right.val!=left.val)
            return false;
        
        else 
        {
            left = left.next;
            return true;
        }
    }
    
    public boolean isPalindrome(ListNode head) {
        
        left = head;
        return helper(head);
    }
}