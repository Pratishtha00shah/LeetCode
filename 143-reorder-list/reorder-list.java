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
        if (head == null || head.next == null) {
            return;
        }
        
        // Find the middle of the list
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Reverse the second half of the list
        ListNode prev = null;
        ListNode curr = slow.next;
        
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        slow.next = null;
        
        // Merge the two lists
        ListNode p1 = head;
        ListNode p2 = prev;
        
        while (p2 != null) {
            ListNode temp1 = p1.next;
            ListNode temp2 = p2.next;
            
            p1.next = p2;
            p2.next = temp1;
            
            p1 = temp1;
            p2 = temp2;
        }
    }
}