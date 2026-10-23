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
        ListNode reversedHead = reverseList(head);
        ListNode dummy = new ListNode(0,reversedHead);
        if(n == 1) return reverseList(reversedHead.next);
        while(n>1){
            dummy = dummy.next;
            n--;
        }
        //if(reversedHead.next != null){
        dummy.next = dummy.next.next;
        //}

        return reverseList(reversedHead);
    }
    
    public ListNode reverseList(ListNode head){
        return reverseHelper(null, head);
    }

    public ListNode reverseHelper(ListNode head, ListNode next){
        if(next == null) return head;
        ListNode next2 = next.next;
        next.next = head;
        return reverseHelper(next, next2);
    }
}
