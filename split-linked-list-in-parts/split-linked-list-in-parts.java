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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        
        ListNode tmp = head;
        while(tmp != null) {
            len++;
            tmp = tmp.next;
        }
        
        int cnt = len / k;
        int left = len % k;
        
        tmp = head;
        ListNode[] ans = new ListNode[k];
        ListNode h = tmp;
        for(int i = 0 ; i < k ; ++i){
            ans[i] = h;
            
            ListNode prev = null;
            for (int j = 0; j < cnt + (left > 0 ? 1 : 0); j++) {
                prev = h;
                h = h.next;
            }
            
            left -= 1;
            if (prev != null) {
                prev.next = null;
            }
        }
            
        
        return ans;
    }
}