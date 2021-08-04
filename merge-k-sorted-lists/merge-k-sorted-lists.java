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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length == 1) return lists[0];
        if(lists.length == 0) return null;
        
        ListNode head = mergeList(lists[0], lists[1]);
        for(int i = 2; i < lists.length ; ++i) head = mergeList(head, lists[i]);
        
        return head;
    }
    
    public ListNode mergeList(ListNode head1, ListNode head2){
        ListNode tmp = new ListNode(0);
        ListNode res = tmp;
        
        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                tmp.next = head1;
                tmp = tmp.next;
                head1 = head1.next;
            } else {
                tmp.next = head2;
                tmp = tmp.next;
                head2 = head2.next;
            }
        }
        
        if(head1 == null) tmp.next = head2;
        if(head2 == null) tmp.next = head1;
        
        return res.next;
    }
}