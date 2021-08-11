/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    private static int length(ListNode node){
        
        int ans = 0;
        ListNode curr = node;
        
        while(curr!=null)
        {
            ans++;
            curr = curr.next;
        }
        
        return ans;
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode l1 = headA;
        ListNode l2 = headB;
        
        int s1 = length(headA);
        int s2 = length(headB);
        
        int delta = Math.abs(s1-s2);
        
        if(s1>s2)
        {
            for(int i=0; i<delta; i++)
                l1 = l1.next;
        }
        
        else 
        {
           for(int i=0; i<delta; i++)
               l2 = l2.next;
        }
        
        while(l1!=l2)
        {
            l1 = l1.next;
            l2 = l2.next;
        }
        
        return l1;
    }
}