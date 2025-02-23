// Runtime 0 ms Beats 100.00% - Memory 41.67 MB Beats 74.25%

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

class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode current = head;


        while (current != null) {
            length++;
            current = current.next;
        }

        
        int nodeToRemove = (length - n);

        if (nodeToRemove == 0) {
            return head.next;
        }

        current = head;
        int counter = 1;
        while (current != null) {
            if (nodeToRemove == counter) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }

            counter++;
        }

        return head;
    }
}
