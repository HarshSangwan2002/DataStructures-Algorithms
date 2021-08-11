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
    public ListNode removeElements(ListNode head, int val) {
        
        if(head==null)
            return null;
        
        ListNode temp = head;
        
        while(temp.val==val)
        {
            if(temp.next==null)
                break;
            
            temp = temp.next;
        }
        
        if(temp.val==val && temp.next==null)
            return null;
        
        head = temp;
        
        ListNode t = head;
        
        while(t!=null && t.next!=null)
        {
            if(t.next.val==val)
                t.next = t.next.next;
            
            else 
                t = t.next;
        }
        
        return head;
    }
}