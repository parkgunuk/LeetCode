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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode res = new ListNode(0);
        ListNode cur = res;
        ListNode pre = head;
        ListNode curr = head.next;
        
        while(pre != null){
            while(curr != null && pre.val == curr.val){
                pre = curr;
                curr = curr.next;
            }
            
            cur.next = new ListNode(pre.val);
            cur = cur.next;
            pre = curr;
            
            if(curr == null) curr = null;
            else curr = curr.next;
            
        }
        
        return res.next;
    }
}