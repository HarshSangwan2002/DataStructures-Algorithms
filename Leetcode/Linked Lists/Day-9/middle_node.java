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
    public ListNode middleNode(ListNode head) {
        
        if(head.next==null)
            return head;
        
        if(head.next.next==null)
            return head.next;
        
        ListNode s = head;
        ListNode f = head;
        
        while(f.next!=null && f.next.next!=null)
        {
            s = s.next;
            f = f.next.next;
        }
        
        if(f.next==null)
            return s;
        
        else 
            return s.next;
    }
}