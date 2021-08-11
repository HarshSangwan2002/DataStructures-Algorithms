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
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        
        ListNode prev = head;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = null;
        
        ListNode lsh = sortList(head);
        ListNode ssh = sortList(slow);
        return merge(lsh,ssh);
    }
    
    ListNode merge(ListNode l1, ListNode l2){
        
        if(l1==null)
            return l2;
        
        if(l2==null)
            return l1;
        
        ListNode dummy = new ListNode(-1);
        ListNode l3 = dummy;
        
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                l3.next = l1;
                l3 = l1;
                l1 = l1.next;
            }
            
            else 
            {
                l3.next = l2;
                l3 = l2;
                l2 = l2.next;
            }
        }
        
        while(l1!=null)
        {
            l3.next = l1;
            l3 = l1;
            l1 = l1.next;
        }
        
        while(l2!=null)
        {
            l3.next = l2;
            l3 = l2;
            l2 = l2.next;
        }
        
        return dummy.next;
    }
}