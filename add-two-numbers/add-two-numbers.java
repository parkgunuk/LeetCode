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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int over = 0;
        ListNode head = new ListNode(0);
        ListNode res = head;
        
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + over;
            
            res.next = new ListNode(sum % 10);
            
            over = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            res = res.next;
        }
        while(l1 != null) {
            int sum = l1.val + over;
            res.next = new ListNode(sum % 10);
            
            over = sum / 10;
            l1 = l1.next;
            res = res.next;
        }
        
        while(l2 != null) {
            int sum = l2.val + over;
            res.next = new ListNode(sum % 10);
            
            over = sum / 10;
            l2 = l2.next;
            res = res.next;
        }
        
        if(over > 0){
            res.next = new ListNode(1);
        }
        
        
        return head.next;
    }
}