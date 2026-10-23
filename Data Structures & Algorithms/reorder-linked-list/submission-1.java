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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while(head != null){
            head.next = reverseList(head.next);
            head = head.next;
        }
        head = dummy.next;
    }

     public ListNode reverseList(ListNode head){
        return reverseHelper(null, head);
    }

    public ListNode reverseHelper(ListNode head, ListNode next){
        if(next == null) return head;
        ListNode next2 = next.next;
        next.next = head;
        return reverseHelper(next,next2);
    }
}
