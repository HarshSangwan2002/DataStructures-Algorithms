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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int l = 0;
        ListNode t = head;
        
        while(t!=null)
        {
            l++;
            t = t.next;
        }
        
        if(l==1)
        {
            head = null;
            return head;
        }
        
       
        int idx = l-n;
        
        if(idx==0)
        {
            head = head.next;
            return head;
        }
        
        t = head;
        for(int i=0; i<idx-1; i++)
            t = t.next;
        
        t.next = t.next.next;
        return head;
    }
}