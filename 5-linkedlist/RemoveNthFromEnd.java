/**

Accepted
208 / 208 testcases passed
Xavier Chopin
Xavier Chopin
submitted at Aug 20, 2025 16:40

Editorial

Solution
Runtime
0ms Beats 100.00% Analyze Complexity
Memory
41.68MB
Beats
76.12%

*/

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
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode reversed = reverse(head);

        if (n == 1) {
            return reverse(reversed.next);
        } 

        int i = 1;


        ListNode reversedHead = reversed;
   
        while (reversed != null && i != n) {
            if (i == n - 1) {
                reversed.next = reversed.next.next;
            }
            reversed = reversed.next;
            i++;
        }

        return reverse(reversedHead);
    }

    private ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        return previous;
    }
}
