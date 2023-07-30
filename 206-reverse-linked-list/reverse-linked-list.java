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

        // Initialize two pointers: prev to store the previous node and curr to store the current node
        ListNode prev = null;
        ListNode curr = head;

        // Iterate through the list until we reach the end
        while (curr != null) {

            // Store the next node of the current node
            ListNode temp = curr.next;

            // Reverse the direction of the current node's pointer to the previous node
            curr.next = prev;

            // Move prev and curr pointers one step forward
            prev = curr;
            curr = temp;
        }

        // Return the new head of the reversed list, which would be the last node encountered
        return prev;
    }
}