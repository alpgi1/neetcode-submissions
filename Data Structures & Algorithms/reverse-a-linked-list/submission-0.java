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
    public ListNode reverseList(ListNode head) {
        return helper(null, head);
    }
    public ListNode helper(ListNode head, ListNode next){
        if(next == null) return head;
        ListNode next2 = next.next;
        next.next = head;
        return helper(next, next2);
    }
}
