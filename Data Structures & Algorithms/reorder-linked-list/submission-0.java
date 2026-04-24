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

        // I see a reversed part. 
        // some kind of two pointers. 

        // we can use fast-slow pointer method to get mid;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        // now we have a mid point at slow. 
        System.out.println(fast);
        System.out.println(slow.val);
        
        
        ListNode second = slow.next; // save for later;
        slow.next = null;

        
        ListNode prev = null;
        ListNode curr = second;

        

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        second = prev; // we now set head to the last element.

        // now the  2nd half of the list is list is reversed

        while(second != null){
            ListNode next = head.next;
            ListNode next2 = second.next;
            head.next = second;
            second.next = next;
            head = next;
            second = next2;
        }



    }
}
