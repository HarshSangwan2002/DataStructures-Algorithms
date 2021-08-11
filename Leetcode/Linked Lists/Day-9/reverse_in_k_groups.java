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
    
    public static int length(ListNode node){
        
        int l = 0;
        ListNode curr = node;
        
        while(curr!=null)
        {
            l++;
            curr = curr.next;
        }
        
        return l;
    }
    
    static ListNode th = null;
    static ListNode tt = null;
    
    public static void addfirst(ListNode node){
        
        if(th==null)
        {
            th=node;
            tt=node;
        }
        
        else 
        {
            node.next = th;
            th = node;
        }
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(head==null || head.next==null || k==0)
            return head;
        
        
        int len = length(head);
        ListNode curr = head;
        ListNode oh = null;
        ListNode ot = null;
        
        while(len>=k)
        {
            int tempk = k;
            
            while(tempk-- >0)
            {
                ListNode forw = curr.next;
                curr.next = null;
                addfirst(curr);
                curr = forw;
            }
            
            if(oh==null)
            {
                oh = th;
                ot = tt;
            }
            
            else 
            {
                ot.next = th;
                ot=tt;
            }
            
            th=null;
            tt=null;
            len-=k;
        }
        
        ot.next = curr;
        return oh;
    }
}