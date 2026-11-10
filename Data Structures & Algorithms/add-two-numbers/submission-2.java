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
        ListNode head = new ListNode();
        ListNode dummy = new ListNode();
        head = dummy;
        int extra = 0;
        while(l1!= null && l2!= null){
            head.next = new ListNode();
            head = head.next;
            int val = (l1.val + l2.val + extra) % 10;
            extra = (l1.val + l2.val + extra) / 10;
            head.val = val;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!= null){
            head.next = new ListNode();
            head = head.next;
            int val = (l1.val + extra) % 10;
            extra = (l1.val + extra) / 10;
            head.val = val;
            l1 = l1.next;
        }
        while(l2!= null){
            head.next = new ListNode();
            head = head.next;
            int val = (l2.val + extra) % 10;
            extra = (l2.val + extra) / 10;
            head.val = val;
            l2 = l2.next;
        }

        if(extra > 0){
            head.next = new ListNode();
            head.next.val = 1;
        }
        return dummy.next;
    }
}
