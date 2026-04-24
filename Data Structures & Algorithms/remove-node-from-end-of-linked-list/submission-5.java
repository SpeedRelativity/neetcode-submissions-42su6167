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

        int counter = 0;
        ListNode walker = head;

        while(walker != null){
            walker = walker.next;
            counter++;
        }

        // we need a predecessor 
        ListNode dummy = new ListNode(0, head);
        int steps = counter - n;

        ListNode prev = dummy;
        for(int i = 0; i < steps; i++){
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return dummy.next;

    }
}
