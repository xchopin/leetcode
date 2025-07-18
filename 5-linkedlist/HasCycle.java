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
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            pointer = pointer.next;
            fastPointer = fastPointer.next.next;

            if (pointer == fastPointer) {
                return true;
            }

        }
        
        return false;
    }

}
