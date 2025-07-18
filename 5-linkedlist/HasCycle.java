class HasCycle {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean hasCycle(ListNode head) {
        ListNode pointer = head;
        ListNode fastPointer = head.next;

        while (fastPointer != null && fastPointer.next != null) {

            if (pointer == fastPointer) {
                return true;
            }

            pointer = pointer.next;
            fastPointer = fastPointer.next.next;

        }
        
        return false;
    }

}
