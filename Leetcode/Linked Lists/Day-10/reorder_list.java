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
    public void reorderList(ListNode head) {
        
        if(head==null || head.next==null)
            return;
        
        ListNode l1 = head;
        
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
        
        ListNode l2 = reverse(slow);
        
        merge(l1,l2);
    }
    
    private void merge(ListNode l1, ListNode l2){
       
        while(l1!=null)
        {
            ListNode l1_next = l1.next;
            ListNode l2_next = l2.next;
            
            l1.next = l2;
            
            if(l1_next==null)
                break;
            
            l2.next = l1_next;
            
            l1 = l1_next;
            l2 = l2_next;
            
        }
    }
    
    private ListNode reverse(ListNode node){
        
        ListNode pre = null;
        ListNode curr = node;
        
        while(curr!=null)
        {
            ListNode forw = curr.next;
            curr.next = pre;
            
            pre = curr;
            curr = forw;
        }
        
        return pre;
    }
}