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
        int len = 0;
        ListNode cur = head;
        
        System.out.println(cur.val);
        
        while(cur != null){
            cur = cur.next;
            len++;
        }
        
        if(len == n) {
            head = head.next;
            return head;
        }
        
        ListNode res = head;
        for(int i = 0 ; i < len - n - 1; ++i) {
            res = res.next;
        }
        
        ListNode temp = res.next;
        res.next = temp.next;
        
        return head;
    }
}